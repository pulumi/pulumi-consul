// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package consul

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-consul/sdk/v3/go/consul/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The `AclToken` data source returns the information related to the `AclToken` resource with the exception of its secret ID.
//
// If you want to get the secret ID associated with a token, use the [`getAclTokenSecretId` data source](https://www.terraform.io/docs/providers/consul/d/acl_token_secret_id.html).
//
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
//			test, err := consul.LookupAclToken(ctx, &consul.LookupAclTokenArgs{
//				AccessorId: "00000000-0000-0000-0000-000000000002",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("consulAclPolicies", test.Policies)
//			return nil
//		})
//	}
//
// ```
func LookupAclToken(ctx *pulumi.Context, args *LookupAclTokenArgs, opts ...pulumi.InvokeOption) (*LookupAclTokenResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAclTokenResult
	err := ctx.Invoke("consul:index/getAclToken:getAclToken", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAclToken.
type LookupAclTokenArgs struct {
	// The accessor ID of the ACL token.
	AccessorId string `pulumi:"accessorId"`
	// The namespace to lookup the ACL token.
	Namespace *string `pulumi:"namespace"`
	// The partition to lookup the ACL token.
	Partition *string `pulumi:"partition"`
}

// A collection of values returned by getAclToken.
type LookupAclTokenResult struct {
	// The accessor ID of the ACL token.
	AccessorId string `pulumi:"accessorId"`
	// The description of the ACL token.
	Description string `pulumi:"description"`
	// If set this represents the point after which a token should be considered revoked and is eligible for destruction.
	ExpirationTime string `pulumi:"expirationTime"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Whether the ACL token is local to the datacenter it was created within.
	Local bool `pulumi:"local"`
	// The namespace to lookup the ACL token.
	Namespace *string `pulumi:"namespace"`
	// The list of node identities attached to the token.
	NodeIdentities []GetAclTokenNodeIdentity `pulumi:"nodeIdentities"`
	// The partition to lookup the ACL token.
	Partition *string `pulumi:"partition"`
	// A list of policies associated with the ACL token.
	Policies []GetAclTokenPolicy `pulumi:"policies"`
	// List of roles linked to the token
	Roles []GetAclTokenRole `pulumi:"roles"`
	// The list of service identities attached to the token.
	ServiceIdentities []GetAclTokenServiceIdentity `pulumi:"serviceIdentities"`
	// The list of templated policies that should be applied to the token.
	TemplatedPolicies []GetAclTokenTemplatedPolicy `pulumi:"templatedPolicies"`
}

func LookupAclTokenOutput(ctx *pulumi.Context, args LookupAclTokenOutputArgs, opts ...pulumi.InvokeOption) LookupAclTokenResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAclTokenResultOutput, error) {
			args := v.(LookupAclTokenArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("consul:index/getAclToken:getAclToken", args, LookupAclTokenResultOutput{}, options).(LookupAclTokenResultOutput), nil
		}).(LookupAclTokenResultOutput)
}

// A collection of arguments for invoking getAclToken.
type LookupAclTokenOutputArgs struct {
	// The accessor ID of the ACL token.
	AccessorId pulumi.StringInput `pulumi:"accessorId"`
	// The namespace to lookup the ACL token.
	Namespace pulumi.StringPtrInput `pulumi:"namespace"`
	// The partition to lookup the ACL token.
	Partition pulumi.StringPtrInput `pulumi:"partition"`
}

func (LookupAclTokenOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAclTokenArgs)(nil)).Elem()
}

// A collection of values returned by getAclToken.
type LookupAclTokenResultOutput struct{ *pulumi.OutputState }

func (LookupAclTokenResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAclTokenResult)(nil)).Elem()
}

func (o LookupAclTokenResultOutput) ToLookupAclTokenResultOutput() LookupAclTokenResultOutput {
	return o
}

func (o LookupAclTokenResultOutput) ToLookupAclTokenResultOutputWithContext(ctx context.Context) LookupAclTokenResultOutput {
	return o
}

// The accessor ID of the ACL token.
func (o LookupAclTokenResultOutput) AccessorId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAclTokenResult) string { return v.AccessorId }).(pulumi.StringOutput)
}

// The description of the ACL token.
func (o LookupAclTokenResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAclTokenResult) string { return v.Description }).(pulumi.StringOutput)
}

// If set this represents the point after which a token should be considered revoked and is eligible for destruction.
func (o LookupAclTokenResultOutput) ExpirationTime() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAclTokenResult) string { return v.ExpirationTime }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAclTokenResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAclTokenResult) string { return v.Id }).(pulumi.StringOutput)
}

// Whether the ACL token is local to the datacenter it was created within.
func (o LookupAclTokenResultOutput) Local() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAclTokenResult) bool { return v.Local }).(pulumi.BoolOutput)
}

// The namespace to lookup the ACL token.
func (o LookupAclTokenResultOutput) Namespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAclTokenResult) *string { return v.Namespace }).(pulumi.StringPtrOutput)
}

// The list of node identities attached to the token.
func (o LookupAclTokenResultOutput) NodeIdentities() GetAclTokenNodeIdentityArrayOutput {
	return o.ApplyT(func(v LookupAclTokenResult) []GetAclTokenNodeIdentity { return v.NodeIdentities }).(GetAclTokenNodeIdentityArrayOutput)
}

// The partition to lookup the ACL token.
func (o LookupAclTokenResultOutput) Partition() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAclTokenResult) *string { return v.Partition }).(pulumi.StringPtrOutput)
}

// A list of policies associated with the ACL token.
func (o LookupAclTokenResultOutput) Policies() GetAclTokenPolicyArrayOutput {
	return o.ApplyT(func(v LookupAclTokenResult) []GetAclTokenPolicy { return v.Policies }).(GetAclTokenPolicyArrayOutput)
}

// List of roles linked to the token
func (o LookupAclTokenResultOutput) Roles() GetAclTokenRoleArrayOutput {
	return o.ApplyT(func(v LookupAclTokenResult) []GetAclTokenRole { return v.Roles }).(GetAclTokenRoleArrayOutput)
}

// The list of service identities attached to the token.
func (o LookupAclTokenResultOutput) ServiceIdentities() GetAclTokenServiceIdentityArrayOutput {
	return o.ApplyT(func(v LookupAclTokenResult) []GetAclTokenServiceIdentity { return v.ServiceIdentities }).(GetAclTokenServiceIdentityArrayOutput)
}

// The list of templated policies that should be applied to the token.
func (o LookupAclTokenResultOutput) TemplatedPolicies() GetAclTokenTemplatedPolicyArrayOutput {
	return o.ApplyT(func(v LookupAclTokenResult) []GetAclTokenTemplatedPolicy { return v.TemplatedPolicies }).(GetAclTokenTemplatedPolicyArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAclTokenResultOutput{})
}
