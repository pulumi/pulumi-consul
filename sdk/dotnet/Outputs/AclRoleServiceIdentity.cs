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
    public sealed class AclRoleServiceIdentity
    {
        /// <summary>
        /// The datacenters the effective policy is valid within. When no datacenters are provided the effective policy is valid in all datacenters including those which do not yet exist but may in the future.
        /// </summary>
        public readonly ImmutableArray<string> Datacenters;
        /// <summary>
        /// The name of the service.
        /// </summary>
        public readonly string ServiceName;

        [OutputConstructor]
        private AclRoleServiceIdentity(
            ImmutableArray<string> datacenters,

            string serviceName)
        {
            Datacenters = datacenters;
            ServiceName = serviceName;
        }
    }
}
