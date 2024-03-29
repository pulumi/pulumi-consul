// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNodesQueryOption extends com.pulumi.resources.InvokeArgs {

    public static final GetNodesQueryOption Empty = new GetNodesQueryOption();

    /**
     * When `true`, the default, allow responses from
     * Consul servers that are followers.
     * 
     */
    @Import(name="allowStale")
    private @Nullable Boolean allowStale;

    /**
     * @return When `true`, the default, allow responses from
     * Consul servers that are followers.
     * 
     */
    public Optional<Boolean> allowStale() {
        return Optional.ofNullable(this.allowStale);
    }

    /**
     * The Consul datacenter to query.  Defaults to the
     * same value found in `query_options` parameter specified below, or if that is
     * empty, the `datacenter` value found in the Consul agent that this provider is
     * configured to talk to then the datacenter in the provider setup.
     * 
     */
    @Import(name="datacenter")
    private @Nullable String datacenter;

    /**
     * @return The Consul datacenter to query.  Defaults to the
     * same value found in `query_options` parameter specified below, or if that is
     * empty, the `datacenter` value found in the Consul agent that this provider is
     * configured to talk to then the datacenter in the provider setup.
     * 
     */
    public Optional<String> datacenter() {
        return Optional.ofNullable(this.datacenter);
    }

    @Import(name="near")
    private @Nullable String near;

    public Optional<String> near() {
        return Optional.ofNullable(this.near);
    }

    @Import(name="nodeMeta")
    private @Nullable Map<String,String> nodeMeta;

    public Optional<Map<String,String>> nodeMeta() {
        return Optional.ofNullable(this.nodeMeta);
    }

    @Import(name="partition")
    private @Nullable String partition;

    public Optional<String> partition() {
        return Optional.ofNullable(this.partition);
    }

    /**
     * When `true` force the client to perform a
     * read on at least quorum servers and verify the result is the same.  Defaults
     * to `false`.
     * 
     */
    @Import(name="requireConsistent")
    private @Nullable Boolean requireConsistent;

    /**
     * @return When `true` force the client to perform a
     * read on at least quorum servers and verify the result is the same.  Defaults
     * to `false`.
     * 
     */
    public Optional<Boolean> requireConsistent() {
        return Optional.ofNullable(this.requireConsistent);
    }

    /**
     * Specify the Consul ACL token to use when performing the
     * request.  This defaults to the same API token configured by the `consul`
     * provider but may be overridden if necessary.
     * 
     */
    @Import(name="token")
    private @Nullable String token;

    /**
     * @return Specify the Consul ACL token to use when performing the
     * request.  This defaults to the same API token configured by the `consul`
     * provider but may be overridden if necessary.
     * 
     */
    public Optional<String> token() {
        return Optional.ofNullable(this.token);
    }

    /**
     * Index number used to enable blocking queries.
     * 
     */
    @Import(name="waitIndex")
    private @Nullable Integer waitIndex;

    /**
     * @return Index number used to enable blocking queries.
     * 
     */
    public Optional<Integer> waitIndex() {
        return Optional.ofNullable(this.waitIndex);
    }

    /**
     * Max time the client should wait for a blocking query
     * to return.
     * 
     */
    @Import(name="waitTime")
    private @Nullable String waitTime;

    /**
     * @return Max time the client should wait for a blocking query
     * to return.
     * 
     */
    public Optional<String> waitTime() {
        return Optional.ofNullable(this.waitTime);
    }

    private GetNodesQueryOption() {}

    private GetNodesQueryOption(GetNodesQueryOption $) {
        this.allowStale = $.allowStale;
        this.datacenter = $.datacenter;
        this.near = $.near;
        this.nodeMeta = $.nodeMeta;
        this.partition = $.partition;
        this.requireConsistent = $.requireConsistent;
        this.token = $.token;
        this.waitIndex = $.waitIndex;
        this.waitTime = $.waitTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNodesQueryOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNodesQueryOption $;

        public Builder() {
            $ = new GetNodesQueryOption();
        }

        public Builder(GetNodesQueryOption defaults) {
            $ = new GetNodesQueryOption(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowStale When `true`, the default, allow responses from
         * Consul servers that are followers.
         * 
         * @return builder
         * 
         */
        public Builder allowStale(@Nullable Boolean allowStale) {
            $.allowStale = allowStale;
            return this;
        }

        /**
         * @param datacenter The Consul datacenter to query.  Defaults to the
         * same value found in `query_options` parameter specified below, or if that is
         * empty, the `datacenter` value found in the Consul agent that this provider is
         * configured to talk to then the datacenter in the provider setup.
         * 
         * @return builder
         * 
         */
        public Builder datacenter(@Nullable String datacenter) {
            $.datacenter = datacenter;
            return this;
        }

        public Builder near(@Nullable String near) {
            $.near = near;
            return this;
        }

        public Builder nodeMeta(@Nullable Map<String,String> nodeMeta) {
            $.nodeMeta = nodeMeta;
            return this;
        }

        public Builder partition(@Nullable String partition) {
            $.partition = partition;
            return this;
        }

        /**
         * @param requireConsistent When `true` force the client to perform a
         * read on at least quorum servers and verify the result is the same.  Defaults
         * to `false`.
         * 
         * @return builder
         * 
         */
        public Builder requireConsistent(@Nullable Boolean requireConsistent) {
            $.requireConsistent = requireConsistent;
            return this;
        }

        /**
         * @param token Specify the Consul ACL token to use when performing the
         * request.  This defaults to the same API token configured by the `consul`
         * provider but may be overridden if necessary.
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable String token) {
            $.token = token;
            return this;
        }

        /**
         * @param waitIndex Index number used to enable blocking queries.
         * 
         * @return builder
         * 
         */
        public Builder waitIndex(@Nullable Integer waitIndex) {
            $.waitIndex = waitIndex;
            return this;
        }

        /**
         * @param waitTime Max time the client should wait for a blocking query
         * to return.
         * 
         * @return builder
         * 
         */
        public Builder waitTime(@Nullable String waitTime) {
            $.waitTime = waitTime;
            return this;
        }

        public GetNodesQueryOption build() {
            return $;
        }
    }

}
