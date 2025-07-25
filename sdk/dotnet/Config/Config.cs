// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Immutable;

namespace Pulumi.Consul
{
    public static class Config
    {
        [global::System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "IDE1006", Justification = 
        "Double underscore prefix used to avoid conflicts with variable names.")]
        private sealed class __Value<T>
        {
            private readonly Func<T> _getter;
            private T _value = default!;
            private bool _set;

            public __Value(Func<T> getter)
            {
                _getter = getter;
            }

            public T Get() => _set ? _value : _getter();

            public void Set(T value)
            {
                _value = value;
                _set = true;
            }
        }

        private static readonly global::Pulumi.Config __config = new global::Pulumi.Config("consul");

        private static readonly __Value<string?> _address = new __Value<string?>(() => __config.Get("address"));
        /// <summary>
        /// The HTTP(S) API address of the agent to use. Defaults to "127.0.0.1:8500".
        /// </summary>
        public static string? Address
        {
            get => _address.Get();
            set => _address.Set(value);
        }

        private static readonly __Value<Pulumi.Consul.Config.Types.AuthJwt?> _authJwt = new __Value<Pulumi.Consul.Config.Types.AuthJwt?>(() => __config.GetObject<Pulumi.Consul.Config.Types.AuthJwt>("authJwt"));
        /// <summary>
        /// Authenticates to Consul using a JWT authentication method.
        /// </summary>
        public static Pulumi.Consul.Config.Types.AuthJwt? AuthJwt
        {
            get => _authJwt.Get();
            set => _authJwt.Set(value);
        }

        private static readonly __Value<string?> _caFile = new __Value<string?>(() => __config.Get("caFile"));
        /// <summary>
        /// A path to a PEM-encoded certificate authority used to verify the remote agent's certificate.
        /// </summary>
        public static string? CaFile
        {
            get => _caFile.Get();
            set => _caFile.Set(value);
        }

        private static readonly __Value<string?> _caPath = new __Value<string?>(() => __config.Get("caPath"));
        /// <summary>
        /// A path to a directory of PEM-encoded certificate authority files to use to check the authenticity of client and server
        /// connections. Can also be specified with the `CONSUL_CAPATH` environment variable.
        /// </summary>
        public static string? CaPath
        {
            get => _caPath.Get();
            set => _caPath.Set(value);
        }

        private static readonly __Value<string?> _caPem = new __Value<string?>(() => __config.Get("caPem"));
        /// <summary>
        /// PEM-encoded certificate authority used to verify the remote agent's certificate.
        /// </summary>
        public static string? CaPem
        {
            get => _caPem.Get();
            set => _caPem.Set(value);
        }

        private static readonly __Value<string?> _certFile = new __Value<string?>(() => __config.Get("certFile"));
        /// <summary>
        /// A path to a PEM-encoded certificate provided to the remote agent; requires use of `key_file` or `key_pem`.
        /// </summary>
        public static string? CertFile
        {
            get => _certFile.Get();
            set => _certFile.Set(value);
        }

        private static readonly __Value<string?> _certPem = new __Value<string?>(() => __config.Get("certPem"));
        /// <summary>
        /// PEM-encoded certificate provided to the remote agent; requires use of `key_file` or `key_pem`.
        /// </summary>
        public static string? CertPem
        {
            get => _certPem.Get();
            set => _certPem.Set(value);
        }

        private static readonly __Value<string?> _datacenter = new __Value<string?>(() => __config.Get("datacenter"));
        /// <summary>
        /// The datacenter to use. Defaults to that of the agent.
        /// </summary>
        public static string? Datacenter
        {
            get => _datacenter.Get();
            set => _datacenter.Set(value);
        }

