// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.consul.outputs.GetAclRoleNodeIdentity;
import com.pulumi.consul.outputs.GetAclRolePolicy;
import com.pulumi.consul.outputs.GetAclRoleServiceIdentity;
import com.pulumi.consul.outputs.GetAclRoleTemplatedPolicy;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAclRoleResult {
    /**
     * @return The description of the ACL Role.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The name of the ACL Role.
     * 
     */
    private String name;
    /**
     * @return The namespace to lookup the role.
     * 
     */
    private @Nullable String namespace;
    /**
     * @return The list of node identities associated with the ACL Role.
     * 
     */
    private List<GetAclRoleNodeIdentity> nodeIdentities;
    /**
     * @return The partition to lookup the role.
     * 
     */
    private @Nullable String partition;
    /**
     * @return The list of policies associated with the ACL Role.
     * 
     */
    private List<GetAclRolePolicy> policies;
    /**
     * @return The list of service identities associated with the ACL Role.
     * 
     */
    private List<GetAclRoleServiceIdentity> serviceIdentities;
    /**
     * @return The list of templated policies that should be applied to the token.
     * 
     */
    private List<GetAclRoleTemplatedPolicy> templatedPolicies;

    private GetAclRoleResult() {}
    /**
     * @return The description of the ACL Role.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the ACL Role.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The namespace to lookup the role.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return The list of node identities associated with the ACL Role.
     * 
     */
    public List<GetAclRoleNodeIdentity> nodeIdentities() {
        return this.nodeIdentities;
    }
    /**
     * @return The partition to lookup the role.
     * 
     */
    public Optional<String> partition() {
        return Optional.ofNullable(this.partition);
    }
    /**
     * @return The list of policies associated with the ACL Role.
     * 
     */
    public List<GetAclRolePolicy> policies() {
        return this.policies;
    }
    /**
     * @return The list of service identities associated with the ACL Role.
     * 
     */
    public List<GetAclRoleServiceIdentity> serviceIdentities() {
        return this.serviceIdentities;
    }
    /**
     * @return The list of templated policies that should be applied to the token.
     * 
     */
    public List<GetAclRoleTemplatedPolicy> templatedPolicies() {
        return this.templatedPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAclRoleResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private String name;
        private @Nullable String namespace;
        private List<GetAclRoleNodeIdentity> nodeIdentities;
        private @Nullable String partition;
        private List<GetAclRolePolicy> policies;
        private List<GetAclRoleServiceIdentity> serviceIdentities;
        private List<GetAclRoleTemplatedPolicy> templatedPolicies;
        public Builder() {}
        public Builder(GetAclRoleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.nodeIdentities = defaults.nodeIdentities;
    	      this.partition = defaults.partition;
    	      this.policies = defaults.policies;
    	      this.serviceIdentities = defaults.serviceIdentities;
    	      this.templatedPolicies = defaults.templatedPolicies;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetAclRoleResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAclRoleResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAclRoleResult", "name");
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
        public Builder nodeIdentities(List<GetAclRoleNodeIdentity> nodeIdentities) {
            if (nodeIdentities == null) {
              throw new MissingRequiredPropertyException("GetAclRoleResult", "nodeIdentities");
            }
            this.nodeIdentities = nodeIdentities;
            return this;
        }
        public Builder nodeIdentities(GetAclRoleNodeIdentity... nodeIdentities) {
            return nodeIdentities(List.of(nodeIdentities));
        }
        @CustomType.Setter
        public Builder partition(@Nullable String partition) {

            this.partition = partition;
            return this;
        }
        @CustomType.Setter
        public Builder policies(List<GetAclRolePolicy> policies) {
            if (policies == null) {
              throw new MissingRequiredPropertyException("GetAclRoleResult", "policies");
            }
            this.policies = policies;
            return this;
        }
        public Builder policies(GetAclRolePolicy... policies) {
            return policies(List.of(policies));
        }
        @CustomType.Setter
        public Builder serviceIdentities(List<GetAclRoleServiceIdentity> serviceIdentities) {
            if (serviceIdentities == null) {
              throw new MissingRequiredPropertyException("GetAclRoleResult", "serviceIdentities");
            }
            this.serviceIdentities = serviceIdentities;
            return this;
        }
        public Builder serviceIdentities(GetAclRoleServiceIdentity... serviceIdentities) {
            return serviceIdentities(List.of(serviceIdentities));
        }
        @CustomType.Setter
        public Builder templatedPolicies(List<GetAclRoleTemplatedPolicy> templatedPolicies) {
            if (templatedPolicies == null) {
              throw new MissingRequiredPropertyException("GetAclRoleResult", "templatedPolicies");
            }
            this.templatedPolicies = templatedPolicies;
            return this;
        }
        public Builder templatedPolicies(GetAclRoleTemplatedPolicy... templatedPolicies) {
            return templatedPolicies(List.of(templatedPolicies));
        }
        public GetAclRoleResult build() {
            final var _resultValue = new GetAclRoleResult();
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.namespace = namespace;
            _resultValue.nodeIdentities = nodeIdentities;
            _resultValue.partition = partition;
            _resultValue.policies = policies;
            _resultValue.serviceIdentities = serviceIdentities;
            _resultValue.templatedPolicies = templatedPolicies;
            return _resultValue;
        }
    }
}
