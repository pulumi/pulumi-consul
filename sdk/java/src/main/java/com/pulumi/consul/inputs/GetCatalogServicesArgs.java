// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.inputs;

import com.pulumi.consul.inputs.GetCatalogServicesQueryOptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCatalogServicesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCatalogServicesArgs Empty = new GetCatalogServicesArgs();

    @Import(name="queryOptions")
    private @Nullable Output<List<GetCatalogServicesQueryOptionArgs>> queryOptions;

    public Optional<Output<List<GetCatalogServicesQueryOptionArgs>>> queryOptions() {
        return Optional.ofNullable(this.queryOptions);
    }

    private GetCatalogServicesArgs() {}

    private GetCatalogServicesArgs(GetCatalogServicesArgs $) {
        this.queryOptions = $.queryOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCatalogServicesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCatalogServicesArgs $;

        public Builder() {
            $ = new GetCatalogServicesArgs();
        }

        public Builder(GetCatalogServicesArgs defaults) {
            $ = new GetCatalogServicesArgs(Objects.requireNonNull(defaults));
        }

        public Builder queryOptions(@Nullable Output<List<GetCatalogServicesQueryOptionArgs>> queryOptions) {
            $.queryOptions = queryOptions;
            return this;
        }

        public Builder queryOptions(List<GetCatalogServicesQueryOptionArgs> queryOptions) {
            return queryOptions(Output.of(queryOptions));
        }

        public Builder queryOptions(GetCatalogServicesQueryOptionArgs... queryOptions) {
            return queryOptions(List.of(queryOptions));
        }

        public GetCatalogServicesArgs build() {
            return $;
        }
    }

}