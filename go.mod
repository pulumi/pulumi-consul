module github.com/pulumi/pulumi-consul

go 1.12

require (
	github.com/hashicorp/terraform-plugin-sdk v1.2.0
	github.com/pulumi/pulumi v1.4.0
	github.com/pulumi/pulumi-terraform-bridge v1.1.0
	github.com/terraform-providers/terraform-provider-consul v0.0.0-20191025151742-3d78dec813d9
)

replace github.com/hashicorp/consul/api => github.com/hashicorp/consul/api v1.2.0
