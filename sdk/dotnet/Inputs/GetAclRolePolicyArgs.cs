// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul.Inputs
{

    public sealed class GetAclRolePolicyArgs : Pulumi.InvokeArgs
    {
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        /// <summary>
        /// The name of the ACL Role.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetAclRolePolicyArgs()
        {
        }
    }
}