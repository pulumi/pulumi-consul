// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * > **NOTE:** This feature requires [Consul Enterprise](https://www.consul.io/docs/enterprise/index.html).
 *
 * The `consul..NetworkArea` resource manages a relationship between servers in two
 * different Consul datacenters.
 *
 * Unlike Consul's WAN feature, network areas use just the server RPC port for
 * communication, and relationships can be made between independent pairs of
 * datacenters, so not all servers need to be fully connected. This allows for
 * complex topologies among Consul datacenters like hub/spoke and more general trees.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as consul from "@pulumi/consul";
 *
 * const dc2 = new consul.NetworkArea("dc2", {
 *     peerDatacenter: "dc2",
 *     retryJoins: ["1.2.3.4"],
 *     useTls: true,
 * });
 * ```
 */
export class NetworkArea extends pulumi.CustomResource {
    /**
     * Get an existing NetworkArea resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkAreaState, opts?: pulumi.CustomResourceOptions): NetworkArea {
        return new NetworkArea(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'consul:index/networkArea:NetworkArea';

    /**
     * Returns true if the given object is an instance of NetworkArea.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkArea {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkArea.__pulumiType;
    }

    /**
     * The datacenter to use. This overrides the
     * agent's default datacenter and the datacenter in the provider setup.
     */
    public readonly datacenter!: pulumi.Output<string>;
    /**
     * The name of the Consul datacenter that will be
     * joined to form the area.
     */
    public readonly peerDatacenter!: pulumi.Output<string>;
    /**
     * Specifies a list of Consul servers to attempt to
     * join. Servers can be given as `IP`, `IP:port`, `hostname`, or `hostname:port`.
     */
    public readonly retryJoins!: pulumi.Output<string[] | undefined>;
    /**
     * The ACL token to use. This overrides the
     * token that the agent provides by default.
     */
    public readonly token!: pulumi.Output<string | undefined>;
    /**
     * Specifies whether gossip over this area should be
     * encrypted with TLS if possible. Defaults to `false`.
     */
    public readonly useTls!: pulumi.Output<boolean | undefined>;

    /**
     * Create a NetworkArea resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkAreaArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkAreaArgs | NetworkAreaState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as NetworkAreaState | undefined;
            inputs["datacenter"] = state ? state.datacenter : undefined;
            inputs["peerDatacenter"] = state ? state.peerDatacenter : undefined;
            inputs["retryJoins"] = state ? state.retryJoins : undefined;
            inputs["token"] = state ? state.token : undefined;
            inputs["useTls"] = state ? state.useTls : undefined;
        } else {
            const args = argsOrState as NetworkAreaArgs | undefined;
            if (!args || args.peerDatacenter === undefined) {
                throw new Error("Missing required property 'peerDatacenter'");
            }
            inputs["datacenter"] = args ? args.datacenter : undefined;
            inputs["peerDatacenter"] = args ? args.peerDatacenter : undefined;
            inputs["retryJoins"] = args ? args.retryJoins : undefined;
            inputs["token"] = args ? args.token : undefined;
            inputs["useTls"] = args ? args.useTls : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(NetworkArea.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkArea resources.
 */
export interface NetworkAreaState {
    /**
     * The datacenter to use. This overrides the
     * agent's default datacenter and the datacenter in the provider setup.
     */
    readonly datacenter?: pulumi.Input<string>;
    /**
     * The name of the Consul datacenter that will be
     * joined to form the area.
     */
    readonly peerDatacenter?: pulumi.Input<string>;
    /**
     * Specifies a list of Consul servers to attempt to
     * join. Servers can be given as `IP`, `IP:port`, `hostname`, or `hostname:port`.
     */
    readonly retryJoins?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ACL token to use. This overrides the
     * token that the agent provides by default.
     */
    readonly token?: pulumi.Input<string>;
    /**
     * Specifies whether gossip over this area should be
     * encrypted with TLS if possible. Defaults to `false`.
     */
    readonly useTls?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a NetworkArea resource.
 */
export interface NetworkAreaArgs {
    /**
     * The datacenter to use. This overrides the
     * agent's default datacenter and the datacenter in the provider setup.
     */
    readonly datacenter?: pulumi.Input<string>;
    /**
     * The name of the Consul datacenter that will be
     * joined to form the area.
     */
    readonly peerDatacenter: pulumi.Input<string>;
    /**
     * Specifies a list of Consul servers to attempt to
     * join. Servers can be given as `IP`, `IP:port`, `hostname`, or `hostname:port`.
     */
    readonly retryJoins?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ACL token to use. This overrides the
     * token that the agent provides by default.
     */
    readonly token?: pulumi.Input<string>;
    /**
     * Specifies whether gossip over this area should be
     * encrypted with TLS if possible. Defaults to `false`.
     */
    readonly useTls?: pulumi.Input<boolean>;
}