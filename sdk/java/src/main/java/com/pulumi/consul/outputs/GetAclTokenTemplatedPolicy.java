// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.consul.outputs.GetAclTokenTemplatedPolicyTemplateVariable;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAclTokenTemplatedPolicy {
    private List<String> datacenters;
    private String templateName;
    private List<GetAclTokenTemplatedPolicyTemplateVariable> templateVariables;

    private GetAclTokenTemplatedPolicy() {}
    public List<String> datacenters() {
        return this.datacenters;
    }
    public String templateName() {
        return this.templateName;
    }
    public List<GetAclTokenTemplatedPolicyTemplateVariable> templateVariables() {
        return this.templateVariables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAclTokenTemplatedPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> datacenters;
        private String templateName;
        private List<GetAclTokenTemplatedPolicyTemplateVariable> templateVariables;
        public Builder() {}
        public Builder(GetAclTokenTemplatedPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datacenters = defaults.datacenters;
    	      this.templateName = defaults.templateName;
    	      this.templateVariables = defaults.templateVariables;
        }

        @CustomType.Setter
        public Builder datacenters(List<String> datacenters) {
            this.datacenters = Objects.requireNonNull(datacenters);
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
        public Builder templateVariables(List<GetAclTokenTemplatedPolicyTemplateVariable> templateVariables) {
            this.templateVariables = Objects.requireNonNull(templateVariables);
            return this;
        }
        public Builder templateVariables(GetAclTokenTemplatedPolicyTemplateVariable... templateVariables) {
            return templateVariables(List.of(templateVariables));
        }
        public GetAclTokenTemplatedPolicy build() {
            final var _resultValue = new GetAclTokenTemplatedPolicy();
            _resultValue.datacenters = datacenters;
            _resultValue.templateName = templateName;
            _resultValue.templateVariables = templateVariables;
            return _resultValue;
        }
    }
}