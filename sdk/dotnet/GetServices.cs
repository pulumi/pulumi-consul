// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul
{
    public static partial class Invokes
    {
        /// <summary>
        /// The `consul..getServices` data source returns a list of Consul services that
        /// have been registered with the Consul cluster in a given datacenter.  By
        /// specifying a different datacenter in the `query_options` it is possible to
        /// retrieve a list of services from a different WAN-attached Consul datacenter.
        /// 
        /// This data source is different from the `consul..Service` (singular) data
        /// source, which provides a detailed response about a specific Consul service.
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-consul/blob/master/website/docs/d/services.html.markdown.
        /// </summary>
        public static Task<GetServicesResult> GetServices(GetServicesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetServicesResult>("consul:index/getServices:getServices", args, options.WithVersion());
    }

    public sealed class GetServicesArgs : Pulumi.ResourceArgs
    {
        [Input("queryOptions")]
        private InputList<Inputs.GetServicesQueryOptionsArgs>? _queryOptions;

        /// <summary>
        /// See below.
        /// </summary>
        public InputList<Inputs.GetServicesQueryOptionsArgs> QueryOptions
        {
            get => _queryOptions ?? (_queryOptions = new InputList<Inputs.GetServicesQueryOptionsArgs>());
            set => _queryOptions = value;
        }

        public GetServicesArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetServicesResult
    {
        /// <summary>
        /// The datacenter the keys are being read from to.
        /// </summary>
        public readonly string Datacenter;
        public readonly ImmutableArray<string> Names;
        public readonly ImmutableArray<Outputs.GetServicesQueryOptionsResult> QueryOptions;
        public readonly Outputs.GetServicesServicesResult Services;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetServicesResult(
            string datacenter,
            ImmutableArray<string> names,
            ImmutableArray<Outputs.GetServicesQueryOptionsResult> queryOptions,
            Outputs.GetServicesServicesResult services,
            string id)
        {
            Datacenter = datacenter;
            Names = names;
            QueryOptions = queryOptions;
            Services = services;
            Id = id;
        }
    }

    namespace Inputs
    {

    public sealed class GetServicesQueryOptionsArgs : Pulumi.ResourceArgs
    {
        [Input("allowStale")]
        public Input<bool>? AllowStale { get; set; }

        /// <summary>
        /// The Consul datacenter to query.  Defaults to the
        /// same value found in `query_options` parameter specified below, or if that is
        /// empty, the `datacenter` value found in the Consul agent that this provider is
        /// configured to talk to.
        /// </summary>
        [Input("datacenter")]
        public Input<string>? Datacenter { get; set; }

        [Input("near")]
        public Input<string>? Near { get; set; }

        [Input("nodeMeta")]
        private InputMap<object>? _nodeMeta;
        public InputMap<object> NodeMeta
        {
            get => _nodeMeta ?? (_nodeMeta = new InputMap<object>());
            set => _nodeMeta = value;
        }

        [Input("requireConsistent")]
        public Input<bool>? RequireConsistent { get; set; }

        [Input("token")]
        public Input<string>? Token { get; set; }

        [Input("waitIndex")]
        public Input<int>? WaitIndex { get; set; }

        [Input("waitTime")]
        public Input<string>? WaitTime { get; set; }

        public GetServicesQueryOptionsArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class GetServicesQueryOptionsResult
    {
        public readonly bool? AllowStale;
        /// <summary>
        /// The Consul datacenter to query.  Defaults to the
        /// same value found in `query_options` parameter specified below, or if that is
        /// empty, the `datacenter` value found in the Consul agent that this provider is
        /// configured to talk to.
        /// </summary>
        public readonly string? Datacenter;
        public readonly string? Near;
        public readonly ImmutableDictionary<string, object>? NodeMeta;
        public readonly bool? RequireConsistent;
        public readonly string? Token;
        public readonly int? WaitIndex;
        public readonly string? WaitTime;

        [OutputConstructor]
        private GetServicesQueryOptionsResult(
            bool? allowStale,
            string? datacenter,
            string? near,
            ImmutableDictionary<string, object>? nodeMeta,
            bool? requireConsistent,
            string? token,
            int? waitIndex,
            string? waitTime)
        {
            AllowStale = allowStale;
            Datacenter = datacenter;
            Near = near;
            NodeMeta = nodeMeta;
            RequireConsistent = requireConsistent;
            Token = token;
            WaitIndex = waitIndex;
            WaitTime = waitTime;
        }
    }

    [OutputType]
    public sealed class GetServicesServicesResult
    {
        /// <summary>
        /// A map of the tags found for each service.  If more than one service
        /// shares the same tag, unique service names will be joined by whitespace (this
        /// is the inverse of `services` and can be used to lookup the services that match
        /// a single tag).
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetServicesServicesResult(ImmutableArray<string> tags)
        {
            Tags = tags;
        }
    }
    }
}