// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package consul

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-consul/sdk/v3/go/consul/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-consul/sdk/v3/go/consul"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := consul.NewKeyPrefix(ctx, "myapp_config", &consul.KeyPrefixArgs{
//				Datacenter: pulumi.String("nyc1"),
//				Token:      pulumi.String("abcd"),
//				PathPrefix: pulumi.String("myapp/config/"),
//				Subkeys: pulumi.StringMap{
//					"elb_cname":         pulumi.Any(appAwsElb.DnsName),
//					"s3_bucket_name":    pulumi.Any(appAwsS3Bucket.Bucket),
//					"database/hostname": pulumi.Any(app.Address),
//					"database/port":     pulumi.Any(app.Port),
//					"database/username": pulumi.Any(app.Username),
//					"database/name":     pulumi.Any(app.Name),
//				},
//				SubkeyCollection: consul.KeyPrefixSubkeyCollectionArray{
//					&consul.KeyPrefixSubkeyCollectionArgs{
//						Path:  pulumi.String("database/password"),
//						Value: pulumi.Any(app.Password),
//						Flags: pulumi.Int(2),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// `consul_key_prefix` can be imported. This is useful when the path already exists and
// you know all keys in path should be managed by Terraform.
//
// ```sh
// $ pulumi import consul:index/keyPrefix:KeyPrefix myapp_config myapp/config/
// ```
type KeyPrefix struct {
	pulumi.CustomResourceState

	// The datacenter to use. This overrides the
	// agent's default datacenter and the datacenter in the provider setup.
	Datacenter pulumi.StringOutput `pulumi:"datacenter"`
	// The namespace to create the keys within.
	Namespace pulumi.StringPtrOutput `pulumi:"namespace"`
	// The admin partition to create the keys within.
	Partition pulumi.StringPtrOutput `pulumi:"partition"`
	// Specifies the common prefix shared by all keys
	// that will be managed by this resource instance. In most cases this will
	// end with a slash, to manage a "folder" of keys.
	PathPrefix pulumi.StringOutput `pulumi:"pathPrefix"`
	// A subkey to add. Supported values documented below.
	// Multiple blocks supported.
	SubkeyCollection KeyPrefixSubkeyCollectionArrayOutput `pulumi:"subkeyCollection"`
	// A mapping from subkey name (which will be appended
	// to the given `pathPrefix`) to the value that should be stored at that key.
	// Use slashes, as shown in the above example, to create "sub-folders" under
	// the given path prefix.
	Subkeys pulumi.StringMapOutput `pulumi:"subkeys"`
	// The ACL token to use. This overrides the
	// token that the agent provides by default.
	//
	// Deprecated: The token argument has been deprecated and will be removed in a future release.
	// Please use the token argument in the provider configuration
	Token pulumi.StringPtrOutput `pulumi:"token"`
}

