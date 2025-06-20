// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * > **NOTE:** This feature requires [Consul Enterprise](https://www.consul.io/docs/enterprise/index.html).
 *
 * The `consul.License` resource provides datacenter-level management of
 * the Consul Enterprise license. If ACLs are enabled then a token with operator
 * privileges may be required in order to use this command.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as consul from "@pulumi/consul";
 * import * as std from "@pulumi/std";
 *
 * const license = new consul.License("license", {license: std.file({
 *     input: "license.hclic",
 * }).then(invoke => invoke.result)});
 * ```
 */
export class License extends pulumi.CustomResource {
    /**
     * Get an existing License resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LicenseState, opts?: pulumi.CustomResourceOptions): License {
        return new License(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'consul:index/license:License';

    /**
     * Returns true if the given object is an instance of License.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is License {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === License.__pulumiType;
    }

    /**
     * The ID of the customer the license is attached to.
     */
    public /*out*/ readonly customerId!: pulumi.Output<string>;
    /**
     * The datacenter to use. This overrides the
     * agent's default datacenter and the datacenter in the provider setup.
     */
    public readonly datacenter!: pulumi.Output<string | undefined>;
    /**
     * The expiration time of the license.
     */
    public /*out*/ readonly expirationTime!: pulumi.Output<string>;
    /**
     * The features for which the license is valid.
     */
    public /*out*/ readonly features!: pulumi.Output<string[]>;
    /**
     * The ID of the current installation.
     */
    public /*out*/ readonly installationId!: pulumi.Output<string>;
    /**
     * The date the license was issued.
     */
    public /*out*/ readonly issueTime!: pulumi.Output<string>;
    /**
     * The Consul license to use.
     */
    public readonly license!: pulumi.Output<string>;
    /**
     * The ID of the license used.
     */
    public /*out*/ readonly licenseId!: pulumi.Output<string>;
    /**
     * The product for which the license is valid.
     */
    public /*out*/ readonly product!: pulumi.Output<string>;
    /**
     * The start time of the license.
     */
    public /*out*/ readonly startTime!: pulumi.Output<string>;
    /**
     * Whether the license is valid.
     */
    public /*out*/ readonly valid!: pulumi.Output<boolean>;
    /**
     * A list of warning messages regarding the license validity.
     */
    public /*out*/ readonly warnings!: pulumi.Output<string[]>;

    /**
     * Create a License resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LicenseArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LicenseArgs | LicenseState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LicenseState | undefined;
            resourceInputs["customerId"] = state ? state.customerId : undefined;
            resourceInputs["datacenter"] = state ? state.datacenter : undefined;
            resourceInputs["expirationTime"] = state ? state.expirationTime : undefined;
            resourceInputs["features"] = state ? state.features : undefined;
            resourceInputs["installationId"] = state ? state.installationId : undefined;
            resourceInputs["issueTime"] = state ? state.issueTime : undefined;
            resourceInputs["license"] = state ? state.license : undefined;
            resourceInputs["licenseId"] = state ? state.licenseId : undefined;
            resourceInputs["product"] = state ? state.product : undefined;
            resourceInputs["startTime"] = state ? state.startTime : undefined;
            resourceInputs["valid"] = state ? state.valid : undefined;
            resourceInputs["warnings"] = state ? state.warnings : undefined;
        } else {
            const args = argsOrState as LicenseArgs | undefined;
            if ((!args || args.license === undefined) && !opts.urn) {
                throw new Error("Missing required property 'license'");
            }
            resourceInputs["datacenter"] = args ? args.datacenter : undefined;
            resourceInputs["license"] = args?.license ? pulumi.secret(args.license) : undefined;
            resourceInputs["customerId"] = undefined /*out*/;
            resourceInputs["expirationTime"] = undefined /*out*/;
            resourceInputs["features"] = undefined /*out*/;
            resourceInputs["installationId"] = undefined /*out*/;
            resourceInputs["issueTime"] = undefined /*out*/;
            resourceInputs["licenseId"] = undefined /*out*/;
            resourceInputs["product"] = undefined /*out*/;
            resourceInputs["startTime"] = undefined /*out*/;
            resourceInputs["valid"] = undefined /*out*/;
            resourceInputs["warnings"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["license"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(License.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering License resources.
 */
export interface LicenseState {
    /**
     * The ID of the customer the license is attached to.
     */
    customerId?: pulumi.Input<string>;
    /**
     * The datacenter to use. This overrides the
     * agent's default datacenter and the datacenter in the provider setup.
     */
    datacenter?: pulumi.Input<string>;
    /**
     * The expiration time of the license.
     */
    expirationTime?: pulumi.Input<string>;
    /**
     * The features for which the license is valid.
     */
    features?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the current installation.
     */
    installationId?: pulumi.Input<string>;
    /**
     * The date the license was issued.
     */
    issueTime?: pulumi.Input<string>;
    /**
     * The Consul license to use.
     */
    license?: pulumi.Input<string>;
    /**
     * The ID of the license used.
     */
    licenseId?: pulumi.Input<string>;
    /**
     * The product for which the license is valid.
     */
    product?: pulumi.Input<string>;
    /**
     * The start time of the license.
     */
    startTime?: pulumi.Input<string>;
    /**
     * Whether the license is valid.
     */
    valid?: pulumi.Input<boolean>;
    /**
     * A list of warning messages regarding the license validity.
     */
    warnings?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a License resource.
 */
export interface LicenseArgs {
    /**
     * The datacenter to use. This overrides the
     * agent's default datacenter and the datacenter in the provider setup.
     */
    datacenter?: pulumi.Input<string>;
    /**
     * The Consul license to use.
     */
    license: pulumi.Input<string>;
}
