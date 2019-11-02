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
	"unicode"

	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/hashicorp/terraform-plugin-sdk/terraform"
	"github.com/pulumi/pulumi-terraform-bridge/pkg/tfbridge"
	"github.com/pulumi/pulumi/pkg/resource"
	"github.com/pulumi/pulumi/pkg/tokens"
	"github.com/terraform-providers/terraform-provider-consul/consul"
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

func preConfigureCallback(vars resource.PropertyMap, c *terraform.ResourceConfig) error {
	return nil
}

// Provider returns additional overlaid schema and metadata associated with the provider.
func Provider() tfbridge.ProviderInfo {
	p := consul.Provider().(*schema.Provider)
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "consul",
		Description: "A Pulumi package for creating and managing consul resources.",
		Keywords:    []string{"pulumi", "consul"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		Repository:  "https://github.com/pulumi/pulumi-consul",
		Config: map[string]*tfbridge.SchemaInfo{
			"address": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{
						"CONSUL_ADDRESS",
						"CONSUL_HTTP_ADDR",
					},
					Value: "localhost:8500",
				},
			},
			"scheme": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{
						"CONSUL_SCHEME",
						"CONSUL_HTTP_SCHEME",
					},
					Value: "http",
				},
			},
			"http_auth": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"CONSUL_HTTP_AUTH"},
				},
			},
			"ca_file": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"CONSUL_CA_FILE"},
				},
			},
			"cert_file": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"CONSUL_CERT_FILE"},
				},
			},
			"key_file": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"CONSUL_KEY_FILE"},
				},
			},
			"ca_path": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"CONSUL_CAPATH"},
				},
			},
			"token": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{
						"CONSUL_TOKEN",
						"CONSUL_HTTP_TOKEN",
					},
				},
			},
		},
		PreConfigureCallback: preConfigureCallback,
		Resources: map[string]*tfbridge.ResourceInfo{
			"consul_acl_auth_method":             {Tok: makeResource(mainMod, "AclAuthMethod")},
			"consul_acl_binding_rule":            {Tok: makeResource(mainMod, "AclBindingRule")},
			"consul_acl_policy":                  {Tok: makeResource(mainMod, "AclPolicy")},
			"consul_acl_role":                    {Tok: makeResource(mainMod, "AclRole")},
			"consul_acl_token":                   {Tok: makeResource(mainMod, "AclToken")},
			"consul_acl_token_policy_attachment": {Tok: makeResource(mainMod, "AclTokenPolicyAttachment")},
			"consul_agent_service":               {Tok: makeResource(mainMod, "AgentService")},
			"consul_autopilot_config":            {Tok: makeResource(mainMod, "AutopilotConfig")},
			"consul_catalog_entry":               {Tok: makeResource(mainMod, "CatalogEntry")},
			"consul_config_entry":                {Tok: makeResource(mainMod, "ConfigEntry")},
			"consul_intention":                   {Tok: makeResource(mainMod, "Intention")},
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
			"consul_node":           {Tok: makeResource(mainMod, "Node")},
			"consul_prepared_query": {Tok: makeResource(mainMod, "PreparedQuery")},
			"consul_service":        {Tok: makeResource(mainMod, "Service")},
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
			"consul_keys":           {Tok: makeDataSource(mainMod, "getKeys")},
			"consul_nodes":          {Tok: makeDataSource(mainMod, "getNodes")},
			"consul_service":        {Tok: makeDataSource(mainMod, "getService")},
			"consul_service_health": {Tok: makeDataSource(mainMod, "getServiceHealth")},
			"consul_services":       {Tok: makeDataSource(mainMod, "getServices")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "latest",
			},
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=1.0.0,<2.0.0",
			},
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "1.5.0-*",
				"System.Collections.Immutable": "1.6.0",
			},
		},
	}

	// For all resources with name properties, we will add an auto-name property.  Make sure to skip those that
	// already have a name mapping entry, since those may have custom overrides set above (e.g., for length).
	const nameProperty = "name"
	for resname, res := range prov.Resources {
		if resourceSchema := p.ResourcesMap[resname]; resourceSchema != nil {
			// Only apply auto-name to input properties (Optional || Required) named `name`
			if tfs, has := resourceSchema.Schema[nameProperty]; has && (tfs.Optional || tfs.Required) {
				if _, hasfield := res.Fields[nameProperty]; !hasfield {
					if res.Fields == nil {
						res.Fields = make(map[string]*tfbridge.SchemaInfo)
					}
					res.Fields[nameProperty] = tfbridge.AutoName(nameProperty, 255)
				}
			}
		}
	}

	return prov
}
