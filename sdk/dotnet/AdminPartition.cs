// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul
{
    /// <summary>
    /// &gt; **NOTE:** This feature requires Consul Enterprise.
    /// 
    /// The `consul.AdminPartition` resource manages [Consul Enterprise Admin Partitions](https://www.consul.io/docs/enterprise/admin-partitions).
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
    ///     var naWest = new Consul.AdminPartition("na_west", new()
    ///     {
    ///         Name = "na-west",
    ///         Description = "Partition for North America West",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// `consul_admin_partition` can be imported:
    /// 
    /// ```sh
    /// $ pulumi import consul:index/adminPartition:AdminPartition na_west na-west
    /// ```
    /// </summary>
    [ConsulResourceType("consul:index/adminPartition:AdminPartition")]
    public partial class AdminPartition : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Free form partition description.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// . Disable gossip pool for the partition. Defaults to `false`.
        /// </summary>
        [Output("disableGossip")]
        public Output<bool?> DisableGossip { get; private set; } = null!;

        /// <summary>
        /// The partition name. This must be a valid DNS hostname label.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a AdminPartition resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AdminPartition(string name, AdminPartitionArgs? args = null, CustomResourceOptions? options = null)
            : base("consul:index/adminPartition:AdminPartition", name, args ?? new AdminPartitionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AdminPartition(string name, Input<string> id, AdminPartitionState? state = null, CustomResourceOptions? options = null)
            : base("consul:index/adminPartition:AdminPartition", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AdminPartition resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AdminPartition Get(string name, Input<string> id, AdminPartitionState? state = null, CustomResourceOptions? options = null)
        {
            return new AdminPartition(name, id, state, options);
        }
    }

    public sealed class AdminPartitionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Free form partition description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// . Disable gossip pool for the partition. Defaults to `false`.
        /// </summary>
        [Input("disableGossip")]
        public Input<bool>? DisableGossip { get; set; }

        /// <summary>
        /// The partition name. This must be a valid DNS hostname label.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public AdminPartitionArgs()
        {
        }
        public static new AdminPartitionArgs Empty => new AdminPartitionArgs();
    }

    public sealed class AdminPartitionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Free form partition description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// . Disable gossip pool for the partition. Defaults to `false`.
        /// </summary>
        [Input("disableGossip")]
        public Input<bool>? DisableGossip { get; set; }

        /// <summary>
        /// The partition name. This must be a valid DNS hostname label.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public AdminPartitionState()
        {
        }
        public static new AdminPartitionState Empty => new AdminPartitionState();
    }
}
