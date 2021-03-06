// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package consul

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// > **Note:** The `getAgentConfig` resource differs from [`getAgentSelf`](https://www.terraform.io/docs/providers/consul/d/agent_self.html),
// providing less information but utilizing stable APIs. `getAgentSelf` will be
// deprecated in a future release.
//
// The `getAgentConfig` data source returns
// [configuration data](https://www.consul.io/api/agent.html#read-configuration)
// from the agent specified in the `provider`.
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
// 		remoteAgent, err := consul.GetAgentConfig(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("consulVersion", remoteAgent.Version)
// 		return nil
// 	})
// }
// ```
func GetAgentConfig(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetAgentConfigResult, error) {
	var rv GetAgentConfigResult
	err := ctx.Invoke("consul:index/getAgentConfig:getAgentConfig", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getAgentConfig.
type GetAgentConfigResult struct {
	// The datacenter the agent is running in
	Datacenter string `pulumi:"datacenter"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The ID of the node the agent is running on
	NodeId string `pulumi:"nodeId"`
	// The name of the node the agent is running on
	NodeName string `pulumi:"nodeName"`
	// The first 9 characters of the VCS revision of the build of Consul that is running
	Revision string `pulumi:"revision"`
	// Boolean if the agent is a server or not
	Server bool `pulumi:"server"`
	// The version of the build of Consul that is running
	Version string `pulumi:"version"`
}
