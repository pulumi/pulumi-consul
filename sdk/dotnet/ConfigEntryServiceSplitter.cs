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
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Consul = Pulumi.Consul;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var web = new Consul.ConfigEntry("web", new()
    ///     {
    ///         Name = "web",
    ///         Kind = "service-defaults",
    ///         ConfigJson = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["Protocol"] = "http",
    ///             ["Expose"] = new Dictionary&lt;string, object?&gt;
    ///             {
    ///             },
    ///             ["MeshGateway"] = new Dictionary&lt;string, object?&gt;
    ///             {
    ///             },
    ///             ["TransparentProxy"] = new Dictionary&lt;string, object?&gt;
    ///             {
    ///             },
    ///         }),
    ///     });
    /// 
    ///     var serviceResolver = new Consul.ConfigEntryServiceResolver("service_resolver", new()
    ///     {
    ///         Name = "service-resolver",
    ///         DefaultSubset = "v1",
    ///         Subsets = new[]
    ///         {
    ///             new Consul.Inputs.ConfigEntryServiceResolverSubsetArgs
    ///             {
    ///                 Name = "v1",
    ///                 Filter = "Service.Meta.version == v1",
    ///             },
    ///             new Consul.Inputs.ConfigEntryServiceResolverSubsetArgs
    ///             {
    ///                 Name = "v2",
    ///                 Filter = "Service.Meta.version == v2",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var foo = new Consul.ConfigEntryServiceSplitter("foo", new()
    ///     {
    ///         Name = serviceResolver.Name,
    ///         Meta = 
    ///         {
    ///             { "key", "value" },
    ///         },
    ///         Splits = new[]
    ///         {
    ///             new Consul.Inputs.ConfigEntryServiceSplitterSplitArgs
    ///             {
    ///                 Weight = 80,
    ///                 Service = "web",
    ///                 ServiceSubset = "v1",
    ///                 RequestHeaders = new Consul.Inputs.ConfigEntryServiceSplitterSplitRequestHeadersArgs
    ///                 {
    ///                     Set = 
    ///                     {
    ///                         { "x-web-version", "from-v1" },
    ///                     },
    ///                 },
    ///                 ResponseHeaders = new Consul.Inputs.ConfigEntryServiceSplitterSplitResponseHeadersArgs
    ///                 {
    ///                     Set = 
    ///                     {
    ///                         { "x-web-version", "to-v1" },
    ///                     },
    ///                 },
    ///             },
    ///             new Consul.Inputs.ConfigEntryServiceSplitterSplitArgs
    ///             {
    ///                 Weight = 10,
    ///                 Service = "web",
    ///                 ServiceSubset = "v2",
    ///                 RequestHeaders = new Consul.Inputs.ConfigEntryServiceSplitterSplitRequestHeadersArgs
    ///                 {
    ///                     Set = 
    ///                     {
    ///                         { "x-web-version", "from-v2" },
    ///                     },
    ///                 },
    ///                 ResponseHeaders = new Consul.Inputs.ConfigEntryServiceSplitterSplitResponseHeadersArgs
    ///                 {
    ///                     Set = 
    ///                     {
    ///                         { "x-web-version", "to-v2" },
    ///                     },
    ///                 },
    ///             },
    ///             new Consul.Inputs.ConfigEntryServiceSplitterSplitArgs
    ///             {
    ///                 Weight = 10,
    ///                 Service = "web",
    ///                 ServiceSubset = "v2",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import consul:index/configEntryServiceSplitter:ConfigEntryServiceSplitter foo web
    /// ```
    /// </summary>
    [ConsulResourceType("consul:index/configEntryServiceSplitter:ConfigEntryServiceSplitter")]
    public partial class ConfigEntryServiceSplitter : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies key-value pairs to add to the KV store.
        /// </summary>
        [Output("meta")]
        public Output<ImmutableDictionary<string, string>?> Meta { get; private set; } = null!;

        /// <summary>
        /// Specifies a name for the configuration entry.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the namespace to apply the configuration entry.
        /// </summary>
        [Output("namespace")]
        public Output<string?> Namespace { get; private set; } = null!;

        /// <summary>
        /// Specifies the admin partition to apply the configuration entry.
        /// </summary>
        [Output("partition")]
        public Output<string?> Partition { get; private set; } = null!;

        /// <summary>
        /// Defines how much traffic to send to sets of service instances during a traffic split.
        /// </summary>
        [Output("splits")]
        public Output<ImmutableArray<Outputs.ConfigEntryServiceSplitterSplit>> Splits { get; private set; } = null!;


        /// <summary>
        /// Create a ConfigEntryServiceSplitter resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ConfigEntryServiceSplitter(string name, ConfigEntryServiceSplitterArgs args, CustomResourceOptions? options = null)
            : base("consul:index/configEntryServiceSplitter:ConfigEntryServiceSplitter", name, args ?? new ConfigEntryServiceSplitterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ConfigEntryServiceSplitter(string name, Input<string> id, ConfigEntryServiceSplitterState? state = null, CustomResourceOptions? options = null)
            : base("consul:index/configEntryServiceSplitter:ConfigEntryServiceSplitter", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ConfigEntryServiceSplitter resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ConfigEntryServiceSplitter Get(string name, Input<string> id, ConfigEntryServiceSplitterState? state = null, CustomResourceOptions? options = null)
        {
            return new ConfigEntryServiceSplitter(name, id, state, options);
        }
    }

    public sealed class ConfigEntryServiceSplitterArgs : global::Pulumi.ResourceArgs
    {
        [Input("meta")]
        private InputMap<string>? _meta;

        /// <summary>
        /// Specifies key-value pairs to add to the KV store.
        /// </summary>
        public InputMap<string> Meta
        {
            get => _meta ?? (_meta = new InputMap<string>());
            set => _meta = value;
        }

        /// <summary>
        /// Specifies a name for the configuration entry.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the namespace to apply the configuration entry.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// Specifies the admin partition to apply the configuration entry.
        /// </summary>
        [Input("partition")]
        public Input<string>? Partition { get; set; }

        [Input("splits", required: true)]
        private InputList<Inputs.ConfigEntryServiceSplitterSplitArgs>? _splits;

        /// <summary>
        /// Defines how much traffic to send to sets of service instances during a traffic split.
        /// </summary>
        public InputList<Inputs.ConfigEntryServiceSplitterSplitArgs> Splits
        {
            get => _splits ?? (_splits = new InputList<Inputs.ConfigEntryServiceSplitterSplitArgs>());
            set => _splits = value;
        }

        public ConfigEntryServiceSplitterArgs()
        {
        }
        public static new ConfigEntryServiceSplitterArgs Empty => new ConfigEntryServiceSplitterArgs();
    }

    public sealed class ConfigEntryServiceSplitterState : global::Pulumi.ResourceArgs
    {
        [Input("meta")]
        private InputMap<string>? _meta;

        /// <summary>
        /// Specifies key-value pairs to add to the KV store.
        /// </summary>
        public InputMap<string> Meta
        {
            get => _meta ?? (_meta = new InputMap<string>());
            set => _meta = value;
        }

        /// <summary>
        /// Specifies a name for the configuration entry.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the namespace to apply the configuration entry.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// Specifies the admin partition to apply the configuration entry.
        /// </summary>
        [Input("partition")]
        public Input<string>? Partition { get; set; }

        [Input("splits")]
        private InputList<Inputs.ConfigEntryServiceSplitterSplitGetArgs>? _splits;

        /// <summary>
        /// Defines how much traffic to send to sets of service instances during a traffic split.
        /// </summary>
        public InputList<Inputs.ConfigEntryServiceSplitterSplitGetArgs> Splits
        {
            get => _splits ?? (_splits = new InputList<Inputs.ConfigEntryServiceSplitterSplitGetArgs>());
            set => _splits = value;
        }

        public ConfigEntryServiceSplitterState()
        {
        }
        public static new ConfigEntryServiceSplitterState Empty => new ConfigEntryServiceSplitterState();
    }
}
