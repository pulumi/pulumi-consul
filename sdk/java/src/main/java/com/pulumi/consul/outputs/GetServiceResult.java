// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.consul.outputs.GetServiceQueryOption;
import com.pulumi.consul.outputs.GetServiceService;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceResult {
    /**
     * @return The datacenter the keys are being read from to.
     * 
     */
    private @Nullable String datacenter;
    private @Nullable String filter;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The name of the service
     * 
     */
    private String name;
    private @Nullable List<GetServiceQueryOption> queryOptions;
    /**
     * @return A list of nodes and details about each endpoint advertising a
     * service.  Each element in the list is a map of attributes that correspond to
     * each individual node.  The list of per-node attributes is detailed below.
     * 
     */
    private List<GetServiceService> services;
    /**
     * @return The name of the tag used to filter the list of nodes in `service`.
     * 
     */
    private @Nullable String tag;

    private GetServiceResult() {}
    /**
     * @return The datacenter the keys are being read from to.
     * 
     */
    public Optional<String> datacenter() {
        return Optional.ofNullable(this.datacenter);
    }
    public Optional<String> filter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the service
     * 
     */
    public String name() {
        return this.name;
    }
    public List<GetServiceQueryOption> queryOptions() {
        return this.queryOptions == null ? List.of() : this.queryOptions;
    }
    /**
     * @return A list of nodes and details about each endpoint advertising a
     * service.  Each element in the list is a map of attributes that correspond to
     * each individual node.  The list of per-node attributes is detailed below.
     * 
     */
    public List<GetServiceService> services() {
        return this.services;
    }
    /**
     * @return The name of the tag used to filter the list of nodes in `service`.
     * 
     */
    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String datacenter;
        private @Nullable String filter;
        private String id;
        private String name;
        private @Nullable List<GetServiceQueryOption> queryOptions;
        private List<GetServiceService> services;
        private @Nullable String tag;
        public Builder() {}
        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datacenter = defaults.datacenter;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.queryOptions = defaults.queryOptions;
    	      this.services = defaults.services;
    	      this.tag = defaults.tag;
        }

        @CustomType.Setter
        public Builder datacenter(@Nullable String datacenter) {

            this.datacenter = datacenter;
            return this;
        }
        @CustomType.Setter
        public Builder filter(@Nullable String filter) {

            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetServiceResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetServiceResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder queryOptions(@Nullable List<GetServiceQueryOption> queryOptions) {

            this.queryOptions = queryOptions;
            return this;
        }
        public Builder queryOptions(GetServiceQueryOption... queryOptions) {
            return queryOptions(List.of(queryOptions));
        }
        @CustomType.Setter
        public Builder services(List<GetServiceService> services) {
            if (services == null) {
              throw new MissingRequiredPropertyException("GetServiceResult", "services");
            }
            this.services = services;
            return this;
        }
        public Builder services(GetServiceService... services) {
            return services(List.of(services));
        }
        @CustomType.Setter
        public Builder tag(@Nullable String tag) {

            this.tag = tag;
            return this;
        }
        public GetServiceResult build() {
            final var _resultValue = new GetServiceResult();
            _resultValue.datacenter = datacenter;
            _resultValue.filter = filter;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.queryOptions = queryOptions;
            _resultValue.services = services;
            _resultValue.tag = tag;
            return _resultValue;
        }
    }
}
