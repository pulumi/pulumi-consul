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
 * const basic = consul.getPeering({
 *     peerName: "peered-cluster",
 * });
 * ```
 */
export function getPeering(args: GetPeeringArgs, opts?: pulumi.InvokeOptions): Promise<GetPeeringResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("consul:index/getPeering:getPeering", {
        "partition": args.partition,
        "peerName": args.peerName,
    }, opts);
}

/**
 * A collection of arguments for invoking getPeering.
 */
export interface GetPeeringArgs {
    partition?: string;
    peerName: string;
}

/**
 * A collection of values returned by getPeering.
 */
export interface GetPeeringResult {
    readonly deletedAt: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly meta: {[key: string]: string};
    readonly partition?: string;
    readonly peerCaPems: string[];
    readonly peerId: string;
    readonly peerName: string;
    readonly peerServerAddresses: string[];
    readonly peerServerName: string;
    readonly state: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as consul from "@pulumi/consul";
 *
 * const basic = consul.getPeering({
 *     peerName: "peered-cluster",
 * });
 * ```
 */
export function getPeeringOutput(args: GetPeeringOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPeeringResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("consul:index/getPeering:getPeering", {
        "partition": args.partition,
        "peerName": args.peerName,
    }, opts);
}

/**
 * A collection of arguments for invoking getPeering.
 */
export interface GetPeeringOutputArgs {
    partition?: pulumi.Input<string>;
    peerName: pulumi.Input<string>;
}