// NewKeyPrefix registers a new resource with the given unique name, arguments, and options.
func NewKeyPrefix(ctx *pulumi.Context,
	name string, args *KeyPrefixArgs, opts ...pulumi.ResourceOption) (*KeyPrefix, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PathPrefix == nil {
		return nil, errors.New("invalid value for required argument 'PathPrefix'")
	}
	if args.Token != nil {
		args.Token = pulumi.ToSecret(args.Token).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"token",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource KeyPrefix
	err := ctx.RegisterResource("consul:index/keyPrefix:KeyPrefix", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKeyPrefix gets an existing KeyPrefix resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKeyPrefix(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KeyPrefixState, opts ...pulumi.ResourceOption) (*KeyPrefix, error) {
	var resource KeyPrefix
	err := ctx.ReadResource("consul:index/keyPrefix:KeyPrefix", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering KeyPrefix resources.
type keyPrefixState struct {
	// The datacenter to use. This overrides the
	// agent's default datacenter and the datacenter in the provider setup.
	Datacenter *string `pulumi:"datacenter"`
	// The namespace to create the keys within.
	Namespace *string `pulumi:"namespace"`
	// The admin partition to create the keys within.
	Partition *string `pulumi:"partition"`
	// Specifies the common prefix shared by all keys
	// that will be managed by this resource instance. In most cases this will
	// end with a slash, to manage a "folder" of keys.
	PathPrefix *string `pulumi:"pathPrefix"`
	// A subkey to add. Supported values documented below.
	// Multiple blocks supported.
	SubkeyCollection []KeyPrefixSubkeyCollection `pulumi:"subkeyCollection"`
	// A mapping from subkey name (which will be appended
	// to the given `pathPrefix`) to the value that should be stored at that key.
	// Use slashes, as shown in the above example, to create "sub-folders" under
	// the given path prefix.
	Subkeys map[string]string `pulumi:"subkeys"`
	// The ACL token to use. This overrides the
	// token that the agent provides by default.
	//
	// Deprecated: The token argument has been deprecated and will be removed in a future release.
	// Please use the token argument in the provider configuration
	Token *string `pulumi:"token"`
}

type KeyPrefixState struct {
	// The datacenter to use. This overrides the
	// agent's default datacenter and the datacenter in the provider setup.
	Datacenter pulumi.StringPtrInput
	// The namespace to create the keys within.
	Namespace pulumi.StringPtrInput
	// The admin partition to create the keys within.
	Partition pulumi.StringPtrInput
	// Specifies the common prefix shared by all keys
	// that will be managed by this resource instance. In most cases this will
	// end with a slash, to manage a "folder" of keys.
	PathPrefix pulumi.StringPtrInput
	// A subkey to add. Supported values documented below.
	// Multiple blocks supported.
	SubkeyCollection KeyPrefixSubkeyCollectionArrayInput
	// A mapping from subkey name (which will be appended
	// to the given `pathPrefix`) to the value that should be stored at that key.
	// Use slashes, as shown in the above example, to create "sub-folders" under
	// the given path prefix.
	Subkeys pulumi.StringMapInput
	// The ACL token to use. This overrides the
	// token that the agent provides by default.
	//
	// Deprecated: The token argument has been deprecated and will be removed in a future release.
	// Please use the token argument in the provider configuration
	Token pulumi.StringPtrInput
}

func (KeyPrefixState) ElementType() reflect.Type {
	return reflect.TypeOf((*keyPrefixState)(nil)).Elem()
}

type keyPrefixArgs struct {
	// The datacenter to use. This overrides the
	// agent's default datacenter and the datacenter in the provider setup.
	Datacenter *string `pulumi:"datacenter"`
	// The namespace to create the keys within.
	Namespace *string `pulumi:"namespace"`
	// The admin partition to create the keys within.
	Partition *string `pulumi:"partition"`
	// Specifies the common prefix shared by all keys
	// that will be managed by this resource instance. In most cases this will
	// end with a slash, to manage a "folder" of keys.
	PathPrefix string `pulumi:"pathPrefix"`
	// A subkey to add. Supported values documented below.
	// Multiple blocks supported.
	SubkeyCollection []KeyPrefixSubkeyCollection `pulumi:"subkeyCollection"`
	// A mapping from subkey name (which will be appended
	// to the given `pathPrefix`) to the value that should be stored at that key.
	// Use slashes, as shown in the above example, to create "sub-folders" under
	// the given path prefix.
	Subkeys map[string]string `pulumi:"subkeys"`
	// The ACL token to use. This overrides the
	// token that the agent provides by default.
	//
	// Deprecated: The token argument has been deprecated and will be removed in a future release.
	// Please use the token argument in the provider configuration
	Token *string `pulumi:"token"`
}

// The set of arguments for constructing a KeyPrefix resource.
type KeyPrefixArgs struct {
	// The datacenter to use. This overrides the
	// agent's default datacenter and the datacenter in the provider setup.
	Datacenter pulumi.StringPtrInput
	// The namespace to create the keys within.
	Namespace pulumi.StringPtrInput
	// The admin partition to create the keys within.
	Partition pulumi.StringPtrInput
	// Specifies the common prefix shared by all keys
	// that will be managed by this resource instance. In most cases this will
	// end with a slash, to manage a "folder" of keys.
	PathPrefix pulumi.StringInput
	// A subkey to add. Supported values documented below.
	// Multiple blocks supported.
	SubkeyCollection KeyPrefixSubkeyCollectionArrayInput
	// A mapping from subkey name (which will be appended
	// to the given `pathPrefix`) to the value that should be stored at that key.
	// Use slashes, as shown in the above example, to create "sub-folders" under
	// the given path prefix.
	Subkeys pulumi.StringMapInput
	// The ACL token to use. This overrides the
	// token that the agent provides by default.
	//
	// Deprecated: The token argument has been deprecated and will be removed in a future release.
	// Please use the token argument in the provider configuration
	Token pulumi.StringPtrInput
}

func (KeyPrefixArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*keyPrefixArgs)(nil)).Elem()
}

type KeyPrefixInput interface {
	pulumi.Input

	ToKeyPrefixOutput() KeyPrefixOutput
	ToKeyPrefixOutputWithContext(ctx context.Context) KeyPrefixOutput
}

func (*KeyPrefix) ElementType() reflect.Type {
	return reflect.TypeOf((**KeyPrefix)(nil)).Elem()
}

func (i *KeyPrefix) ToKeyPrefixOutput() KeyPrefixOutput {
	return i.ToKeyPrefixOutputWithContext(context.Background())
}

func (i *KeyPrefix) ToKeyPrefixOutputWithContext(ctx context.Context) KeyPrefixOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KeyPrefixOutput)
}

// KeyPrefixArrayInput is an input type that accepts KeyPrefixArray and KeyPrefixArrayOutput values.
// You can construct a concrete instance of `KeyPrefixArrayInput` via:
//
//	KeyPrefixArray{ KeyPrefixArgs{...} }
type KeyPrefixArrayInput interface {
	pulumi.Input

	ToKeyPrefixArrayOutput() KeyPrefixArrayOutput
	ToKeyPrefixArrayOutputWithContext(context.Context) KeyPrefixArrayOutput
}

type KeyPrefixArray []KeyPrefixInput

func (KeyPrefixArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KeyPrefix)(nil)).Elem()
}

