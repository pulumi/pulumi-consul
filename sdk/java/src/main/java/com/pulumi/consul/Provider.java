// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul;

import com.pulumi.consul.ProviderArgs;
import com.pulumi.consul.Utilities;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The provider type for the consul package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 * 
 */
@ResourceType(type="pulumi:providers:consul")
public class Provider extends com.pulumi.resources.ProviderResource {
    @Export(name="address", type=String.class, parameters={})
    private Output</* @Nullable */ String> address;

    public Output<Optional<String>> address() {
        return Codegen.optional(this.address);
    }
    @Export(name="caFile", type=String.class, parameters={})
    private Output</* @Nullable */ String> caFile;

    public Output<Optional<String>> caFile() {
        return Codegen.optional(this.caFile);
    }
    @Export(name="caPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> caPath;

    public Output<Optional<String>> caPath() {
        return Codegen.optional(this.caPath);
    }
    @Export(name="caPem", type=String.class, parameters={})
    private Output</* @Nullable */ String> caPem;

    public Output<Optional<String>> caPem() {
        return Codegen.optional(this.caPem);
    }
    @Export(name="certFile", type=String.class, parameters={})
    private Output</* @Nullable */ String> certFile;

    public Output<Optional<String>> certFile() {
        return Codegen.optional(this.certFile);
    }
    @Export(name="certPem", type=String.class, parameters={})
    private Output</* @Nullable */ String> certPem;

    public Output<Optional<String>> certPem() {
        return Codegen.optional(this.certPem);
    }
    @Export(name="datacenter", type=String.class, parameters={})
    private Output</* @Nullable */ String> datacenter;

    public Output<Optional<String>> datacenter() {
        return Codegen.optional(this.datacenter);
    }
    @Export(name="httpAuth", type=String.class, parameters={})
    private Output</* @Nullable */ String> httpAuth;

    public Output<Optional<String>> httpAuth() {
        return Codegen.optional(this.httpAuth);
    }
    @Export(name="keyFile", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyFile;

    public Output<Optional<String>> keyFile() {
        return Codegen.optional(this.keyFile);
    }
    @Export(name="keyPem", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyPem;

    public Output<Optional<String>> keyPem() {
        return Codegen.optional(this.keyPem);
    }
    @Export(name="namespace", type=String.class, parameters={})
    private Output</* @Nullable */ String> namespace;

    public Output<Optional<String>> namespace() {
        return Codegen.optional(this.namespace);
    }
    @Export(name="scheme", type=String.class, parameters={})
    private Output</* @Nullable */ String> scheme;

    public Output<Optional<String>> scheme() {
        return Codegen.optional(this.scheme);
    }
    @Export(name="token", type=String.class, parameters={})
    private Output</* @Nullable */ String> token;

    public Output<Optional<String>> token() {
        return Codegen.optional(this.token);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(String name, @Nullable ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(String name, @Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("consul", name, args == null ? ProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}