// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ConfigEntryServiceRouterRouteDestinationRequestHeaders {
    /**
     * @return Defines a set of key-value pairs to add to the header. Use header names as the keys.
     * 
     */
    private @Nullable Map<String,String> add;
    /**
     * @return Defines a list of headers to remove.
     * 
     */
    private @Nullable List<String> removes;
    /**
     * @return Defines a set of key-value pairs to add to the request header or to replace existing header values with.
     * 
     */
    private @Nullable Map<String,String> set;

    private ConfigEntryServiceRouterRouteDestinationRequestHeaders() {}
    /**
     * @return Defines a set of key-value pairs to add to the header. Use header names as the keys.
     * 
     */
    public Map<String,String> add() {
        return this.add == null ? Map.of() : this.add;
    }
    /**
     * @return Defines a list of headers to remove.
     * 
     */
    public List<String> removes() {
        return this.removes == null ? List.of() : this.removes;
    }
    /**
     * @return Defines a set of key-value pairs to add to the request header or to replace existing header values with.
     * 
     */
    public Map<String,String> set() {
        return this.set == null ? Map.of() : this.set;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigEntryServiceRouterRouteDestinationRequestHeaders defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> add;
        private @Nullable List<String> removes;
        private @Nullable Map<String,String> set;
        public Builder() {}
        public Builder(ConfigEntryServiceRouterRouteDestinationRequestHeaders defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.add = defaults.add;
    	      this.removes = defaults.removes;
    	      this.set = defaults.set;
        }

        @CustomType.Setter
        public Builder add(@Nullable Map<String,String> add) {
            this.add = add;
            return this;
        }
        @CustomType.Setter
        public Builder removes(@Nullable List<String> removes) {
            this.removes = removes;
            return this;
        }
        public Builder removes(String... removes) {
            return removes(List.of(removes));
        }
        @CustomType.Setter
        public Builder set(@Nullable Map<String,String> set) {
            this.set = set;
            return this;
        }
        public ConfigEntryServiceRouterRouteDestinationRequestHeaders build() {
            final var _resultValue = new ConfigEntryServiceRouterRouteDestinationRequestHeaders();
            _resultValue.add = add;
            _resultValue.removes = removes;
            _resultValue.set = set;
            return _resultValue;
        }
    }
}