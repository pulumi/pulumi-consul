// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;

namespace Pulumi.Consul
{
    public static class Config
    {
        private static readonly Pulumi.Config __config = new Pulumi.Config("consul");
        public static string? Address { get; set; } = __config.Get("address") ?? Utilities.GetEnv("CONSUL_ADDRESS", "CONSUL_HTTP_ADDR") ?? "localhost:8500";

        public static string? CaFile { get; set; } = __config.Get("caFile") ?? Utilities.GetEnv("CONSUL_CA_FILE");

        public static string? CaPath { get; set; } = __config.Get("caPath") ?? Utilities.GetEnv("CONSUL_CAPATH");

        public static string? CertFile { get; set; } = __config.Get("certFile") ?? Utilities.GetEnv("CONSUL_CERT_FILE");

        public static string? Datacenter { get; set; } = __config.Get("datacenter");

        public static string? HttpAuth { get; set; } = __config.Get("httpAuth") ?? Utilities.GetEnv("CONSUL_HTTP_AUTH");

        public static bool? InsecureHttps { get; set; } = __config.GetBoolean("insecureHttps");

        public static string? KeyFile { get; set; } = __config.Get("keyFile") ?? Utilities.GetEnv("CONSUL_KEY_FILE");

        public static string? Namespace { get; set; } = __config.Get("namespace");

        public static string? Scheme { get; set; } = __config.Get("scheme") ?? Utilities.GetEnv("CONSUL_SCHEME", "CONSUL_HTTP_SCHEME") ?? "http";

        public static string? Token { get; set; } = __config.Get("token") ?? Utilities.GetEnv("CONSUL_TOKEN", "CONSUL_HTTP_TOKEN");

    }
}