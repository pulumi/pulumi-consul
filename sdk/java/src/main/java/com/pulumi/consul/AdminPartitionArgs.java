// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AdminPartitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AdminPartitionArgs Empty = new AdminPartitionArgs();

    /**
     * Free form partition description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Free form partition description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The partition name. This must be a valid DNS hostname label.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The partition name. This must be a valid DNS hostname label.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private AdminPartitionArgs() {}

    private AdminPartitionArgs(AdminPartitionArgs $) {
        this.description = $.description;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdminPartitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdminPartitionArgs $;

        public Builder() {
            $ = new AdminPartitionArgs();
        }

        public Builder(AdminPartitionArgs defaults) {
            $ = new AdminPartitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Free form partition description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Free form partition description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The partition name. This must be a valid DNS hostname label.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The partition name. This must be a valid DNS hostname label.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AdminPartitionArgs build() {
            return $;
        }
    }

}