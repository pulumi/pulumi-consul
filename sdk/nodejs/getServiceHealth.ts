// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `consul.getServiceHealth` can be used to get the list of the instances that
 * are currently healthy, according to their associated  health-checks.
 * The result includes the list of service instances, the node associated to each
 * instance and its health-checks.
 *
 * This resource is likely to change as frequently as the health-checks are being
 * updated, you should expect different results in a frequent basis.
 */
export function getServiceHealth(args: GetServiceHealthArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceHealthResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("consul:index/getServiceHealth:getServiceHealth", {
        "datacenter": args.datacenter,
        "filter": args.filter,
        "name": args.name,
        "near": args.near,
        "nodeMeta": args.nodeMeta,
        "passing": args.passing,
        "tag": args.tag,
        "waitFor": args.waitFor,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceHealth.
 */
export interface GetServiceHealthArgs {
    /**
     * The Consul datacenter to query.
     */
    datacenter?: string;
    /**
     * A filter expression to refine the list of results, see
     * https://www.consul.io/api-docs/features/filtering and https://www.consul.io/api-docs/health#filtering-2.
     */
    filter?: string;
    /**
     * The service name to select.
     */
    name: string;
    /**
     * Specifies a node name to sort the node list in ascending order
     * based on the estimated round trip time from that node.
     */
    near?: string;
    /**
     * Filter the results to nodes with the specified key/value
     * pairs.
     */
    nodeMeta?: {[key: string]: string};
    /**
     * Whether to return only nodes with all checks in the
     * passing state. Defaults to `true`.
     */
    passing?: boolean;
    /**
     * A single tag that can be used to filter the list to return
     * based on a single matching tag.
     */
    tag?: string;
    waitFor?: string;
}

/**
 * A collection of values returned by getServiceHealth.
 */
export interface GetServiceHealthResult {
    /**
     * The datacenter in which the node is running.
     * * [`taggedAddresses`](https://www.consul.io/docs/agent/http/catalog.html#TaggedAddresses) -
     * List of explicit LAN and WAN IP addresses for the agent.
     */
    readonly datacenter?: string;
    readonly filter?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The name of this health-check.
     */
    readonly name: string;
    /**
     * The node to which the result must be sorted to.
     */
    readonly near?: string;
    /**
     * The list of metadata to filter the nodes.
     */
    readonly nodeMeta?: {[key: string]: string};
    /**
     * Whether to return only nodes with all checks in the
     * passing state.
     */
    readonly passing?: boolean;
    /**
     * A list of entries and details about each endpoint advertising a
     * service.  Each element in the list has three attributes: `node`, `service` and
     * `checks`.  The list of the attributes of each one is detailed below.
     */
    readonly results: outputs.GetServiceHealthResult[];
    /**
     * The name of the tag used to filter the list.
     */
    readonly tag?: string;
    readonly waitFor?: string;
}
/**
 * `consul.getServiceHealth` can be used to get the list of the instances that
 * are currently healthy, according to their associated  health-checks.
 * The result includes the list of service instances, the node associated to each
 * instance and its health-checks.
 *
 * This resource is likely to change as frequently as the health-checks are being
 * updated, you should expect different results in a frequent basis.
 */
export function getServiceHealthOutput(args: GetServiceHealthOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetServiceHealthResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("consul:index/getServiceHealth:getServiceHealth", {
        "datacenter": args.datacenter,
        "filter": args.filter,
        "name": args.name,
        "near": args.near,
        "nodeMeta": args.nodeMeta,
        "passing": args.passing,
        "tag": args.tag,
        "waitFor": args.waitFor,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceHealth.
 */
export interface GetServiceHealthOutputArgs {
    /**
     * The Consul datacenter to query.
     */
    datacenter?: pulumi.Input<string>;
    /**
     * A filter expression to refine the list of results, see
     * https://www.consul.io/api-docs/features/filtering and https://www.consul.io/api-docs/health#filtering-2.
     */
    filter?: pulumi.Input<string>;
    /**
     * The service name to select.
     */
    name: pulumi.Input<string>;
    /**
     * Specifies a node name to sort the node list in ascending order
     * based on the estimated round trip time from that node.
     */
    near?: pulumi.Input<string>;
    /**
     * Filter the results to nodes with the specified key/value
     * pairs.
     */
    nodeMeta?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Whether to return only nodes with all checks in the
     * passing state. Defaults to `true`.
     */
    passing?: pulumi.Input<boolean>;
    /**
     * A single tag that can be used to filter the list to return
     * based on a single matching tag.
     */
    tag?: pulumi.Input<string>;
    waitFor?: pulumi.Input<string>;
}
