// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package consul

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-consul/sdk/v3/go/consul/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupConfigEntry(ctx *pulumi.Context, args *LookupConfigEntryArgs, opts ...pulumi.InvokeOption) (*LookupConfigEntryResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupConfigEntryResult
	err := ctx.Invoke("consul:index/getConfigEntry:getConfigEntry", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConfigEntry.
type LookupConfigEntryArgs struct {
	// The kind of config entry to read.
	Kind string `pulumi:"kind"`
	// The name of the config entry to read.
	Name string `pulumi:"name"`
	// The namespace the config entry is associated with.
	Namespace *string `pulumi:"namespace"`
	// The partition the config entry is associated with.
	Partition *string `pulumi:"partition"`
}

// A collection of values returned by getConfigEntry.
type LookupConfigEntryResult struct {
	// The configuration of the config entry.
	ConfigJson string `pulumi:"configJson"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The kind of config entry to read.
	Kind string `pulumi:"kind"`
	// The name of the config entry to read.
	Name string `pulumi:"name"`
	// The namespace the config entry is associated with.
	Namespace *string `pulumi:"namespace"`
	// The partition the config entry is associated with.
	Partition *string `pulumi:"partition"`
}

func LookupConfigEntryOutput(ctx *pulumi.Context, args LookupConfigEntryOutputArgs, opts ...pulumi.InvokeOption) LookupConfigEntryResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupConfigEntryResultOutput, error) {
			args := v.(LookupConfigEntryArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("consul:index/getConfigEntry:getConfigEntry", args, LookupConfigEntryResultOutput{}, options).(LookupConfigEntryResultOutput), nil
		}).(LookupConfigEntryResultOutput)
}

// A collection of arguments for invoking getConfigEntry.
type LookupConfigEntryOutputArgs struct {
	// The kind of config entry to read.
	Kind pulumi.StringInput `pulumi:"kind"`
	// The name of the config entry to read.
	Name pulumi.StringInput `pulumi:"name"`
	// The namespace the config entry is associated with.
	Namespace pulumi.StringPtrInput `pulumi:"namespace"`
	// The partition the config entry is associated with.
	Partition pulumi.StringPtrInput `pulumi:"partition"`
}

func (LookupConfigEntryOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConfigEntryArgs)(nil)).Elem()
}

// A collection of values returned by getConfigEntry.
type LookupConfigEntryResultOutput struct{ *pulumi.OutputState }

func (LookupConfigEntryResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConfigEntryResult)(nil)).Elem()
}

func (o LookupConfigEntryResultOutput) ToLookupConfigEntryResultOutput() LookupConfigEntryResultOutput {
	return o
}

func (o LookupConfigEntryResultOutput) ToLookupConfigEntryResultOutputWithContext(ctx context.Context) LookupConfigEntryResultOutput {
	return o
}

// The configuration of the config entry.
func (o LookupConfigEntryResultOutput) ConfigJson() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConfigEntryResult) string { return v.ConfigJson }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupConfigEntryResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConfigEntryResult) string { return v.Id }).(pulumi.StringOutput)
}

// The kind of config entry to read.
func (o LookupConfigEntryResultOutput) Kind() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConfigEntryResult) string { return v.Kind }).(pulumi.StringOutput)
}

// The name of the config entry to read.
func (o LookupConfigEntryResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConfigEntryResult) string { return v.Name }).(pulumi.StringOutput)
}

// The namespace the config entry is associated with.
func (o LookupConfigEntryResultOutput) Namespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConfigEntryResult) *string { return v.Namespace }).(pulumi.StringPtrOutput)
}

// The partition the config entry is associated with.
func (o LookupConfigEntryResultOutput) Partition() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConfigEntryResult) *string { return v.Partition }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupConfigEntryResultOutput{})
}
