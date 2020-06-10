module github.com/pulumi/pulumi-consul/provider/v2

go 1.14

require (
	github.com/hashicorp/terraform-plugin-sdk v1.12.0
	github.com/pulumi/pulumi-auth0/provider v0.0.0-20200610201602-623215e10a44 // indirect
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.4.1-0.20200608011815-6feeb51f2d39
	github.com/pulumi/pulumi/sdk/v2 v2.3.1-0.20200607162109-9754465b04db
	github.com/terraform-providers/terraform-provider-consul v1.1.1-0.20200521135537-45c597fcbe0f
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/consul => github.com/hashicorp/consul v1.5.0
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
