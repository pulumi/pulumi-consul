// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.inputs;

import com.pulumi.consul.inputs.CatalogEntryServiceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CatalogEntryState extends com.pulumi.resources.ResourceArgs {

    public static final CatalogEntryState Empty = new CatalogEntryState();

    /**
     * The address of the node being added to,
     * or referenced in the catalog.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return The address of the node being added to,
     * or referenced in the catalog.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
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
    @Import(name="node")
    private @Nullable Output<String> node;

    /**
     * @return The name of the node being added to, or
     * referenced in the catalog.
     * 
     */
    public Optional<Output<String>> node() {
        return Optional.ofNullable(this.node);
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
     * @deprecated
     * The token argument has been deprecated and will be removed in a future release.
     * Please use the token argument in the provider configuration
     * 
     */
    @Deprecated /* The token argument has been deprecated and will be removed in a future release.
Please use the token argument in the provider configuration */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return ACL token.
     * 
     * @deprecated
     * The token argument has been deprecated and will be removed in a future release.
     * Please use the token argument in the provider configuration
     * 
     */
    @Deprecated /* The token argument has been deprecated and will be removed in a future release.
Please use the token argument in the provider configuration */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    private CatalogEntryState() {}

    private CatalogEntryState(CatalogEntryState $) {
        this.address = $.address;
        this.datacenter = $.datacenter;
        this.node = $.node;
        this.services = $.services;
        this.token = $.token;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CatalogEntryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CatalogEntryState $;

        public Builder() {
            $ = new CatalogEntryState();
        }

        public Builder(CatalogEntryState defaults) {
            $ = new CatalogEntryState(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The address of the node being added to,
         * or referenced in the catalog.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
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
        public Builder node(@Nullable Output<String> node) {
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
         * @deprecated
         * The token argument has been deprecated and will be removed in a future release.
         * Please use the token argument in the provider configuration
         * 
         */
        @Deprecated /* The token argument has been deprecated and will be removed in a future release.
Please use the token argument in the provider configuration */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token ACL token.
         * 
         * @return builder
         * 
         * @deprecated
         * The token argument has been deprecated and will be removed in a future release.
         * Please use the token argument in the provider configuration
         * 
         */
        @Deprecated /* The token argument has been deprecated and will be removed in a future release.
Please use the token argument in the provider configuration */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        public CatalogEntryState build() {
            return $;
        }
    }

}
