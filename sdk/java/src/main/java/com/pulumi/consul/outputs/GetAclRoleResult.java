// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.consul.outputs.GetAclRoleNodeIdentity;
import com.pulumi.consul.outputs.GetAclRolePolicy;
import com.pulumi.consul.outputs.GetAclRoleServiceIdentity;
import com.pulumi.core.annotations.CustomType;
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
     * @return The list of node identities associated with the ACL Role. Each entry has a `node_name` and a `datacenter` attributes.
     * 
     */
    private List<GetAclRoleNodeIdentity> nodeIdentities;
    private @Nullable String partition;
    /**
     * @return The list of policies associated with the ACL Role. Each entry has an `id` and a `name` attribute.
     * 
     */
    private List<GetAclRolePolicy> policies;
    /**
     * @return The list of service identities associated with the ACL Role. Each entry has a `service_name` attribute and a list of `datacenters`.
     * 
     */
    private List<GetAclRoleServiceIdentity> serviceIdentities;

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
     * @return The list of node identities associated with the ACL Role. Each entry has a `node_name` and a `datacenter` attributes.
     * 
     */
    public List<GetAclRoleNodeIdentity> nodeIdentities() {
        return this.nodeIdentities;
    }
    public Optional<String> partition() {
        return Optional.ofNullable(this.partition);
    }
    /**
     * @return The list of policies associated with the ACL Role. Each entry has an `id` and a `name` attribute.
     * 
     */
    public List<GetAclRolePolicy> policies() {
        return this.policies;
    }
    /**
     * @return The list of service identities associated with the ACL Role. Each entry has a `service_name` attribute and a list of `datacenters`.
     * 
     */
    public List<GetAclRoleServiceIdentity> serviceIdentities() {
        return this.serviceIdentities;
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
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder nodeIdentities(List<GetAclRoleNodeIdentity> nodeIdentities) {
            this.nodeIdentities = Objects.requireNonNull(nodeIdentities);
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
            this.policies = Objects.requireNonNull(policies);
            return this;
        }
        public Builder policies(GetAclRolePolicy... policies) {
            return policies(List.of(policies));
        }
        @CustomType.Setter
        public Builder serviceIdentities(List<GetAclRoleServiceIdentity> serviceIdentities) {
            this.serviceIdentities = Objects.requireNonNull(serviceIdentities);
            return this;
        }
        public Builder serviceIdentities(GetAclRoleServiceIdentity... serviceIdentities) {
            return serviceIdentities(List.of(serviceIdentities));
        }
        public GetAclRoleResult build() {
            final var o = new GetAclRoleResult();
            o.description = description;
            o.id = id;
            o.name = name;
            o.namespace = namespace;
            o.nodeIdentities = nodeIdentities;
            o.partition = partition;
            o.policies = policies;
            o.serviceIdentities = serviceIdentities;
            return o;
        }
    }
}