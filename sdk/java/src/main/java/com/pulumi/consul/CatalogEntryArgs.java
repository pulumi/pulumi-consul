// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul;

import com.pulumi.consul.inputs.CatalogEntryServiceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CatalogEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final CatalogEntryArgs Empty = new CatalogEntryArgs();

    /**
     * The address of the node being added to,
     * or referenced in the catalog.
     * 
     */
    @Import(name="address", required=true)
    private Output<String> address;

    /**
     * @return The address of the node being added to,
     * or referenced in the catalog.
     * 
     */
    public Output<String> address() {
        return this.address;
    }

    /**
     * The datacenter to use. This overrides the
     * agent&#39;s default datacenter and the datacenter in the provider setup.
     * 
     */
    @Import(name="datacenter")
    private @Nullable Output<String> datacenter;

    /**
     * @return The datacenter to use. This overrides the
     * agent&#39;s default datacenter and the datacenter in the provider setup.
     * 
     */
    public Optional<Output<String>> datacenter() {
        return Optional.ofNullable(this.datacenter);
    }

    /**
     * The name of the node being added to, or
     * referenced in the catalog.
     * 
     */
    @Import(name="node", required=true)
    private Output<String> node;

    /**
     * @return The name of the node being added to, or
     * referenced in the catalog.
     * 
     */
    public Output<String> node() {
        return this.node;
    }

    /**
     * A service to optionally associated with
     * the node. Supported values are documented below.
     * 
     */
    @Import(name="services")
    private @Nullable Output<List<CatalogEntryServiceArgs>> services;

    /**
     * @return A service to optionally associated with
     * the node. Supported values are documented below.
     * 
     */
    public Optional<Output<List<CatalogEntryServiceArgs>>> services() {
        return Optional.ofNullable(this.services);
    }

    /**
     * ACL token.
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return ACL token.
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    private CatalogEntryArgs() {}

    private CatalogEntryArgs(CatalogEntryArgs $) {
        this.address = $.address;
        this.datacenter = $.datacenter;
        this.node = $.node;
        this.services = $.services;
        this.token = $.token;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CatalogEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CatalogEntryArgs $;

        public Builder() {
            $ = new CatalogEntryArgs();
        }

        public Builder(CatalogEntryArgs defaults) {
            $ = new CatalogEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The address of the node being added to,
         * or referenced in the catalog.
         * 
         * @return builder
         * 
         */
        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The address of the node being added to,
         * or referenced in the catalog.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param datacenter The datacenter to use. This overrides the
         * agent&#39;s default datacenter and the datacenter in the provider setup.
         * 
         * @return builder
         * 
         */
        public Builder datacenter(@Nullable Output<String> datacenter) {
            $.datacenter = datacenter;
            return this;
        }

        /**
         * @param datacenter The datacenter to use. This overrides the
         * agent&#39;s default datacenter and the datacenter in the provider setup.
         * 
         * @return builder
         * 
         */
        public Builder datacenter(String datacenter) {
            return datacenter(Output.of(datacenter));
        }

        /**
         * @param node The name of the node being added to, or
         * referenced in the catalog.
         * 
         * @return builder
         * 
         */
        public Builder node(Output<String> node) {
            $.node = node;
            return this;
        }

        /**
         * @param node The name of the node being added to, or
         * referenced in the catalog.
         * 
         * @return builder
         * 
         */
        public Builder node(String node) {
            return node(Output.of(node));
        }

        /**
         * @param services A service to optionally associated with
         * the node. Supported values are documented below.
         * 
         * @return builder
         * 
         */
        public Builder services(@Nullable Output<List<CatalogEntryServiceArgs>> services) {
            $.services = services;
            return this;
        }

        /**
         * @param services A service to optionally associated with
         * the node. Supported values are documented below.
         * 
         * @return builder
         * 
         */
        public Builder services(List<CatalogEntryServiceArgs> services) {
            return services(Output.of(services));
        }

        /**
         * @param services A service to optionally associated with
         * the node. Supported values are documented below.
         * 
         * @return builder
         * 
         */
        public Builder services(CatalogEntryServiceArgs... services) {
            return services(List.of(services));
        }

        /**
         * @param token ACL token.
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token ACL token.
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        public CatalogEntryArgs build() {
            $.address = Objects.requireNonNull($.address, "expected parameter 'address' to be non-null");
            $.node = Objects.requireNonNull($.node, "expected parameter 'node' to be non-null");
            return $;
        }
    }

}