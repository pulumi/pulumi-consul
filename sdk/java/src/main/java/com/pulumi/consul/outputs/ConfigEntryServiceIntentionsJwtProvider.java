// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.consul.outputs.ConfigEntryServiceIntentionsJwtProviderVerifyClaim;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigEntryServiceIntentionsJwtProvider {
    /**
     * @return Specifies the name of a JWT provider defined in the Name field of the jwt-provider configuration entry.
     * 
     */
    private @Nullable String name;
    /**
     * @return Specifies additional token information to verify beyond what is configured in the JWT provider configuration entry.
     * 
     */
    private @Nullable List<ConfigEntryServiceIntentionsJwtProviderVerifyClaim> verifyClaims;

    private ConfigEntryServiceIntentionsJwtProvider() {}
    /**
     * @return Specifies the name of a JWT provider defined in the Name field of the jwt-provider configuration entry.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Specifies additional token information to verify beyond what is configured in the JWT provider configuration entry.
     * 
     */
    public List<ConfigEntryServiceIntentionsJwtProviderVerifyClaim> verifyClaims() {
        return this.verifyClaims == null ? List.of() : this.verifyClaims;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigEntryServiceIntentionsJwtProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable List<ConfigEntryServiceIntentionsJwtProviderVerifyClaim> verifyClaims;
        public Builder() {}
        public Builder(ConfigEntryServiceIntentionsJwtProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.verifyClaims = defaults.verifyClaims;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder verifyClaims(@Nullable List<ConfigEntryServiceIntentionsJwtProviderVerifyClaim> verifyClaims) {
            this.verifyClaims = verifyClaims;
            return this;
        }
        public Builder verifyClaims(ConfigEntryServiceIntentionsJwtProviderVerifyClaim... verifyClaims) {
            return verifyClaims(List.of(verifyClaims));
        }
        public ConfigEntryServiceIntentionsJwtProvider build() {
            final var _resultValue = new ConfigEntryServiceIntentionsJwtProvider();
            _resultValue.name = name;
            _resultValue.verifyClaims = verifyClaims;
            return _resultValue;
        }
    }
}