// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul.Outputs
{

    [OutputType]
    public sealed class GetAutopilotHealthServerResult
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
        private GetAutopilotHealthServerResult(
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