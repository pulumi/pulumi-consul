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
    public sealed class PreparedQueryTemplate
    {
        /// <summary>
        /// The regular expression to match with. When using
        /// `name_prefix_match`, this regex is applied against the query name.
        /// </summary>
        public readonly string Regexp;
        /// <summary>
        /// The type of template matching to perform. Currently
        /// only `name_prefix_match` is supported.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private PreparedQueryTemplate(
            string regexp,

            string type)
        {
            Regexp = regexp;
            Type = type;
        }
    }
}