func (i KeyPrefixArray) ToKeyPrefixArrayOutput() KeyPrefixArrayOutput {
	return i.ToKeyPrefixArrayOutputWithContext(context.Background())
}

func (i KeyPrefixArray) ToKeyPrefixArrayOutputWithContext(ctx context.Context) KeyPrefixArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KeyPrefixArrayOutput)
}

// KeyPrefixMapInput is an input type that accepts KeyPrefixMap and KeyPrefixMapOutput values.
// You can construct a concrete instance of `KeyPrefixMapInput` via:
//
//	KeyPrefixMap{ "key": KeyPrefixArgs{...} }
type KeyPrefixMapInput interface {
	pulumi.Input

	ToKeyPrefixMapOutput() KeyPrefixMapOutput
	ToKeyPrefixMapOutputWithContext(context.Context) KeyPrefixMapOutput
}

type KeyPrefixMap map[string]KeyPrefixInput

func (KeyPrefixMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KeyPrefix)(nil)).Elem()
}

func (i KeyPrefixMap) ToKeyPrefixMapOutput() KeyPrefixMapOutput {
	return i.ToKeyPrefixMapOutputWithContext(context.Background())
}

func (i KeyPrefixMap) ToKeyPrefixMapOutputWithContext(ctx context.Context) KeyPrefixMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KeyPrefixMapOutput)
}

type KeyPrefixOutput struct{ *pulumi.OutputState }

func (KeyPrefixOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**KeyPrefix)(nil)).Elem()
}

func (o KeyPrefixOutput) ToKeyPrefixOutput() KeyPrefixOutput {
	return o
}

func (o KeyPrefixOutput) ToKeyPrefixOutputWithContext(ctx context.Context) KeyPrefixOutput {
	return o
}

// The datacenter to use. This overrides the
// agent's default datacenter and the datacenter in the provider setup.
func (o KeyPrefixOutput) Datacenter() pulumi.StringOutput {
	return o.ApplyT(func(v *KeyPrefix) pulumi.StringOutput { return v.Datacenter }).(pulumi.StringOutput)
}

