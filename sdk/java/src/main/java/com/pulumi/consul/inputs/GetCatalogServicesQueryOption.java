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


public final class GetCatalogServicesQueryOption extends com.pulumi.resources.InvokeArgs {

    public static final GetCatalogServicesQueryOption Empty = new GetCatalogServicesQueryOption();

    @Import(name="allowStale")
    private @Nullable Boolean allowStale;

    public Optional<Boolean> allowStale() {
        return Optional.ofNullable(this.allowStale);
    }

    @Import(name="datacenter")
    private @Nullable String datacenter;

    public Optional<String> datacenter() {
        return Optional.ofNullable(this.datacenter);
    }

    @Import(name="namespace")
    private @Nullable String namespace;

    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
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

    @Import(name="requireConsistent")
    private @Nullable Boolean requireConsistent;

    public Optional<Boolean> requireConsistent() {
        return Optional.ofNullable(this.requireConsistent);
    }

    @Import(name="token")
    private @Nullable String token;

    public Optional<String> token() {
        return Optional.ofNullable(this.token);
    }

    @Import(name="waitIndex")
    private @Nullable Integer waitIndex;

    public Optional<Integer> waitIndex() {
        return Optional.ofNullable(this.waitIndex);
    }

    @Import(name="waitTime")
    private @Nullable String waitTime;

    public Optional<String> waitTime() {
        return Optional.ofNullable(this.waitTime);
    }

    private GetCatalogServicesQueryOption() {}

    private GetCatalogServicesQueryOption(GetCatalogServicesQueryOption $) {
        this.allowStale = $.allowStale;
        this.datacenter = $.datacenter;
        this.namespace = $.namespace;
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
    public static Builder builder(GetCatalogServicesQueryOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCatalogServicesQueryOption $;

        public Builder() {
            $ = new GetCatalogServicesQueryOption();
        }

        public Builder(GetCatalogServicesQueryOption defaults) {
            $ = new GetCatalogServicesQueryOption(Objects.requireNonNull(defaults));
        }

        public Builder allowStale(@Nullable Boolean allowStale) {
            $.allowStale = allowStale;
            return this;
        }

        public Builder datacenter(@Nullable String datacenter) {
            $.datacenter = datacenter;
            return this;
        }

        public Builder namespace(@Nullable String namespace) {
            $.namespace = namespace;
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

        public Builder requireConsistent(@Nullable Boolean requireConsistent) {
            $.requireConsistent = requireConsistent;
            return this;
        }

        public Builder token(@Nullable String token) {
            $.token = token;
            return this;
        }

        public Builder waitIndex(@Nullable Integer waitIndex) {
            $.waitIndex = waitIndex;
            return this;
        }

        public Builder waitTime(@Nullable String waitTime) {
            $.waitTime = waitTime;
            return this;
        }

        public GetCatalogServicesQueryOption build() {
            return $;
        }
    }

}