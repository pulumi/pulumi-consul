// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul
{
    [ConsulResourceType("consul:index/configEntryV2ExportedServices:ConfigEntryV2ExportedServices")]
    public partial class ConfigEntryV2ExportedServices : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The kind of exported services config (ExportedServices, NamespaceExportedServices, PartitionExportedServices).
        /// </summary>
        [Output("kind")]
        public Output<string> Kind { get; private set; } = null!;

        /// <summary>
        /// The name of the config entry to read.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The namespace the config entry is associated with.
        /// </summary>
        [Output("namespace")]
        public Output<string?> Namespace { get; private set; } = null!;

        /// <summary>
        /// The partition the config entry is associated with.
        /// </summary>
        [Output("partition")]
        public Output<string> Partition { get; private set; } = null!;

        /// <summary>
        /// The exported service partition consumers.
        /// </summary>
        [Output("partitionConsumers")]
        public Output<ImmutableArray<string>> PartitionConsumers { get; private set; } = null!;

        /// <summary>
        /// The exported service peer consumers.
        /// </summary>
        [Output("peerConsumers")]
        public Output<ImmutableArray<string>> PeerConsumers { get; private set; } = null!;

        /// <summary>
        /// The exported service sameness group consumers.
        /// </summary>
        [Output("samenessGroupConsumers")]
        public Output<ImmutableArray<string>> SamenessGroupConsumers { get; private set; } = null!;

        /// <summary>
        /// The exported services.
        /// </summary>
        [Output("services")]
        public Output<ImmutableArray<string>> Services { get; private set; } = null!;


        /// <summary>
        /// Create a ConfigEntryV2ExportedServices resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ConfigEntryV2ExportedServices(string name, ConfigEntryV2ExportedServicesArgs args, CustomResourceOptions? options = null)
            : base("consul:index/configEntryV2ExportedServices:ConfigEntryV2ExportedServices", name, args ?? new ConfigEntryV2ExportedServicesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ConfigEntryV2ExportedServices(string name, Input<string> id, ConfigEntryV2ExportedServicesState? state = null, CustomResourceOptions? options = null)
            : base("consul:index/configEntryV2ExportedServices:ConfigEntryV2ExportedServices", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ConfigEntryV2ExportedServices resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ConfigEntryV2ExportedServices Get(string name, Input<string> id, ConfigEntryV2ExportedServicesState? state = null, CustomResourceOptions? options = null)
        {
            return new ConfigEntryV2ExportedServices(name, id, state, options);
        }
    }

    public sealed class ConfigEntryV2ExportedServicesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The kind of exported services config (ExportedServices, NamespaceExportedServices, PartitionExportedServices).
        /// </summary>
        [Input("kind", required: true)]
        public Input<string> Kind { get; set; } = null!;

        /// <summary>
        /// The name of the config entry to read.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespace the config entry is associated with.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// The partition the config entry is associated with.
        /// </summary>
        [Input("partition", required: true)]
        public Input<string> Partition { get; set; } = null!;

        [Input("partitionConsumers")]
        private InputList<string>? _partitionConsumers;

        /// <summary>
        /// The exported service partition consumers.
        /// </summary>
        public InputList<string> PartitionConsumers
        {
            get => _partitionConsumers ?? (_partitionConsumers = new InputList<string>());
            set => _partitionConsumers = value;
        }

        [Input("peerConsumers")]
        private InputList<string>? _peerConsumers;

        /// <summary>
        /// The exported service peer consumers.
        /// </summary>
        public InputList<string> PeerConsumers
        {
            get => _peerConsumers ?? (_peerConsumers = new InputList<string>());
            set => _peerConsumers = value;
        }

        [Input("samenessGroupConsumers")]
        private InputList<string>? _samenessGroupConsumers;

        /// <summary>
        /// The exported service sameness group consumers.
        /// </summary>
        public InputList<string> SamenessGroupConsumers
        {
            get => _samenessGroupConsumers ?? (_samenessGroupConsumers = new InputList<string>());
            set => _samenessGroupConsumers = value;
        }

        [Input("services")]
        private InputList<string>? _services;

        /// <summary>
        /// The exported services.
        /// </summary>
        public InputList<string> Services
        {
            get => _services ?? (_services = new InputList<string>());
            set => _services = value;
        }

        public ConfigEntryV2ExportedServicesArgs()
        {
        }
        public static new ConfigEntryV2ExportedServicesArgs Empty => new ConfigEntryV2ExportedServicesArgs();
    }

    public sealed class ConfigEntryV2ExportedServicesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The kind of exported services config (ExportedServices, NamespaceExportedServices, PartitionExportedServices).
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        /// <summary>
        /// The name of the config entry to read.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespace the config entry is associated with.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// The partition the config entry is associated with.
        /// </summary>
        [Input("partition")]
        public Input<string>? Partition { get; set; }

        [Input("partitionConsumers")]
        private InputList<string>? _partitionConsumers;

        /// <summary>
        /// The exported service partition consumers.
        /// </summary>
        public InputList<string> PartitionConsumers
        {
            get => _partitionConsumers ?? (_partitionConsumers = new InputList<string>());
            set => _partitionConsumers = value;
        }

        [Input("peerConsumers")]
        private InputList<string>? _peerConsumers;

        /// <summary>
        /// The exported service peer consumers.
        /// </summary>
        public InputList<string> PeerConsumers
        {
            get => _peerConsumers ?? (_peerConsumers = new InputList<string>());
            set => _peerConsumers = value;
        }

        [Input("samenessGroupConsumers")]
        private InputList<string>? _samenessGroupConsumers;

        /// <summary>
        /// The exported service sameness group consumers.
        /// </summary>
        public InputList<string> SamenessGroupConsumers
        {
            get => _samenessGroupConsumers ?? (_samenessGroupConsumers = new InputList<string>());
            set => _samenessGroupConsumers = value;
        }

        [Input("services")]
        private InputList<string>? _services;

        /// <summary>
        /// The exported services.
        /// </summary>
        public InputList<string> Services
        {
            get => _services ?? (_services = new InputList<string>());
            set => _services = value;
        }

        public ConfigEntryV2ExportedServicesState()
        {
        }
        public static new ConfigEntryV2ExportedServicesState Empty => new ConfigEntryV2ExportedServicesState();
    }
}
