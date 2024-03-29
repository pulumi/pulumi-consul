// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetServiceHealthResultService {
    /**
     * @return The address of this instance.
     * 
     */
    private String address;
    /**
     * @return The ID of this health-check.
     * 
     */
    private String id;
    /**
     * @return Service metadata tag information, if any.
     * 
     */
    private Map<String,String> meta;
    /**
     * @return The service name to select.
     * 
     */
    private String name;
    /**
     * @return The port of this instance.
     * 
     */
    private Integer port;
    /**
     * @return The list of tags associated with this instance.
     * 
     */
    private List<String> tags;

    private GetServiceHealthResultService() {}
    /**
     * @return The address of this instance.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return The ID of this health-check.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Service metadata tag information, if any.
     * 
     */
    public Map<String,String> meta() {
        return this.meta;
    }
    /**
     * @return The service name to select.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The port of this instance.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The list of tags associated with this instance.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceHealthResultService defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private String id;
        private Map<String,String> meta;
        private String name;
        private Integer port;
        private List<String> tags;
        public Builder() {}
        public Builder(GetServiceHealthResultService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.id = defaults.id;
    	      this.meta = defaults.meta;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetServiceHealthResultService", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetServiceHealthResultService", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder meta(Map<String,String> meta) {
            if (meta == null) {
              throw new MissingRequiredPropertyException("GetServiceHealthResultService", "meta");
            }
            this.meta = meta;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetServiceHealthResultService", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetServiceHealthResultService", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetServiceHealthResultService", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public GetServiceHealthResultService build() {
            final var _resultValue = new GetServiceHealthResultService();
            _resultValue.address = address;
            _resultValue.id = id;
            _resultValue.meta = meta;
            _resultValue.name = name;
            _resultValue.port = port;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
