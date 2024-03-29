// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KeysKey {
    private @Nullable String default_;
    /**
     * @return If true, then the key will be deleted when
     * either its configuration block is removed from the configuration or
     * the entire resource is destroyed. Otherwise, it will be left in Consul.
     * Defaults to false.
     * 
     */
    private @Nullable Boolean delete;
    /**
     * @return An [unsigned integer value](https://www.consul.io/api/kv.html#flags-1)
     * to attach to the key (defaults to 0).
     * 
     */
    private @Nullable Integer flags;
    /**
     * @deprecated
     * Using consul.Keys resource to *read* is deprecated; please use consul.Keys data source instead
     * 
     */
    @Deprecated /* Using consul.Keys resource to *read* is deprecated; please use consul.Keys data source instead */
    private @Nullable String name;
    /**
     * @return This is the path in Consul that should be written to.
     * 
     */
    private String path;
    /**
     * @return The value to write to the given path.
     * 
     */
    private @Nullable String value;

    private KeysKey() {}
    public Optional<String> default_() {
        return Optional.ofNullable(this.default_);
    }
    /**
     * @return If true, then the key will be deleted when
     * either its configuration block is removed from the configuration or
     * the entire resource is destroyed. Otherwise, it will be left in Consul.
     * Defaults to false.
     * 
     */
    public Optional<Boolean> delete() {
        return Optional.ofNullable(this.delete);
    }
    /**
     * @return An [unsigned integer value](https://www.consul.io/api/kv.html#flags-1)
     * to attach to the key (defaults to 0).
     * 
     */
    public Optional<Integer> flags() {
        return Optional.ofNullable(this.flags);
    }
    /**
     * @deprecated
     * Using consul.Keys resource to *read* is deprecated; please use consul.Keys data source instead
     * 
     */
    @Deprecated /* Using consul.Keys resource to *read* is deprecated; please use consul.Keys data source instead */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return This is the path in Consul that should be written to.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return The value to write to the given path.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeysKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String default_;
        private @Nullable Boolean delete;
        private @Nullable Integer flags;
        private @Nullable String name;
        private String path;
        private @Nullable String value;
        public Builder() {}
        public Builder(KeysKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.delete = defaults.delete;
    	      this.flags = defaults.flags;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.value = defaults.value;
        }

        @CustomType.Setter("default")
        public Builder default_(@Nullable String default_) {

            this.default_ = default_;
            return this;
        }
        @CustomType.Setter
        public Builder delete(@Nullable Boolean delete) {

            this.delete = delete;
            return this;
        }
        @CustomType.Setter
        public Builder flags(@Nullable Integer flags) {

            this.flags = flags;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("KeysKey", "path");
            }
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public KeysKey build() {
            final var _resultValue = new KeysKey();
            _resultValue.default_ = default_;
            _resultValue.delete = delete;
            _resultValue.flags = flags;
            _resultValue.name = name;
            _resultValue.path = path;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
