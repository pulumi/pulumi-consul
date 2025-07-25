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

// ## Import
//
// `consul_acl_token_policy_attachment` can be imported. This is especially useful to manage the
//
// policies attached to the anonymous and the master tokens with Terraform:
//
// ```sh
// $ pulumi import consul:index/aclTokenPolicyAttachment:AclTokenPolicyAttachment anonymous 00000000-0000-0000-0000-000000000002:policy_name
// ```
//
// ```sh
// $ pulumi import consul:index/aclTokenPolicyAttachment:AclTokenPolicyAttachment master-token 624d94ca-bc5c-f960-4e83-0a609cf588be:policy_name
// ```
type AclTokenPolicyAttachment struct {
	pulumi.CustomResourceState

	// The name of the policy attached to the token.
	Policy pulumi.StringOutput `pulumi:"policy"`
	// The id of the token.
	TokenId pulumi.StringOutput `pulumi:"tokenId"`
}

// NewAclTokenPolicyAttachment registers a new resource with the given unique name, arguments, and options.
func NewAclTokenPolicyAttachment(ctx *pulumi.Context,
	name string, args *AclTokenPolicyAttachmentArgs, opts ...pulumi.ResourceOption) (*AclTokenPolicyAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Policy == nil {
		return nil, errors.New("invalid value for required argument 'Policy'")
	}
	if args.TokenId == nil {
		return nil, errors.New("invalid value for required argument 'TokenId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AclTokenPolicyAttachment
	err := ctx.RegisterResource("consul:index/aclTokenPolicyAttachment:AclTokenPolicyAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAclTokenPolicyAttachment gets an existing AclTokenPolicyAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAclTokenPolicyAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AclTokenPolicyAttachmentState, opts ...pulumi.ResourceOption) (*AclTokenPolicyAttachment, error) {
	var resource AclTokenPolicyAttachment
	err := ctx.ReadResource("consul:index/aclTokenPolicyAttachment:AclTokenPolicyAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AclTokenPolicyAttachment resources.
type aclTokenPolicyAttachmentState struct {
	// The name of the policy attached to the token.
	Policy *string `pulumi:"policy"`
	// The id of the token.
	TokenId *string `pulumi:"tokenId"`
}

type AclTokenPolicyAttachmentState struct {
	// The name of the policy attached to the token.
	Policy pulumi.StringPtrInput
	// The id of the token.
	TokenId pulumi.StringPtrInput
}

func (AclTokenPolicyAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*aclTokenPolicyAttachmentState)(nil)).Elem()
}

type aclTokenPolicyAttachmentArgs struct {
	// The name of the policy attached to the token.
	Policy string `pulumi:"policy"`
	// The id of the token.
	TokenId string `pulumi:"tokenId"`
}

// The set of arguments for constructing a AclTokenPolicyAttachment resource.
type AclTokenPolicyAttachmentArgs struct {
	// The name of the policy attached to the token.
	Policy pulumi.StringInput
	// The id of the token.
	TokenId pulumi.StringInput
}

func (AclTokenPolicyAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*aclTokenPolicyAttachmentArgs)(nil)).Elem()
}

type AclTokenPolicyAttachmentInput interface {
	pulumi.Input

	ToAclTokenPolicyAttachmentOutput() AclTokenPolicyAttachmentOutput
	ToAclTokenPolicyAttachmentOutputWithContext(ctx context.Context) AclTokenPolicyAttachmentOutput
}

func (*AclTokenPolicyAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**AclTokenPolicyAttachment)(nil)).Elem()
}

func (i *AclTokenPolicyAttachment) ToAclTokenPolicyAttachmentOutput() AclTokenPolicyAttachmentOutput {
	return i.ToAclTokenPolicyAttachmentOutputWithContext(context.Background())
}

func (i *AclTokenPolicyAttachment) ToAclTokenPolicyAttachmentOutputWithContext(ctx context.Context) AclTokenPolicyAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclTokenPolicyAttachmentOutput)
}

// AclTokenPolicyAttachmentArrayInput is an input type that accepts AclTokenPolicyAttachmentArray and AclTokenPolicyAttachmentArrayOutput values.
// You can construct a concrete instance of `AclTokenPolicyAttachmentArrayInput` via:
//
//	AclTokenPolicyAttachmentArray{ AclTokenPolicyAttachmentArgs{...} }
type AclTokenPolicyAttachmentArrayInput interface {
	pulumi.Input

	ToAclTokenPolicyAttachmentArrayOutput() AclTokenPolicyAttachmentArrayOutput
	ToAclTokenPolicyAttachmentArrayOutputWithContext(context.Context) AclTokenPolicyAttachmentArrayOutput
}

type AclTokenPolicyAttachmentArray []AclTokenPolicyAttachmentInput

func (AclTokenPolicyAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AclTokenPolicyAttachment)(nil)).Elem()
}

func (i AclTokenPolicyAttachmentArray) ToAclTokenPolicyAttachmentArrayOutput() AclTokenPolicyAttachmentArrayOutput {
	return i.ToAclTokenPolicyAttachmentArrayOutputWithContext(context.Background())
}

