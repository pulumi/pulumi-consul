// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.inputs;

import com.pulumi.consul.inputs.ConfigEntryServiceIntentionsSourcePermissionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigEntryServiceIntentionsSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigEntryServiceIntentionsSourceArgs Empty = new ConfigEntryServiceIntentionsSourceArgs();

    /**
     * Specifies the action to take when the source sends traffic to the destination service.
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return Specifies the action to take when the source sends traffic to the destination service.
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * Specifies a description of the intention.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Specifies a description of the intention.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies the name of the source that the intention allows or denies traffic from.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the source that the intention allows or denies traffic from.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the traffic source namespace that the intention allows or denies traffic from.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return Specifies the traffic source namespace that the intention allows or denies traffic from.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * Specifies the name of an admin partition that the intention allows or denies traffic from.
     * 
     */
    @Import(name="partition")
    private @Nullable Output<String> partition;

    /**
     * @return Specifies the name of an admin partition that the intention allows or denies traffic from.
     * 
     */
    public Optional<Output<String>> partition() {
        return Optional.ofNullable(this.partition);
    }

    /**
     * Specifies the name of a peered Consul cluster that the intention allows or denies traffic from
     * 
     */
    @Import(name="peer")
    private @Nullable Output<String> peer;

    /**
     * @return Specifies the name of a peered Consul cluster that the intention allows or denies traffic from
     * 
     */
    public Optional<Output<String>> peer() {
        return Optional.ofNullable(this.peer);
    }

    /**
     * Specifies a list of permissions for L7 traffic sources. The list contains one or more actions and a set of match criteria for each action.
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<List<ConfigEntryServiceIntentionsSourcePermissionArgs>> permissions;

    /**
     * @return Specifies a list of permissions for L7 traffic sources. The list contains one or more actions and a set of match criteria for each action.
     * 
     */
    public Optional<Output<List<ConfigEntryServiceIntentionsSourcePermissionArgs>>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    /**
     * The Precedence field contains a read-only integer. Consul generates the value based on name configurations for the source and destination services.
     * 
     */
    @Import(name="precedence")
    private @Nullable Output<Integer> precedence;

    /**
     * @return The Precedence field contains a read-only integer. Consul generates the value based on name configurations for the source and destination services.
     * 
     */
    public Optional<Output<Integer>> precedence() {
        return Optional.ofNullable(this.precedence);
    }

    /**
     * Specifies the name of a sameness group that the intention allows or denies traffic from.
     * 
     */
    @Import(name="samenessGroup")
    private @Nullable Output<String> samenessGroup;

    /**
     * @return Specifies the name of a sameness group that the intention allows or denies traffic from.
     * 
     */
    public Optional<Output<String>> samenessGroup() {
        return Optional.ofNullable(this.samenessGroup);
    }

    /**
     * Specifies the type of destination service that the configuration entry applies to.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Specifies the type of destination service that the configuration entry applies to.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ConfigEntryServiceIntentionsSourceArgs() {}

    private ConfigEntryServiceIntentionsSourceArgs(ConfigEntryServiceIntentionsSourceArgs $) {
        this.action = $.action;
        this.description = $.description;
        this.name = $.name;
        this.namespace = $.namespace;
        this.partition = $.partition;
        this.peer = $.peer;
        this.permissions = $.permissions;
        this.precedence = $.precedence;
        this.samenessGroup = $.samenessGroup;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigEntryServiceIntentionsSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigEntryServiceIntentionsSourceArgs $;

        public Builder() {
            $ = new ConfigEntryServiceIntentionsSourceArgs();
        }

        public Builder(ConfigEntryServiceIntentionsSourceArgs defaults) {
            $ = new ConfigEntryServiceIntentionsSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Specifies the action to take when the source sends traffic to the destination service.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Specifies the action to take when the source sends traffic to the destination service.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param description Specifies a description of the intention.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Specifies a description of the intention.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Specifies the name of the source that the intention allows or denies traffic from.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the source that the intention allows or denies traffic from.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace Specifies the traffic source namespace that the intention allows or denies traffic from.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Specifies the traffic source namespace that the intention allows or denies traffic from.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param partition Specifies the name of an admin partition that the intention allows or denies traffic from.
         * 
         * @return builder
         * 
         */
        public Builder partition(@Nullable Output<String> partition) {
            $.partition = partition;
            return this;
        }

        /**
         * @param partition Specifies the name of an admin partition that the intention allows or denies traffic from.
         * 
         * @return builder
         * 
         */
        public Builder partition(String partition) {
            return partition(Output.of(partition));
        }

        /**
         * @param peer Specifies the name of a peered Consul cluster that the intention allows or denies traffic from
         * 
         * @return builder
         * 
         */
        public Builder peer(@Nullable Output<String> peer) {
            $.peer = peer;
            return this;
        }

        /**
         * @param peer Specifies the name of a peered Consul cluster that the intention allows or denies traffic from
         * 
         * @return builder
         * 
         */
        public Builder peer(String peer) {
            return peer(Output.of(peer));
        }

        /**
         * @param permissions Specifies a list of permissions for L7 traffic sources. The list contains one or more actions and a set of match criteria for each action.
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable Output<List<ConfigEntryServiceIntentionsSourcePermissionArgs>> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions Specifies a list of permissions for L7 traffic sources. The list contains one or more actions and a set of match criteria for each action.
         * 
         * @return builder
         * 
         */
        public Builder permissions(List<ConfigEntryServiceIntentionsSourcePermissionArgs> permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param permissions Specifies a list of permissions for L7 traffic sources. The list contains one or more actions and a set of match criteria for each action.
         * 
         * @return builder
         * 
         */
        public Builder permissions(ConfigEntryServiceIntentionsSourcePermissionArgs... permissions) {
            return permissions(List.of(permissions));
        }

        /**
         * @param precedence The Precedence field contains a read-only integer. Consul generates the value based on name configurations for the source and destination services.
         * 
         * @return builder
         * 
         */
        public Builder precedence(@Nullable Output<Integer> precedence) {
            $.precedence = precedence;
            return this;
        }

        /**
         * @param precedence The Precedence field contains a read-only integer. Consul generates the value based on name configurations for the source and destination services.
         * 
         * @return builder
         * 
         */
        public Builder precedence(Integer precedence) {
            return precedence(Output.of(precedence));
        }

        /**
         * @param samenessGroup Specifies the name of a sameness group that the intention allows or denies traffic from.
         * 
         * @return builder
         * 
         */
        public Builder samenessGroup(@Nullable Output<String> samenessGroup) {
            $.samenessGroup = samenessGroup;
            return this;
        }

        /**
         * @param samenessGroup Specifies the name of a sameness group that the intention allows or denies traffic from.
         * 
         * @return builder
         * 
         */
        public Builder samenessGroup(String samenessGroup) {
            return samenessGroup(Output.of(samenessGroup));
        }

        /**
         * @param type Specifies the type of destination service that the configuration entry applies to.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of destination service that the configuration entry applies to.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ConfigEntryServiceIntentionsSourceArgs build() {
            return $;
        }
    }

}