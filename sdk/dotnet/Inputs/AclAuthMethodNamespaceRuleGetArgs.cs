// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul.Inputs
{

    public sealed class AclAuthMethodNamespaceRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If the namespace rule's `selector` matches then this is used to control the namespace where the token is created.
        /// </summary>
        [Input("bindNamespace", required: true)]
        public Input<string> BindNamespace { get; set; } = null!;

        /// <summary>
        /// Specifies the expression used to match this namespace rule against valid identities returned from an auth method validation.
        /// </summary>
        [Input("selector")]
        public Input<string>? Selector { get; set; }

        public AclAuthMethodNamespaceRuleGetArgs()
        {
        }
        public static new AclAuthMethodNamespaceRuleGetArgs Empty => new AclAuthMethodNamespaceRuleGetArgs();
    }
}
