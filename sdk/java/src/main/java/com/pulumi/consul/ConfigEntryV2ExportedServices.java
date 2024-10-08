// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul;

import com.pulumi.consul.ConfigEntryV2ExportedServicesArgs;
import com.pulumi.consul.Utilities;
import com.pulumi.consul.inputs.ConfigEntryV2ExportedServicesState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="consul:index/configEntryV2ExportedServices:ConfigEntryV2ExportedServices")
public class ConfigEntryV2ExportedServices extends com.pulumi.resources.CustomResource {
    /**
     * The kind of exported services config (ExportedServices, NamespaceExportedServices, PartitionExportedServices).
     * 
     */
    @Export(name="kind", refs={String.class}, tree="[0]")
    private Output<String> kind;

    /**
     * @return The kind of exported services config (ExportedServices, NamespaceExportedServices, PartitionExportedServices).
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The name of the config entry to read.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the config entry to read.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The namespace the config entry is associated with.
     * 
     */
    @Export(name="namespace", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> namespace;

    /**
     * @return The namespace the config entry is associated with.
     * 
     */
    public Output<Optional<String>> namespace() {
        return Codegen.optional(this.namespace);
    }
    /**
     * The partition the config entry is associated with.
     * 
     */
    @Export(name="partition", refs={String.class}, tree="[0]")
    private Output<String> partition;

    /**
     * @return The partition the config entry is associated with.
     * 
     */
    public Output<String> partition() {
        return this.partition;
    }
    /**
     * The exported service partition consumers.
     * 
     */
    @Export(name="partitionConsumers", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> partitionConsumers;

    /**
     * @return The exported service partition consumers.
     * 
     */
    public Output<Optional<List<String>>> partitionConsumers() {
        return Codegen.optional(this.partitionConsumers);
    }
    /**
     * The exported service peer consumers.
     * 
     */
    @Export(name="peerConsumers", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> peerConsumers;

    /**
     * @return The exported service peer consumers.
     * 
     */
    public Output<Optional<List<String>>> peerConsumers() {
        return Codegen.optional(this.peerConsumers);
    }
    /**
     * The exported service sameness group consumers.
     * 
     */
    @Export(name="samenessGroupConsumers", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> samenessGroupConsumers;

    /**
     * @return The exported service sameness group consumers.
     * 
     */
    public Output<Optional<List<String>>> samenessGroupConsumers() {
        return Codegen.optional(this.samenessGroupConsumers);
    }
    /**
     * The exported services.
     * 
     */
    @Export(name="services", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> services;

    /**
     * @return The exported services.
     * 
     */
    public Output<Optional<List<String>>> services() {
        return Codegen.optional(this.services);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConfigEntryV2ExportedServices(java.lang.String name) {
        this(name, ConfigEntryV2ExportedServicesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfigEntryV2ExportedServices(java.lang.String name, ConfigEntryV2ExportedServicesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigEntryV2ExportedServices(java.lang.String name, ConfigEntryV2ExportedServicesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("consul:index/configEntryV2ExportedServices:ConfigEntryV2ExportedServices", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ConfigEntryV2ExportedServices(java.lang.String name, Output<java.lang.String> id, @Nullable ConfigEntryV2ExportedServicesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("consul:index/configEntryV2ExportedServices:ConfigEntryV2ExportedServices", name, state, makeResourceOptions(options, id), false);
    }

    private static ConfigEntryV2ExportedServicesArgs makeArgs(ConfigEntryV2ExportedServicesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ConfigEntryV2ExportedServicesArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ConfigEntryV2ExportedServices get(java.lang.String name, Output<java.lang.String> id, @Nullable ConfigEntryV2ExportedServicesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConfigEntryV2ExportedServices(name, id, state, options);
    }
}
