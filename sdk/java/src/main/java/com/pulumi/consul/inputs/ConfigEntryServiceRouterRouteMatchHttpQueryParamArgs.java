// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigEntryServiceRouterRouteMatchHttpQueryParamArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigEntryServiceRouterRouteMatchHttpQueryParamArgs Empty = new ConfigEntryServiceRouterRouteMatchHttpQueryParamArgs();

    /**
     * Specifies that a request matches when the query parameter with the given name is this exact value.
     * 
     */
    @Import(name="exact")
    private @Nullable Output<String> exact;

    /**
     * @return Specifies that a request matches when the query parameter with the given name is this exact value.
     * 
     */
    public Optional<Output<String>> exact() {
        return Optional.ofNullable(this.exact);
    }

    /**
     * Specifies the name of the HTTP query parameter to match.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the HTTP query parameter to match.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies that a request matches when the value in the `name` argument is present anywhere in the HTTP query parameter.
     * 
     */
    @Import(name="present")
    private @Nullable Output<Boolean> present;

    /**
     * @return Specifies that a request matches when the value in the `name` argument is present anywhere in the HTTP query parameter.
     * 
     */
    public Optional<Output<Boolean>> present() {
        return Optional.ofNullable(this.present);
    }

    /**
     * Specifies that a request matches when the query parameter with the given name matches this regular expression.
     * 
     */
    @Import(name="regex")
    private @Nullable Output<String> regex;

    /**
     * @return Specifies that a request matches when the query parameter with the given name matches this regular expression.
     * 
     */
    public Optional<Output<String>> regex() {
        return Optional.ofNullable(this.regex);
    }

    private ConfigEntryServiceRouterRouteMatchHttpQueryParamArgs() {}

    private ConfigEntryServiceRouterRouteMatchHttpQueryParamArgs(ConfigEntryServiceRouterRouteMatchHttpQueryParamArgs $) {
        this.exact = $.exact;
        this.name = $.name;
        this.present = $.present;
        this.regex = $.regex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigEntryServiceRouterRouteMatchHttpQueryParamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigEntryServiceRouterRouteMatchHttpQueryParamArgs $;

        public Builder() {
            $ = new ConfigEntryServiceRouterRouteMatchHttpQueryParamArgs();
        }

        public Builder(ConfigEntryServiceRouterRouteMatchHttpQueryParamArgs defaults) {
            $ = new ConfigEntryServiceRouterRouteMatchHttpQueryParamArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exact Specifies that a request matches when the query parameter with the given name is this exact value.
         * 
         * @return builder
         * 
         */
        public Builder exact(@Nullable Output<String> exact) {
            $.exact = exact;
            return this;
        }

        /**
         * @param exact Specifies that a request matches when the query parameter with the given name is this exact value.
         * 
         * @return builder
         * 
         */
        public Builder exact(String exact) {
            return exact(Output.of(exact));
        }

        /**
         * @param name Specifies the name of the HTTP query parameter to match.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the HTTP query parameter to match.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param present Specifies that a request matches when the value in the `name` argument is present anywhere in the HTTP query parameter.
         * 
         * @return builder
         * 
         */
        public Builder present(@Nullable Output<Boolean> present) {
            $.present = present;
            return this;
        }

        /**
         * @param present Specifies that a request matches when the value in the `name` argument is present anywhere in the HTTP query parameter.
         * 
         * @return builder
         * 
         */
        public Builder present(Boolean present) {
            return present(Output.of(present));
        }

        /**
         * @param regex Specifies that a request matches when the query parameter with the given name matches this regular expression.
         * 
         * @return builder
         * 
         */
        public Builder regex(@Nullable Output<String> regex) {
            $.regex = regex;
            return this;
        }

        /**
         * @param regex Specifies that a request matches when the query parameter with the given name matches this regular expression.
         * 
         * @return builder
         * 
         */
        public Builder regex(String regex) {
            return regex(Output.of(regex));
        }

        public ConfigEntryServiceRouterRouteMatchHttpQueryParamArgs build() {
            return $;
        }
    }

}
