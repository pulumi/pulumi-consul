// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package consul

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Starting with Consul 1.4.0, the AclPolicy can be used to managed Consul ACL policies.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-consul/sdk/v2/go/consul"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := consul.NewAclPolicy(ctx, "test", &consul.AclPolicyArgs{
// 			Datacenters: pulumi.StringArray{
// 				pulumi.String("dc1"),
// 			},
// 			Rules: pulumi.String(fmt.Sprintf("%v%v%v%v", "node_prefix \"\" {\n", "  policy = \"read\"\n", "}\n", "\n")),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// `consul_acl_policy` can be imported
//
// ```sh
//  $ pulumi import consul:index/aclPolicy:AclPolicy my-policy 1c90ef03-a6dd-6a8c-ac49-042ad3752896
// ```
type AclPolicy struct {
	pulumi.CustomResourceState

	// The datacenters of the policy.
	Datacenters pulumi.StringArrayOutput `pulumi:"datacenters"`
	// The description of the policy.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the policy.
	Name pulumi.StringOutput `pulumi:"name"`
	// The namespace to create the policy within.
	Namespace pulumi.StringPtrOutput `pulumi:"namespace"`
	// The rules of the policy.
	Rules pulumi.StringOutput `pulumi:"rules"`
}

// NewAclPolicy registers a new resource with the given unique name, arguments, and options.
func NewAclPolicy(ctx *pulumi.Context,
	name string, args *AclPolicyArgs, opts ...pulumi.ResourceOption) (*AclPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Rules == nil {
		return nil, errors.New("invalid value for required argument 'Rules'")
	}
	var resource AclPolicy
	err := ctx.RegisterResource("consul:index/aclPolicy:AclPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAclPolicy gets an existing AclPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAclPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AclPolicyState, opts ...pulumi.ResourceOption) (*AclPolicy, error) {
	var resource AclPolicy
	err := ctx.ReadResource("consul:index/aclPolicy:AclPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AclPolicy resources.
type aclPolicyState struct {
	// The datacenters of the policy.
	Datacenters []string `pulumi:"datacenters"`
	// The description of the policy.
	Description *string `pulumi:"description"`
	// The name of the policy.
	Name *string `pulumi:"name"`
	// The namespace to create the policy within.
	Namespace *string `pulumi:"namespace"`
	// The rules of the policy.
	Rules *string `pulumi:"rules"`
}

type AclPolicyState struct {
	// The datacenters of the policy.
	Datacenters pulumi.StringArrayInput
	// The description of the policy.
	Description pulumi.StringPtrInput
	// The name of the policy.
	Name pulumi.StringPtrInput
	// The namespace to create the policy within.
	Namespace pulumi.StringPtrInput
	// The rules of the policy.
	Rules pulumi.StringPtrInput
}

func (AclPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*aclPolicyState)(nil)).Elem()
}

type aclPolicyArgs struct {
	// The datacenters of the policy.
	Datacenters []string `pulumi:"datacenters"`
	// The description of the policy.
	Description *string `pulumi:"description"`
	// The name of the policy.
	Name *string `pulumi:"name"`
	// The namespace to create the policy within.
	Namespace *string `pulumi:"namespace"`
	// The rules of the policy.
	Rules string `pulumi:"rules"`
}

// The set of arguments for constructing a AclPolicy resource.
type AclPolicyArgs struct {
	// The datacenters of the policy.
	Datacenters pulumi.StringArrayInput
	// The description of the policy.
	Description pulumi.StringPtrInput
	// The name of the policy.
	Name pulumi.StringPtrInput
	// The namespace to create the policy within.
	Namespace pulumi.StringPtrInput
	// The rules of the policy.
	Rules pulumi.StringInput
}

func (AclPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*aclPolicyArgs)(nil)).Elem()
}

type AclPolicyInput interface {
	pulumi.Input

	ToAclPolicyOutput() AclPolicyOutput
	ToAclPolicyOutputWithContext(ctx context.Context) AclPolicyOutput
}

func (*AclPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((*AclPolicy)(nil))
}

func (i *AclPolicy) ToAclPolicyOutput() AclPolicyOutput {
	return i.ToAclPolicyOutputWithContext(context.Background())
}

func (i *AclPolicy) ToAclPolicyOutputWithContext(ctx context.Context) AclPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclPolicyOutput)
}

func (i *AclPolicy) ToAclPolicyPtrOutput() AclPolicyPtrOutput {
	return i.ToAclPolicyPtrOutputWithContext(context.Background())
}

func (i *AclPolicy) ToAclPolicyPtrOutputWithContext(ctx context.Context) AclPolicyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclPolicyPtrOutput)
}

type AclPolicyPtrInput interface {
	pulumi.Input

	ToAclPolicyPtrOutput() AclPolicyPtrOutput
	ToAclPolicyPtrOutputWithContext(ctx context.Context) AclPolicyPtrOutput
}

type aclPolicyPtrType AclPolicyArgs

func (*aclPolicyPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**AclPolicy)(nil))
}

