// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul.Inputs
{

    public sealed class ConfigEntryServiceRouterRouteMatchGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a set of HTTP criteria used to evaluate incoming L7 traffic for matches.
        /// </summary>
        [Input("http")]
        public Input<Inputs.ConfigEntryServiceRouterRouteMatchHttpGetArgs>? Http { get; set; }

        public ConfigEntryServiceRouterRouteMatchGetArgs()
        {
        }
        public static new ConfigEntryServiceRouterRouteMatchGetArgs Empty => new ConfigEntryServiceRouterRouteMatchGetArgs();
    }
}