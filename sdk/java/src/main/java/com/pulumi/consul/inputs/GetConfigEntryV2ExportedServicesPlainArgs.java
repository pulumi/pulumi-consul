// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConfigEntryV2ExportedServicesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConfigEntryV2ExportedServicesPlainArgs Empty = new GetConfigEntryV2ExportedServicesPlainArgs();

    /**
     * The kind of exported services config (ExportedServices, NamespaceExportedServices, PartitionExportedServices).
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    /**
     * @return The kind of exported services config (ExportedServices, NamespaceExportedServices, PartitionExportedServices).
     * 
     */
    public String kind() {
        return this.kind;
    }

    /**
     * The name of the config entry to read.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the config entry to read.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The namespace the config entry is associated with.
     * 
     */
    @Import(name="namespace")
    private @Nullable String namespace;

    /**
     * @return The namespace the config entry is associated with.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * The partition the config entry is associated with.
     * 
     */
    @Import(name="partition")
    private @Nullable String partition;

    /**
     * @return The partition the config entry is associated with.
     * 
     */
    public Optional<String> partition() {
        return Optional.ofNullable(this.partition);
    }

    /**
     * The exported service partition consumers.
     * 
     */
    @Import(name="partitionConsumers")
    private @Nullable List<String> partitionConsumers;

    /**
     * @return The exported service partition consumers.
     * 
     */
    public Optional<List<String>> partitionConsumers() {
        return Optional.ofNullable(this.partitionConsumers);
    }

    /**
     * The exported service peer consumers.
     * 
     */
    @Import(name="peerConsumers")
    private @Nullable List<String> peerConsumers;

    /**
     * @return The exported service peer consumers.
     * 
     */
    public Optional<List<String>> peerConsumers() {
        return Optional.ofNullable(this.peerConsumers);
    }

    /**
     * The exported service sameness group consumers.
     * 
     */
    @Import(name="samenessGroupConsumers")
    private @Nullable List<String> samenessGroupConsumers;

    /**
     * @return The exported service sameness group consumers.
     * 
     */
    public Optional<List<String>> samenessGroupConsumers() {
        return Optional.ofNullable(this.samenessGroupConsumers);
    }

    /**
     * The exported services.
     * 
     */
    @Import(name="services")
    private @Nullable List<String> services;

    /**
     * @return The exported services.
     * 
     */
    public Optional<List<String>> services() {
        return Optional.ofNullable(this.services);
    }

    private GetConfigEntryV2ExportedServicesPlainArgs() {}

    private GetConfigEntryV2ExportedServicesPlainArgs(GetConfigEntryV2ExportedServicesPlainArgs $) {
        this.kind = $.kind;
        this.name = $.name;
        this.namespace = $.namespace;
        this.partition = $.partition;
        this.partitionConsumers = $.partitionConsumers;
        this.peerConsumers = $.peerConsumers;
        this.samenessGroupConsumers = $.samenessGroupConsumers;
        this.services = $.services;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConfigEntryV2ExportedServicesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConfigEntryV2ExportedServicesPlainArgs $;

        public Builder() {
            $ = new GetConfigEntryV2ExportedServicesPlainArgs();
        }

        public Builder(GetConfigEntryV2ExportedServicesPlainArgs defaults) {
            $ = new GetConfigEntryV2ExportedServicesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kind The kind of exported services config (ExportedServices, NamespaceExportedServices, PartitionExportedServices).
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param name The name of the config entry to read.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param namespace The namespace the config entry is associated with.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable String namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param partition The partition the config entry is associated with.
         * 
         * @return builder
         * 
         */
        public Builder partition(@Nullable String partition) {
            $.partition = partition;
            return this;
        }

        /**
         * @param partitionConsumers The exported service partition consumers.
         * 
         * @return builder
         * 
         */
        public Builder partitionConsumers(@Nullable List<String> partitionConsumers) {
            $.partitionConsumers = partitionConsumers;
            return this;
        }

        /**
         * @param partitionConsumers The exported service partition consumers.
         * 
         * @return builder
         * 
         */
        public Builder partitionConsumers(String... partitionConsumers) {
            return partitionConsumers(List.of(partitionConsumers));
        }

        /**
         * @param peerConsumers The exported service peer consumers.
         * 
         * @return builder
         * 
         */
        public Builder peerConsumers(@Nullable List<String> peerConsumers) {
            $.peerConsumers = peerConsumers;
            return this;
        }

        /**
         * @param peerConsumers The exported service peer consumers.
         * 
         * @return builder
         * 
         */
        public Builder peerConsumers(String... peerConsumers) {
            return peerConsumers(List.of(peerConsumers));
        }

        /**
         * @param samenessGroupConsumers The exported service sameness group consumers.
         * 
         * @return builder
         * 
         */
        public Builder samenessGroupConsumers(@Nullable List<String> samenessGroupConsumers) {
            $.samenessGroupConsumers = samenessGroupConsumers;
            return this;
        }

        /**
         * @param samenessGroupConsumers The exported service sameness group consumers.
         * 
         * @return builder
         * 
         */
        public Builder samenessGroupConsumers(String... samenessGroupConsumers) {
            return samenessGroupConsumers(List.of(samenessGroupConsumers));
        }

        /**
         * @param services The exported services.
         * 
         * @return builder
         * 
         */
        public Builder services(@Nullable List<String> services) {
            $.services = services;
            return this;
        }

        /**
         * @param services The exported services.
         * 
         * @return builder
         * 
         */
        public Builder services(String... services) {
            return services(List.of(services));
        }

        public GetConfigEntryV2ExportedServicesPlainArgs build() {
            if ($.kind == null) {
                throw new MissingRequiredPropertyException("GetConfigEntryV2ExportedServicesPlainArgs", "kind");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetConfigEntryV2ExportedServicesPlainArgs", "name");
            }
            return $;
        }
    }

}