func (i AclTokenPolicyAttachmentArray) ToAclTokenPolicyAttachmentArrayOutputWithContext(ctx context.Context) AclTokenPolicyAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclTokenPolicyAttachmentArrayOutput)
}

// AclTokenPolicyAttachmentMapInput is an input type that accepts AclTokenPolicyAttachmentMap and AclTokenPolicyAttachmentMapOutput values.
// You can construct a concrete instance of `AclTokenPolicyAttachmentMapInput` via:
//
//	AclTokenPolicyAttachmentMap{ "key": AclTokenPolicyAttachmentArgs{...} }
type AclTokenPolicyAttachmentMapInput interface {
	pulumi.Input

	ToAclTokenPolicyAttachmentMapOutput() AclTokenPolicyAttachmentMapOutput
	ToAclTokenPolicyAttachmentMapOutputWithContext(context.Context) AclTokenPolicyAttachmentMapOutput
}

type AclTokenPolicyAttachmentMap map[string]AclTokenPolicyAttachmentInput

func (AclTokenPolicyAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AclTokenPolicyAttachment)(nil)).Elem()
}

func (i AclTokenPolicyAttachmentMap) ToAclTokenPolicyAttachmentMapOutput() AclTokenPolicyAttachmentMapOutput {
	return i.ToAclTokenPolicyAttachmentMapOutputWithContext(context.Background())
}

func (i AclTokenPolicyAttachmentMap) ToAclTokenPolicyAttachmentMapOutputWithContext(ctx context.Context) AclTokenPolicyAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclTokenPolicyAttachmentMapOutput)
}

type AclTokenPolicyAttachmentOutput struct{ *pulumi.OutputState }

func (AclTokenPolicyAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AclTokenPolicyAttachment)(nil)).Elem()
}

func (o AclTokenPolicyAttachmentOutput) ToAclTokenPolicyAttachmentOutput() AclTokenPolicyAttachmentOutput {
	return o
}

func (o AclTokenPolicyAttachmentOutput) ToAclTokenPolicyAttachmentOutputWithContext(ctx context.Context) AclTokenPolicyAttachmentOutput {
	return o
}

// The name of the policy attached to the token.
func (o AclTokenPolicyAttachmentOutput) Policy() pulumi.StringOutput {
	return o.ApplyT(func(v *AclTokenPolicyAttachment) pulumi.StringOutput { return v.Policy }).(pulumi.StringOutput)
}

// The id of the token.
func (o AclTokenPolicyAttachmentOutput) TokenId() pulumi.StringOutput {
	return o.ApplyT(func(v *AclTokenPolicyAttachment) pulumi.StringOutput { return v.TokenId }).(pulumi.StringOutput)
}

type AclTokenPolicyAttachmentArrayOutput struct{ *pulumi.OutputState }

func (AclTokenPolicyAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AclTokenPolicyAttachment)(nil)).Elem()
}

func (o AclTokenPolicyAttachmentArrayOutput) ToAclTokenPolicyAttachmentArrayOutput() AclTokenPolicyAttachmentArrayOutput {
	return o
}

func (o AclTokenPolicyAttachmentArrayOutput) ToAclTokenPolicyAttachmentArrayOutputWithContext(ctx context.Context) AclTokenPolicyAttachmentArrayOutput {
	return o
}

func (o AclTokenPolicyAttachmentArrayOutput) Index(i pulumi.IntInput) AclTokenPolicyAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AclTokenPolicyAttachment {
		return vs[0].([]*AclTokenPolicyAttachment)[vs[1].(int)]
	}).(AclTokenPolicyAttachmentOutput)
}

type AclTokenPolicyAttachmentMapOutput struct{ *pulumi.OutputState }

func (AclTokenPolicyAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AclTokenPolicyAttachment)(nil)).Elem()
}

func (o AclTokenPolicyAttachmentMapOutput) ToAclTokenPolicyAttachmentMapOutput() AclTokenPolicyAttachmentMapOutput {
	return o
}

func (o AclTokenPolicyAttachmentMapOutput) ToAclTokenPolicyAttachmentMapOutputWithContext(ctx context.Context) AclTokenPolicyAttachmentMapOutput {
	return o
}

func (o AclTokenPolicyAttachmentMapOutput) MapIndex(k pulumi.StringInput) AclTokenPolicyAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AclTokenPolicyAttachment {
		return vs[0].(map[string]*AclTokenPolicyAttachment)[vs[1].(string)]
	}).(AclTokenPolicyAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AclTokenPolicyAttachmentInput)(nil)).Elem(), &AclTokenPolicyAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*AclTokenPolicyAttachmentArrayInput)(nil)).Elem(), AclTokenPolicyAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AclTokenPolicyAttachmentMapInput)(nil)).Elem(), AclTokenPolicyAttachmentMap{})
	pulumi.RegisterOutputType(AclTokenPolicyAttachmentOutput{})
	pulumi.RegisterOutputType(AclTokenPolicyAttachmentArrayOutput{})
	pulumi.RegisterOutputType(AclTokenPolicyAttachmentMapOutput{})
}
