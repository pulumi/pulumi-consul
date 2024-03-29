// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeysKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeysKeyArgs Empty = new KeysKeyArgs();

    @Import(name="default")
    private @Nullable Output<String> default_;

    public Optional<Output<String>> default_() {
        return Optional.ofNullable(this.default_);
    }

    /**
     * If true, then the key will be deleted when
     * either its configuration block is removed from the configuration or
     * the entire resource is destroyed. Otherwise, it will be left in Consul.
     * Defaults to false.
     * 
     */
    @Import(name="delete")
    private @Nullable Output<Boolean> delete;

    /**
     * @return If true, then the key will be deleted when
     * either its configuration block is removed from the configuration or
     * the entire resource is destroyed. Otherwise, it will be left in Consul.
     * Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> delete() {
        return Optional.ofNullable(this.delete);
    }

    /**
     * An [unsigned integer value](https://www.consul.io/api/kv.html#flags-1)
     * to attach to the key (defaults to 0).
     * 
     */
    @Import(name="flags")
    private @Nullable Output<Integer> flags;

    /**
     * @return An [unsigned integer value](https://www.consul.io/api/kv.html#flags-1)
     * to attach to the key (defaults to 0).
     * 
     */
    public Optional<Output<Integer>> flags() {
        return Optional.ofNullable(this.flags);
    }

    /**
     * @deprecated
     * Using consul.Keys resource to *read* is deprecated; please use consul.Keys data source instead
     * 
     */
    @Deprecated /* Using consul.Keys resource to *read* is deprecated; please use consul.Keys data source instead */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @deprecated
     * Using consul.Keys resource to *read* is deprecated; please use consul.Keys data source instead
     * 
     */
    @Deprecated /* Using consul.Keys resource to *read* is deprecated; please use consul.Keys data source instead */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * This is the path in Consul that should be written to.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return This is the path in Consul that should be written to.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     * The value to write to the given path.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value to write to the given path.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private KeysKeyArgs() {}

    private KeysKeyArgs(KeysKeyArgs $) {
        this.default_ = $.default_;
        this.delete = $.delete;
        this.flags = $.flags;
        this.name = $.name;
        this.path = $.path;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeysKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeysKeyArgs $;

        public Builder() {
            $ = new KeysKeyArgs();
        }

        public Builder(KeysKeyArgs defaults) {
            $ = new KeysKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder default_(@Nullable Output<String> default_) {
            $.default_ = default_;
            return this;
        }

        public Builder default_(String default_) {
            return default_(Output.of(default_));
        }

        /**
         * @param delete If true, then the key will be deleted when
         * either its configuration block is removed from the configuration or
         * the entire resource is destroyed. Otherwise, it will be left in Consul.
         * Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder delete(@Nullable Output<Boolean> delete) {
            $.delete = delete;
            return this;
        }

        /**
         * @param delete If true, then the key will be deleted when
         * either its configuration block is removed from the configuration or
         * the entire resource is destroyed. Otherwise, it will be left in Consul.
         * Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder delete(Boolean delete) {
            return delete(Output.of(delete));
        }

        /**
         * @param flags An [unsigned integer value](https://www.consul.io/api/kv.html#flags-1)
         * to attach to the key (defaults to 0).
         * 
         * @return builder
         * 
         */
        public Builder flags(@Nullable Output<Integer> flags) {
            $.flags = flags;
            return this;
        }

        /**
         * @param flags An [unsigned integer value](https://www.consul.io/api/kv.html#flags-1)
         * to attach to the key (defaults to 0).
         * 
         * @return builder
         * 
         */
        public Builder flags(Integer flags) {
            return flags(Output.of(flags));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Using consul.Keys resource to *read* is deprecated; please use consul.Keys data source instead
         * 
         */
        @Deprecated /* Using consul.Keys resource to *read* is deprecated; please use consul.Keys data source instead */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Using consul.Keys resource to *read* is deprecated; please use consul.Keys data source instead
         * 
         */
        @Deprecated /* Using consul.Keys resource to *read* is deprecated; please use consul.Keys data source instead */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path This is the path in Consul that should be written to.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path This is the path in Consul that should be written to.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param value The value to write to the given path.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value to write to the given path.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public KeysKeyArgs build() {
            if ($.path == null) {
                throw new MissingRequiredPropertyException("KeysKeyArgs", "path");
            }
            return $;
        }
    }

}
