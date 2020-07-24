module github.com/pulumi/pulumi-consul/provider/v2

go 1.14

require (
	github.com/hashicorp/terraform-plugin-sdk v1.12.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.5.2
	github.com/pulumi/pulumi/sdk/v2 v2.5.1-0.20200630091945-bb358c4d2173
	github.com/terraform-providers/terraform-provider-consul v1.1.1-0.20200723145626-a6f65f2da82a
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/consul => github.com/hashicorp/consul v1.5.0
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
