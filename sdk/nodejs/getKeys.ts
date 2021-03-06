// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * The `consul.Keys` resource reads values from the Consul key/value store.
 * This is a powerful way dynamically set values in templates.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as consul from "@pulumi/consul";
 *
 * const appKeys = pulumi.output(consul.getKeys({
 *     datacenter: "nyc1",
 *     // Read the launch AMI from Consul
 *     keys: [{
 *         default: "ami-1234",
 *         name: "ami",
 *         path: "service/app/launch_ami",
 *     }],
 *     token: "abcd",
 * }, { async: true }));
 * // Start our instance with the dynamic ami value
 * const appInstance = new aws.ec2.Instance("app", {
 *     ami: appKeys.var.ami,
 * });
 * ```
 */
export function getKeys(args?: GetKeysArgs, opts?: pulumi.InvokeOptions): Promise<GetKeysResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("consul:index/getKeys:getKeys", {
        "datacenter": args.datacenter,
        "keys": args.keys,
        "namespace": args.namespace,
        "token": args.token,
    }, opts);
}

/**
 * A collection of arguments for invoking getKeys.
 */
export interface GetKeysArgs {
    /**
     * The datacenter to use. This overrides the
     * agent's default datacenter and the datacenter in the provider setup.
     */
    readonly datacenter?: string;
    /**
     * Specifies a key in Consul to be read. Supported
     * values documented below. Multiple blocks supported.
     */
    readonly keys?: inputs.GetKeysKey[];
    /**
     * The namespace to lookup the keys.
     */
    readonly namespace?: string;
    /**
     * The ACL token to use. This overrides the
     * token that the agent provides by default.
     */
    readonly token?: string;
}

/**
 * A collection of values returned by getKeys.
 */
export interface GetKeysResult {
    /**
     * The datacenter the keys are being read from.
     * * `var.<name>` - For each name given, the corresponding attribute
     * has the value of the key.
     */
    readonly datacenter: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly keys?: outputs.GetKeysKey[];
    readonly namespace?: string;
    readonly token?: string;
    readonly var: {[key: string]: string};
}
