// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as consul from "@pulumi/consul";
 *
 * const web = new consul.ConfigEntryServiceResolver("web", {
 *     name: "web",
 *     defaultSubset: "v1",
 *     connectTimeout: "15s",
 *     subsets: [
 *         {
 *             name: "v1",
 *             filter: "Service.Meta.version == v1",
 *         },
 *         {
 *             name: "v2",
 *             filter: "Service.Meta.version == v2",
 *         },
 *     ],
 *     redirects: [{
 *         service: "web",
 *         datacenter: "dc2",
 *     }],
 *     failovers: [
 *         {
 *             subsetName: "v2",
 *             datacenters: ["dc2"],
 *         },
 *         {
 *             subsetName: "*",
 *             datacenters: [
 *                 "dc3",
 *                 "dc4",
 *             ],
 *         },
 *     ],
 * });
 * ```
 */
export class ConfigEntryServiceResolver extends pulumi.CustomResource {
    /**
     * Get an existing ConfigEntryServiceResolver resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConfigEntryServiceResolverState, opts?: pulumi.CustomResourceOptions): ConfigEntryServiceResolver {
        return new ConfigEntryServiceResolver(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'consul:index/configEntryServiceResolver:ConfigEntryServiceResolver';

    /**
     * Returns true if the given object is an instance of ConfigEntryServiceResolver.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ConfigEntryServiceResolver {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ConfigEntryServiceResolver.__pulumiType;
    }

    /**
     * Specifies the timeout duration for establishing new network connections to this service.
     */
    public readonly connectTimeout!: pulumi.Output<string | undefined>;
    /**
     * Specifies a defined subset of service instances to use when no explicit subset is requested. If this parameter is not specified, Consul uses the unnamed default subset.
     */
    public readonly defaultSubset!: pulumi.Output<string | undefined>;
    /**
     * Specifies controls for rerouting traffic to an alternate pool of service instances if the target service fails.
     */
    public readonly failovers!: pulumi.Output<outputs.ConfigEntryServiceResolverFailover[] | undefined>;
    /**
     * Specifies the load balancing policy and configuration for services issuing requests to this upstream.
     */
    public readonly loadBalancers!: pulumi.Output<outputs.ConfigEntryServiceResolverLoadBalancer[] | undefined>;
    /**
     * Specifies key-value pairs to add to the KV store.
     */
    public readonly meta!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Specifies a name for the configuration entry.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies the namespace that the service resolver applies to.
     */
    public readonly namespace!: pulumi.Output<string | undefined>;
    /**
     * Specifies the admin partition that the service resolver applies to.
     */
    public readonly partition!: pulumi.Output<string | undefined>;
    /**
     * Specifies redirect instructions for local service traffic so that services deployed to a different network location resolve the upstream request instead.
     */
    public readonly redirects!: pulumi.Output<outputs.ConfigEntryServiceResolverRedirect[] | undefined>;
    /**
     * Specifies the timeout duration for receiving an HTTP response from this service.
     */
    public readonly requestTimeout!: pulumi.Output<string | undefined>;
    /**
     * Specifies names for custom service subsets and the conditions under which service instances belong to each subset.
     */
    public readonly subsets!: pulumi.Output<outputs.ConfigEntryServiceResolverSubset[] | undefined>;

    /**
     * Create a ConfigEntryServiceResolver resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ConfigEntryServiceResolverArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConfigEntryServiceResolverArgs | ConfigEntryServiceResolverState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConfigEntryServiceResolverState | undefined;
            resourceInputs["connectTimeout"] = state ? state.connectTimeout : undefined;
            resourceInputs["defaultSubset"] = state ? state.defaultSubset : undefined;
            resourceInputs["failovers"] = state ? state.failovers : undefined;
            resourceInputs["loadBalancers"] = state ? state.loadBalancers : undefined;
            resourceInputs["meta"] = state ? state.meta : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namespace"] = state ? state.namespace : undefined;
            resourceInputs["partition"] = state ? state.partition : undefined;
            resourceInputs["redirects"] = state ? state.redirects : undefined;
            resourceInputs["requestTimeout"] = state ? state.requestTimeout : undefined;
            resourceInputs["subsets"] = state ? state.subsets : undefined;
        } else {
            const args = argsOrState as ConfigEntryServiceResolverArgs | undefined;
            resourceInputs["connectTimeout"] = args ? args.connectTimeout : undefined;
            resourceInputs["defaultSubset"] = args ? args.defaultSubset : undefined;
            resourceInputs["failovers"] = args ? args.failovers : undefined;
            resourceInputs["loadBalancers"] = args ? args.loadBalancers : undefined;
            resourceInputs["meta"] = args ? args.meta : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namespace"] = args ? args.namespace : undefined;
            resourceInputs["partition"] = args ? args.partition : undefined;
            resourceInputs["redirects"] = args ? args.redirects : undefined;
            resourceInputs["requestTimeout"] = args ? args.requestTimeout : undefined;
            resourceInputs["subsets"] = args ? args.subsets : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ConfigEntryServiceResolver.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ConfigEntryServiceResolver resources.
 */
export interface ConfigEntryServiceResolverState {
    /**
     * Specifies the timeout duration for establishing new network connections to this service.
     */
    connectTimeout?: pulumi.Input<string>;
    /**
     * Specifies a defined subset of service instances to use when no explicit subset is requested. If this parameter is not specified, Consul uses the unnamed default subset.
     */
    defaultSubset?: pulumi.Input<string>;
    /**
     * Specifies controls for rerouting traffic to an alternate pool of service instances if the target service fails.
     */
    failovers?: pulumi.Input<pulumi.Input<inputs.ConfigEntryServiceResolverFailover>[]>;
    /**
     * Specifies the load balancing policy and configuration for services issuing requests to this upstream.
     */
    loadBalancers?: pulumi.Input<pulumi.Input<inputs.ConfigEntryServiceResolverLoadBalancer>[]>;
    /**
     * Specifies key-value pairs to add to the KV store.
     */
    meta?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Specifies a name for the configuration entry.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the namespace that the service resolver applies to.
     */
    namespace?: pulumi.Input<string>;
    /**
     * Specifies the admin partition that the service resolver applies to.
     */
    partition?: pulumi.Input<string>;
    /**
     * Specifies redirect instructions for local service traffic so that services deployed to a different network location resolve the upstream request instead.
     */
    redirects?: pulumi.Input<pulumi.Input<inputs.ConfigEntryServiceResolverRedirect>[]>;
    /**
     * Specifies the timeout duration for receiving an HTTP response from this service.
     */
    requestTimeout?: pulumi.Input<string>;
    /**
     * Specifies names for custom service subsets and the conditions under which service instances belong to each subset.
     */
    subsets?: pulumi.Input<pulumi.Input<inputs.ConfigEntryServiceResolverSubset>[]>;
}

/**
 * The set of arguments for constructing a ConfigEntryServiceResolver resource.
 */
export interface ConfigEntryServiceResolverArgs {
    /**
     * Specifies the timeout duration for establishing new network connections to this service.
     */
    connectTimeout?: pulumi.Input<string>;
    /**
     * Specifies a defined subset of service instances to use when no explicit subset is requested. If this parameter is not specified, Consul uses the unnamed default subset.
     */
    defaultSubset?: pulumi.Input<string>;
    /**
     * Specifies controls for rerouting traffic to an alternate pool of service instances if the target service fails.
     */
    failovers?: pulumi.Input<pulumi.Input<inputs.ConfigEntryServiceResolverFailover>[]>;
    /**
     * Specifies the load balancing policy and configuration for services issuing requests to this upstream.
     */
    loadBalancers?: pulumi.Input<pulumi.Input<inputs.ConfigEntryServiceResolverLoadBalancer>[]>;
    /**
     * Specifies key-value pairs to add to the KV store.
     */
    meta?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Specifies a name for the configuration entry.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the namespace that the service resolver applies to.
     */
    namespace?: pulumi.Input<string>;
    /**
     * Specifies the admin partition that the service resolver applies to.
     */
    partition?: pulumi.Input<string>;
    /**
     * Specifies redirect instructions for local service traffic so that services deployed to a different network location resolve the upstream request instead.
     */
    redirects?: pulumi.Input<pulumi.Input<inputs.ConfigEntryServiceResolverRedirect>[]>;
    /**
     * Specifies the timeout duration for receiving an HTTP response from this service.
     */
    requestTimeout?: pulumi.Input<string>;
    /**
     * Specifies names for custom service subsets and the conditions under which service instances belong to each subset.
     */
    subsets?: pulumi.Input<pulumi.Input<inputs.ConfigEntryServiceResolverSubset>[]>;
}
