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
    public sealed class ConfigEntryServiceRouterRoute
    {
        /// <summary>
        /// Specifies the target service to route matching requests to, as well as behavior for the request to follow when routed.
        /// </summary>
        public readonly Outputs.ConfigEntryServiceRouterRouteDestination? Destination;
        /// <summary>
        /// Describes a set of criteria that Consul compares incoming L7 traffic with.
        /// </summary>
        public readonly Outputs.ConfigEntryServiceRouterRouteMatch? Match;

        [OutputConstructor]
        private ConfigEntryServiceRouterRoute(
            Outputs.ConfigEntryServiceRouterRouteDestination? destination,

            Outputs.ConfigEntryServiceRouterRouteMatch? match)
        {
            Destination = destination;
            Match = match;
        }
    }
}
