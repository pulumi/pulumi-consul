module github.com/pulumi/pulumi-consul/provider/v3

go 1.16

require (
	github.com/hashicorp/terraform-plugin-sdk v1.12.0
	github.com/hashicorp/terraform-provider-consul v1.1.1-0.20210114144241-fe7216563490
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.0.0-beta.1
	github.com/pulumi/pulumi/sdk/v3 v3.0.0-beta.2
)

replace (
	github.com/hashicorp/consul => github.com/hashicorp/consul v1.5.0
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
