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
 * // Creates a prepared query myquery.query.consul that finds the nearest
 * // healthy myapp.service.consul instance that has the active tag and not
 * // the standby tag.
 * const myapp_query = new consul.PreparedQuery("myapp-query", {
 *     name: "myquery",
 *     datacenter: "us-central1",
 *     token: "abcd",
 *     storedToken: "wxyz",
 *     onlyPassing: true,
 *     near: "_agent",
 *     service: "myapp",
 *     tags: [
 *         "active",
 *         "!standby",
 *     ],
 *     failover: {
 *         nearestN: 3,
 *         datacenters: [
 *             "us-west1",
 *             "us-east-2",
 *             "asia-east1",
 *         ],
 *     },
 *     dns: {
 *         ttl: "30s",
 *     },
 * });
 * // Creates a Prepared Query Template that matches *-near-self.query.consul
 * // and finds the nearest service that matches the glob character (e.g.
 * // foo-near-self.query.consul will find the nearest healthy foo.service.consul).
 * const service_near_self = new consul.PreparedQuery("service-near-self", {
 *     datacenter: "nyc1",
 *     token: "abcd",
 *     storedToken: "wxyz",
 *     name: "",
 *     onlyPassing: true,
 *     connect: true,
 *     near: "_agent",
 *     template: {
 *         type: "name_prefix_match",
 *         regexp: "^(.*)-near-self$",
 *     },
 *     service: "${match(1)}",
 *     failover: {
 *         nearestN: 3,
 *         datacenters: [
 *             "dc2",
 *             "dc3",
 *             "dc4",
 *         ],
 *     },
 *     dns: {
 *         ttl: "5m",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import consul:index/preparedQuery:PreparedQuery my_service 71ecfb82-717a-4258-b4b6-2fb75144d856
 * ```
 */
export class PreparedQuery extends pulumi.CustomResource {
    /**
     * Get an existing PreparedQuery resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PreparedQueryState, opts?: pulumi.CustomResourceOptions): PreparedQuery {
        return new PreparedQuery(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'consul:index/preparedQuery:PreparedQuery';

    /**
     * Returns true if the given object is an instance of PreparedQuery.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PreparedQuery {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PreparedQuery.__pulumiType;
    }

    /**
     * When `true` the prepared query will return connect proxy services for a queried service.  Conditions such as `tags` in the prepared query will be matched against the proxy service. Defaults to false.
     */
    public readonly connect!: pulumi.Output<boolean | undefined>;
    /**
     * The datacenter to use. This overrides the agent's default datacenter and the datacenter in the provider setup.
     */
    public readonly datacenter!: pulumi.Output<string | undefined>;
    /**
     * Settings for controlling the DNS response details.
     */
    public readonly dns!: pulumi.Output<outputs.PreparedQueryDns | undefined>;
    /**
     * Options for controlling behavior when no healthy nodes are available in the local DC.
     */
    public readonly failover!: pulumi.Output<outputs.PreparedQueryFailover | undefined>;
    /**
     * Specifies a list of check IDs that should be ignored when filtering unhealthy instances. This is mostly useful in an emergency or as a temporary measure when a health check is found to be unreliable. Being able to ignore it in centrally-defined queries can be simpler than de-registering the check as an interim solution until the check can be fixed.
     */
    public readonly ignoreCheckIds!: pulumi.Output<string[] | undefined>;
    /**
     * The name of the prepared query. Used to identify the prepared query during requests. Can be specified as an empty string to configure the query as a catch-all.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Allows specifying the name of a node to sort results near using Consul's distance sorting and network coordinates. The magic `_agent` value can be used to always sort nearest the node servicing the request.
     */
    public readonly near!: pulumi.Output<string | undefined>;
    /**
     * Specifies a list of user-defined key/value pairs that will be used for filtering the query results to nodes with the given metadata values present.
     */
    public readonly nodeMeta!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * When `true`, the prepared query will only return nodes with passing health checks in the result.
     */
    public readonly onlyPassing!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the service to query
     */
    public readonly service!: pulumi.Output<string>;
    /**
     * Specifies a list of user-defined key/value pairs that will be used for filtering the query results to services with the given metadata values present.
     */
    public readonly serviceMeta!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The name of the Consul session to tie this query's lifetime to.  This is an advanced parameter that should not be used without a complete understanding of Consul sessions and the implications of their use (it is recommended to leave this blank in nearly all cases).  If this parameter is omitted the query will not expire.
     */
    public readonly session!: pulumi.Output<string | undefined>;
    /**
     * The ACL token to store with the prepared query. This token will be used by default whenever the query is executed.
     */
    public readonly storedToken!: pulumi.Output<string | undefined>;
    /**
     * The list of required and/or disallowed tags.  If a tag is in this list it must be present.  If the tag is preceded with a "!" then it is disallowed.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * Query templating options. This is used to make a single prepared query respond to many different requests
     */
    public readonly template!: pulumi.Output<outputs.PreparedQueryTemplate | undefined>;
    /**
     * The ACL token to use when saving the prepared query. This overrides the token that the agent provides by default.
     *
     * @deprecated The token argument has been deprecated and will be removed in a future release.
Please use the token argument in the provider configuration
     */
    public readonly token!: pulumi.Output<string | undefined>;

    /**
     * Create a PreparedQuery resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PreparedQueryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PreparedQueryArgs | PreparedQueryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PreparedQueryState | undefined;
            resourceInputs["connect"] = state ? state.connect : undefined;
            resourceInputs["datacenter"] = state ? state.datacenter : undefined;
            resourceInputs["dns"] = state ? state.dns : undefined;
            resourceInputs["failover"] = state ? state.failover : undefined;
            resourceInputs["ignoreCheckIds"] = state ? state.ignoreCheckIds : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["near"] = state ? state.near : undefined;
            resourceInputs["nodeMeta"] = state ? state.nodeMeta : undefined;
            resourceInputs["onlyPassing"] = state ? state.onlyPassing : undefined;
            resourceInputs["service"] = state ? state.service : undefined;
            resourceInputs["serviceMeta"] = state ? state.serviceMeta : undefined;
            resourceInputs["session"] = state ? state.session : undefined;
            resourceInputs["storedToken"] = state ? state.storedToken : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["template"] = state ? state.template : undefined;
            resourceInputs["token"] = state ? state.token : undefined;
        } else {
            const args = argsOrState as PreparedQueryArgs | undefined;
            if ((!args || args.service === undefined) && !opts.urn) {
                throw new Error("Missing required property 'service'");
            }
            resourceInputs["connect"] = args ? args.connect : undefined;
            resourceInputs["datacenter"] = args ? args.datacenter : undefined;
            resourceInputs["dns"] = args ? args.dns : undefined;
            resourceInputs["failover"] = args ? args.failover : undefined;
            resourceInputs["ignoreCheckIds"] = args ? args.ignoreCheckIds : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["near"] = args ? args.near : undefined;
            resourceInputs["nodeMeta"] = args ? args.nodeMeta : undefined;
            resourceInputs["onlyPassing"] = args ? args.onlyPassing : undefined;
            resourceInputs["service"] = args ? args.service : undefined;
            resourceInputs["serviceMeta"] = args ? args.serviceMeta : undefined;
            resourceInputs["session"] = args ? args.session : undefined;
            resourceInputs["storedToken"] = args ? args.storedToken : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["template"] = args ? args.template : undefined;
            resourceInputs["token"] = args?.token ? pulumi.secret(args.token) : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["token"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(PreparedQuery.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PreparedQuery resources.
 */
export interface PreparedQueryState {
    /**
     * When `true` the prepared query will return connect proxy services for a queried service.  Conditions such as `tags` in the prepared query will be matched against the proxy service. Defaults to false.
     */
    connect?: pulumi.Input<boolean>;
    /**
     * The datacenter to use. This overrides the agent's default datacenter and the datacenter in the provider setup.
     */
    datacenter?: pulumi.Input<string>;
    /**
     * Settings for controlling the DNS response details.
     */
    dns?: pulumi.Input<inputs.PreparedQueryDns>;
    /**
     * Options for controlling behavior when no healthy nodes are available in the local DC.
     */
    failover?: pulumi.Input<inputs.PreparedQueryFailover>;
    /**
     * Specifies a list of check IDs that should be ignored when filtering unhealthy instances. This is mostly useful in an emergency or as a temporary measure when a health check is found to be unreliable. Being able to ignore it in centrally-defined queries can be simpler than de-registering the check as an interim solution until the check can be fixed.
     */
    ignoreCheckIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the prepared query. Used to identify the prepared query during requests. Can be specified as an empty string to configure the query as a catch-all.
     */
    name?: pulumi.Input<string>;
    /**
     * Allows specifying the name of a node to sort results near using Consul's distance sorting and network coordinates. The magic `_agent` value can be used to always sort nearest the node servicing the request.
     */
    near?: pulumi.Input<string>;
    /**
     * Specifies a list of user-defined key/value pairs that will be used for filtering the query results to nodes with the given metadata values present.
     */
    nodeMeta?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * When `true`, the prepared query will only return nodes with passing health checks in the result.
     */
    onlyPassing?: pulumi.Input<boolean>;
    /**
     * The name of the service to query
     */
    service?: pulumi.Input<string>;
    /**
     * Specifies a list of user-defined key/value pairs that will be used for filtering the query results to services with the given metadata values present.
     */
    serviceMeta?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the Consul session to tie this query's lifetime to.  This is an advanced parameter that should not be used without a complete understanding of Consul sessions and the implications of their use (it is recommended to leave this blank in nearly all cases).  If this parameter is omitted the query will not expire.
     */
    session?: pulumi.Input<string>;
    /**
     * The ACL token to store with the prepared query. This token will be used by default whenever the query is executed.
     */
    storedToken?: pulumi.Input<string>;
    /**
     * The list of required and/or disallowed tags.  If a tag is in this list it must be present.  If the tag is preceded with a "!" then it is disallowed.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Query templating options. This is used to make a single prepared query respond to many different requests
     */
    template?: pulumi.Input<inputs.PreparedQueryTemplate>;
    /**
     * The ACL token to use when saving the prepared query. This overrides the token that the agent provides by default.
     *
     * @deprecated The token argument has been deprecated and will be removed in a future release.
Please use the token argument in the provider configuration
     */
    token?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PreparedQuery resource.
 */
export interface PreparedQueryArgs {
    /**
     * When `true` the prepared query will return connect proxy services for a queried service.  Conditions such as `tags` in the prepared query will be matched against the proxy service. Defaults to false.
     */
    connect?: pulumi.Input<boolean>;
    /**
     * The datacenter to use. This overrides the agent's default datacenter and the datacenter in the provider setup.
     */
    datacenter?: pulumi.Input<string>;
    /**
     * Settings for controlling the DNS response details.
     */
    dns?: pulumi.Input<inputs.PreparedQueryDns>;
    /**
     * Options for controlling behavior when no healthy nodes are available in the local DC.
     */
    failover?: pulumi.Input<inputs.PreparedQueryFailover>;
    /**
     * Specifies a list of check IDs that should be ignored when filtering unhealthy instances. This is mostly useful in an emergency or as a temporary measure when a health check is found to be unreliable. Being able to ignore it in centrally-defined queries can be simpler than de-registering the check as an interim solution until the check can be fixed.
     */
    ignoreCheckIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the prepared query. Used to identify the prepared query during requests. Can be specified as an empty string to configure the query as a catch-all.
     */
    name?: pulumi.Input<string>;
    /**
     * Allows specifying the name of a node to sort results near using Consul's distance sorting and network coordinates. The magic `_agent` value can be used to always sort nearest the node servicing the request.
     */
    near?: pulumi.Input<string>;
    /**
     * Specifies a list of user-defined key/value pairs that will be used for filtering the query results to nodes with the given metadata values present.
     */
    nodeMeta?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * When `true`, the prepared query will only return nodes with passing health checks in the result.
     */
    onlyPassing?: pulumi.Input<boolean>;
    /**
     * The name of the service to query
     */
    service: pulumi.Input<string>;
    /**
     * Specifies a list of user-defined key/value pairs that will be used for filtering the query results to services with the given metadata values present.
     */
    serviceMeta?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The name of the Consul session to tie this query's lifetime to.  This is an advanced parameter that should not be used without a complete understanding of Consul sessions and the implications of their use (it is recommended to leave this blank in nearly all cases).  If this parameter is omitted the query will not expire.
     */
    session?: pulumi.Input<string>;
    /**
     * The ACL token to store with the prepared query. This token will be used by default whenever the query is executed.
     */
    storedToken?: pulumi.Input<string>;
    /**
     * The list of required and/or disallowed tags.  If a tag is in this list it must be present.  If the tag is preceded with a "!" then it is disallowed.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Query templating options. This is used to make a single prepared query respond to many different requests
     */
    template?: pulumi.Input<inputs.PreparedQueryTemplate>;
    /**
     * The ACL token to use when saving the prepared query. This overrides the token that the agent provides by default.
     *
     * @deprecated The token argument has been deprecated and will be removed in a future release.
Please use the token argument in the provider configuration
     */
    token?: pulumi.Input<string>;
}
