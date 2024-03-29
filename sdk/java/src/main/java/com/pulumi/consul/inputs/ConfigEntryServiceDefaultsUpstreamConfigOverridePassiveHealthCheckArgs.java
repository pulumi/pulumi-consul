// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigEntryServiceDefaultsUpstreamConfigOverridePassiveHealthCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigEntryServiceDefaultsUpstreamConfigOverridePassiveHealthCheckArgs Empty = new ConfigEntryServiceDefaultsUpstreamConfigOverridePassiveHealthCheckArgs();

    /**
     * Specifies the minimum amount of time that an ejected host must remain outside the cluster before rejoining.
     * 
     */
    @Import(name="baseEjectionTime")
    private @Nullable Output<String> baseEjectionTime;

    /**
     * @return Specifies the minimum amount of time that an ejected host must remain outside the cluster before rejoining.
     * 
     */
    public Optional<Output<String>> baseEjectionTime() {
        return Optional.ofNullable(this.baseEjectionTime);
    }

    /**
     * Specifies a percentage that indicates how many times out of 100 that Consul ejects the host when it detects an outlier status.
     * 
     */
    @Import(name="enforcingConsecutive5xx")
    private @Nullable Output<Integer> enforcingConsecutive5xx;

    /**
     * @return Specifies a percentage that indicates how many times out of 100 that Consul ejects the host when it detects an outlier status.
     * 
     */
    public Optional<Output<Integer>> enforcingConsecutive5xx() {
        return Optional.ofNullable(this.enforcingConsecutive5xx);
    }

    /**
     * Specifies the time between checks.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<String> interval;

    /**
     * @return Specifies the time between checks.
     * 
     */
    public Optional<Output<String>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * Specifies the maximum percentage of an upstream cluster that Consul ejects when the proxy reports an outlier.
     * 
     */
    @Import(name="maxEjectionPercent")
    private @Nullable Output<Integer> maxEjectionPercent;

    /**
     * @return Specifies the maximum percentage of an upstream cluster that Consul ejects when the proxy reports an outlier.
     * 
     */
    public Optional<Output<Integer>> maxEjectionPercent() {
        return Optional.ofNullable(this.maxEjectionPercent);
    }

    /**
     * Specifies the number of consecutive failures allowed per check interval. If exceeded, Consul removes the host from the load balancer.
     * 
     */
    @Import(name="maxFailures")
    private @Nullable Output<Integer> maxFailures;

    /**
     * @return Specifies the number of consecutive failures allowed per check interval. If exceeded, Consul removes the host from the load balancer.
     * 
     */
    public Optional<Output<Integer>> maxFailures() {
        return Optional.ofNullable(this.maxFailures);
    }

    private ConfigEntryServiceDefaultsUpstreamConfigOverridePassiveHealthCheckArgs() {}

    private ConfigEntryServiceDefaultsUpstreamConfigOverridePassiveHealthCheckArgs(ConfigEntryServiceDefaultsUpstreamConfigOverridePassiveHealthCheckArgs $) {
        this.baseEjectionTime = $.baseEjectionTime;
        this.enforcingConsecutive5xx = $.enforcingConsecutive5xx;
        this.interval = $.interval;
        this.maxEjectionPercent = $.maxEjectionPercent;
        this.maxFailures = $.maxFailures;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigEntryServiceDefaultsUpstreamConfigOverridePassiveHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigEntryServiceDefaultsUpstreamConfigOverridePassiveHealthCheckArgs $;

        public Builder() {
            $ = new ConfigEntryServiceDefaultsUpstreamConfigOverridePassiveHealthCheckArgs();
        }

        public Builder(ConfigEntryServiceDefaultsUpstreamConfigOverridePassiveHealthCheckArgs defaults) {
            $ = new ConfigEntryServiceDefaultsUpstreamConfigOverridePassiveHealthCheckArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseEjectionTime Specifies the minimum amount of time that an ejected host must remain outside the cluster before rejoining.
         * 
         * @return builder
         * 
         */
        public Builder baseEjectionTime(@Nullable Output<String> baseEjectionTime) {
            $.baseEjectionTime = baseEjectionTime;
            return this;
        }

        /**
         * @param baseEjectionTime Specifies the minimum amount of time that an ejected host must remain outside the cluster before rejoining.
         * 
         * @return builder
         * 
         */
        public Builder baseEjectionTime(String baseEjectionTime) {
            return baseEjectionTime(Output.of(baseEjectionTime));
        }

        /**
         * @param enforcingConsecutive5xx Specifies a percentage that indicates how many times out of 100 that Consul ejects the host when it detects an outlier status.
         * 
         * @return builder
         * 
         */
        public Builder enforcingConsecutive5xx(@Nullable Output<Integer> enforcingConsecutive5xx) {
            $.enforcingConsecutive5xx = enforcingConsecutive5xx;
            return this;
        }

        /**
         * @param enforcingConsecutive5xx Specifies a percentage that indicates how many times out of 100 that Consul ejects the host when it detects an outlier status.
         * 
         * @return builder
         * 
         */
        public Builder enforcingConsecutive5xx(Integer enforcingConsecutive5xx) {
            return enforcingConsecutive5xx(Output.of(enforcingConsecutive5xx));
        }

        /**
         * @param interval Specifies the time between checks.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<String> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval Specifies the time between checks.
         * 
         * @return builder
         * 
         */
        public Builder interval(String interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param maxEjectionPercent Specifies the maximum percentage of an upstream cluster that Consul ejects when the proxy reports an outlier.
         * 
         * @return builder
         * 
         */
        public Builder maxEjectionPercent(@Nullable Output<Integer> maxEjectionPercent) {
            $.maxEjectionPercent = maxEjectionPercent;
            return this;
        }

        /**
         * @param maxEjectionPercent Specifies the maximum percentage of an upstream cluster that Consul ejects when the proxy reports an outlier.
         * 
         * @return builder
         * 
         */
        public Builder maxEjectionPercent(Integer maxEjectionPercent) {
            return maxEjectionPercent(Output.of(maxEjectionPercent));
        }

        /**
         * @param maxFailures Specifies the number of consecutive failures allowed per check interval. If exceeded, Consul removes the host from the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder maxFailures(@Nullable Output<Integer> maxFailures) {
            $.maxFailures = maxFailures;
            return this;
        }

        /**
         * @param maxFailures Specifies the number of consecutive failures allowed per check interval. If exceeded, Consul removes the host from the load balancer.
         * 
         * @return builder
         * 
         */
        public Builder maxFailures(Integer maxFailures) {
            return maxFailures(Output.of(maxFailures));
        }

        public ConfigEntryServiceDefaultsUpstreamConfigOverridePassiveHealthCheckArgs build() {
            return $;
        }
    }

}
