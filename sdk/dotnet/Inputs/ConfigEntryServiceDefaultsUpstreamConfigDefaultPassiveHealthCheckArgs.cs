// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul.Inputs
{

    public sealed class ConfigEntryServiceDefaultsUpstreamConfigDefaultPassiveHealthCheckArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the minimum amount of time that an ejected host must remain outside the cluster before rejoining.
        /// </summary>
        [Input("baseEjectionTime")]
        public Input<string>? BaseEjectionTime { get; set; }

        /// <summary>
        /// Specifies a percentage that indicates how many times out of 100 that Consul ejects the host when it detects an outlier status.
        /// </summary>
        [Input("enforcingConsecutive5xx")]
        public Input<int>? EnforcingConsecutive5xx { get; set; }

        /// <summary>
        /// Specifies the time between checks.
        /// </summary>
        [Input("interval")]
        public Input<string>? Interval { get; set; }

        /// <summary>
        /// Specifies the maximum percentage of an upstream cluster that Consul ejects when the proxy reports an outlier.
        /// </summary>
        [Input("maxEjectionPercent")]
        public Input<int>? MaxEjectionPercent { get; set; }

        /// <summary>
        /// Specifies the number of consecutive failures allowed per check interval. If exceeded, Consul removes the host from the load balancer.
        /// </summary>
        [Input("maxFailures")]
        public Input<int>? MaxFailures { get; set; }

        public ConfigEntryServiceDefaultsUpstreamConfigDefaultPassiveHealthCheckArgs()
        {
        }
        public static new ConfigEntryServiceDefaultsUpstreamConfigDefaultPassiveHealthCheckArgs Empty => new ConfigEntryServiceDefaultsUpstreamConfigDefaultPassiveHealthCheckArgs();
    }
}