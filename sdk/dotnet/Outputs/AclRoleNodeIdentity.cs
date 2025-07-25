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
    public sealed class AclRoleNodeIdentity
    {
        /// <summary>
        /// Specifies the node's datacenter.
        /// </summary>
        public readonly string Datacenter;
        /// <summary>
        /// The name of the node.
        /// </summary>
        public readonly string NodeName;

        [OutputConstructor]
        private AclRoleNodeIdentity(
            string datacenter,

            string nodeName)
        {
            Datacenter = datacenter;
            NodeName = nodeName;
        }
    }
}
