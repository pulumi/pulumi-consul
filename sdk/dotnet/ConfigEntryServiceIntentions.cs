// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul
{
    /// <summary>
    /// The `consul_service_intentions_config_entry` resource configures [service intentions](https://developer.hashicorp.com/consul/docs/connect/config-entries/service-intentions) that are configurations for controlling access between services in the service mesh. A single service intentions configuration entry specifies one destination service and one or more L4 traffic sources, L7 traffic sources, or combination of traffic sources.
    /// 
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
    ///     var jwtProvider = new Consul.ConfigEntry("jwtProvider", new()
    ///     {
    ///         Kind = "jwt-provider",
    ///         ConfigJson = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["ClockSkewSeconds"] = 30,
    ///             ["Issuer"] = "test-issuer",
    ///             ["JSONWebKeySet"] = new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 ["Remote"] = new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["URI"] = "https://127.0.0.1:9091",
    ///                     ["FetchAsynchronously"] = true,
    ///                 },
    ///             },
    ///         }),
    ///     });
    /// 
    ///     var web = new Consul.ConfigEntryServiceIntentions("web", new()
    ///     {
    ///         Jwts = new[]
    ///         {
    ///             new Consul.Inputs.ConfigEntryServiceIntentionsJwtArgs
    ///             {
    ///                 Providers = new[]
    ///                 {
    ///                     new Consul.Inputs.ConfigEntryServiceIntentionsJwtProviderArgs
    ///                     {
    ///                         Name = jwtProvider.Name,
    ///                         VerifyClaims = new[]
    ///                         {
    ///                             new Consul.Inputs.ConfigEntryServiceIntentionsJwtProviderVerifyClaimArgs
    ///                             {
    ///                                 Paths = new[]
    ///                                 {
    ///                                     "perms",
    ///                                     "role",
    ///                                 },
    ///                                 Value = "admin",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Sources = new[]
    ///         {
    ///             new Consul.Inputs.ConfigEntryServiceIntentionsSourceArgs
    ///             {
    ///                 Name = "frontend-webapp",
    ///                 Type = "consul",
    ///                 Action = "allow",
    ///             },
    ///             new Consul.Inputs.ConfigEntryServiceIntentionsSourceArgs
    ///             {
    ///                 Name = "nightly-cronjob",
    ///                 Type = "consul",
    ///                 Action = "deny",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [ConsulResourceType("consul:index/configEntryServiceIntentions:ConfigEntryServiceIntentions")]
    public partial class ConfigEntryServiceIntentions : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies a JSON Web Token provider configured in a JWT provider configuration entry, as well as additional configurations for verifying a service's JWT before authorizing communication between services
        /// </summary>
        [Output("jwts")]
        public Output<ImmutableArray<Outputs.ConfigEntryServiceIntentionsJwt>> Jwts { get; private set; } = null!;

        /// <summary>
        /// Specifies key-value pairs to add to the KV store.
        /// </summary>
        [Output("meta")]
        public Output<ImmutableDictionary<string, string>?> Meta { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of a JWT provider defined in the Name field of the jwt-provider configuration entry.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the traffic source namespace that the intention allows or denies traffic from.
        /// </summary>
        [Output("namespace")]
        public Output<string?> Namespace { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of an admin partition that the intention allows or denies traffic from.
        /// </summary>
        [Output("partition")]
        public Output<string?> Partition { get; private set; } = null!;

        /// <summary>
        /// List of configurations that define intention sources and the authorization granted to the sources.
        /// </summary>
        [Output("sources")]
        public Output<ImmutableArray<Outputs.ConfigEntryServiceIntentionsSource>> Sources { get; private set; } = null!;


        /// <summary>
        /// Create a ConfigEntryServiceIntentions resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ConfigEntryServiceIntentions(string name, ConfigEntryServiceIntentionsArgs? args = null, CustomResourceOptions? options = null)
            : base("consul:index/configEntryServiceIntentions:ConfigEntryServiceIntentions", name, args ?? new ConfigEntryServiceIntentionsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ConfigEntryServiceIntentions(string name, Input<string> id, ConfigEntryServiceIntentionsState? state = null, CustomResourceOptions? options = null)
            : base("consul:index/configEntryServiceIntentions:ConfigEntryServiceIntentions", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ConfigEntryServiceIntentions resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ConfigEntryServiceIntentions Get(string name, Input<string> id, ConfigEntryServiceIntentionsState? state = null, CustomResourceOptions? options = null)
        {
            return new ConfigEntryServiceIntentions(name, id, state, options);
        }
    }

    public sealed class ConfigEntryServiceIntentionsArgs : global::Pulumi.ResourceArgs
    {
        [Input("jwts")]
        private InputList<Inputs.ConfigEntryServiceIntentionsJwtArgs>? _jwts;

        /// <summary>
        /// Specifies a JSON Web Token provider configured in a JWT provider configuration entry, as well as additional configurations for verifying a service's JWT before authorizing communication between services
        /// </summary>
        public InputList<Inputs.ConfigEntryServiceIntentionsJwtArgs> Jwts
        {
            get => _jwts ?? (_jwts = new InputList<Inputs.ConfigEntryServiceIntentionsJwtArgs>());
            set => _jwts = value;
        }

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
        /// Specifies the name of a JWT provider defined in the Name field of the jwt-provider configuration entry.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the traffic source namespace that the intention allows or denies traffic from.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// Specifies the name of an admin partition that the intention allows or denies traffic from.
        /// </summary>
        [Input("partition")]
        public Input<string>? Partition { get; set; }

        [Input("sources")]
        private InputList<Inputs.ConfigEntryServiceIntentionsSourceArgs>? _sources;

        /// <summary>
        /// List of configurations that define intention sources and the authorization granted to the sources.
        /// </summary>
        public InputList<Inputs.ConfigEntryServiceIntentionsSourceArgs> Sources
        {
            get => _sources ?? (_sources = new InputList<Inputs.ConfigEntryServiceIntentionsSourceArgs>());
            set => _sources = value;
        }

        public ConfigEntryServiceIntentionsArgs()
        {
        }
        public static new ConfigEntryServiceIntentionsArgs Empty => new ConfigEntryServiceIntentionsArgs();
    }

    public sealed class ConfigEntryServiceIntentionsState : global::Pulumi.ResourceArgs
    {
        [Input("jwts")]
        private InputList<Inputs.ConfigEntryServiceIntentionsJwtGetArgs>? _jwts;

        /// <summary>
        /// Specifies a JSON Web Token provider configured in a JWT provider configuration entry, as well as additional configurations for verifying a service's JWT before authorizing communication between services
        /// </summary>
        public InputList<Inputs.ConfigEntryServiceIntentionsJwtGetArgs> Jwts
        {
            get => _jwts ?? (_jwts = new InputList<Inputs.ConfigEntryServiceIntentionsJwtGetArgs>());
            set => _jwts = value;
        }

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
        /// Specifies the name of a JWT provider defined in the Name field of the jwt-provider configuration entry.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the traffic source namespace that the intention allows or denies traffic from.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// Specifies the name of an admin partition that the intention allows or denies traffic from.
        /// </summary>
        [Input("partition")]
        public Input<string>? Partition { get; set; }

        [Input("sources")]
        private InputList<Inputs.ConfigEntryServiceIntentionsSourceGetArgs>? _sources;

        /// <summary>
        /// List of configurations that define intention sources and the authorization granted to the sources.
        /// </summary>
        public InputList<Inputs.ConfigEntryServiceIntentionsSourceGetArgs> Sources
        {
            get => _sources ?? (_sources = new InputList<Inputs.ConfigEntryServiceIntentionsSourceGetArgs>());
            set => _sources = value;
        }

        public ConfigEntryServiceIntentionsState()
        {
        }
        public static new ConfigEntryServiceIntentionsState Empty => new ConfigEntryServiceIntentionsState();
    }
}