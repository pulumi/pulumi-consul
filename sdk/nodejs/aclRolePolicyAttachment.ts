// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as consul from "@pulumi/consul";
 *
 * const myRole = consul.getAclRole({
 *     name: "my_role",
 * });
 * const readPolicy = new consul.AclPolicy("read_policy", {
 *     name: "read-policy",
 *     rules: "node \"\" { policy = \"read\" }",
 *     datacenters: ["dc1"],
 * });
 * const myRoleReadPolicy = new consul.AclRolePolicyAttachment("my_role_read_policy", {
 *     roleId: test.id,
 *     policy: readPolicy.name,
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import consul:index/aclRolePolicyAttachment:AclRolePolicyAttachment my_role_read_policy 624d94ca-bc5c-f960-4e83-0a609cf588be:policy_name
 * ```
 */
export class AclRolePolicyAttachment extends pulumi.CustomResource {
    /**
     * Get an existing AclRolePolicyAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AclRolePolicyAttachmentState, opts?: pulumi.CustomResourceOptions): AclRolePolicyAttachment {
        return new AclRolePolicyAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'consul:index/aclRolePolicyAttachment:AclRolePolicyAttachment';

    /**
     * Returns true if the given object is an instance of AclRolePolicyAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AclRolePolicyAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AclRolePolicyAttachment.__pulumiType;
    }

    /**
     * The policy name.
     */
    public readonly policy!: pulumi.Output<string>;
    /**
     * The id of the role.
     */
    public readonly roleId!: pulumi.Output<string>;

    /**
     * Create a AclRolePolicyAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AclRolePolicyAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AclRolePolicyAttachmentArgs | AclRolePolicyAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AclRolePolicyAttachmentState | undefined;
            resourceInputs["policy"] = state ? state.policy : undefined;
            resourceInputs["roleId"] = state ? state.roleId : undefined;
        } else {
            const args = argsOrState as AclRolePolicyAttachmentArgs | undefined;
            if ((!args || args.policy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policy'");
            }
            if ((!args || args.roleId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleId'");
            }
            resourceInputs["policy"] = args ? args.policy : undefined;
            resourceInputs["roleId"] = args ? args.roleId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AclRolePolicyAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AclRolePolicyAttachment resources.
 */
export interface AclRolePolicyAttachmentState {
    /**
     * The policy name.
     */
    policy?: pulumi.Input<string>;
    /**
     * The id of the role.
     */
    roleId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AclRolePolicyAttachment resource.
 */
export interface AclRolePolicyAttachmentArgs {
    /**
     * The policy name.
     */
    policy: pulumi.Input<string>;
    /**
     * The id of the role.
     */
    roleId: pulumi.Input<string>;
}
