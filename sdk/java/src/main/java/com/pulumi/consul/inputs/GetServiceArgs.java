// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.inputs;

import com.pulumi.consul.inputs.GetServiceQueryOptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceArgs Empty = new GetServiceArgs();

    /**
     * The Consul datacenter to query.  Defaults to the
     * same value found in `query_options` parameter specified below, or if that is
     * empty, the `datacenter` value found in the Consul agent that this provider is
     * configured to talk to.
     * 
     */
    @Import(name="datacenter")
    private @Nullable Output<String> datacenter;

    /**
     * @return The Consul datacenter to query.  Defaults to the
     * same value found in `query_options` parameter specified below, or if that is
     * empty, the `datacenter` value found in the Consul agent that this provider is
     * configured to talk to.
     * 
     */
    public Optional<Output<String>> datacenter() {
        return Optional.ofNullable(this.datacenter);
    }

    /**
     * A filter expression to refine the query, see https://www.consul.io/api-docs/features/filtering
     * and https://www.consul.io/api-docs/catalog#filtering-1.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return A filter expression to refine the query, see https://www.consul.io/api-docs/features/filtering
     * and https://www.consul.io/api-docs/catalog#filtering-1.
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * The service name to select.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The service name to select.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * See below.
     * 
     */
    @Import(name="queryOptions")
    private @Nullable Output<List<GetServiceQueryOptionArgs>> queryOptions;

    /**
     * @return See below.
     * 
     */
    public Optional<Output<List<GetServiceQueryOptionArgs>>> queryOptions() {
        return Optional.ofNullable(this.queryOptions);
    }

    /**
     * A single tag that can be used to filter the list of nodes
     * to return based on a single matching tag..
     * 
     */
    @Import(name="tag")
    private @Nullable Output<String> tag;

    /**
     * @return A single tag that can be used to filter the list of nodes
     * to return based on a single matching tag..
     * 
     */
    public Optional<Output<String>> tag() {
        return Optional.ofNullable(this.tag);
    }

    private GetServiceArgs() {}

    private GetServiceArgs(GetServiceArgs $) {
        this.datacenter = $.datacenter;
        this.filter = $.filter;
        this.name = $.name;
        this.queryOptions = $.queryOptions;
        this.tag = $.tag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceArgs $;

        public Builder() {
            $ = new GetServiceArgs();
        }

        public Builder(GetServiceArgs defaults) {
            $ = new GetServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datacenter The Consul datacenter to query.  Defaults to the
         * same value found in `query_options` parameter specified below, or if that is
         * empty, the `datacenter` value found in the Consul agent that this provider is
         * configured to talk to.
         * 
         * @return builder
         * 
         */
        public Builder datacenter(@Nullable Output<String> datacenter) {
            $.datacenter = datacenter;
            return this;
        }

        /**
         * @param datacenter The Consul datacenter to query.  Defaults to the
         * same value found in `query_options` parameter specified below, or if that is
         * empty, the `datacenter` value found in the Consul agent that this provider is
         * configured to talk to.
         * 
         * @return builder
         * 
         */
        public Builder datacenter(String datacenter) {
            return datacenter(Output.of(datacenter));
        }

        /**
         * @param filter A filter expression to refine the query, see https://www.consul.io/api-docs/features/filtering
         * and https://www.consul.io/api-docs/catalog#filtering-1.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter A filter expression to refine the query, see https://www.consul.io/api-docs/features/filtering
         * and https://www.consul.io/api-docs/catalog#filtering-1.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param name The service name to select.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The service name to select.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param queryOptions See below.
         * 
         * @return builder
         * 
         */
        public Builder queryOptions(@Nullable Output<List<GetServiceQueryOptionArgs>> queryOptions) {
            $.queryOptions = queryOptions;
            return this;
        }

        /**
         * @param queryOptions See below.
         * 
         * @return builder
         * 
         */
        public Builder queryOptions(List<GetServiceQueryOptionArgs> queryOptions) {
            return queryOptions(Output.of(queryOptions));
        }

        /**
         * @param queryOptions See below.
         * 
         * @return builder
         * 
         */
        public Builder queryOptions(GetServiceQueryOptionArgs... queryOptions) {
            return queryOptions(List.of(queryOptions));
        }

        /**
         * @param tag A single tag that can be used to filter the list of nodes
         * to return based on a single matching tag..
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable Output<String> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag A single tag that can be used to filter the list of nodes
         * to return based on a single matching tag..
         * 
         * @return builder
         * 
         */
        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        public GetServiceArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}