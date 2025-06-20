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
    public sealed class ConfigEntryServiceDefaultsEnvoyExtension
    {
        public readonly ImmutableDictionary<string, string>? Arguments;
        public readonly string? ConsulVersion;
        public readonly string? EnvoyVersion;
        public readonly string? Name;
        public readonly bool? Required;

        [OutputConstructor]
        private ConfigEntryServiceDefaultsEnvoyExtension(
            ImmutableDictionary<string, string>? arguments,

            string? consulVersion,

            string? envoyVersion,

            string? name,

            bool? required)
        {
            Arguments = arguments;
            ConsulVersion = consulVersion;
            EnvoyVersion = envoyVersion;
            Name = name;
            Required = required;
        }
    }
}
