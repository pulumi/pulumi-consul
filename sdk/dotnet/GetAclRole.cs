// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul
{
    public static class GetAclRole
    {
        /// <summary>
        /// The `consul.AclRole` data source returns the information related to a
        /// [Consul ACL Role](https://www.consul.io/api/acl/roles.html).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Consul = Pulumi.Consul;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var test = Output.Create(Consul.GetAclRole.InvokeAsync(new Consul.GetAclRoleArgs
        ///         {
        ///             Name = "example-role",
        ///         }));
        ///         this.ConsulAclRole = test.Apply(test =&gt; test.Id);
        ///     }
        /// 
        ///     [Output("consulAclRole")]
        ///     public Output&lt;string&gt; ConsulAclRole { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAclRoleResult> InvokeAsync(GetAclRoleArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAclRoleResult>("consul:index/getAclRole:getAclRole", args ?? new GetAclRoleArgs(), options.WithVersion());
    }


    public sealed class GetAclRoleArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The description of the ACL Role.
        /// </summary>
        [Input("description")]
        public string? Description { get; set; }

        /// <summary>
        /// The name of the ACL Role.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The namespace to lookup the role.
        /// </summary>
        [Input("namespace")]
        public string? Namespace { get; set; }

        [Input("policies")]
        private List<Inputs.GetAclRolePolicyArgs>? _policies;

        /// <summary>
        /// The list of policies associated with the ACL Role. Each entry has
        /// an `id` and a `name` attribute.
        /// </summary>
        public List<Inputs.GetAclRolePolicyArgs> Policies
        {
            get => _policies ?? (_policies = new List<Inputs.GetAclRolePolicyArgs>());
            set => _policies = value;
        }

        [Input("serviceIdentities")]
        private List<Inputs.GetAclRoleServiceIdentityArgs>? _serviceIdentities;

        /// <summary>
        /// The list of service identities associated with the ACL
        /// Role. Each entry has a `service_name` attribute and a list of `datacenters`.
        /// </summary>
        public List<Inputs.GetAclRoleServiceIdentityArgs> ServiceIdentities
        {
            get => _serviceIdentities ?? (_serviceIdentities = new List<Inputs.GetAclRoleServiceIdentityArgs>());
            set => _serviceIdentities = value;
        }

        public GetAclRoleArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetAclRoleResult
    {
        /// <summary>
        /// The description of the ACL Role.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string? Namespace;
        /// <summary>
        /// The list of policies associated with the ACL Role. Each entry has
        /// an `id` and a `name` attribute.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAclRolePolicyResult> Policies;
        /// <summary>
        /// The list of service identities associated with the ACL
        /// Role. Each entry has a `service_name` attribute and a list of `datacenters`.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAclRoleServiceIdentityResult> ServiceIdentities;

        [OutputConstructor]
        private GetAclRoleResult(
            string? description,

            string id,

            string name,

            string? @namespace,

            ImmutableArray<Outputs.GetAclRolePolicyResult> policies,

            ImmutableArray<Outputs.GetAclRoleServiceIdentityResult> serviceIdentities)
        {
            Description = description;
            Id = id;
            Name = name;
            Namespace = @namespace;
            Policies = policies;
            ServiceIdentities = serviceIdentities;
        }
    }
}
