// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package consul

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// `consul_acl_token_role_attachment` can be imported. This is especially useful to manage the policies attached to the anonymous and the master tokens with Terraform
//
// ```sh
//  $ pulumi import consul:index/aclTokenRoleAttachment:AclTokenRoleAttachment anonymous token_id:role_id
// ```
type AclTokenRoleAttachment struct {
	pulumi.CustomResourceState

	// The role name.
	Role pulumi.StringOutput `pulumi:"role"`
	// The id of the token.
	TokenId pulumi.StringOutput `pulumi:"tokenId"`
}

// NewAclTokenRoleAttachment registers a new resource with the given unique name, arguments, and options.
func NewAclTokenRoleAttachment(ctx *pulumi.Context,
	name string, args *AclTokenRoleAttachmentArgs, opts ...pulumi.ResourceOption) (*AclTokenRoleAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	if args.TokenId == nil {
		return nil, errors.New("invalid value for required argument 'TokenId'")
	}
	var resource AclTokenRoleAttachment
	err := ctx.RegisterResource("consul:index/aclTokenRoleAttachment:AclTokenRoleAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAclTokenRoleAttachment gets an existing AclTokenRoleAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAclTokenRoleAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AclTokenRoleAttachmentState, opts ...pulumi.ResourceOption) (*AclTokenRoleAttachment, error) {
	var resource AclTokenRoleAttachment
	err := ctx.ReadResource("consul:index/aclTokenRoleAttachment:AclTokenRoleAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AclTokenRoleAttachment resources.
type aclTokenRoleAttachmentState struct {
	// The role name.
	Role *string `pulumi:"role"`
	// The id of the token.
	TokenId *string `pulumi:"tokenId"`
}

type AclTokenRoleAttachmentState struct {
	// The role name.
	Role pulumi.StringPtrInput
	// The id of the token.
	TokenId pulumi.StringPtrInput
}

func (AclTokenRoleAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*aclTokenRoleAttachmentState)(nil)).Elem()
}

type aclTokenRoleAttachmentArgs struct {
	// The role name.
	Role string `pulumi:"role"`
	// The id of the token.
	TokenId string `pulumi:"tokenId"`
}

// The set of arguments for constructing a AclTokenRoleAttachment resource.
type AclTokenRoleAttachmentArgs struct {
	// The role name.
	Role pulumi.StringInput
	// The id of the token.
	TokenId pulumi.StringInput
}

func (AclTokenRoleAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*aclTokenRoleAttachmentArgs)(nil)).Elem()
}

type AclTokenRoleAttachmentInput interface {
	pulumi.Input

	ToAclTokenRoleAttachmentOutput() AclTokenRoleAttachmentOutput
	ToAclTokenRoleAttachmentOutputWithContext(ctx context.Context) AclTokenRoleAttachmentOutput
}

func (*AclTokenRoleAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((*AclTokenRoleAttachment)(nil))
}

func (i *AclTokenRoleAttachment) ToAclTokenRoleAttachmentOutput() AclTokenRoleAttachmentOutput {
	return i.ToAclTokenRoleAttachmentOutputWithContext(context.Background())
}

func (i *AclTokenRoleAttachment) ToAclTokenRoleAttachmentOutputWithContext(ctx context.Context) AclTokenRoleAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclTokenRoleAttachmentOutput)
}

func (i *AclTokenRoleAttachment) ToAclTokenRoleAttachmentPtrOutput() AclTokenRoleAttachmentPtrOutput {
	return i.ToAclTokenRoleAttachmentPtrOutputWithContext(context.Background())
}

func (i *AclTokenRoleAttachment) ToAclTokenRoleAttachmentPtrOutputWithContext(ctx context.Context) AclTokenRoleAttachmentPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclTokenRoleAttachmentPtrOutput)
}

type AclTokenRoleAttachmentPtrInput interface {
	pulumi.Input

	ToAclTokenRoleAttachmentPtrOutput() AclTokenRoleAttachmentPtrOutput
	ToAclTokenRoleAttachmentPtrOutputWithContext(ctx context.Context) AclTokenRoleAttachmentPtrOutput
}

type aclTokenRoleAttachmentPtrType AclTokenRoleAttachmentArgs

func (*aclTokenRoleAttachmentPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AclTokenRoleAttachment)(nil))
}

func (i *aclTokenRoleAttachmentPtrType) ToAclTokenRoleAttachmentPtrOutput() AclTokenRoleAttachmentPtrOutput {
	return i.ToAclTokenRoleAttachmentPtrOutputWithContext(context.Background())
}

func (i *aclTokenRoleAttachmentPtrType) ToAclTokenRoleAttachmentPtrOutputWithContext(ctx context.Context) AclTokenRoleAttachmentPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclTokenRoleAttachmentPtrOutput)
}

// AclTokenRoleAttachmentArrayInput is an input type that accepts AclTokenRoleAttachmentArray and AclTokenRoleAttachmentArrayOutput values.
// You can construct a concrete instance of `AclTokenRoleAttachmentArrayInput` via:
//
//          AclTokenRoleAttachmentArray{ AclTokenRoleAttachmentArgs{...} }
type AclTokenRoleAttachmentArrayInput interface {
	pulumi.Input

	ToAclTokenRoleAttachmentArrayOutput() AclTokenRoleAttachmentArrayOutput
	ToAclTokenRoleAttachmentArrayOutputWithContext(context.Context) AclTokenRoleAttachmentArrayOutput
}

type AclTokenRoleAttachmentArray []AclTokenRoleAttachmentInput

func (AclTokenRoleAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*AclTokenRoleAttachment)(nil))
}

