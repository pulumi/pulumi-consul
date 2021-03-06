// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package consul

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// The `AclPolicy` data source returns the information related to a
// [Consul ACL Policy](https://www.consul.io/docs/acl/acl-system.html#acl-policies).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-consul/sdk/v2/go/consul"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		agent, err := consul.LookupAclPolicy(ctx, &consul.LookupAclPolicyArgs{
// 			Name: "agent",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("consulAclPolicy", agent.Rules)
// 		return nil
// 	})
// }
// ```
func LookupAclPolicy(ctx *pulumi.Context, args *LookupAclPolicyArgs, opts ...pulumi.InvokeOption) (*LookupAclPolicyResult, error) {
	var rv LookupAclPolicyResult
	err := ctx.Invoke("consul:index/getAclPolicy:getAclPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAclPolicy.
type LookupAclPolicyArgs struct {
	// The datacenters associated with the ACL Policy.
	Datacenters []string `pulumi:"datacenters"`
	// The description of the ACL Policy.
	Description *string `pulumi:"description"`
	// The name of the ACL Policy.
	Name string `pulumi:"name"`
	// The namespace to lookup the policy.
	Namespace *string `pulumi:"namespace"`
	// The rules associated with the ACL Policy.
	Rules *string `pulumi:"rules"`
}

// A collection of values returned by getAclPolicy.
type LookupAclPolicyResult struct {
	// The datacenters associated with the ACL Policy.
	Datacenters []string `pulumi:"datacenters"`
	// The description of the ACL Policy.
	Description *string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id        string  `pulumi:"id"`
	Name      string  `pulumi:"name"`
	Namespace *string `pulumi:"namespace"`
	// The rules associated with the ACL Policy.
	Rules *string `pulumi:"rules"`
}
