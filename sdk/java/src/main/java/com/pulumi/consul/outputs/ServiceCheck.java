// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.consul.outputs.ServiceCheckHeader;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceCheck {
    /**
     * @return An ID, *unique per agent*. Will default to *name*
     * if not set.
     * 
     */
    private String checkId;
    /**
     * @return The time after which
     * the service is automatically deregistered when in the `critical` state.
     * Defaults to `30s`.
     * 
     */
    private @Nullable String deregisterCriticalServiceAfter;
    /**
     * @return The headers to send for an HTTP check.
     * The attributes of each header is given below.
     * 
     */
    private @Nullable List<ServiceCheckHeader> headers;
    /**
     * @return The HTTP endpoint to call for an HTTP check.
     * 
     */
    private @Nullable String http;
    /**
     * @return The interval to wait between each health-check
     * invocation.
     * 
     */
    private String interval;
    /**
     * @return The method to use for HTTP health-checks. Defaults
     * to `GET`.
     * 
     */
    private @Nullable String method;
    /**
     * @return The name of the health-check.
     * 
     */
    private String name;
    /**
     * @return An opaque field meant to hold human readable text.
     * 
     */
    private @Nullable String notes;
    /**
     * @return The initial health-check status.
     * 
     */
    private @Nullable String status;
    /**
     * @return The TCP address and port to connect to for a TCP check.
     * 
     */
    private @Nullable String tcp;
    /**
     * @return The timeout value for HTTP checks.
     * 
     */
    private String timeout;
    /**
     * @return Whether to deactivate certificate
     * verification for HTTP health-checks. Defaults to `false`.
     * 
     */
    private @Nullable Boolean tlsSkipVerify;

    private ServiceCheck() {}
    /**
     * @return An ID, *unique per agent*. Will default to *name*
     * if not set.
     * 
     */
    public String checkId() {
        return this.checkId;
    }
    /**
     * @return The time after which
     * the service is automatically deregistered when in the `critical` state.
     * Defaults to `30s`.
     * 
     */
    public Optional<String> deregisterCriticalServiceAfter() {
        return Optional.ofNullable(this.deregisterCriticalServiceAfter);
    }
    /**
     * @return The headers to send for an HTTP check.
     * The attributes of each header is given below.
     * 
     */
    public List<ServiceCheckHeader> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * @return The HTTP endpoint to call for an HTTP check.
     * 
     */
    public Optional<String> http() {
        return Optional.ofNullable(this.http);
    }
    /**
     * @return The interval to wait between each health-check
     * invocation.
     * 
     */
    public String interval() {
        return this.interval;
    }
    /**
     * @return The method to use for HTTP health-checks. Defaults
     * to `GET`.
     * 
     */
    public Optional<String> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return The name of the health-check.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return An opaque field meant to hold human readable text.
     * 
     */
    public Optional<String> notes() {
        return Optional.ofNullable(this.notes);
    }
    /**
     * @return The initial health-check status.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return The TCP address and port to connect to for a TCP check.
     * 
     */
    public Optional<String> tcp() {
        return Optional.ofNullable(this.tcp);
    }
    /**
     * @return The timeout value for HTTP checks.
     * 
     */
    public String timeout() {
        return this.timeout;
    }
    /**
     * @return Whether to deactivate certificate
     * verification for HTTP health-checks. Defaults to `false`.
     * 
     */
    public Optional<Boolean> tlsSkipVerify() {
        return Optional.ofNullable(this.tlsSkipVerify);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCheck defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String checkId;
        private @Nullable String deregisterCriticalServiceAfter;
        private @Nullable List<ServiceCheckHeader> headers;
        private @Nullable String http;
        private String interval;
        private @Nullable String method;
        private String name;
        private @Nullable String notes;
        private @Nullable String status;
        private @Nullable String tcp;
        private String timeout;
        private @Nullable Boolean tlsSkipVerify;
        public Builder() {}
        public Builder(ServiceCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkId = defaults.checkId;
    	      this.deregisterCriticalServiceAfter = defaults.deregisterCriticalServiceAfter;
    	      this.headers = defaults.headers;
    	      this.http = defaults.http;
    	      this.interval = defaults.interval;
    	      this.method = defaults.method;
    	      this.name = defaults.name;
    	      this.notes = defaults.notes;
    	      this.status = defaults.status;
    	      this.tcp = defaults.tcp;
    	      this.timeout = defaults.timeout;
    	      this.tlsSkipVerify = defaults.tlsSkipVerify;
        }

        @CustomType.Setter
        public Builder checkId(String checkId) {
            this.checkId = Objects.requireNonNull(checkId);
            return this;
        }
        @CustomType.Setter
        public Builder deregisterCriticalServiceAfter(@Nullable String deregisterCriticalServiceAfter) {
            this.deregisterCriticalServiceAfter = deregisterCriticalServiceAfter;
            return this;
        }
        @CustomType.Setter
        public Builder headers(@Nullable List<ServiceCheckHeader> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(ServiceCheckHeader... headers) {
            return headers(List.of(headers));
        }
        @CustomType.Setter
        public Builder http(@Nullable String http) {
            this.http = http;
            return this;
        }
        @CustomType.Setter
        public Builder interval(String interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        @CustomType.Setter
        public Builder method(@Nullable String method) {
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder notes(@Nullable String notes) {
            this.notes = notes;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tcp(@Nullable String tcp) {
            this.tcp = tcp;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        @CustomType.Setter
        public Builder tlsSkipVerify(@Nullable Boolean tlsSkipVerify) {
            this.tlsSkipVerify = tlsSkipVerify;
            return this;
        }
        public ServiceCheck build() {
            final var o = new ServiceCheck();
            o.checkId = checkId;
            o.deregisterCriticalServiceAfter = deregisterCriticalServiceAfter;
            o.headers = headers;
            o.http = http;
            o.interval = interval;
            o.method = method;
            o.name = name;
            o.notes = notes;
            o.status = status;
            o.tcp = tcp;
            o.timeout = timeout;
            o.tlsSkipVerify = tlsSkipVerify;
            return o;
        }
    }
}