func (i AclTokenRoleAttachmentArray) ToAclTokenRoleAttachmentArrayOutput() AclTokenRoleAttachmentArrayOutput {
	return i.ToAclTokenRoleAttachmentArrayOutputWithContext(context.Background())
}

func (i AclTokenRoleAttachmentArray) ToAclTokenRoleAttachmentArrayOutputWithContext(ctx context.Context) AclTokenRoleAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclTokenRoleAttachmentArrayOutput)
}

// AclTokenRoleAttachmentMapInput is an input type that accepts AclTokenRoleAttachmentMap and AclTokenRoleAttachmentMapOutput values.
// You can construct a concrete instance of `AclTokenRoleAttachmentMapInput` via:
//
//          AclTokenRoleAttachmentMap{ "key": AclTokenRoleAttachmentArgs{...} }
type AclTokenRoleAttachmentMapInput interface {
	pulumi.Input

	ToAclTokenRoleAttachmentMapOutput() AclTokenRoleAttachmentMapOutput
	ToAclTokenRoleAttachmentMapOutputWithContext(context.Context) AclTokenRoleAttachmentMapOutput
}

type AclTokenRoleAttachmentMap map[string]AclTokenRoleAttachmentInput

func (AclTokenRoleAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*AclTokenRoleAttachment)(nil))
}

func (i AclTokenRoleAttachmentMap) ToAclTokenRoleAttachmentMapOutput() AclTokenRoleAttachmentMapOutput {
	return i.ToAclTokenRoleAttachmentMapOutputWithContext(context.Background())
}

func (i AclTokenRoleAttachmentMap) ToAclTokenRoleAttachmentMapOutputWithContext(ctx context.Context) AclTokenRoleAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclTokenRoleAttachmentMapOutput)
}

type AclTokenRoleAttachmentOutput struct {
	*pulumi.OutputState
}

func (AclTokenRoleAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AclTokenRoleAttachment)(nil))
}

func (o AclTokenRoleAttachmentOutput) ToAclTokenRoleAttachmentOutput() AclTokenRoleAttachmentOutput {
	return o
}

func (o AclTokenRoleAttachmentOutput) ToAclTokenRoleAttachmentOutputWithContext(ctx context.Context) AclTokenRoleAttachmentOutput {
	return o
}

func (o AclTokenRoleAttachmentOutput) ToAclTokenRoleAttachmentPtrOutput() AclTokenRoleAttachmentPtrOutput {
	return o.ToAclTokenRoleAttachmentPtrOutputWithContext(context.Background())
}

func (o AclTokenRoleAttachmentOutput) ToAclTokenRoleAttachmentPtrOutputWithContext(ctx context.Context) AclTokenRoleAttachmentPtrOutput {
	return o.ApplyT(func(v AclTokenRoleAttachment) *AclTokenRoleAttachment {
		return &v
	}).(AclTokenRoleAttachmentPtrOutput)
}

type AclTokenRoleAttachmentPtrOutput struct {
	*pulumi.OutputState
}

func (AclTokenRoleAttachmentPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AclTokenRoleAttachment)(nil))
}

func (o AclTokenRoleAttachmentPtrOutput) ToAclTokenRoleAttachmentPtrOutput() AclTokenRoleAttachmentPtrOutput {
	return o
}

func (o AclTokenRoleAttachmentPtrOutput) ToAclTokenRoleAttachmentPtrOutputWithContext(ctx context.Context) AclTokenRoleAttachmentPtrOutput {
	return o
}

type AclTokenRoleAttachmentArrayOutput struct{ *pulumi.OutputState }

func (AclTokenRoleAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AclTokenRoleAttachment)(nil))
}

func (o AclTokenRoleAttachmentArrayOutput) ToAclTokenRoleAttachmentArrayOutput() AclTokenRoleAttachmentArrayOutput {
	return o
}

func (o AclTokenRoleAttachmentArrayOutput) ToAclTokenRoleAttachmentArrayOutputWithContext(ctx context.Context) AclTokenRoleAttachmentArrayOutput {
	return o
}

func (o AclTokenRoleAttachmentArrayOutput) Index(i pulumi.IntInput) AclTokenRoleAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AclTokenRoleAttachment {
		return vs[0].([]AclTokenRoleAttachment)[vs[1].(int)]
	}).(AclTokenRoleAttachmentOutput)
}

type AclTokenRoleAttachmentMapOutput struct{ *pulumi.OutputState }

func (AclTokenRoleAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]AclTokenRoleAttachment)(nil))
}

func (o AclTokenRoleAttachmentMapOutput) ToAclTokenRoleAttachmentMapOutput() AclTokenRoleAttachmentMapOutput {
	return o
}

func (o AclTokenRoleAttachmentMapOutput) ToAclTokenRoleAttachmentMapOutputWithContext(ctx context.Context) AclTokenRoleAttachmentMapOutput {
	return o
}

func (o AclTokenRoleAttachmentMapOutput) MapIndex(k pulumi.StringInput) AclTokenRoleAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) AclTokenRoleAttachment {
		return vs[0].(map[string]AclTokenRoleAttachment)[vs[1].(string)]
	}).(AclTokenRoleAttachmentOutput)
}

func init() {
	pulumi.RegisterOutputType(AclTokenRoleAttachmentOutput{})
	pulumi.RegisterOutputType(AclTokenRoleAttachmentPtrOutput{})
	pulumi.RegisterOutputType(AclTokenRoleAttachmentArrayOutput{})
	pulumi.RegisterOutputType(AclTokenRoleAttachmentMapOutput{})
}