// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul
{
    public static class GetAclPolicy
    {
        /// <summary>
        /// The `consul.AclPolicy` data source returns the information related to a
        /// [Consul ACL Policy](https://www.consul.io/docs/acl/acl-system.html#acl-policies).
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Consul = Pulumi.Consul;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var agent = Consul.GetAclPolicy.Invoke(new()
        ///     {
        ///         Name = "agent",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["consulAclPolicy"] = agent.Apply(getAclPolicyResult =&gt; getAclPolicyResult.Rules),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetAclPolicyResult> InvokeAsync(GetAclPolicyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAclPolicyResult>("consul:index/getAclPolicy:getAclPolicy", args ?? new GetAclPolicyArgs(), options.WithDefaults());

        /// <summary>
        /// The `consul.AclPolicy` data source returns the information related to a
        /// [Consul ACL Policy](https://www.consul.io/docs/acl/acl-system.html#acl-policies).
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Consul = Pulumi.Consul;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var agent = Consul.GetAclPolicy.Invoke(new()
        ///     {
        ///         Name = "agent",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["consulAclPolicy"] = agent.Apply(getAclPolicyResult =&gt; getAclPolicyResult.Rules),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetAclPolicyResult> Invoke(GetAclPolicyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAclPolicyResult>("consul:index/getAclPolicy:getAclPolicy", args ?? new GetAclPolicyInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// The `consul.AclPolicy` data source returns the information related to a
        /// [Consul ACL Policy](https://www.consul.io/docs/acl/acl-system.html#acl-policies).
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Consul = Pulumi.Consul;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var agent = Consul.GetAclPolicy.Invoke(new()
        ///     {
        ///         Name = "agent",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["consulAclPolicy"] = agent.Apply(getAclPolicyResult =&gt; getAclPolicyResult.Rules),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetAclPolicyResult> Invoke(GetAclPolicyInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAclPolicyResult>("consul:index/getAclPolicy:getAclPolicy", args ?? new GetAclPolicyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAclPolicyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the ACL Policy.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The namespace to lookup the policy.
        /// </summary>
        [Input("namespace")]
        public string? Namespace { get; set; }

        /// <summary>
        /// The partition to lookup the policy.
        /// </summary>
        [Input("partition")]
        public string? Partition { get; set; }

        public GetAclPolicyArgs()
        {
        }
        public static new GetAclPolicyArgs Empty => new GetAclPolicyArgs();
    }

    public sealed class GetAclPolicyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the ACL Policy.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The namespace to lookup the policy.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// The partition to lookup the policy.
        /// </summary>
        [Input("partition")]
        public Input<string>? Partition { get; set; }

        public GetAclPolicyInvokeArgs()
        {
        }
        public static new GetAclPolicyInvokeArgs Empty => new GetAclPolicyInvokeArgs();
    }


    [OutputType]
    public sealed class GetAclPolicyResult
    {
        /// <summary>
        /// The datacenters associated with the ACL Policy.
        /// </summary>
        public readonly ImmutableArray<string> Datacenters;
        /// <summary>
        /// The description of the ACL Policy.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string? Namespace;
        public readonly string? Partition;
        /// <summary>
        /// The rules associated with the ACL Policy.
        /// </summary>
        public readonly string Rules;

        [OutputConstructor]
        private GetAclPolicyResult(
            ImmutableArray<string> datacenters,

            string description,

            string id,

            string name,

            string? @namespace,

            string? partition,

            string rules)
        {
            Datacenters = datacenters;
            Description = description;
            Id = id;
            Name = name;
            Namespace = @namespace;
            Partition = partition;
            Rules = rules;
        }
    }
}
