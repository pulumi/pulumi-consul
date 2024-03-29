// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.inputs;

import com.pulumi.consul.inputs.GetCatalogNodesQueryOption;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCatalogNodesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCatalogNodesPlainArgs Empty = new GetCatalogNodesPlainArgs();

    /**
     * See below.
     * 
     */
    @Import(name="queryOptions")
    private @Nullable List<GetCatalogNodesQueryOption> queryOptions;

    /**
     * @return See below.
     * 
     */
    public Optional<List<GetCatalogNodesQueryOption>> queryOptions() {
        return Optional.ofNullable(this.queryOptions);
    }

    private GetCatalogNodesPlainArgs() {}

    private GetCatalogNodesPlainArgs(GetCatalogNodesPlainArgs $) {
        this.queryOptions = $.queryOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCatalogNodesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCatalogNodesPlainArgs $;

        public Builder() {
            $ = new GetCatalogNodesPlainArgs();
        }

        public Builder(GetCatalogNodesPlainArgs defaults) {
            $ = new GetCatalogNodesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param queryOptions See below.
         * 
         * @return builder
         * 
         */
        public Builder queryOptions(@Nullable List<GetCatalogNodesQueryOption> queryOptions) {
            $.queryOptions = queryOptions;
            return this;
        }

        /**
         * @param queryOptions See below.
         * 
         * @return builder
         * 
         */
        public Builder queryOptions(GetCatalogNodesQueryOption... queryOptions) {
            return queryOptions(List.of(queryOptions));
        }

        public GetCatalogNodesPlainArgs build() {
            return $;
        }
    }

}
