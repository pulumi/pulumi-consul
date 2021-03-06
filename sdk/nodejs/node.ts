// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides access to Node data in Consul. This can be used to define a
 * node. Currently, defining health checks is not supported.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as consul from "@pulumi/consul";
 *
 * const foobar = new consul.Node("foobar", {
 *     address: "192.168.10.10",
 * });
 * ```
 */
export class Node extends pulumi.CustomResource {
    /**
     * Get an existing Node resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NodeState, opts?: pulumi.CustomResourceOptions): Node {
        return new Node(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'consul:index/node:Node';

    /**
     * Returns true if the given object is an instance of Node.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Node {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Node.__pulumiType;
    }

    /**
     * The address of the node being added to,
     * or referenced in the catalog.
     */
    public readonly address!: pulumi.Output<string>;
    /**
     * The datacenter to use. This overrides the agent's
     * default datacenter and the datacenter in the provider setup.
     */
    public readonly datacenter!: pulumi.Output<string>;
    /**
     * Key/value pairs that are associated with the node.
     */
    public readonly meta!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The name of the node being added to, or
     * referenced in the catalog.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly token!: pulumi.Output<string | undefined>;

    /**
     * Create a Node resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NodeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NodeArgs | NodeState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NodeState | undefined;
            inputs["address"] = state ? state.address : undefined;
            inputs["datacenter"] = state ? state.datacenter : undefined;
            inputs["meta"] = state ? state.meta : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["token"] = state ? state.token : undefined;
        } else {
            const args = argsOrState as NodeArgs | undefined;
            if ((!args || args.address === undefined) && !opts.urn) {
                throw new Error("Missing required property 'address'");
            }
            inputs["address"] = args ? args.address : undefined;
            inputs["datacenter"] = args ? args.datacenter : undefined;
            inputs["meta"] = args ? args.meta : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["token"] = args ? args.token : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Node.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Node resources.
 */
export interface NodeState {
    /**
     * The address of the node being added to,
     * or referenced in the catalog.
     */
    readonly address?: pulumi.Input<string>;
    /**
     * The datacenter to use. This overrides the agent's
     * default datacenter and the datacenter in the provider setup.
     */
    readonly datacenter?: pulumi.Input<string>;
    /**
     * Key/value pairs that are associated with the node.
     */
    readonly meta?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the node being added to, or
     * referenced in the catalog.
     */
    readonly name?: pulumi.Input<string>;
    readonly token?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Node resource.
 */
export interface NodeArgs {
    /**
     * The address of the node being added to,
     * or referenced in the catalog.
     */
    readonly address: pulumi.Input<string>;
    /**
     * The datacenter to use. This overrides the agent's
     * default datacenter and the datacenter in the provider setup.
     */
    readonly datacenter?: pulumi.Input<string>;
    /**
     * Key/value pairs that are associated with the node.
     */
    readonly meta?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the node being added to, or
     * referenced in the catalog.
     */
    readonly name?: pulumi.Input<string>;
    readonly token?: pulumi.Input<string>;
}
