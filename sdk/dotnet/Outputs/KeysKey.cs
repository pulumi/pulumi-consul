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
    public sealed class KeysKey
    {
        public readonly string? Default;
        /// <summary>
        /// If true, then the key will be deleted when
        /// either its configuration block is removed from the configuration or
        /// the entire resource is destroyed. Otherwise, it will be left in Consul.
        /// Defaults to false.
        /// </summary>
        public readonly bool? Delete;
        /// <summary>
        /// An [unsigned integer value](https://www.consul.io/api/kv.html#flags-1)
        /// to attach to the key (defaults to 0).
        /// </summary>
        public readonly int? Flags;
        public readonly string? Name;
        /// <summary>
        /// This is the path in Consul that should be written to.
        /// </summary>
        public readonly string Path;
        /// <summary>
        /// The value to write to the given path.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private KeysKey(
            string? @default,

            bool? delete,

            int? flags,

            string? name,

            string path,

            string? value)
        {
            Default = @default;
            Delete = delete;
            Flags = flags;
            Name = name;
            Path = path;
            Value = value;
        }
    }
}