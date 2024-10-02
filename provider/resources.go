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
	"bytes"
	"fmt"
	"path/filepath"

	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/hashicorp/terraform-provider-consul/consul"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tks "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfgen"
	shimv1 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v1"

	"github.com/pulumi/pulumi-consul/provider/v3/pkg/version"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "consul"

	// modules:
	mainMod = "index"
)

// Provider returns additional overlaid schema and metadata associated with the provider.
func Provider() tfbridge.ProviderInfo {
	p := shimv1.NewProvider(consul.Provider().(*schema.Provider))
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "consul",
		Description: "A Pulumi package for creating and managing consul resources.",
		Keywords:    []string{"pulumi", "consul"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		Repository:  "https://github.com/pulumi/pulumi-consul",
		GitHubOrg:   "hashicorp",
		Config:      map[string]*tfbridge.SchemaInfo{},
		DocRules:    &tfbridge.DocRuleInfo{EditRules: docEditRules},
		Resources: map[string]*tfbridge.ResourceInfo{
			"consul_acl_auth_method": {
				Docs: &tfbridge.DocInfo{
					Source: "acl_auth_method.markdown",
				},
			},
			"consul_acl_binding_rule": {
				Docs: &tfbridge.DocInfo{
					Source: "acl_binding_rule.markdown",
				},
			},
			"consul_acl_role": {
				Docs: &tfbridge.DocInfo{
					Source: "acl_role.markdown",
				},
			},
			"consul_config_entry": {
				Docs: &tfbridge.DocInfo{
					Source: "config_entry.markdown",
				},
			},
			"consul_key_prefix": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"subkey": {
						Name: "subkeyCollection",
					},
				},
			},
			"consul_keys": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"key": {
						CSharpName: "KeysCollection",
					},
				},
			},
			"consul_prepared_query": {
				Docs: &tfbridge.DocInfo{
					Source: "prepared_query.markdown",
				},
			},
			"consul_license": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"license": {
						CSharpName: "ConsulLicense",
					},
				},
			},
			"consul_peering_token": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"peering_token": {
						CSharpName: "Token",
					},
				},
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"consul_catalog_nodes": {
				Docs: &tfbridge.DocInfo{
					Source: "nodes.md",
				},
				DeprecationMessage: "getCatalogNodes has been deprecated in favor of getNodes",
			},
			"consul_catalog_service": {
				Docs: &tfbridge.DocInfo{
					Source: "service.md",
				},
				DeprecationMessage: "getCatalogService has been deprecated in favor of getService",
			},
			"consul_catalog_services": {
				Docs: &tfbridge.DocInfo{
					Source: "services.md",
				},
				DeprecationMessage: "getCatalogServices has been deprecated in favor of getServices",
			},
			"consul_key_prefix": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"subkey": {
						Name: "subkeyCollection",
					},
				},
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},

		Python: (func() *tfbridge.PythonInfo {
			i := &tfbridge.PythonInfo{
				RespectSchemaVersion: true,
			}
			i.PyProject.Enabled = true
			return i
		})(),

		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: map[string]string{
				mainPkg: "Consul",
			},
		},
	}

	prov.MustComputeTokens(tks.SingleModule("consul_", mainMod, tks.MakeStandard(mainPkg)))

	prov.SetAutonaming(255, "-")

	return prov
}

func docEditRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	return append(
		defaults,
		removeRemoteStateBackend,
		skipCompatibilitySection,
	)
}

var remoteStateBackendNote = "~> **NOTE:** The Consul provider should not be confused with the " +
	"[Consul remote\nstate backend][consul-remote-state-backend], which is one of many backends " +
	"that\ncan be used to store Terraform state. The Consul provider is instead used to\nmanage " +
	"resources within Consul itself, such as adding external services or\nworking with the key/value " +
	"store.\n\n[consul-remote-state-backend]: /docs/backends/types/consul.html\n"

// Removes a reference to Consul Remote State Backend
var removeRemoteStateBackend = tfbridge.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		before, after, _ := bytes.Cut(content, []byte(remoteStateBackendNote))
		content = append(before, after...)
		return content, nil
	},
}

// Skip a section on compatibility with TF provider versions
var skipCompatibilitySection = tfbridge.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		return tfgen.SkipSectionByHeaderContent(content, func(headerText string) bool {
			return headerText == "Compatibility"
		})
	},
}
