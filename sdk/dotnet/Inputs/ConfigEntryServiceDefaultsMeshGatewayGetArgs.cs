// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul.Inputs
{

    public sealed class ConfigEntryServiceDefaultsMeshGatewayGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        public ConfigEntryServiceDefaultsMeshGatewayGetArgs()
        {
        }
        public static new ConfigEntryServiceDefaultsMeshGatewayGetArgs Empty => new ConfigEntryServiceDefaultsMeshGatewayGetArgs();
    }
}
