// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ConfigEntryServiceResolverSubsetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigEntryServiceResolverSubsetArgs Empty = new ConfigEntryServiceResolverSubsetArgs();

    /**
     * Specifies an expression that filters the DNS elements of service instances that belong to the subset. If empty, all healthy instances of a service are returned.
     * 
     */
    @Import(name="filter", required=true)
    private Output<String> filter;

    /**
     * @return Specifies an expression that filters the DNS elements of service instances that belong to the subset. If empty, all healthy instances of a service are returned.
     * 
     */
    public Output<String> filter() {
        return this.filter;
    }

    /**
     * Name of subset.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of subset.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Determines if instances that return a warning from a health check are allowed to resolve a request. When set to false, instances with passing and warning states are considered healthy. When set to true, only instances with a passing health check state are considered healthy.
     * 
     */
    @Import(name="onlyPassing", required=true)
    private Output<Boolean> onlyPassing;

    /**
     * @return Determines if instances that return a warning from a health check are allowed to resolve a request. When set to false, instances with passing and warning states are considered healthy. When set to true, only instances with a passing health check state are considered healthy.
     * 
     */
    public Output<Boolean> onlyPassing() {
        return this.onlyPassing;
    }

    private ConfigEntryServiceResolverSubsetArgs() {}

    private ConfigEntryServiceResolverSubsetArgs(ConfigEntryServiceResolverSubsetArgs $) {
        this.filter = $.filter;
        this.name = $.name;
        this.onlyPassing = $.onlyPassing;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigEntryServiceResolverSubsetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigEntryServiceResolverSubsetArgs $;

        public Builder() {
            $ = new ConfigEntryServiceResolverSubsetArgs();
        }

        public Builder(ConfigEntryServiceResolverSubsetArgs defaults) {
            $ = new ConfigEntryServiceResolverSubsetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filter Specifies an expression that filters the DNS elements of service instances that belong to the subset. If empty, all healthy instances of a service are returned.
         * 
         * @return builder
         * 
         */
        public Builder filter(Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter Specifies an expression that filters the DNS elements of service instances that belong to the subset. If empty, all healthy instances of a service are returned.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param name Name of subset.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of subset.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param onlyPassing Determines if instances that return a warning from a health check are allowed to resolve a request. When set to false, instances with passing and warning states are considered healthy. When set to true, only instances with a passing health check state are considered healthy.
         * 
         * @return builder
         * 
         */
        public Builder onlyPassing(Output<Boolean> onlyPassing) {
            $.onlyPassing = onlyPassing;
            return this;
        }

        /**
         * @param onlyPassing Determines if instances that return a warning from a health check are allowed to resolve a request. When set to false, instances with passing and warning states are considered healthy. When set to true, only instances with a passing health check state are considered healthy.
         * 
         * @return builder
         * 
         */
        public Builder onlyPassing(Boolean onlyPassing) {
            return onlyPassing(Output.of(onlyPassing));
        }

        public ConfigEntryServiceResolverSubsetArgs build() {
            $.filter = Objects.requireNonNull($.filter, "expected parameter 'filter' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.onlyPassing = Objects.requireNonNull($.onlyPassing, "expected parameter 'onlyPassing' to be non-null");
            return $;
        }
    }

}