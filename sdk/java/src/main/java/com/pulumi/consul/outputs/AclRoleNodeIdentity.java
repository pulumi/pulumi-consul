// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AclRoleNodeIdentity {
    /**
     * @return The datacenter of the node.
     * 
     */
    private String datacenter;
    /**
     * @return The name of the node.
     * 
     */
    private String nodeName;

    private AclRoleNodeIdentity() {}
    /**
     * @return The datacenter of the node.
     * 
     */
    public String datacenter() {
        return this.datacenter;
    }
    /**
     * @return The name of the node.
     * 
     */
    public String nodeName() {
        return this.nodeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AclRoleNodeIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String datacenter;
        private String nodeName;
        public Builder() {}
        public Builder(AclRoleNodeIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datacenter = defaults.datacenter;
    	      this.nodeName = defaults.nodeName;
        }

        @CustomType.Setter
        public Builder datacenter(String datacenter) {
            this.datacenter = Objects.requireNonNull(datacenter);
            return this;
        }
        @CustomType.Setter
        public Builder nodeName(String nodeName) {
            this.nodeName = Objects.requireNonNull(nodeName);
            return this;
        }
        public AclRoleNodeIdentity build() {
            final var o = new AclRoleNodeIdentity();
            o.datacenter = datacenter;
            o.nodeName = nodeName;
            return o;
        }
    }
}