// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul
{
    /// <summary>
    /// [Intentions](https://www.consul.io/docs/connect/intentions.html) are used to define
    /// rules for which services may connect to one another when using [Consul Connect](https://www.consul.io/docs/connect/index.html).
    /// 
    /// It is appropriate to either reference existing services or specify non-existent services
    /// that will be created in the future when creating intentions. This resource can be used
    /// in conjunction with the `consul..Service` datasource when referencing services
    /// registered on nodes that have a running Consul agent.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-consul/blob/master/website/docs/r/intention.html.markdown.
    /// </summary>
    public partial class Intention : Pulumi.CustomResource
    {
        /// <summary>
        /// The intention action. Must be one of `allow` or `deny`.
        /// </summary>
        [Output("action")]
        public Output<string> Action { get; private set; } = null!;

        /// <summary>
        /// Optional description that can be used by Consul
        /// tooling, but is not used internally.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the destination service for the intention. This
        /// service does not have to exist.
        /// </summary>
        [Output("destinationName")]
        public Output<string> DestinationName { get; private set; } = null!;

        /// <summary>
        /// Key/value pairs that are opaque to Consul and are associated
        /// with the intention.
        /// </summary>
        [Output("meta")]
        public Output<ImmutableDictionary<string, string>?> Meta { get; private set; } = null!;

        /// <summary>
        /// The name of the source service for the intention. This
        /// service does not have to exist.
        /// </summary>
        [Output("sourceName")]
        public Output<string> SourceName { get; private set; } = null!;


        /// <summary>
        /// Create a Intention resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Intention(string name, IntentionArgs args, CustomResourceOptions? options = null)
            : base("consul:index/intention:Intention", name, args, MakeResourceOptions(options, ""))
        {
        }

        private Intention(string name, Input<string> id, IntentionState? state = null, CustomResourceOptions? options = null)
            : base("consul:index/intention:Intention", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Intention resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Intention Get(string name, Input<string> id, IntentionState? state = null, CustomResourceOptions? options = null)
        {
            return new Intention(name, id, state, options);
        }
    }

    public sealed class IntentionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The intention action. Must be one of `allow` or `deny`.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// Optional description that can be used by Consul
        /// tooling, but is not used internally.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the destination service for the intention. This
        /// service does not have to exist.
        /// </summary>
        [Input("destinationName", required: true)]
        public Input<string> DestinationName { get; set; } = null!;

        [Input("meta")]
        private InputMap<string>? _meta;

        /// <summary>
        /// Key/value pairs that are opaque to Consul and are associated
        /// with the intention.
        /// </summary>
        public InputMap<string> Meta
        {
            get => _meta ?? (_meta = new InputMap<string>());
            set => _meta = value;
        }

        /// <summary>
        /// The name of the source service for the intention. This
        /// service does not have to exist.
        /// </summary>
        [Input("sourceName", required: true)]
        public Input<string> SourceName { get; set; } = null!;

        public IntentionArgs()
        {
        }
    }

    public sealed class IntentionState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The intention action. Must be one of `allow` or `deny`.
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        /// <summary>
        /// Optional description that can be used by Consul
        /// tooling, but is not used internally.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the destination service for the intention. This
        /// service does not have to exist.
        /// </summary>
        [Input("destinationName")]
        public Input<string>? DestinationName { get; set; }

        [Input("meta")]
        private InputMap<string>? _meta;

        /// <summary>
        /// Key/value pairs that are opaque to Consul and are associated
        /// with the intention.
        /// </summary>
        public InputMap<string> Meta
        {
            get => _meta ?? (_meta = new InputMap<string>());
            set => _meta = value;
        }

        /// <summary>
        /// The name of the source service for the intention. This
        /// service does not have to exist.
        /// </summary>
        [Input("sourceName")]
        public Input<string>? SourceName { get; set; }

        public IntentionState()
        {
        }
    }
}