module github.com/pulumi/pulumi-consul

go 1.13

require (
	github.com/hashicorp/terraform-plugin-sdk v1.2.0
	github.com/pkg/errors v0.8.1
	github.com/pulumi/pulumi v1.12.2-0.20200313044354-8111d33438b9
	github.com/pulumi/pulumi-terraform-bridge v1.8.2
	github.com/terraform-providers/terraform-provider-consul v1.1.1-0.20200326204544-6a3c38fc1ba8
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/consul => github.com/hashicorp/consul v1.5.0
	github.com/hashicorp/vault => github.com/hashicorp/vault v1.2.0
)
