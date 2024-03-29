// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigEntryServiceIntentionsJwtProviderVerifyClaimArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigEntryServiceIntentionsJwtProviderVerifyClaimArgs Empty = new ConfigEntryServiceIntentionsJwtProviderVerifyClaimArgs();

    /**
     * Specifies the path to the claim in the JSON web token.
     * 
     */
    @Import(name="paths")
    private @Nullable Output<List<String>> paths;

    /**
     * @return Specifies the path to the claim in the JSON web token.
     * 
     */
    public Optional<Output<List<String>>> paths() {
        return Optional.ofNullable(this.paths);
    }

    /**
     * Specifies the value to match on when verifying the the claim designated in path.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Specifies the value to match on when verifying the the claim designated in path.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ConfigEntryServiceIntentionsJwtProviderVerifyClaimArgs() {}

    private ConfigEntryServiceIntentionsJwtProviderVerifyClaimArgs(ConfigEntryServiceIntentionsJwtProviderVerifyClaimArgs $) {
        this.paths = $.paths;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigEntryServiceIntentionsJwtProviderVerifyClaimArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigEntryServiceIntentionsJwtProviderVerifyClaimArgs $;

        public Builder() {
            $ = new ConfigEntryServiceIntentionsJwtProviderVerifyClaimArgs();
        }

        public Builder(ConfigEntryServiceIntentionsJwtProviderVerifyClaimArgs defaults) {
            $ = new ConfigEntryServiceIntentionsJwtProviderVerifyClaimArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param paths Specifies the path to the claim in the JSON web token.
         * 
         * @return builder
         * 
         */
        public Builder paths(@Nullable Output<List<String>> paths) {
            $.paths = paths;
            return this;
        }

        /**
         * @param paths Specifies the path to the claim in the JSON web token.
         * 
         * @return builder
         * 
         */
        public Builder paths(List<String> paths) {
            return paths(Output.of(paths));
        }

        /**
         * @param paths Specifies the path to the claim in the JSON web token.
         * 
         * @return builder
         * 
         */
        public Builder paths(String... paths) {
            return paths(List.of(paths));
        }

        /**
         * @param value Specifies the value to match on when verifying the the claim designated in path.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Specifies the value to match on when verifying the the claim designated in path.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ConfigEntryServiceIntentionsJwtProviderVerifyClaimArgs build() {
            return $;
        }
    }

}
