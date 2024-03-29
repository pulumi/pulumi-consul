// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.consul.outputs.ConfigEntryServiceSplitterSplitRequestHeaders;
import com.pulumi.consul.outputs.ConfigEntryServiceSplitterSplitResponseHeaders;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigEntryServiceSplitterSplit {
    /**
     * @return Specifies the namespace to use in the FQDN when resolving the service.
     * 
     */
    private @Nullable String namespace;
    /**
     * @return Specifies the admin partition to use in the FQDN when resolving the service.
     * 
     */
    private @Nullable String partition;
    /**
     * @return Specifies a set of HTTP-specific header modification rules applied to requests routed with the service split. You cannot configure request headers if the listener protocol is set to `tcp`.
     * 
     */
    private @Nullable ConfigEntryServiceSplitterSplitRequestHeaders requestHeaders;
    /**
     * @return Specifies a set of HTTP-specific header modification rules applied to responses routed with the service split. You cannot configure request headers if the listener protocol is set to `tcp`.
     * 
     */
    private @Nullable ConfigEntryServiceSplitterSplitResponseHeaders responseHeaders;
    /**
     * @return Specifies the name of the service to resolve.
     * 
     */
    private String service;
    /**
     * @return Specifies a subset of the service to resolve. A service subset assigns a name to a specific subset of discoverable service instances within a datacenter, such as `version2` or `canary`. All services have an unnamed default subset that returns all healthy instances.
     * 
     */
    private @Nullable String serviceSubset;
    /**
     * @return Specifies the percentage of traffic sent to the set of service instances specified in the `service` field. Each weight must be a floating integer between `0` and `100`. The smallest representable value is `.01`. The sum of weights across all splits must add up to `100`.
     * 
     */
    private Double weight;

    private ConfigEntryServiceSplitterSplit() {}
    /**
     * @return Specifies the namespace to use in the FQDN when resolving the service.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return Specifies the admin partition to use in the FQDN when resolving the service.
     * 
     */
    public Optional<String> partition() {
        return Optional.ofNullable(this.partition);
    }
    /**
     * @return Specifies a set of HTTP-specific header modification rules applied to requests routed with the service split. You cannot configure request headers if the listener protocol is set to `tcp`.
     * 
     */
    public Optional<ConfigEntryServiceSplitterSplitRequestHeaders> requestHeaders() {
        return Optional.ofNullable(this.requestHeaders);
    }
    /**
     * @return Specifies a set of HTTP-specific header modification rules applied to responses routed with the service split. You cannot configure request headers if the listener protocol is set to `tcp`.
     * 
     */
    public Optional<ConfigEntryServiceSplitterSplitResponseHeaders> responseHeaders() {
        return Optional.ofNullable(this.responseHeaders);
    }
    /**
     * @return Specifies the name of the service to resolve.
     * 
     */
    public String service() {
        return this.service;
    }
    /**
     * @return Specifies a subset of the service to resolve. A service subset assigns a name to a specific subset of discoverable service instances within a datacenter, such as `version2` or `canary`. All services have an unnamed default subset that returns all healthy instances.
     * 
     */
    public Optional<String> serviceSubset() {
        return Optional.ofNullable(this.serviceSubset);
    }
    /**
     * @return Specifies the percentage of traffic sent to the set of service instances specified in the `service` field. Each weight must be a floating integer between `0` and `100`. The smallest representable value is `.01`. The sum of weights across all splits must add up to `100`.
     * 
     */
    public Double weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigEntryServiceSplitterSplit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String namespace;
        private @Nullable String partition;
        private @Nullable ConfigEntryServiceSplitterSplitRequestHeaders requestHeaders;
        private @Nullable ConfigEntryServiceSplitterSplitResponseHeaders responseHeaders;
        private String service;
        private @Nullable String serviceSubset;
        private Double weight;
        public Builder() {}
        public Builder(ConfigEntryServiceSplitterSplit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
    	      this.partition = defaults.partition;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.responseHeaders = defaults.responseHeaders;
    	      this.service = defaults.service;
    	      this.serviceSubset = defaults.serviceSubset;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {

            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder partition(@Nullable String partition) {

            this.partition = partition;
            return this;
        }
        @CustomType.Setter
        public Builder requestHeaders(@Nullable ConfigEntryServiceSplitterSplitRequestHeaders requestHeaders) {

            this.requestHeaders = requestHeaders;
            return this;
        }
        @CustomType.Setter
        public Builder responseHeaders(@Nullable ConfigEntryServiceSplitterSplitResponseHeaders responseHeaders) {

            this.responseHeaders = responseHeaders;
            return this;
        }
        @CustomType.Setter
        public Builder service(String service) {
            if (service == null) {
              throw new MissingRequiredPropertyException("ConfigEntryServiceSplitterSplit", "service");
            }
            this.service = service;
            return this;
        }
        @CustomType.Setter
        public Builder serviceSubset(@Nullable String serviceSubset) {

            this.serviceSubset = serviceSubset;
            return this;
        }
        @CustomType.Setter
        public Builder weight(Double weight) {
            if (weight == null) {
              throw new MissingRequiredPropertyException("ConfigEntryServiceSplitterSplit", "weight");
            }
            this.weight = weight;
            return this;
        }
        public ConfigEntryServiceSplitterSplit build() {
            final var _resultValue = new ConfigEntryServiceSplitterSplit();
            _resultValue.namespace = namespace;
            _resultValue.partition = partition;
            _resultValue.requestHeaders = requestHeaders;
            _resultValue.responseHeaders = responseHeaders;
            _resultValue.service = service;
            _resultValue.serviceSubset = serviceSubset;
            _resultValue.weight = weight;
            return _resultValue;
        }
    }
}
