// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CatalogEntryServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final CatalogEntryServiceArgs Empty = new CatalogEntryServiceArgs();

    /**
     * The address of the service. Defaults to the
     * node address.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return The address of the service. Defaults to the
     * node address.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The ID of the service. Defaults to the `name`.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the service. Defaults to the `name`.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the service
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the service
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The port of the service.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port of the service.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * A list of values that are opaque to Consul,
     * but can be used to distinguish between services or nodes.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of values that are opaque to Consul,
     * but can be used to distinguish between services or nodes.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private CatalogEntryServiceArgs() {}

    private CatalogEntryServiceArgs(CatalogEntryServiceArgs $) {
        this.address = $.address;
        this.id = $.id;
        this.name = $.name;
        this.port = $.port;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CatalogEntryServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CatalogEntryServiceArgs $;

        public Builder() {
            $ = new CatalogEntryServiceArgs();
        }

        public Builder(CatalogEntryServiceArgs defaults) {
            $ = new CatalogEntryServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The address of the service. Defaults to the
         * node address.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The address of the service. Defaults to the
         * node address.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param id The ID of the service. Defaults to the `name`.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the service. Defaults to the `name`.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the service
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the service
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param port The port of the service.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port of the service.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param tags A list of values that are opaque to Consul,
         * but can be used to distinguish between services or nodes.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of values that are opaque to Consul,
         * but can be used to distinguish between services or nodes.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of values that are opaque to Consul,
         * but can be used to distinguish between services or nodes.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public CatalogEntryServiceArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("CatalogEntryServiceArgs", "name");
            }
            return $;
        }
    }

}
