// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul.Inputs
{

    public sealed class ConfigEntryServiceIntentionsSourcePermissionHttpArgs : global::Pulumi.ResourceArgs
    {
        [Input("headers")]
        private InputList<Inputs.ConfigEntryServiceIntentionsSourcePermissionHttpHeaderArgs>? _headers;

        /// <summary>
        /// Specifies a header name and matching criteria for HTTP request headers.
        /// </summary>
        public InputList<Inputs.ConfigEntryServiceIntentionsSourcePermissionHttpHeaderArgs> Headers
        {
            get => _headers ?? (_headers = new InputList<Inputs.ConfigEntryServiceIntentionsSourcePermissionHttpHeaderArgs>());
            set => _headers = value;
        }

        [Input("methods")]
        private InputList<string>? _methods;

        /// <summary>
        /// Specifies a list of HTTP methods.
        /// </summary>
        public InputList<string> Methods
        {
            get => _methods ?? (_methods = new InputList<string>());
            set => _methods = value;
        }

        /// <summary>
        /// Specifies an exact path to match on the HTTP request path.
        /// </summary>
        [Input("pathExact")]
        public Input<string>? PathExact { get; set; }

        /// <summary>
        /// Specifies a path prefix to match on the HTTP request path.
        /// </summary>
        [Input("pathPrefix")]
        public Input<string>? PathPrefix { get; set; }

        /// <summary>
        /// Defines a regular expression to match on the HTTP request path.
        /// </summary>
        [Input("pathRegex")]
        public Input<string>? PathRegex { get; set; }

        public ConfigEntryServiceIntentionsSourcePermissionHttpArgs()
        {
        }
        public static new ConfigEntryServiceIntentionsSourcePermissionHttpArgs Empty => new ConfigEntryServiceIntentionsSourcePermissionHttpArgs();
    }
}