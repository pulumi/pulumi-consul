// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceHealthPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceHealthPlainArgs Empty = new GetServiceHealthPlainArgs();

    /**
     * The Consul datacenter to query.
     * 
     */
    @Import(name="datacenter")
    private @Nullable String datacenter;

    /**
     * @return The Consul datacenter to query.
     * 
     */
    public Optional<String> datacenter() {
        return Optional.ofNullable(this.datacenter);
    }

    /**
     * A filter expression to refine the list of results, see
     * https://www.consul.io/api-docs/features/filtering and https://www.consul.io/api-docs/health#filtering-2.
     * 
     */
    @Import(name="filter")
    private @Nullable String filter;

    /**
     * @return A filter expression to refine the list of results, see
     * https://www.consul.io/api-docs/features/filtering and https://www.consul.io/api-docs/health#filtering-2.
     * 
     */
    public Optional<String> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * The service name to select.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The service name to select.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Specifies a node name to sort the node list in ascending order
     * based on the estimated round trip time from that node.
     * 
     */
    @Import(name="near")
    private @Nullable String near;

    /**
     * @return Specifies a node name to sort the node list in ascending order
     * based on the estimated round trip time from that node.
     * 
     */
    public Optional<String> near() {
        return Optional.ofNullable(this.near);
    }

    /**
     * Filter the results to nodes with the specified key/value
     * pairs.
     * 
     */
    @Import(name="nodeMeta")
    private @Nullable Map<String,String> nodeMeta;

    /**
     * @return Filter the results to nodes with the specified key/value
     * pairs.
     * 
     */
    public Optional<Map<String,String>> nodeMeta() {
        return Optional.ofNullable(this.nodeMeta);
    }

    /**
     * Whether to return only nodes with all checks in the
     * passing state. Defaults to `true`.
     * 
     */
    @Import(name="passing")
    private @Nullable Boolean passing;

    /**
     * @return Whether to return only nodes with all checks in the
     * passing state. Defaults to `true`.
     * 
     */
    public Optional<Boolean> passing() {
        return Optional.ofNullable(this.passing);
    }

    /**
     * A single tag that can be used to filter the list to return
     * based on a single matching tag.
     * 
     */
    @Import(name="tag")
    private @Nullable String tag;

    /**
     * @return A single tag that can be used to filter the list to return
     * based on a single matching tag.
     * 
     */
    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }

    @Import(name="waitFor")
    private @Nullable String waitFor;

    public Optional<String> waitFor() {
        return Optional.ofNullable(this.waitFor);
    }

    private GetServiceHealthPlainArgs() {}

    private GetServiceHealthPlainArgs(GetServiceHealthPlainArgs $) {
        this.datacenter = $.datacenter;
        this.filter = $.filter;
        this.name = $.name;
        this.near = $.near;
        this.nodeMeta = $.nodeMeta;
        this.passing = $.passing;
        this.tag = $.tag;
        this.waitFor = $.waitFor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceHealthPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceHealthPlainArgs $;

        public Builder() {
            $ = new GetServiceHealthPlainArgs();
        }

        public Builder(GetServiceHealthPlainArgs defaults) {
            $ = new GetServiceHealthPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datacenter The Consul datacenter to query.
         * 
         * @return builder
         * 
         */
        public Builder datacenter(@Nullable String datacenter) {
            $.datacenter = datacenter;
            return this;
        }

        /**
         * @param filter A filter expression to refine the list of results, see
         * https://www.consul.io/api-docs/features/filtering and https://www.consul.io/api-docs/health#filtering-2.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable String filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param name The service name to select.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param near Specifies a node name to sort the node list in ascending order
         * based on the estimated round trip time from that node.
         * 
         * @return builder
         * 
         */
        public Builder near(@Nullable String near) {
            $.near = near;
            return this;
        }

        /**
         * @param nodeMeta Filter the results to nodes with the specified key/value
         * pairs.
         * 
         * @return builder
         * 
         */
        public Builder nodeMeta(@Nullable Map<String,String> nodeMeta) {
            $.nodeMeta = nodeMeta;
            return this;
        }

        /**
         * @param passing Whether to return only nodes with all checks in the
         * passing state. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder passing(@Nullable Boolean passing) {
            $.passing = passing;
            return this;
        }

        /**
         * @param tag A single tag that can be used to filter the list to return
         * based on a single matching tag.
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable String tag) {
            $.tag = tag;
            return this;
        }

        public Builder waitFor(@Nullable String waitFor) {
            $.waitFor = waitFor;
            return this;
        }

        public GetServiceHealthPlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetServiceHealthPlainArgs", "name");
            }
            return $;
        }
    }

}
