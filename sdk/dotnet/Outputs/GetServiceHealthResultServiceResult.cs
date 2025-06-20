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
    public sealed class GetServiceHealthResultServiceResult
    {
        /// <summary>
        /// The address of this instance.
        /// </summary>
        public readonly string Address;
        /// <summary>
        /// The ID of this health-check.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Service metadata tag information, if any.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Meta;
        /// <summary>
        /// The service name to select.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The port of this instance.
        /// </summary>
        public readonly int Port;
        /// <summary>
        /// The list of tags associated with this instance.
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetServiceHealthResultServiceResult(
            string address,

            string id,

            ImmutableDictionary<string, string> meta,

            string name,

            int port,

            ImmutableArray<string> tags)
        {
            Address = address;
            Id = id;
            Meta = meta;
            Name = name;
            Port = port;
            Tags = tags;
        }
    }
}
