// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Consul
{
    /// <summary>
    /// The provider type for the consul package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-consul/blob/master/website/docs/index.html.markdown.
    /// </summary>
    public partial class Provider : Pulumi.ProviderResource
    {
        /// <summary>
        /// Create a Provider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Provider(string name, ProviderArgs? args = null, ResourceOptions? options = null)
            : base("consul", name, args, MakeResourceOptions(options, ""))
        {
        }

        private static ResourceOptions MakeResourceOptions(ResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new ResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = ResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
    }

    public sealed class ProviderArgs : Pulumi.ResourceArgs
    {
        [Input("address")]
        public Input<string>? Address { get; set; }

        [Input("caFile")]
        public Input<string>? CaFile { get; set; }

        [Input("caPath")]
        public Input<string>? CaPath { get; set; }

        [Input("certFile")]
        public Input<string>? CertFile { get; set; }

        [Input("datacenter")]
        public Input<string>? Datacenter { get; set; }

        [Input("httpAuth")]
        public Input<string>? HttpAuth { get; set; }

        [Input("insecureHttps", json: true)]
        public Input<bool>? InsecureHttps { get; set; }

        [Input("keyFile")]
        public Input<string>? KeyFile { get; set; }

        [Input("scheme")]
        public Input<string>? Scheme { get; set; }

        [Input("token")]
        public Input<string>? Token { get; set; }

        public ProviderArgs()
        {
            Address = Utilities.GetEnv("CONSUL_ADDRESS", "CONSUL_HTTP_ADDR") ?? "localhost:8500";
            CaFile = Utilities.GetEnv("CONSUL_CA_FILE");
            CaPath = Utilities.GetEnv("CONSUL_CAPATH");
            CertFile = Utilities.GetEnv("CONSUL_CERT_FILE");
            HttpAuth = Utilities.GetEnv("CONSUL_HTTP_AUTH");
            KeyFile = Utilities.GetEnv("CONSUL_KEY_FILE");
            Scheme = Utilities.GetEnv("CONSUL_SCHEME", "CONSUL_HTTP_SCHEME") ?? "http";
            Token = Utilities.GetEnv("CONSUL_TOKEN", "CONSUL_HTTP_TOKEN");
        }
    }
}