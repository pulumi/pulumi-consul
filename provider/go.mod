module github.com/pulumi/pulumi-consul/provider/v3

go 1.16

require (
	github.com/hashicorp/terraform-plugin-sdk v1.12.0
	github.com/hashicorp/terraform-provider-consul v1.1.1-0.20210512155551-b8fe8859dc3c
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.2.1
	github.com/pulumi/pulumi/pkg/v3 v3.3.2-0.20210526172205-85142462c7ed
	github.com/pulumi/pulumi/sdk/v3 v3.3.2-0.20210526172205-85142462c7ed
)

replace (
	github.com/hashicorp/consul => github.com/hashicorp/consul v1.5.0
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
