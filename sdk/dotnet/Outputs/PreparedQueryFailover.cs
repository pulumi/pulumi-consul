// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul.Outputs
{

    [OutputType]
    public sealed class PreparedQueryFailover
    {
        /// <summary>
        /// Remote datacenters to return results from.
        /// </summary>
        public readonly ImmutableArray<string> Datacenters;
        /// <summary>
        /// Return results from this many datacenters, sorted in ascending order of estimated RTT.
        /// </summary>
        public readonly int? NearestN;
        /// <summary>
        /// Specifies a sequential list of remote datacenters and cluster peers to failover to if there are no healthy service instances in the local datacenter. This option cannot be used with `nearest_n` or `datacenters`.
        /// </summary>
        public readonly ImmutableArray<Outputs.PreparedQueryFailoverTarget> Targets;

        [OutputConstructor]
        private PreparedQueryFailover(
            ImmutableArray<string> datacenters,

            int? nearestN,

            ImmutableArray<Outputs.PreparedQueryFailoverTarget> targets)
        {
            Datacenters = datacenters;
            NearestN = nearestN;
            Targets = targets;
        }
    }
}