func (i *aclPolicyPtrType) ToAclPolicyPtrOutput() AclPolicyPtrOutput {
	return i.ToAclPolicyPtrOutputWithContext(context.Background())
}

func (i *aclPolicyPtrType) ToAclPolicyPtrOutputWithContext(ctx context.Context) AclPolicyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclPolicyPtrOutput)
}

// AclPolicyArrayInput is an input type that accepts AclPolicyArray and AclPolicyArrayOutput values.
// You can construct a concrete instance of `AclPolicyArrayInput` via:
//
//          AclPolicyArray{ AclPolicyArgs{...} }
type AclPolicyArrayInput interface {
	pulumi.Input

	ToAclPolicyArrayOutput() AclPolicyArrayOutput
	ToAclPolicyArrayOutputWithContext(context.Context) AclPolicyArrayOutput
}

type AclPolicyArray []AclPolicyInput

func (AclPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*AclPolicy)(nil))
}

func (i AclPolicyArray) ToAclPolicyArrayOutput() AclPolicyArrayOutput {
	return i.ToAclPolicyArrayOutputWithContext(context.Background())
}

func (i AclPolicyArray) ToAclPolicyArrayOutputWithContext(ctx context.Context) AclPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclPolicyArrayOutput)
}

// AclPolicyMapInput is an input type that accepts AclPolicyMap and AclPolicyMapOutput values.
// You can construct a concrete instance of `AclPolicyMapInput` via:
//
//          AclPolicyMap{ "key": AclPolicyArgs{...} }
type AclPolicyMapInput interface {
	pulumi.Input

	ToAclPolicyMapOutput() AclPolicyMapOutput
	ToAclPolicyMapOutputWithContext(context.Context) AclPolicyMapOutput
}

type AclPolicyMap map[string]AclPolicyInput

func (AclPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*AclPolicy)(nil))
}

func (i AclPolicyMap) ToAclPolicyMapOutput() AclPolicyMapOutput {
	return i.ToAclPolicyMapOutputWithContext(context.Background())
}

func (i AclPolicyMap) ToAclPolicyMapOutputWithContext(ctx context.Context) AclPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AclPolicyMapOutput)
}

type AclPolicyOutput struct {
	*pulumi.OutputState
}

func (AclPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AclPolicy)(nil))
}

func (o AclPolicyOutput) ToAclPolicyOutput() AclPolicyOutput {
	return o
}

func (o AclPolicyOutput) ToAclPolicyOutputWithContext(ctx context.Context) AclPolicyOutput {
	return o
}

func (o AclPolicyOutput) ToAclPolicyPtrOutput() AclPolicyPtrOutput {
	return o.ToAclPolicyPtrOutputWithContext(context.Background())
}

func (o AclPolicyOutput) ToAclPolicyPtrOutputWithContext(ctx context.Context) AclPolicyPtrOutput {
	return o.ApplyT(func(v AclPolicy) *AclPolicy {
		return &v
	}).(AclPolicyPtrOutput)
}

type AclPolicyPtrOutput struct {
	*pulumi.OutputState
}

func (AclPolicyPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AclPolicy)(nil))
}

func (o AclPolicyPtrOutput) ToAclPolicyPtrOutput() AclPolicyPtrOutput {
	return o
}

func (o AclPolicyPtrOutput) ToAclPolicyPtrOutputWithContext(ctx context.Context) AclPolicyPtrOutput {
	return o
}

type AclPolicyArrayOutput struct{ *pulumi.OutputState }

func (AclPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]AclPolicy)(nil))
}

func (o AclPolicyArrayOutput) ToAclPolicyArrayOutput() AclPolicyArrayOutput {
	return o
}

func (o AclPolicyArrayOutput) ToAclPolicyArrayOutputWithContext(ctx context.Context) AclPolicyArrayOutput {
	return o
}

func (o AclPolicyArrayOutput) Index(i pulumi.IntInput) AclPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) AclPolicy {
		return vs[0].([]AclPolicy)[vs[1].(int)]
	}).(AclPolicyOutput)
}

type AclPolicyMapOutput struct{ *pulumi.OutputState }

func (AclPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]AclPolicy)(nil))
}

func (o AclPolicyMapOutput) ToAclPolicyMapOutput() AclPolicyMapOutput {
	return o
}

func (o AclPolicyMapOutput) ToAclPolicyMapOutputWithContext(ctx context.Context) AclPolicyMapOutput {
	return o
}

func (o AclPolicyMapOutput) MapIndex(k pulumi.StringInput) AclPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) AclPolicy {
		return vs[0].(map[string]AclPolicy)[vs[1].(string)]
	}).(AclPolicyOutput)
}

func init() {
	pulumi.RegisterOutputType(AclPolicyOutput{})
	pulumi.RegisterOutputType(AclPolicyPtrOutput{})
	pulumi.RegisterOutputType(AclPolicyArrayOutput{})
	pulumi.RegisterOutputType(AclPolicyMapOutput{})
}
