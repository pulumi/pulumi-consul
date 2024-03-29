// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.consul.outputs.GetNetworkAreaMembersMember;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNetworkAreaMembersResult {
    /**
     * @return The node&#39;s Consul datacenter.
     * 
     */
    private String datacenter;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The list of Consul servers in this network area
     * 
     */
    private List<GetNetworkAreaMembersMember> members;
    /**
     * @deprecated
     * The token argument has been deprecated and will be removed in a future release.
     * Please use the token argument in the provider configuration
     * 
     */
    @Deprecated /* The token argument has been deprecated and will be removed in a future release.
Please use the token argument in the provider configuration */
    private @Nullable String token;
    /**
     * @return The UUID of the Network Area being queried.
     * 
     */
    private String uuid;

    private GetNetworkAreaMembersResult() {}
    /**
     * @return The node&#39;s Consul datacenter.
     * 
     */
    public String datacenter() {
        return this.datacenter;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The list of Consul servers in this network area
     * 
     */
    public List<GetNetworkAreaMembersMember> members() {
        return this.members;
    }
    /**
     * @deprecated
     * The token argument has been deprecated and will be removed in a future release.
     * Please use the token argument in the provider configuration
     * 
     */
    @Deprecated /* The token argument has been deprecated and will be removed in a future release.
Please use the token argument in the provider configuration */
    public Optional<String> token() {
        return Optional.ofNullable(this.token);
    }
    /**
     * @return The UUID of the Network Area being queried.
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkAreaMembersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String datacenter;
        private String id;
        private List<GetNetworkAreaMembersMember> members;
        private @Nullable String token;
        private String uuid;
        public Builder() {}
        public Builder(GetNetworkAreaMembersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datacenter = defaults.datacenter;
    	      this.id = defaults.id;
    	      this.members = defaults.members;
    	      this.token = defaults.token;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder datacenter(String datacenter) {
            if (datacenter == null) {
              throw new MissingRequiredPropertyException("GetNetworkAreaMembersResult", "datacenter");
            }
            this.datacenter = datacenter;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNetworkAreaMembersResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder members(List<GetNetworkAreaMembersMember> members) {
            if (members == null) {
              throw new MissingRequiredPropertyException("GetNetworkAreaMembersResult", "members");
            }
            this.members = members;
            return this;
        }
        public Builder members(GetNetworkAreaMembersMember... members) {
            return members(List.of(members));
        }
        @CustomType.Setter
        public Builder token(@Nullable String token) {

            this.token = token;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("GetNetworkAreaMembersResult", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public GetNetworkAreaMembersResult build() {
            final var _resultValue = new GetNetworkAreaMembersResult();
            _resultValue.datacenter = datacenter;
            _resultValue.id = id;
            _resultValue.members = members;
            _resultValue.token = token;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
