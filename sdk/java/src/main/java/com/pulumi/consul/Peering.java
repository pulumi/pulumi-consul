// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul;

import com.pulumi.consul.PeeringArgs;
import com.pulumi.consul.Utilities;
import com.pulumi.consul.inputs.PeeringState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * [Cluster Peering](https://www.consul.io/docs/connect/cluster-peering) can be used to create connections between two or more independent clusters so that services deployed to different partitions or datacenters can communicate.
 * 
 * The `cluster_peering` resource can be used to establish the peering after a peering token has been generated.
 * 
 * &gt; **Cluster peering is currently in technical preview:** Functionality associated with cluster peering is subject to change. You should never use the technical preview release in secure environments or production scenarios. Features in technical preview may have performance issues, scaling issues, and limited support.
 * 
 * The functionality described here is available only in Consul version 1.13.0 and later.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="consul:index/peering:Peering")
public class Peering extends com.pulumi.resources.CustomResource {
    @Export(name="deletedAt", type=String.class, parameters={})
    private Output<String> deletedAt;

    public Output<String> deletedAt() {
        return this.deletedAt;
    }
    /**
     * Specifies KV metadata to associate with the peering. This parameter is not required and does not directly impact the
     * cluster peering process.
     * 
     */
    @Export(name="meta", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> meta;

    /**
     * @return Specifies KV metadata to associate with the peering. This parameter is not required and does not directly impact the
     * cluster peering process.
     * 
     */
    public Output<Optional<Map<String,String>>> meta() {
        return Codegen.optional(this.meta);
    }
    @Export(name="partition", type=String.class, parameters={})
    private Output</* @Nullable */ String> partition;

    public Output<Optional<String>> partition() {
        return Codegen.optional(this.partition);
    }
    @Export(name="peerCaPems", type=List.class, parameters={String.class})
    private Output<List<String>> peerCaPems;

    public Output<List<String>> peerCaPems() {
        return this.peerCaPems;
    }
    @Export(name="peerId", type=String.class, parameters={})
    private Output<String> peerId;

    public Output<String> peerId() {
        return this.peerId;
    }
    /**
     * The name assigned to the peer cluster. The `peer_name` is used to reference the peer cluster in service discovery
     * queries and configuration entries such as `service-intentions`. This field must be a valid DNS hostname label.
     * 
     */
    @Export(name="peerName", type=String.class, parameters={})
    private Output<String> peerName;

    /**
     * @return The name assigned to the peer cluster. The `peer_name` is used to reference the peer cluster in service discovery
     * queries and configuration entries such as `service-intentions`. This field must be a valid DNS hostname label.
     * 
     */
    public Output<String> peerName() {
        return this.peerName;
    }
    @Export(name="peerServerAddresses", type=List.class, parameters={String.class})
    private Output<List<String>> peerServerAddresses;

    public Output<List<String>> peerServerAddresses() {
        return this.peerServerAddresses;
    }
    @Export(name="peerServerName", type=String.class, parameters={})
    private Output<String> peerServerName;

    public Output<String> peerServerName() {
        return this.peerServerName;
    }
    /**
     * The peering token fetched from the peer cluster.
     * 
     */
    @Export(name="peeringToken", type=String.class, parameters={})
    private Output<String> peeringToken;

    /**
     * @return The peering token fetched from the peer cluster.
     * 
     */
    public Output<String> peeringToken() {
        return this.peeringToken;
    }
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Peering(String name) {
        this(name, PeeringArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Peering(String name, PeeringArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Peering(String name, PeeringArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("consul:index/peering:Peering", name, args == null ? PeeringArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Peering(String name, Output<String> id, @Nullable PeeringState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("consul:index/peering:Peering", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Peering get(String name, Output<String> id, @Nullable PeeringState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Peering(name, id, state, options);
    }
}