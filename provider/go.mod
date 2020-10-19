module github.com/pulumi/pulumi-consul/provider/v2

go 1.14

require (
	github.com/hashicorp/terraform-plugin-sdk v1.12.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.9.1
	github.com/pulumi/pulumi/sdk/v2 v2.10.0
	github.com/hashicorp/terraform-provider-consul v1.1.1-0.20200918230306-90ea2cd14250
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/consul => github.com/hashicorp/consul v1.5.0
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
