// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Starting with Consul 1.4.0, the consul.AclPolicy can be used to managed Consul ACL policies.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as consul from "@pulumi/consul";
 *
 * const test = new consul.AclPolicy("test", {
 *     datacenters: ["dc1"],
 *     rules: `node_prefix "" {
 *   policy = "read"
 * }
 * `,
 * });
 * ```
 *
 * ## Import
 *
 * `consul_acl_policy` can be imported
 *
 * ```sh
 *  $ pulumi import consul:index/aclPolicy:AclPolicy my-policy 1c90ef03-a6dd-6a8c-ac49-042ad3752896
 * ```
 */
export class AclPolicy extends pulumi.CustomResource {
    /**
     * Get an existing AclPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AclPolicyState, opts?: pulumi.CustomResourceOptions): AclPolicy {
        return new AclPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'consul:index/aclPolicy:AclPolicy';

    /**
     * Returns true if the given object is an instance of AclPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AclPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AclPolicy.__pulumiType;
    }

    /**
     * The datacenters of the policy.
     */
    public readonly datacenters!: pulumi.Output<string[] | undefined>;
    /**
     * The description of the policy.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The name of the policy.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The namespace to create the policy within.
     */
    public readonly namespace!: pulumi.Output<string | undefined>;
    /**
     * The rules of the policy.
     */
    public readonly rules!: pulumi.Output<string>;

    /**
     * Create a AclPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AclPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AclPolicyArgs | AclPolicyState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AclPolicyState | undefined;
            inputs["datacenters"] = state ? state.datacenters : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["namespace"] = state ? state.namespace : undefined;
            inputs["rules"] = state ? state.rules : undefined;
        } else {
            const args = argsOrState as AclPolicyArgs | undefined;
            if ((!args || args.rules === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rules'");
            }
            inputs["datacenters"] = args ? args.datacenters : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["namespace"] = args ? args.namespace : undefined;
            inputs["rules"] = args ? args.rules : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(AclPolicy.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AclPolicy resources.
 */
export interface AclPolicyState {
    /**
     * The datacenters of the policy.
     */
    readonly datacenters?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The description of the policy.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The name of the policy.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The namespace to create the policy within.
     */
    readonly namespace?: pulumi.Input<string>;
    /**
     * The rules of the policy.
     */
    readonly rules?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AclPolicy resource.
 */
export interface AclPolicyArgs {
    /**
     * The datacenters of the policy.
     */
    readonly datacenters?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The description of the policy.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The name of the policy.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The namespace to create the policy within.
     */
    readonly namespace?: pulumi.Input<string>;
    /**
     * The rules of the policy.
     */
    readonly rules: pulumi.Input<string>;
}
