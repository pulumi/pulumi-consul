// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PeeringArgs extends com.pulumi.resources.ResourceArgs {

    public static final PeeringArgs Empty = new PeeringArgs();

    /**
     * Specifies KV metadata to associate with the peering. This parameter is not required and does not directly impact the
     * cluster peering process.
     * 
     */
    @Import(name="meta")
    private @Nullable Output<Map<String,String>> meta;

    /**
     * @return Specifies KV metadata to associate with the peering. This parameter is not required and does not directly impact the
     * cluster peering process.
     * 
     */
    public Optional<Output<Map<String,String>>> meta() {
        return Optional.ofNullable(this.meta);
    }

    @Import(name="partition")
    private @Nullable Output<String> partition;

    public Optional<Output<String>> partition() {
        return Optional.ofNullable(this.partition);
    }

    /**
     * The name assigned to the peer cluster. The `peer_name` is used to reference the peer cluster in service discovery
     * queries and configuration entries such as `service-intentions`. This field must be a valid DNS hostname label.
     * 
     */
    @Import(name="peerName", required=true)
    private Output<String> peerName;

    /**
     * @return The name assigned to the peer cluster. The `peer_name` is used to reference the peer cluster in service discovery
     * queries and configuration entries such as `service-intentions`. This field must be a valid DNS hostname label.
     * 
     */
    public Output<String> peerName() {
        return this.peerName;
    }

    /**
     * The peering token fetched from the peer cluster.
     * 
     */
    @Import(name="peeringToken", required=true)
    private Output<String> peeringToken;

    /**
     * @return The peering token fetched from the peer cluster.
     * 
     */
    public Output<String> peeringToken() {
        return this.peeringToken;
    }

    private PeeringArgs() {}

    private PeeringArgs(PeeringArgs $) {
        this.meta = $.meta;
        this.partition = $.partition;
        this.peerName = $.peerName;
        this.peeringToken = $.peeringToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PeeringArgs $;

        public Builder() {
            $ = new PeeringArgs();
        }

        public Builder(PeeringArgs defaults) {
            $ = new PeeringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param meta Specifies KV metadata to associate with the peering. This parameter is not required and does not directly impact the
         * cluster peering process.
         * 
         * @return builder
         * 
         */
        public Builder meta(@Nullable Output<Map<String,String>> meta) {
            $.meta = meta;
            return this;
        }

        /**
         * @param meta Specifies KV metadata to associate with the peering. This parameter is not required and does not directly impact the
         * cluster peering process.
         * 
         * @return builder
         * 
         */
        public Builder meta(Map<String,String> meta) {
            return meta(Output.of(meta));
        }

        public Builder partition(@Nullable Output<String> partition) {
            $.partition = partition;
            return this;
        }

        public Builder partition(String partition) {
            return partition(Output.of(partition));
        }

        /**
         * @param peerName The name assigned to the peer cluster. The `peer_name` is used to reference the peer cluster in service discovery
         * queries and configuration entries such as `service-intentions`. This field must be a valid DNS hostname label.
         * 
         * @return builder
         * 
         */
        public Builder peerName(Output<String> peerName) {
            $.peerName = peerName;
            return this;
        }

        /**
         * @param peerName The name assigned to the peer cluster. The `peer_name` is used to reference the peer cluster in service discovery
         * queries and configuration entries such as `service-intentions`. This field must be a valid DNS hostname label.
         * 
         * @return builder
         * 
         */
        public Builder peerName(String peerName) {
            return peerName(Output.of(peerName));
        }

        /**
         * @param peeringToken The peering token fetched from the peer cluster.
         * 
         * @return builder
         * 
         */
        public Builder peeringToken(Output<String> peeringToken) {
            $.peeringToken = peeringToken;
            return this;
        }

        /**
         * @param peeringToken The peering token fetched from the peer cluster.
         * 
         * @return builder
         * 
         */
        public Builder peeringToken(String peeringToken) {
            return peeringToken(Output.of(peeringToken));
        }

        public PeeringArgs build() {
            $.peerName = Objects.requireNonNull($.peerName, "expected parameter 'peerName' to be non-null");
            $.peeringToken = Objects.requireNonNull($.peeringToken, "expected parameter 'peeringToken' to be non-null");
            return $;
        }
    }

}