// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul.Inputs
{

    public sealed class PreparedQueryFailoverArgs : Pulumi.ResourceArgs
    {
        [Input("datacenters")]
        private InputList<string>? _datacenters;

        /// <summary>
        /// Remote datacenters to return results from.
        /// </summary>
        public InputList<string> Datacenters
        {
            get => _datacenters ?? (_datacenters = new InputList<string>());
            set => _datacenters = value;
        }

        /// <summary>
        /// Return results from this many datacenters,
        /// sorted in ascending order of estimated RTT.
        /// </summary>
        [Input("nearestN")]
        public Input<int>? NearestN { get; set; }

        public PreparedQueryFailoverArgs()
        {
        }
    }
}
