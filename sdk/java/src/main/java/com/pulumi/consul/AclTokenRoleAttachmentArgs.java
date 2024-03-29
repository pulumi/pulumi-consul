// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AclTokenRoleAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final AclTokenRoleAttachmentArgs Empty = new AclTokenRoleAttachmentArgs();

    /**
     * The role name.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The role name.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     * The id of the token.
     * 
     */
    @Import(name="tokenId", required=true)
    private Output<String> tokenId;

    /**
     * @return The id of the token.
     * 
     */
    public Output<String> tokenId() {
        return this.tokenId;
    }

    private AclTokenRoleAttachmentArgs() {}

    private AclTokenRoleAttachmentArgs(AclTokenRoleAttachmentArgs $) {
        this.role = $.role;
        this.tokenId = $.tokenId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AclTokenRoleAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AclTokenRoleAttachmentArgs $;

        public Builder() {
            $ = new AclTokenRoleAttachmentArgs();
        }

        public Builder(AclTokenRoleAttachmentArgs defaults) {
            $ = new AclTokenRoleAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param role The role name.
         * 
         * @return builder
         * 
         */
        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role name.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param tokenId The id of the token.
         * 
         * @return builder
         * 
         */
        public Builder tokenId(Output<String> tokenId) {
            $.tokenId = tokenId;
            return this;
        }

        /**
         * @param tokenId The id of the token.
         * 
         * @return builder
         * 
         */
        public Builder tokenId(String tokenId) {
            return tokenId(Output.of(tokenId));
        }

        public AclTokenRoleAttachmentArgs build() {
            if ($.role == null) {
                throw new MissingRequiredPropertyException("AclTokenRoleAttachmentArgs", "role");
            }
            if ($.tokenId == null) {
                throw new MissingRequiredPropertyException("AclTokenRoleAttachmentArgs", "tokenId");
            }
            return $;
        }
    }

}
