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
    public sealed class GetCatalogServicesQueryOptionResult
    {
        public readonly bool? AllowStale;
        public readonly string? Datacenter;
        public readonly string? Namespace;
        public readonly string? Near;
        public readonly ImmutableDictionary<string, string>? NodeMeta;
        public readonly bool? RequireConsistent;
        public readonly string? Token;
        public readonly int? WaitIndex;
        public readonly string? WaitTime;

        [OutputConstructor]
        private GetCatalogServicesQueryOptionResult(
            bool? allowStale,

            string? datacenter,

            string? @namespace,

            string? near,

            ImmutableDictionary<string, string>? nodeMeta,

            bool? requireConsistent,

            string? token,

            int? waitIndex,

            string? waitTime)
        {
            AllowStale = allowStale;
            Datacenter = datacenter;
            Namespace = @namespace;
            Near = near;
            NodeMeta = nodeMeta;
            RequireConsistent = requireConsistent;
            Token = token;
            WaitIndex = waitIndex;
            WaitTime = waitTime;
        }
    }
}
