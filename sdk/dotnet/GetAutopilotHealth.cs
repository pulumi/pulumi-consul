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
        /// The `consul..getAutopilotHealth` data source returns
        /// [autopilot health information](https://www.consul.io/api/operator/autopilot.html#read-health)
        /// about the current Consul cluster.
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-consul/blob/master/website/docs/d/autopilot_health.html.markdown.
        /// </summary>
        public static Task<GetAutopilotHealthResult> GetAutopilotHealth(GetAutopilotHealthArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAutopilotHealthResult>("consul:index/getAutopilotHealth:getAutopilotHealth", args, options.WithVersion());
    }

    public sealed class GetAutopilotHealthArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The datacenter to use. This overrides the agent's
        /// default datacenter and the datacenter in the provider setup.
        /// </summary>
        [Input("datacenter")]
        public Input<string>? Datacenter { get; set; }

        public GetAutopilotHealthArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetAutopilotHealthResult
    {
        public readonly string? Datacenter;
        /// <summary>
        /// The number of redundant healthy servers that could fail
        /// without causing an outage
        /// </summary>
        public readonly int FailureTolerance;
        /// <summary>
        /// Whether the server is healthy according to the current Autopilot
        /// configuration
        /// </summary>
        public readonly bool Healthy;
        /// <summary>
        /// A list of server health information. See below for details on the
        /// available information.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAutopilotHealthServersResult> Servers;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetAutopilotHealthResult(
            string? datacenter,
            int failureTolerance,
            bool healthy,
            ImmutableArray<Outputs.GetAutopilotHealthServersResult> servers,
            string id)
        {
            Datacenter = datacenter;
            FailureTolerance = failureTolerance;
            Healthy = healthy;
            Servers = servers;
            Id = id;
        }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class GetAutopilotHealthServersResult
    {
        /// <summary>
        /// The address of the server
        /// </summary>
        public readonly string Address;
        /// <summary>
        /// Whether the server is healthy according to the current Autopilot
        /// configuration
        /// </summary>
        public readonly bool Healthy;
        /// <summary>
        /// The Raft ID of the server
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The time elapsed since the server's last contact with
        /// the leader
        /// </summary>
        public readonly string LastContact;
        /// <summary>
        /// The index of the server's last committed Raft log entry
        /// </summary>
        public readonly int LastIndex;
        /// <summary>
        /// The server's last known Raft leader term
        /// </summary>
        public readonly int LastTerm;
        /// <summary>
        /// Whether the server is currently leader
        /// </summary>
        public readonly bool Leader;
        /// <summary>
        /// The node name of the server
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The status of the SerfHealth check of the server
        /// </summary>
        public readonly string SerfStatus;
        /// <summary>
        /// The time this server has been in its current ``Healthy``
        /// state
        /// </summary>
        public readonly string StableSince;
        /// <summary>
        /// The Consul version of the server
        /// </summary>
        public readonly string Version;
        /// <summary>
        /// Whether the server is a voting member of the Raft cluster
        /// </summary>
        public readonly bool Voter;

        [OutputConstructor]
        private GetAutopilotHealthServersResult(
            string address,
            bool healthy,
            string id,
            string lastContact,
            int lastIndex,
            int lastTerm,
            bool leader,
            string name,
            string serfStatus,
            string stableSince,
            string version,
            bool voter)
        {
            Address = address;
            Healthy = healthy;
            Id = id;
            LastContact = lastContact;
            LastIndex = lastIndex;
            LastTerm = lastTerm;
            Leader = leader;
            Name = name;
            SerfStatus = serfStatus;
            StableSince = stableSince;
            Version = version;
            Voter = voter;
        }
    }
    }
}