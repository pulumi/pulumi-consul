// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigEntryServiceDefaultsEnvoyExtension {
    private @Nullable Map<String,String> arguments;
    private @Nullable String consulVersion;
    private @Nullable String envoyVersion;
    private @Nullable String name;
    private @Nullable Boolean required;

    private ConfigEntryServiceDefaultsEnvoyExtension() {}
    public Map<String,String> arguments() {
        return this.arguments == null ? Map.of() : this.arguments;
    }
    public Optional<String> consulVersion() {
        return Optional.ofNullable(this.consulVersion);
    }
    public Optional<String> envoyVersion() {
        return Optional.ofNullable(this.envoyVersion);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<Boolean> required() {
        return Optional.ofNullable(this.required);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigEntryServiceDefaultsEnvoyExtension defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> arguments;
        private @Nullable String consulVersion;
        private @Nullable String envoyVersion;
        private @Nullable String name;
        private @Nullable Boolean required;
        public Builder() {}
        public Builder(ConfigEntryServiceDefaultsEnvoyExtension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.consulVersion = defaults.consulVersion;
    	      this.envoyVersion = defaults.envoyVersion;
    	      this.name = defaults.name;
    	      this.required = defaults.required;
        }

        @CustomType.Setter
        public Builder arguments(@Nullable Map<String,String> arguments) {

            this.arguments = arguments;
            return this;
        }
        @CustomType.Setter
        public Builder consulVersion(@Nullable String consulVersion) {

            this.consulVersion = consulVersion;
            return this;
        }
        @CustomType.Setter
        public Builder envoyVersion(@Nullable String envoyVersion) {

            this.envoyVersion = envoyVersion;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder required(@Nullable Boolean required) {

            this.required = required;
            return this;
        }
        public ConfigEntryServiceDefaultsEnvoyExtension build() {
            final var _resultValue = new ConfigEntryServiceDefaultsEnvoyExtension();
            _resultValue.arguments = arguments;
            _resultValue.consulVersion = consulVersion;
            _resultValue.envoyVersion = envoyVersion;
            _resultValue.name = name;
            _resultValue.required = required;
            return _resultValue;
        }
    }
}
