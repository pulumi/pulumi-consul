// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.inputs;

import com.pulumi.consul.inputs.ConfigEntryServiceResolverLoadBalancerHashPolicyArgs;
import com.pulumi.consul.inputs.ConfigEntryServiceResolverLoadBalancerLeastRequestConfigArgs;
import com.pulumi.consul.inputs.ConfigEntryServiceResolverLoadBalancerRingHashConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigEntryServiceResolverLoadBalancerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigEntryServiceResolverLoadBalancerArgs Empty = new ConfigEntryServiceResolverLoadBalancerArgs();

    /**
     * Specifies a list of hash policies to use for hashing load balancing algorithms. Consul evaluates hash policies individually and combines them so that identical lists result in the same hash.
     * 
     */
    @Import(name="hashPolicies")
    private @Nullable Output<List<ConfigEntryServiceResolverLoadBalancerHashPolicyArgs>> hashPolicies;

    /**
     * @return Specifies a list of hash policies to use for hashing load balancing algorithms. Consul evaluates hash policies individually and combines them so that identical lists result in the same hash.
     * 
     */
    public Optional<Output<List<ConfigEntryServiceResolverLoadBalancerHashPolicyArgs>>> hashPolicies() {
        return Optional.ofNullable(this.hashPolicies);
    }

    /**
     * Specifies configuration for the least*request policy type.
     * 
     */
    @Import(name="leastRequestConfigs")
    private @Nullable Output<List<ConfigEntryServiceResolverLoadBalancerLeastRequestConfigArgs>> leastRequestConfigs;

    /**
     * @return Specifies configuration for the least*request policy type.
     * 
     */
    public Optional<Output<List<ConfigEntryServiceResolverLoadBalancerLeastRequestConfigArgs>>> leastRequestConfigs() {
        return Optional.ofNullable(this.leastRequestConfigs);
    }

    /**
     * Specifies the type of load balancing policy for selecting a host.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return Specifies the type of load balancing policy for selecting a host.
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * Specifies configuration for the ring*hash policy type.
     * 
     */
    @Import(name="ringHashConfigs")
    private @Nullable Output<List<ConfigEntryServiceResolverLoadBalancerRingHashConfigArgs>> ringHashConfigs;

    /**
     * @return Specifies configuration for the ring*hash policy type.
     * 
     */
    public Optional<Output<List<ConfigEntryServiceResolverLoadBalancerRingHashConfigArgs>>> ringHashConfigs() {
        return Optional.ofNullable(this.ringHashConfigs);
    }

    private ConfigEntryServiceResolverLoadBalancerArgs() {}

    private ConfigEntryServiceResolverLoadBalancerArgs(ConfigEntryServiceResolverLoadBalancerArgs $) {
        this.hashPolicies = $.hashPolicies;
        this.leastRequestConfigs = $.leastRequestConfigs;
        this.policy = $.policy;
        this.ringHashConfigs = $.ringHashConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigEntryServiceResolverLoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigEntryServiceResolverLoadBalancerArgs $;

        public Builder() {
            $ = new ConfigEntryServiceResolverLoadBalancerArgs();
        }

        public Builder(ConfigEntryServiceResolverLoadBalancerArgs defaults) {
            $ = new ConfigEntryServiceResolverLoadBalancerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hashPolicies Specifies a list of hash policies to use for hashing load balancing algorithms. Consul evaluates hash policies individually and combines them so that identical lists result in the same hash.
         * 
         * @return builder
         * 
         */
        public Builder hashPolicies(@Nullable Output<List<ConfigEntryServiceResolverLoadBalancerHashPolicyArgs>> hashPolicies) {
            $.hashPolicies = hashPolicies;
            return this;
        }

        /**
         * @param hashPolicies Specifies a list of hash policies to use for hashing load balancing algorithms. Consul evaluates hash policies individually and combines them so that identical lists result in the same hash.
         * 
         * @return builder
         * 
         */
        public Builder hashPolicies(List<ConfigEntryServiceResolverLoadBalancerHashPolicyArgs> hashPolicies) {
            return hashPolicies(Output.of(hashPolicies));
        }

        /**
         * @param hashPolicies Specifies a list of hash policies to use for hashing load balancing algorithms. Consul evaluates hash policies individually and combines them so that identical lists result in the same hash.
         * 
         * @return builder
         * 
         */
        public Builder hashPolicies(ConfigEntryServiceResolverLoadBalancerHashPolicyArgs... hashPolicies) {
            return hashPolicies(List.of(hashPolicies));
        }

        /**
         * @param leastRequestConfigs Specifies configuration for the least*request policy type.
         * 
         * @return builder
         * 
         */
        public Builder leastRequestConfigs(@Nullable Output<List<ConfigEntryServiceResolverLoadBalancerLeastRequestConfigArgs>> leastRequestConfigs) {
            $.leastRequestConfigs = leastRequestConfigs;
            return this;
        }

        /**
         * @param leastRequestConfigs Specifies configuration for the least*request policy type.
         * 
         * @return builder
         * 
         */
        public Builder leastRequestConfigs(List<ConfigEntryServiceResolverLoadBalancerLeastRequestConfigArgs> leastRequestConfigs) {
            return leastRequestConfigs(Output.of(leastRequestConfigs));
        }

        /**
         * @param leastRequestConfigs Specifies configuration for the least*request policy type.
         * 
         * @return builder
         * 
         */
        public Builder leastRequestConfigs(ConfigEntryServiceResolverLoadBalancerLeastRequestConfigArgs... leastRequestConfigs) {
            return leastRequestConfigs(List.of(leastRequestConfigs));
        }

        /**
         * @param policy Specifies the type of load balancing policy for selecting a host.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy Specifies the type of load balancing policy for selecting a host.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param ringHashConfigs Specifies configuration for the ring*hash policy type.
         * 
         * @return builder
         * 
         */
        public Builder ringHashConfigs(@Nullable Output<List<ConfigEntryServiceResolverLoadBalancerRingHashConfigArgs>> ringHashConfigs) {
            $.ringHashConfigs = ringHashConfigs;
            return this;
        }

        /**
         * @param ringHashConfigs Specifies configuration for the ring*hash policy type.
         * 
         * @return builder
         * 
         */
        public Builder ringHashConfigs(List<ConfigEntryServiceResolverLoadBalancerRingHashConfigArgs> ringHashConfigs) {
            return ringHashConfigs(Output.of(ringHashConfigs));
        }

        /**
         * @param ringHashConfigs Specifies configuration for the ring*hash policy type.
         * 
         * @return builder
         * 
         */
        public Builder ringHashConfigs(ConfigEntryServiceResolverLoadBalancerRingHashConfigArgs... ringHashConfigs) {
            return ringHashConfigs(List.of(ringHashConfigs));
        }

        public ConfigEntryServiceResolverLoadBalancerArgs build() {
            return $;
        }
    }

}