// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CatalogEntryService {
    /**
     * @return The address of the service. Defaults to the
     * node address.
     * 
     */
    private @Nullable String address;
    /**
     * @return The ID of the service. Defaults to the `name`.
     * 
     */
    private @Nullable String id;
    /**
     * @return The name of the service
     * 
     */
    private String name;
    /**
     * @return The port of the service.
     * 
     */
    private @Nullable Integer port;
    /**
     * @return A list of values that are opaque to Consul,
     * but can be used to distinguish between services or nodes.
     * 
     */
    private @Nullable List<String> tags;

    private CatalogEntryService() {}
    /**
     * @return The address of the service. Defaults to the
     * node address.
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * @return The ID of the service. Defaults to the `name`.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The name of the service
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The port of the service.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return A list of values that are opaque to Consul,
     * but can be used to distinguish between services or nodes.
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogEntryService defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String address;
        private @Nullable String id;
        private String name;
        private @Nullable Integer port;
        private @Nullable List<String> tags;
        public Builder() {}
        public Builder(CatalogEntryService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public CatalogEntryService build() {
            final var o = new CatalogEntryService();
            o.address = address;
            o.id = id;
            o.name = name;
            o.port = port;
            o.tags = tags;
            return o;
        }
    }
}