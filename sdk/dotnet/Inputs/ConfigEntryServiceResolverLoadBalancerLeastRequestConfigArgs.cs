// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul.Inputs
{

    public sealed class ConfigEntryServiceResolverLoadBalancerLeastRequestConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("choiceCount")]
        public Input<int>? ChoiceCount { get; set; }

        public ConfigEntryServiceResolverLoadBalancerLeastRequestConfigArgs()
        {
        }
        public static new ConfigEntryServiceResolverLoadBalancerLeastRequestConfigArgs Empty => new ConfigEntryServiceResolverLoadBalancerLeastRequestConfigArgs();
    }
}
