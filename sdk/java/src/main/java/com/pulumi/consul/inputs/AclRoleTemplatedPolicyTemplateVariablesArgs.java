// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AclRoleTemplatedPolicyTemplateVariablesArgs extends com.pulumi.resources.ResourceArgs {

    public static final AclRoleTemplatedPolicyTemplateVariablesArgs Empty = new AclRoleTemplatedPolicyTemplateVariablesArgs();

    /**
     * The name of node, workload identity or service.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of node, workload identity or service.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private AclRoleTemplatedPolicyTemplateVariablesArgs() {}

    private AclRoleTemplatedPolicyTemplateVariablesArgs(AclRoleTemplatedPolicyTemplateVariablesArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AclRoleTemplatedPolicyTemplateVariablesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AclRoleTemplatedPolicyTemplateVariablesArgs $;

        public Builder() {
            $ = new AclRoleTemplatedPolicyTemplateVariablesArgs();
        }

        public Builder(AclRoleTemplatedPolicyTemplateVariablesArgs defaults) {
            $ = new AclRoleTemplatedPolicyTemplateVariablesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of node, workload identity or service.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of node, workload identity or service.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AclRoleTemplatedPolicyTemplateVariablesArgs build() {
            return $;
        }
    }

}