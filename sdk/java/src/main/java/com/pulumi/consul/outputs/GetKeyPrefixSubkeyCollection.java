// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetKeyPrefixSubkeyCollection {
    /**
     * @return This is the default value to set for `var.&lt;name&gt;`
     * if the key does not exist in Consul. Defaults to an empty string.
     * 
     */
    private @Nullable String default_;
    /**
     * @return This is the name of the key. This value of the
     * key is exposed as `var.&lt;name&gt;`. This is not the path of the subkey
     * in Consul.
     * 
     */
    private String name;
    /**
     * @return This is the subkey path in Consul (which will be appended
     * to the given `path_prefix`) to construct the full key that will be used
     * to read the value.
     * 
     */
    private String path;

    private GetKeyPrefixSubkeyCollection() {}
    /**
     * @return This is the default value to set for `var.&lt;name&gt;`
     * if the key does not exist in Consul. Defaults to an empty string.
     * 
     */
    public Optional<String> default_() {
        return Optional.ofNullable(this.default_);
    }
    /**
     * @return This is the name of the key. This value of the
     * key is exposed as `var.&lt;name&gt;`. This is not the path of the subkey
     * in Consul.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return This is the subkey path in Consul (which will be appended
     * to the given `path_prefix`) to construct the full key that will be used
     * to read the value.
     * 
     */
    public String path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyPrefixSubkeyCollection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String default_;
        private String name;
        private String path;
        public Builder() {}
        public Builder(GetKeyPrefixSubkeyCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
        }

        @CustomType.Setter("default")
        public Builder default_(@Nullable String default_) {
            this.default_ = default_;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public GetKeyPrefixSubkeyCollection build() {
            final var o = new GetKeyPrefixSubkeyCollection();
            o.default_ = default_;
            o.name = name;
            o.path = path;
            return o;
        }
    }
}