// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul.Inputs
{

    public sealed class GetKeyPrefixSubkeyCollectionArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// This is the default value to set for `var.&lt;name&gt;`
        /// if the key does not exist in Consul. Defaults to an empty string.
        /// </summary>
        [Input("default")]
        public string? Default { get; set; }

        /// <summary>
        /// This is the name of the key. This value of the
        /// key is exposed as `var.&lt;name&gt;`. This is not the path of the subkey
        /// in Consul.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// This is the subkey path in Consul (which will be appended
        /// to the given `path_prefix`) to construct the full key that will be used
        /// to read the value.
        /// </summary>
        [Input("path", required: true)]
        public string Path { get; set; } = null!;

        public GetKeyPrefixSubkeyCollectionArgs()
        {
        }
    }
}