// The namespace to create the keys within.
func (o KeyPrefixOutput) Namespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KeyPrefix) pulumi.StringPtrOutput { return v.Namespace }).(pulumi.StringPtrOutput)
}

// The admin partition to create the keys within.
func (o KeyPrefixOutput) Partition() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KeyPrefix) pulumi.StringPtrOutput { return v.Partition }).(pulumi.StringPtrOutput)
}

// Specifies the common prefix shared by all keys
// that will be managed by this resource instance. In most cases this will
// end with a slash, to manage a "folder" of keys.
func (o KeyPrefixOutput) PathPrefix() pulumi.StringOutput {
	return o.ApplyT(func(v *KeyPrefix) pulumi.StringOutput { return v.PathPrefix }).(pulumi.StringOutput)
}

// A subkey to add. Supported values documented below.
// Multiple blocks supported.
func (o KeyPrefixOutput) SubkeyCollection() KeyPrefixSubkeyCollectionArrayOutput {
	return o.ApplyT(func(v *KeyPrefix) KeyPrefixSubkeyCollectionArrayOutput { return v.SubkeyCollection }).(KeyPrefixSubkeyCollectionArrayOutput)
}

// A mapping from subkey name (which will be appended
// to the given `pathPrefix`) to the value that should be stored at that key.
// Use slashes, as shown in the above example, to create "sub-folders" under
// the given path prefix.
func (o KeyPrefixOutput) Subkeys() pulumi.StringMapOutput {
	return o.ApplyT(func(v *KeyPrefix) pulumi.StringMapOutput { return v.Subkeys }).(pulumi.StringMapOutput)
}

// The ACL token to use. This overrides the
// token that the agent provides by default.
//
// Deprecated: The token argument has been deprecated and will be removed in a future release.
// Please use the token argument in the provider configuration
func (o KeyPrefixOutput) Token() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KeyPrefix) pulumi.StringPtrOutput { return v.Token }).(pulumi.StringPtrOutput)
}

type KeyPrefixArrayOutput struct{ *pulumi.OutputState }

func (KeyPrefixArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KeyPrefix)(nil)).Elem()
}

func (o KeyPrefixArrayOutput) ToKeyPrefixArrayOutput() KeyPrefixArrayOutput {
	return o
}

func (o KeyPrefixArrayOutput) ToKeyPrefixArrayOutputWithContext(ctx context.Context) KeyPrefixArrayOutput {
	return o
}

func (o KeyPrefixArrayOutput) Index(i pulumi.IntInput) KeyPrefixOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *KeyPrefix {
		return vs[0].([]*KeyPrefix)[vs[1].(int)]
	}).(KeyPrefixOutput)
}

type KeyPrefixMapOutput struct{ *pulumi.OutputState }

func (KeyPrefixMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KeyPrefix)(nil)).Elem()
}

func (o KeyPrefixMapOutput) ToKeyPrefixMapOutput() KeyPrefixMapOutput {
	return o
}

func (o KeyPrefixMapOutput) ToKeyPrefixMapOutputWithContext(ctx context.Context) KeyPrefixMapOutput {
	return o
}

func (o KeyPrefixMapOutput) MapIndex(k pulumi.StringInput) KeyPrefixOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *KeyPrefix {
		return vs[0].(map[string]*KeyPrefix)[vs[1].(string)]
	}).(KeyPrefixOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*KeyPrefixInput)(nil)).Elem(), &KeyPrefix{})
	pulumi.RegisterInputType(reflect.TypeOf((*KeyPrefixArrayInput)(nil)).Elem(), KeyPrefixArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*KeyPrefixMapInput)(nil)).Elem(), KeyPrefixMap{})
	pulumi.RegisterOutputType(KeyPrefixOutput{})
	pulumi.RegisterOutputType(KeyPrefixArrayOutput{})
	pulumi.RegisterOutputType(KeyPrefixMapOutput{})
}
