// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul;

import com.pulumi.consul.PreparedQueryArgs;
import com.pulumi.consul.Utilities;
import com.pulumi.consul.inputs.PreparedQueryState;
import com.pulumi.consul.outputs.PreparedQueryDns;
import com.pulumi.consul.outputs.PreparedQueryFailover;
import com.pulumi.consul.outputs.PreparedQueryTemplate;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.consul.PreparedQuery;
 * import com.pulumi.consul.PreparedQueryArgs;
 * import com.pulumi.consul.inputs.PreparedQueryDnsArgs;
 * import com.pulumi.consul.inputs.PreparedQueryFailoverArgs;
 * import com.pulumi.consul.inputs.PreparedQueryTemplateArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var myapp_query = new PreparedQuery(&#34;myapp-query&#34;, PreparedQueryArgs.builder()        
 *             .datacenter(&#34;us-central1&#34;)
 *             .dns(PreparedQueryDnsArgs.builder()
 *                 .ttl(&#34;30s&#34;)
 *                 .build())
 *             .failover(PreparedQueryFailoverArgs.builder()
 *                 .datacenters(                
 *                     &#34;us-west1&#34;,
 *                     &#34;us-east-2&#34;,
 *                     &#34;asia-east1&#34;)
 *                 .nearestN(3)
 *                 .build())
 *             .near(&#34;_agent&#34;)
 *             .onlyPassing(true)
 *             .service(&#34;myapp&#34;)
 *             .storedToken(&#34;wxyz&#34;)
 *             .tags(            
 *                 &#34;active&#34;,
 *                 &#34;!standby&#34;)
 *             .token(&#34;abcd&#34;)
 *             .build());
 * 
 *         var service_near_self = new PreparedQuery(&#34;service-near-self&#34;, PreparedQueryArgs.builder()        
 *             .connect(true)
 *             .datacenter(&#34;nyc1&#34;)
 *             .dns(PreparedQueryDnsArgs.builder()
 *                 .ttl(&#34;5m&#34;)
 *                 .build())
 *             .failover(PreparedQueryFailoverArgs.builder()
 *                 .datacenters(                
 *                     &#34;dc2&#34;,
 *                     &#34;dc3&#34;,
 *                     &#34;dc4&#34;)
 *                 .nearestN(3)
 *                 .build())
 *             .near(&#34;_agent&#34;)
 *             .onlyPassing(true)
 *             .service(&#34;${match(1)}&#34;)
 *             .storedToken(&#34;wxyz&#34;)
 *             .template(PreparedQueryTemplateArgs.builder()
 *                 .regexp(&#34;^(.*)-near-self$&#34;)
 *                 .type(&#34;name_prefix_match&#34;)
 *                 .build())
 *             .token(&#34;abcd&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import consul:index/preparedQuery:PreparedQuery my_service 71ecfb82-717a-4258-b4b6-2fb75144d856
 * ```
 * 
 */
@ResourceType(type="consul:index/preparedQuery:PreparedQuery")
public class PreparedQuery extends com.pulumi.resources.CustomResource {
    /**
     * When `true` the prepared query will return connect proxy services for a queried service.  Conditions such as `tags` in the prepared query will be matched against the proxy service. Defaults to false.
     * 
     */
    @Export(name="connect", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> connect;

    /**
     * @return When `true` the prepared query will return connect proxy services for a queried service.  Conditions such as `tags` in the prepared query will be matched against the proxy service. Defaults to false.
     * 
     */
    public Output<Optional<Boolean>> connect() {
        return Codegen.optional(this.connect);
    }
    /**
     * Specifies a WAN federated datacenter to forward the query to.
     * 
     */
    @Export(name="datacenter", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> datacenter;

    /**
     * @return Specifies a WAN federated datacenter to forward the query to.
     * 
     */
    public Output<Optional<String>> datacenter() {
        return Codegen.optional(this.datacenter);
    }
    /**
     * Settings for controlling the DNS response details.
     * 
     */
    @Export(name="dns", refs={PreparedQueryDns.class}, tree="[0]")
    private Output</* @Nullable */ PreparedQueryDns> dns;

    /**
     * @return Settings for controlling the DNS response details.
     * 
     */
    public Output<Optional<PreparedQueryDns>> dns() {
        return Codegen.optional(this.dns);
    }
    /**
     * Options for controlling behavior when no healthy nodes are available in the local DC.
     * 
     */
    @Export(name="failover", refs={PreparedQueryFailover.class}, tree="[0]")
    private Output</* @Nullable */ PreparedQueryFailover> failover;

    /**
     * @return Options for controlling behavior when no healthy nodes are available in the local DC.
     * 
     */
    public Output<Optional<PreparedQueryFailover>> failover() {
        return Codegen.optional(this.failover);
    }
    /**
     * Specifies a list of check IDs that should be ignored when filtering unhealthy instances. This is mostly useful in an emergency or as a temporary measure when a health check is found to be unreliable. Being able to ignore it in centrally-defined queries can be simpler than de-registering the check as an interim solution until the check can be fixed.
     * 
     */
    @Export(name="ignoreCheckIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> ignoreCheckIds;

    /**
     * @return Specifies a list of check IDs that should be ignored when filtering unhealthy instances. This is mostly useful in an emergency or as a temporary measure when a health check is found to be unreliable. Being able to ignore it in centrally-defined queries can be simpler than de-registering the check as an interim solution until the check can be fixed.
     * 
     */
    public Output<Optional<List<String>>> ignoreCheckIds() {
        return Codegen.optional(this.ignoreCheckIds);
    }
    /**
     * The name of the prepared query. Used to identify the prepared query during requests. Can be specified as an empty string to configure the query as a catch-all.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the prepared query. Used to identify the prepared query during requests. Can be specified as an empty string to configure the query as a catch-all.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Allows specifying the name of a node to sort results near using Consul&#39;s distance sorting and network coordinates. The magic `_agent` value can be used to always sort nearest the node servicing the request.
     * 
     */
    @Export(name="near", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> near;

    /**
     * @return Allows specifying the name of a node to sort results near using Consul&#39;s distance sorting and network coordinates. The magic `_agent` value can be used to always sort nearest the node servicing the request.
     * 
     */
    public Output<Optional<String>> near() {
        return Codegen.optional(this.near);
    }
    /**
     * Specifies a list of user-defined key/value pairs that will be used for filtering the query results to nodes with the given metadata values present.
     * 
     */
    @Export(name="nodeMeta", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> nodeMeta;

    /**
     * @return Specifies a list of user-defined key/value pairs that will be used for filtering the query results to nodes with the given metadata values present.
     * 
     */
    public Output<Optional<Map<String,String>>> nodeMeta() {
        return Codegen.optional(this.nodeMeta);
    }
    /**
     * When `true`, the prepared query will only return nodes with passing health checks in the result.
     * 
     */
    @Export(name="onlyPassing", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> onlyPassing;

    /**
     * @return When `true`, the prepared query will only return nodes with passing health checks in the result.
     * 
     */
    public Output<Optional<Boolean>> onlyPassing() {
        return Codegen.optional(this.onlyPassing);
    }
    /**
     * The name of the service to query
     * 
     */
    @Export(name="service", refs={String.class}, tree="[0]")
    private Output<String> service;

    /**
     * @return The name of the service to query
     * 
     */
    public Output<String> service() {
        return this.service;
    }
    /**
     * Specifies a list of user-defined key/value pairs that will be used for filtering the query results to services with the given metadata values present.
     * 
     */
    @Export(name="serviceMeta", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> serviceMeta;

    /**
     * @return Specifies a list of user-defined key/value pairs that will be used for filtering the query results to services with the given metadata values present.
     * 
     */
    public Output<Optional<Map<String,String>>> serviceMeta() {
        return Codegen.optional(this.serviceMeta);
    }
    /**
     * The name of the Consul session to tie this query&#39;s lifetime to.  This is an advanced parameter that should not be used without a complete understanding of Consul sessions and the implications of their use (it is recommended to leave this blank in nearly all cases).  If this parameter is omitted the query will not expire.
     * 
     */
    @Export(name="session", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> session;

    /**
     * @return The name of the Consul session to tie this query&#39;s lifetime to.  This is an advanced parameter that should not be used without a complete understanding of Consul sessions and the implications of their use (it is recommended to leave this blank in nearly all cases).  If this parameter is omitted the query will not expire.
     * 
     */
    public Output<Optional<String>> session() {
        return Codegen.optional(this.session);
    }
    /**
     * The ACL token to store with the prepared query. This token will be used by default whenever the query is executed.
     * 
     */
    @Export(name="storedToken", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> storedToken;

    /**
     * @return The ACL token to store with the prepared query. This token will be used by default whenever the query is executed.
     * 
     */
    public Output<Optional<String>> storedToken() {
        return Codegen.optional(this.storedToken);
    }
    /**
     * The list of required and/or disallowed tags.  If a tag is in this list it must be present.  If the tag is preceded with a &#34;!&#34; then it is disallowed.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return The list of required and/or disallowed tags.  If a tag is in this list it must be present.  If the tag is preceded with a &#34;!&#34; then it is disallowed.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Query templating options. This is used to make a single prepared query respond to many different requests
     * 
     */
    @Export(name="template", refs={PreparedQueryTemplate.class}, tree="[0]")
    private Output</* @Nullable */ PreparedQueryTemplate> template;

    /**
     * @return Query templating options. This is used to make a single prepared query respond to many different requests
     * 
     */
    public Output<Optional<PreparedQueryTemplate>> template() {
        return Codegen.optional(this.template);
    }
    /**
     * The ACL token to use when saving the prepared query. This overrides the token that the agent provides by default.
     * 
     * @deprecated
     * The token argument has been deprecated and will be removed in a future release.
     * Please use the token argument in the provider configuration
     * 
     */
    @Deprecated /* The token argument has been deprecated and will be removed in a future release.
Please use the token argument in the provider configuration */
    @Export(name="token", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> token;

    /**
     * @return The ACL token to use when saving the prepared query. This overrides the token that the agent provides by default.
     * 
     */
    public Output<Optional<String>> token() {
        return Codegen.optional(this.token);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PreparedQuery(String name) {
        this(name, PreparedQueryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PreparedQuery(String name, PreparedQueryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PreparedQuery(String name, PreparedQueryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("consul:index/preparedQuery:PreparedQuery", name, args == null ? PreparedQueryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PreparedQuery(String name, Output<String> id, @Nullable PreparedQueryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("consul:index/preparedQuery:PreparedQuery", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "token"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PreparedQuery get(String name, Output<String> id, @Nullable PreparedQueryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PreparedQuery(name, id, state, options);
    }
}
