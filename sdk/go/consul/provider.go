// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package consul

import (
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// The provider type for the consul package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}
	if args.Address == nil {
		args.Address = pulumi.StringPtr(getEnvOrDefault("localhost:8500", nil, "CONSUL_ADDRESS", "CONSUL_HTTP_ADDR").(string))
	}
	if args.CaFile == nil {
		args.CaFile = pulumi.StringPtr(getEnvOrDefault("", nil, "CONSUL_CA_FILE").(string))
	}
	if args.CaPath == nil {
		args.CaPath = pulumi.StringPtr(getEnvOrDefault("", nil, "CONSUL_CAPATH").(string))
	}
	if args.CertFile == nil {
		args.CertFile = pulumi.StringPtr(getEnvOrDefault("", nil, "CONSUL_CERT_FILE").(string))
	}
	if args.HttpAuth == nil {
		args.HttpAuth = pulumi.StringPtr(getEnvOrDefault("", nil, "CONSUL_HTTP_AUTH").(string))
	}
	if args.KeyFile == nil {
		args.KeyFile = pulumi.StringPtr(getEnvOrDefault("", nil, "CONSUL_KEY_FILE").(string))
	}
	if args.Scheme == nil {
		args.Scheme = pulumi.StringPtr(getEnvOrDefault("http", nil, "CONSUL_SCHEME", "CONSUL_HTTP_SCHEME").(string))
	}
	if args.Token == nil {
		args.Token = pulumi.StringPtr(getEnvOrDefault("", nil, "CONSUL_TOKEN", "CONSUL_HTTP_TOKEN").(string))
	}
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:consul", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	Address       *string `pulumi:"address"`
	CaFile        *string `pulumi:"caFile"`
	CaPath        *string `pulumi:"caPath"`
	CertFile      *string `pulumi:"certFile"`
	Datacenter    *string `pulumi:"datacenter"`
	HttpAuth      *string `pulumi:"httpAuth"`
	InsecureHttps *bool   `pulumi:"insecureHttps"`
	KeyFile       *string `pulumi:"keyFile"`
	Namespace     *string `pulumi:"namespace"`
	Scheme        *string `pulumi:"scheme"`
	Token         *string `pulumi:"token"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	Address       pulumi.StringPtrInput
	CaFile        pulumi.StringPtrInput
	CaPath        pulumi.StringPtrInput
	CertFile      pulumi.StringPtrInput
	Datacenter    pulumi.StringPtrInput
	HttpAuth      pulumi.StringPtrInput
	InsecureHttps pulumi.BoolPtrInput
	KeyFile       pulumi.StringPtrInput
	Namespace     pulumi.StringPtrInput
	Scheme        pulumi.StringPtrInput
	Token         pulumi.StringPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}