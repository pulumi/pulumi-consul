// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul.Inputs
{

    public sealed class ConfigEntryServiceDefaultsUpstreamConfigOverrideMeshGatewayArgs : global::Pulumi.ResourceArgs
    {
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        public ConfigEntryServiceDefaultsUpstreamConfigOverrideMeshGatewayArgs()
        {
        }
        public static new ConfigEntryServiceDefaultsUpstreamConfigOverrideMeshGatewayArgs Empty => new ConfigEntryServiceDefaultsUpstreamConfigOverrideMeshGatewayArgs();
    }
}
