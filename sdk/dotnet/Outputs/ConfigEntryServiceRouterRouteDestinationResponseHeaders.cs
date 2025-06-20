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
    public sealed class ConfigEntryServiceRouterRouteDestinationResponseHeaders
    {
        /// <summary>
        /// Defines a set of key-value pairs to add to the header. Use header names as the keys
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Add;
        /// <summary>
        /// Defines a list of headers to remove.
        /// </summary>
        public readonly ImmutableArray<string> Removes;
        /// <summary>
        /// Defines a set of key-value pairs to add to the response header or to replace existing header values with
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Set;

        [OutputConstructor]
        private ConfigEntryServiceRouterRouteDestinationResponseHeaders(
            ImmutableDictionary<string, string>? add,

            ImmutableArray<string> removes,

            ImmutableDictionary<string, string>? set)
        {
            Add = add;
            Removes = removes;
            Set = set;
        }
    }
}
