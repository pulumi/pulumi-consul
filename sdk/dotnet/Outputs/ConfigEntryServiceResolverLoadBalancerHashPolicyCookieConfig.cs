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
    public sealed class ConfigEntryServiceResolverLoadBalancerHashPolicyCookieConfig
    {
        /// <summary>
        /// Specifies the path to set for the cookie.
        /// </summary>
        public readonly string? Path;
        /// <summary>
        /// Directs Consul to generate a session cookie with no expiration.
        /// </summary>
        public readonly bool? Session;
        /// <summary>
        /// Specifies the TTL for generated cookies. Cannot be specified for session cookies.
        /// </summary>
        public readonly string? Ttl;

        [OutputConstructor]
        private ConfigEntryServiceResolverLoadBalancerHashPolicyCookieConfig(
            string? path,

            bool? session,

            string? ttl)
        {
            Path = path;
            Session = session;
            Ttl = ttl;
        }
    }
}
