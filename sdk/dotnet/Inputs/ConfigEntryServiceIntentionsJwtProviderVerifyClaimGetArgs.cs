// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul.Inputs
{

    public sealed class ConfigEntryServiceIntentionsJwtProviderVerifyClaimGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("paths")]
        private InputList<string>? _paths;

        /// <summary>
        /// Specifies the path to the claim in the JSON web token.
        /// </summary>
        public InputList<string> Paths
        {
            get => _paths ?? (_paths = new InputList<string>());
            set => _paths = value;
        }

        /// <summary>
        /// Specifies the value to match on when verifying the the claim designated in path.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public ConfigEntryServiceIntentionsJwtProviderVerifyClaimGetArgs()
        {
        }
        public static new ConfigEntryServiceIntentionsJwtProviderVerifyClaimGetArgs Empty => new ConfigEntryServiceIntentionsJwtProviderVerifyClaimGetArgs();
    }
}
