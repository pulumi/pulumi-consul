// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAclTokenTemplatedPolicyTemplateVariable {
    private String name;

    private GetAclTokenTemplatedPolicyTemplateVariable() {}
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAclTokenTemplatedPolicyTemplateVariable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        public Builder() {}
        public Builder(GetAclTokenTemplatedPolicyTemplateVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetAclTokenTemplatedPolicyTemplateVariable build() {
            final var _resultValue = new GetAclTokenTemplatedPolicyTemplateVariable();
            _resultValue.name = name;
            return _resultValue;
        }
    }
}