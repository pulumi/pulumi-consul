// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConfigEntryResult {
    /**
     * @return The configuration of the config entry.
     * 
     */
    private String configJson;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The kind of config entry to read.
     * 
     */
    private String kind;
    /**
     * @return The name of the config entry to read.
     * 
     */
    private String name;
    /**
     * @return The namespace the config entry is associated with.
     * 
     */
    private @Nullable String namespace;
    /**
     * @return The partition the config entry is associated with.
     * 
     */
    private @Nullable String partition;

    private GetConfigEntryResult() {}
    /**
     * @return The configuration of the config entry.
     * 
     */
    public String configJson() {
        return this.configJson;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The kind of config entry to read.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The name of the config entry to read.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The namespace the config entry is associated with.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return The partition the config entry is associated with.
     * 
     */
    public Optional<String> partition() {
        return Optional.ofNullable(this.partition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigEntryResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String configJson;
        private String id;
        private String kind;
        private String name;
        private @Nullable String namespace;
        private @Nullable String partition;
        public Builder() {}
        public Builder(GetConfigEntryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configJson = defaults.configJson;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.partition = defaults.partition;
        }

        @CustomType.Setter
        public Builder configJson(String configJson) {
            if (configJson == null) {
              throw new MissingRequiredPropertyException("GetConfigEntryResult", "configJson");
            }
            this.configJson = configJson;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetConfigEntryResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            if (kind == null) {
              throw new MissingRequiredPropertyException("GetConfigEntryResult", "kind");
            }
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetConfigEntryResult", "name");
            }
            this.name = name;
            return this;
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
        public GetConfigEntryResult build() {
            final var _resultValue = new GetConfigEntryResult();
            _resultValue.configJson = configJson;
            _resultValue.id = id;
            _resultValue.kind = kind;
            _resultValue.name = name;
            _resultValue.namespace = namespace;
            _resultValue.partition = partition;
            return _resultValue;
        }
    }
}
