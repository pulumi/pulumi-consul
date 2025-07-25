// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul.Inputs
{

    public sealed class ConfigEntryServiceIntentionsJwtArgs : global::Pulumi.ResourceArgs
    {
        [Input("providers")]
        private InputList<Inputs.ConfigEntryServiceIntentionsJwtProviderArgs>? _providers;

        /// <summary>
        /// Specifies the names of one or more previously configured JWT provider configuration entries, which include the information necessary to validate a JSON web token.
        /// </summary>
        public InputList<Inputs.ConfigEntryServiceIntentionsJwtProviderArgs> Providers
        {
            get => _providers ?? (_providers = new InputList<Inputs.ConfigEntryServiceIntentionsJwtProviderArgs>());
            set => _providers = value;
        }

        public ConfigEntryServiceIntentionsJwtArgs()
        {
        }
        public static new ConfigEntryServiceIntentionsJwtArgs Empty => new ConfigEntryServiceIntentionsJwtArgs();
    }
}
