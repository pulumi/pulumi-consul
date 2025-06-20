// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package consul

import (
	"context"
	"reflect"

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
//			_, err := consul.GetPeerings(ctx, &consul.GetPeeringsArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetPeerings(ctx *pulumi.Context, args *GetPeeringsArgs, opts ...pulumi.InvokeOption) (*GetPeeringsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPeeringsResult
	err := ctx.Invoke("consul:index/getPeerings:getPeerings", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPeerings.
type GetPeeringsArgs struct {
	Partition *string `pulumi:"partition"`
}

// A collection of values returned by getPeerings.
type GetPeeringsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id        string            `pulumi:"id"`
	Partition *string           `pulumi:"partition"`
	Peers     []GetPeeringsPeer `pulumi:"peers"`
}

func GetPeeringsOutput(ctx *pulumi.Context, args GetPeeringsOutputArgs, opts ...pulumi.InvokeOption) GetPeeringsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetPeeringsResultOutput, error) {
			args := v.(GetPeeringsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("consul:index/getPeerings:getPeerings", args, GetPeeringsResultOutput{}, options).(GetPeeringsResultOutput), nil
		}).(GetPeeringsResultOutput)
}

// A collection of arguments for invoking getPeerings.
type GetPeeringsOutputArgs struct {
	Partition pulumi.StringPtrInput `pulumi:"partition"`
}

func (GetPeeringsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPeeringsArgs)(nil)).Elem()
}

// A collection of values returned by getPeerings.
type GetPeeringsResultOutput struct{ *pulumi.OutputState }

func (GetPeeringsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPeeringsResult)(nil)).Elem()
}

func (o GetPeeringsResultOutput) ToGetPeeringsResultOutput() GetPeeringsResultOutput {
	return o
}

func (o GetPeeringsResultOutput) ToGetPeeringsResultOutputWithContext(ctx context.Context) GetPeeringsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetPeeringsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPeeringsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetPeeringsResultOutput) Partition() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPeeringsResult) *string { return v.Partition }).(pulumi.StringPtrOutput)
}

func (o GetPeeringsResultOutput) Peers() GetPeeringsPeerArrayOutput {
	return o.ApplyT(func(v GetPeeringsResult) []GetPeeringsPeer { return v.Peers }).(GetPeeringsPeerArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPeeringsResultOutput{})
}
