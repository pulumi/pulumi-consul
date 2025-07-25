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
    public sealed class KeyPrefixSubkeyCollection
    {
        /// <summary>
        /// An [unsigned integer value](https://www.consul.io/api/kv.html#flags-1)
        /// to attach to the key (defaults to 0).
        /// </summary>
        public readonly int? Flags;
        /// <summary>
        /// This is the path (which will be appended to the given
        /// `path_prefix`) in Consul that should be written to.
        /// </summary>
        public readonly string Path;
        /// <summary>
        /// The value to write to the given path.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private KeyPrefixSubkeyCollection(
            int? flags,

            string path,

            string value)
        {
            Flags = flags;
            Path = path;
            Value = value;
        }
    }
}
