// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.inputs;

import com.pulumi.consul.inputs.KeysKeyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeysState extends com.pulumi.resources.ResourceArgs {

    public static final KeysState Empty = new KeysState();

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
     * Specifies a key in Consul to be written.
     * Supported values documented below.
     * 
     */
    @Import(name="keys")
    private @Nullable Output<List<KeysKeyArgs>> keys;

    /**
     * @return Specifies a key in Consul to be written.
     * Supported values documented below.
     * 
     */
    public Optional<Output<List<KeysKeyArgs>>> keys() {
        return Optional.ofNullable(this.keys);
    }

    /**
     * The namespace to create the keys within.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return The namespace to create the keys within.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * The partition to create the keys within.
     * 
     */
    @Import(name="partition")
    private @Nullable Output<String> partition;

    /**
     * @return The partition to create the keys within.
     * 
     */
    public Optional<Output<String>> partition() {
        return Optional.ofNullable(this.partition);
    }

    /**
     * The ACL token to use. This overrides the
     * token that the agent provides by default.
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return The ACL token to use. This overrides the
     * token that the agent provides by default.
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    @Import(name="var")
    private @Nullable Output<Map<String,String>> var_;

    public Optional<Output<Map<String,String>>> var_() {
        return Optional.ofNullable(this.var_);
    }

    private KeysState() {}

    private KeysState(KeysState $) {
        this.datacenter = $.datacenter;
        this.keys = $.keys;
        this.namespace = $.namespace;
        this.partition = $.partition;
        this.token = $.token;
        this.var_ = $.var_;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeysState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeysState $;

        public Builder() {
            $ = new KeysState();
        }

        public Builder(KeysState defaults) {
            $ = new KeysState(Objects.requireNonNull(defaults));
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
         * @param keys Specifies a key in Consul to be written.
         * Supported values documented below.
         * 
         * @return builder
         * 
         */
        public Builder keys(@Nullable Output<List<KeysKeyArgs>> keys) {
            $.keys = keys;
            return this;
        }

        /**
         * @param keys Specifies a key in Consul to be written.
         * Supported values documented below.
         * 
         * @return builder
         * 
         */
        public Builder keys(List<KeysKeyArgs> keys) {
            return keys(Output.of(keys));
        }

        /**
         * @param keys Specifies a key in Consul to be written.
         * Supported values documented below.
         * 
         * @return builder
         * 
         */
        public Builder keys(KeysKeyArgs... keys) {
            return keys(List.of(keys));
        }

        /**
         * @param namespace The namespace to create the keys within.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The namespace to create the keys within.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param partition The partition to create the keys within.
         * 
         * @return builder
         * 
         */
        public Builder partition(@Nullable Output<String> partition) {
            $.partition = partition;
            return this;
        }

        /**
         * @param partition The partition to create the keys within.
         * 
         * @return builder
         * 
         */
        public Builder partition(String partition) {
            return partition(Output.of(partition));
        }

        /**
         * @param token The ACL token to use. This overrides the
         * token that the agent provides by default.
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token The ACL token to use. This overrides the
         * token that the agent provides by default.
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        public Builder var_(@Nullable Output<Map<String,String>> var_) {
            $.var_ = var_;
            return this;
        }

        public Builder var_(Map<String,String> var_) {
            return var_(Output.of(var_));
        }

        public KeysState build() {
            return $;
        }
    }

}