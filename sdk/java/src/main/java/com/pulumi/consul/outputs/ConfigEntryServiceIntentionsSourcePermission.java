// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.consul.outputs.ConfigEntryServiceIntentionsSourcePermissionHttp;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ConfigEntryServiceIntentionsSourcePermission {
    /**
     * @return Specifies the action to take when the source sends traffic to the destination service. The value is either allow or deny.
     * 
     */
    private String action;
    /**
     * @return Specifies a set of HTTP-specific match criteria.
     * 
     */
    private List<ConfigEntryServiceIntentionsSourcePermissionHttp> https;

    private ConfigEntryServiceIntentionsSourcePermission() {}
    /**
     * @return Specifies the action to take when the source sends traffic to the destination service. The value is either allow or deny.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return Specifies a set of HTTP-specific match criteria.
     * 
     */
    public List<ConfigEntryServiceIntentionsSourcePermissionHttp> https() {
        return this.https;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigEntryServiceIntentionsSourcePermission defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private List<ConfigEntryServiceIntentionsSourcePermissionHttp> https;
        public Builder() {}
        public Builder(ConfigEntryServiceIntentionsSourcePermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.https = defaults.https;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("ConfigEntryServiceIntentionsSourcePermission", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder https(List<ConfigEntryServiceIntentionsSourcePermissionHttp> https) {
            if (https == null) {
              throw new MissingRequiredPropertyException("ConfigEntryServiceIntentionsSourcePermission", "https");
            }
            this.https = https;
            return this;
        }
        public Builder https(ConfigEntryServiceIntentionsSourcePermissionHttp... https) {
            return https(List.of(https));
        }
        public ConfigEntryServiceIntentionsSourcePermission build() {
            final var _resultValue = new ConfigEntryServiceIntentionsSourcePermission();
            _resultValue.action = action;
            _resultValue.https = https;
            return _resultValue;
        }
    }
}
