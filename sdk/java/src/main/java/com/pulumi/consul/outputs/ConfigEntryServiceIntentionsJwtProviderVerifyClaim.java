// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigEntryServiceIntentionsJwtProviderVerifyClaim {
    /**
     * @return Specifies the path to the claim in the JSON web token.
     * 
     */
    private @Nullable List<String> paths;
    /**
     * @return Specifies the value to match on when verifying the the claim designated in path.
     * 
     */
    private @Nullable String value;

    private ConfigEntryServiceIntentionsJwtProviderVerifyClaim() {}
    /**
     * @return Specifies the path to the claim in the JSON web token.
     * 
     */
    public List<String> paths() {
        return this.paths == null ? List.of() : this.paths;
    }
    /**
     * @return Specifies the value to match on when verifying the the claim designated in path.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigEntryServiceIntentionsJwtProviderVerifyClaim defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> paths;
        private @Nullable String value;
        public Builder() {}
        public Builder(ConfigEntryServiceIntentionsJwtProviderVerifyClaim defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paths = defaults.paths;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder paths(@Nullable List<String> paths) {

            this.paths = paths;
            return this;
        }
        public Builder paths(String... paths) {
            return paths(List.of(paths));
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public ConfigEntryServiceIntentionsJwtProviderVerifyClaim build() {
            final var _resultValue = new ConfigEntryServiceIntentionsJwtProviderVerifyClaim();
            _resultValue.paths = paths;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
