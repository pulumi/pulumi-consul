// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package consul

import (
	"fmt"
	"path/filepath"
	"unicode"

	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/hashicorp/terraform-provider-consul/consul"
	"github.com/pulumi/pulumi-consul/provider/v2/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfbridge"
	shim "github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfshim"
	shimv1 "github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfshim/sdk-v1"
	"github.com/pulumi/pulumi/sdk/v2/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v2/go/common/tokens"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "consul"

	// modules:
	mainMod = "index"
)

func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

func makeDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeMember(mod+"/"+fn, res)
}

func makeResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeType(mod+"/"+fn, res)
}

func preConfigureCallback(vars resource.PropertyMap, c shim.ResourceConfig) error {
	return nil
}

// Provider returns additional overlaid schema and metadata associated with the provider.
func Provider() tfbridge.ProviderInfo {
	p := shimv1.NewProvider(consul.Provider().(*schema.Provider))
	prov := tfbridge.ProviderInfo{
		P:                    p,
		Name:                 "consul",
		Description:          "A Pulumi package for creating and managing consul resources.",
		Keywords:             []string{"pulumi", "consul"},
		License:              "Apache-2.0",
		Homepage:             "https://pulumi.io",
		Repository:           "https://github.com/pulumi/pulumi-consul",
		GitHubOrg:            "hashicorp",
		Config:               map[string]*tfbridge.SchemaInfo{},
		PreConfigureCallback: preConfigureCallback,
		Resources: map[string]*tfbridge.ResourceInfo{
			"consul_acl_auth_method": {
				Tok: makeResource(mainMod, "AclAuthMethod"),
				Docs: &tfbridge.DocInfo{
					Source: "acl_auth_method.markdown",
				},
			},
			"consul_acl_binding_rule": {
				Tok: makeResource(mainMod, "AclBindingRule"),
				Docs: &tfbridge.DocInfo{
					Source: "acl_binding_rule.markdown",
				},
			},
			"consul_acl_policy": {Tok: makeResource(mainMod, "AclPolicy")},
			"consul_acl_role": {
				Tok: makeResource(mainMod, "AclRole"),
				Docs: &tfbridge.DocInfo{
					Source: "acl_role.markdown",
				},
			},
			"consul_acl_token":                   {Tok: makeResource(mainMod, "AclToken")},
			"consul_acl_token_policy_attachment": {Tok: makeResource(mainMod, "AclTokenPolicyAttachment")},
			"consul_agent_service":               {Tok: makeResource(mainMod, "AgentService")},
			"consul_autopilot_config":            {Tok: makeResource(mainMod, "AutopilotConfig")},
			"consul_catalog_entry":               {Tok: makeResource(mainMod, "CatalogEntry")},
			"consul_config_entry": {
				Tok: makeResource(mainMod, "ConfigEntry"),
				Docs: &tfbridge.DocInfo{
					Source: "config_entry.markdown",
				},
			},
			"consul_intention": {Tok: makeResource(mainMod, "Intention")},
			"consul_key_prefix": {
				Tok: makeResource(mainMod, "KeyPrefix"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"subkey": {
						Name: "subkeyCollection",
					},
				},
			},
			"consul_keys": {
				Tok: makeResource(mainMod, "Keys"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"key": {
						CSharpName: "KeysCollection",
					},
				},
			},
			"consul_node": {Tok: makeResource(mainMod, "Node")},
			"consul_prepared_query": {
				Tok: makeResource(mainMod, "PreparedQuery"),
				Docs: &tfbridge.DocInfo{
					Source: "prepared_query.markdown",
				},
			},
			"consul_service": {Tok: makeResource(mainMod, "Service")},
			"consul_license": {
				Tok: makeResource(mainMod, "License"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"license": {
						CSharpName: "ConsulLicense",
					},
				},
			},
			"consul_namespace":             {Tok: makeResource(mainMod, "Namespace")},
			"consul_network_area":          {Tok: makeResource(mainMod, "NetworkArea")},
			"consul_certificate_authority": {Tok: makeResource(mainMod, "CertificateAuthority")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"consul_acl_auth_method":     {Tok: makeDataSource(mainMod, "getAclAuthMethod")},
			"consul_acl_policy":          {Tok: makeDataSource(mainMod, "getAclPolicy")},
			"consul_acl_role":            {Tok: makeDataSource(mainMod, "getAclRole")},
			"consul_acl_token":           {Tok: makeDataSource(mainMod, "getAclToken")},
			"consul_acl_token_secret_id": {Tok: makeDataSource(mainMod, "getAclTokenSecretId")},
			"consul_agent_config":        {Tok: makeDataSource(mainMod, "getAgentConfig")},
			"consul_agent_self":          {Tok: makeDataSource(mainMod, "getAgentSelf")},
			"consul_autopilot_health":    {Tok: makeDataSource(mainMod, "getAutopilotHealth")},
			"consul_catalog_nodes":       {Tok: makeDataSource(mainMod, "getCatalogNodes")},
			"consul_catalog_service":     {Tok: makeDataSource(mainMod, "getCatalogService")},
			"consul_catalog_services":    {Tok: makeDataSource(mainMod, "getCatalogServices")},
			"consul_key_prefix": {
				Tok: makeDataSource(mainMod, "getKeyPrefix"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"subkey": {
						Name: "subkeyCollection",
					},
				},
			},
			"consul_keys":                 {Tok: makeDataSource(mainMod, "getKeys")},
			"consul_nodes":                {Tok: makeDataSource(mainMod, "getNodes")},
			"consul_service":              {Tok: makeDataSource(mainMod, "getService")},
			"consul_service_health":       {Tok: makeDataSource(mainMod, "getServiceHealth")},
			"consul_services":             {Tok: makeDataSource(mainMod, "getServices")},
			"consul_network_area_members": {Tok: makeDataSource(mainMod, "getNetworkAreaMembers")},
			"consul_network_segments":     {Tok: makeDataSource(mainMod, "getNetworkSegments")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^2.15.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},

		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=2.15.0,<3.0.0",
			},
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "2.*",
				"System.Collections.Immutable": "1.6.0",
			},
			Namespaces: map[string]string{
				mainPkg: "Consul",
			},
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}
