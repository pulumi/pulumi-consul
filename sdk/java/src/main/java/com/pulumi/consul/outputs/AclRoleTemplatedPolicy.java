// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.consul.outputs.AclRoleTemplatedPolicyTemplateVariables;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AclRoleTemplatedPolicy {
    /**
     * @return Specifies the datacenters the effective policy is valid within.
     * 
     */
    private @Nullable List<String> datacenters;
    /**
     * @return The name of the templated policies.
     * 
     */
    private String templateName;
    /**
     * @return The templated policy variables.
     * 
     */
    private @Nullable AclRoleTemplatedPolicyTemplateVariables templateVariables;

    private AclRoleTemplatedPolicy() {}
    /**
     * @return Specifies the datacenters the effective policy is valid within.
     * 
     */
    public List<String> datacenters() {
        return this.datacenters == null ? List.of() : this.datacenters;
    }
    /**
     * @return The name of the templated policies.
     * 
     */
    public String templateName() {
        return this.templateName;
    }
    /**
     * @return The templated policy variables.
     * 
     */
    public Optional<AclRoleTemplatedPolicyTemplateVariables> templateVariables() {
        return Optional.ofNullable(this.templateVariables);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AclRoleTemplatedPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> datacenters;
        private String templateName;
        private @Nullable AclRoleTemplatedPolicyTemplateVariables templateVariables;
        public Builder() {}
        public Builder(AclRoleTemplatedPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datacenters = defaults.datacenters;
    	      this.templateName = defaults.templateName;
    	      this.templateVariables = defaults.templateVariables;
        }

        @CustomType.Setter
        public Builder datacenters(@Nullable List<String> datacenters) {
            this.datacenters = datacenters;
            return this;
        }
        public Builder datacenters(String... datacenters) {
            return datacenters(List.of(datacenters));
        }
        @CustomType.Setter
        public Builder templateName(String templateName) {
            this.templateName = Objects.requireNonNull(templateName);
            return this;
        }
        @CustomType.Setter
        public Builder templateVariables(@Nullable AclRoleTemplatedPolicyTemplateVariables templateVariables) {
            this.templateVariables = templateVariables;
            return this;
        }
        public AclRoleTemplatedPolicy build() {
            final var _resultValue = new AclRoleTemplatedPolicy();
            _resultValue.datacenters = datacenters;
            _resultValue.templateName = templateName;
            _resultValue.templateVariables = templateVariables;
            return _resultValue;
        }
    }
}