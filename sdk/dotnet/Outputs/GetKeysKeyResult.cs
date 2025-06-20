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
    public sealed class GetKeysKeyResult
    {
        /// <summary>
        /// This is the default value to set for `var.&lt;name&gt;` if the key does not exist in Consul. Defaults to an empty string.
        /// </summary>
        public readonly string? Default;
        /// <summary>
        /// This is the name of the key. This value of the key is exposed as `var.&lt;name&gt;`. This is not the path of the key in Consul.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// This is the path in Consul that should be read or written to.
        /// </summary>
        public readonly string Path;

        [OutputConstructor]
        private GetKeysKeyResult(
            string? @default,

            string name,

            string path)
        {
            Default = @default;
            Name = name;
            Path = path;
        }
    }
}