        private static readonly __Value<ImmutableArray<Pulumi.Consul.Config.Types.Headers>> _headers = new __Value<ImmutableArray<Pulumi.Consul.Config.Types.Headers>>(() => __config.GetObject<ImmutableArray<Pulumi.Consul.Config.Types.Headers>>("headers"));
        /// <summary>
        /// A configuration block, described below, that provides additional headers to be sent along with all requests to the
        /// Consul server. This block can be specified multiple times.
        /// </summary>
        public static ImmutableArray<Pulumi.Consul.Config.Types.Headers> Headers
        {
            get => _headers.Get();
            set => _headers.Set(value);
        }

        private static readonly __Value<string?> _httpAuth = new __Value<string?>(() => __config.Get("httpAuth"));
        /// <summary>
        /// HTTP Basic Authentication credentials to be used when communicating with Consul, in the format of either `user` or
        /// `user:pass`. This may also be specified using the `CONSUL_HTTP_AUTH` environment variable.
        /// </summary>
        public static string? HttpAuth
        {
            get => _httpAuth.Get();
            set => _httpAuth.Set(value);
        }

        private static readonly __Value<bool?> _insecureHttps = new __Value<bool?>(() => __config.GetBoolean("insecureHttps"));
        /// <summary>
        /// Boolean value to disable SSL certificate verification; setting this value to true is not recommended for production use.
        /// Only use this with scheme set to "https".
        /// </summary>
        public static bool? InsecureHttps
        {
            get => _insecureHttps.Get();
            set => _insecureHttps.Set(value);
        }

        private static readonly __Value<string?> _keyFile = new __Value<string?>(() => __config.Get("keyFile"));
        /// <summary>
        /// A path to a PEM-encoded private key, required if `cert_file` or `cert_pem` is specified.
        /// </summary>
        public static string? KeyFile
        {
            get => _keyFile.Get();
            set => _keyFile.Set(value);
        }

        private static readonly __Value<string?> _keyPem = new __Value<string?>(() => __config.Get("keyPem"));
        /// <summary>
        /// PEM-encoded private key, required if `cert_file` or `cert_pem` is specified.
        /// </summary>
        public static string? KeyPem
        {
            get => _keyPem.Get();
            set => _keyPem.Set(value);
        }

        private static readonly __Value<string?> _namespace = new __Value<string?>(() => __config.Get("namespace"));
        public static string? Namespace
        {
            get => _namespace.Get();
            set => _namespace.Set(value);
        }

        private static readonly __Value<string?> _scheme = new __Value<string?>(() => __config.Get("scheme"));
        /// <summary>
        /// The URL scheme of the agent to use ("http" or "https"). Defaults to "http".
        /// </summary>
        public static string? Scheme
        {
            get => _scheme.Get();
            set => _scheme.Set(value);
        }

        private static readonly __Value<string?> _token = new __Value<string?>(() => __config.Get("token"));
        /// <summary>
        /// The ACL token to use by default when making requests to the agent. Can also be specified with `CONSUL_HTTP_TOKEN` or
        /// `CONSUL_TOKEN` as an environment variable.
        /// </summary>
        public static string? Token
        {
            get => _token.Get();
            set => _token.Set(value);
        }

        public static class Types
        {

             public class AuthJwt
             {
            /// <summary>
            /// The name of the auth method to use for login.
            /// </summary>
                public string AuthMethod { get; set; }
            /// <summary>
            /// The bearer token to present to the auth method during login for authentication purposes. For the Kubernetes auth method this is a [Service Account Token (JWT)](https://kubernetes.io/docs/reference/access-authn-authz/authentication/#service-account-tokens).
            /// </summary>
                public string? BearerToken { get; set; } = null!;
            /// <summary>
            /// Specifies arbitrary KV metadata linked to the token. Can be useful to track origins.
            /// </summary>
                public ImmutableDictionary<string, string>? Meta { get; set; } = null!;
                public bool? UseTerraformCloudWorkloadIdentity { get; set; }
            }

             public class Headers
             {
            /// <summary>
            /// The name of the header.
            /// </summary>
                public string Name { get; set; }
            /// <summary>
            /// The value of the header.
            /// </summary>
                public string Value { get; set; }
            }
        }
    }
}
