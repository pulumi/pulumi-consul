// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.consul.outputs.ConfigEntryServiceIntentionsSourcePermissionHttpHeader;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigEntryServiceIntentionsSourcePermissionHttp {
    /**
     * @return Specifies a header name and matching criteria for HTTP request headers.
     * 
     */
    private @Nullable List<ConfigEntryServiceIntentionsSourcePermissionHttpHeader> headers;
    /**
     * @return Specifies a list of HTTP methods.
     * 
     */
    private @Nullable List<String> methods;
    /**
     * @return Specifies an exact path to match on the HTTP request path.
     * 
     */
    private @Nullable String pathExact;
    /**
     * @return Specifies a path prefix to match on the HTTP request path.
     * 
     */
    private @Nullable String pathPrefix;
    /**
     * @return Defines a regular expression to match on the HTTP request path.
     * 
     */
    private @Nullable String pathRegex;

    private ConfigEntryServiceIntentionsSourcePermissionHttp() {}
    /**
     * @return Specifies a header name and matching criteria for HTTP request headers.
     * 
     */
    public List<ConfigEntryServiceIntentionsSourcePermissionHttpHeader> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * @return Specifies a list of HTTP methods.
     * 
     */
    public List<String> methods() {
        return this.methods == null ? List.of() : this.methods;
    }
    /**
     * @return Specifies an exact path to match on the HTTP request path.
     * 
     */
    public Optional<String> pathExact() {
        return Optional.ofNullable(this.pathExact);
    }
    /**
     * @return Specifies a path prefix to match on the HTTP request path.
     * 
     */
    public Optional<String> pathPrefix() {
        return Optional.ofNullable(this.pathPrefix);
    }
    /**
     * @return Defines a regular expression to match on the HTTP request path.
     * 
     */
    public Optional<String> pathRegex() {
        return Optional.ofNullable(this.pathRegex);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigEntryServiceIntentionsSourcePermissionHttp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ConfigEntryServiceIntentionsSourcePermissionHttpHeader> headers;
        private @Nullable List<String> methods;
        private @Nullable String pathExact;
        private @Nullable String pathPrefix;
        private @Nullable String pathRegex;
        public Builder() {}
        public Builder(ConfigEntryServiceIntentionsSourcePermissionHttp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headers = defaults.headers;
    	      this.methods = defaults.methods;
    	      this.pathExact = defaults.pathExact;
    	      this.pathPrefix = defaults.pathPrefix;
    	      this.pathRegex = defaults.pathRegex;
        }

        @CustomType.Setter
        public Builder headers(@Nullable List<ConfigEntryServiceIntentionsSourcePermissionHttpHeader> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(ConfigEntryServiceIntentionsSourcePermissionHttpHeader... headers) {
            return headers(List.of(headers));
        }
        @CustomType.Setter
        public Builder methods(@Nullable List<String> methods) {
            this.methods = methods;
            return this;
        }
        public Builder methods(String... methods) {
            return methods(List.of(methods));
        }
        @CustomType.Setter
        public Builder pathExact(@Nullable String pathExact) {
            this.pathExact = pathExact;
            return this;
        }
        @CustomType.Setter
        public Builder pathPrefix(@Nullable String pathPrefix) {
            this.pathPrefix = pathPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder pathRegex(@Nullable String pathRegex) {
            this.pathRegex = pathRegex;
            return this;
        }
        public ConfigEntryServiceIntentionsSourcePermissionHttp build() {
            final var _resultValue = new ConfigEntryServiceIntentionsSourcePermissionHttp();
            _resultValue.headers = headers;
            _resultValue.methods = methods;
            _resultValue.pathExact = pathExact;
            _resultValue.pathPrefix = pathPrefix;
            _resultValue.pathRegex = pathRegex;
            return _resultValue;
        }
    }
}