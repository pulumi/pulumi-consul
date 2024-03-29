// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul;

import com.pulumi.consul.ConfigEntryServiceSplitterArgs;
import com.pulumi.consul.Utilities;
import com.pulumi.consul.inputs.ConfigEntryServiceSplitterState;
import com.pulumi.consul.outputs.ConfigEntryServiceSplitterSplit;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
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
 * import com.pulumi.consul.ConfigEntry;
 * import com.pulumi.consul.ConfigEntryArgs;
 * import com.pulumi.consul.ConfigEntryServiceResolver;
 * import com.pulumi.consul.ConfigEntryServiceResolverArgs;
 * import com.pulumi.consul.inputs.ConfigEntryServiceResolverSubsetArgs;
 * import com.pulumi.consul.ConfigEntryServiceSplitter;
 * import com.pulumi.consul.ConfigEntryServiceSplitterArgs;
 * import com.pulumi.consul.inputs.ConfigEntryServiceSplitterSplitArgs;
 * import com.pulumi.consul.inputs.ConfigEntryServiceSplitterSplitRequestHeadersArgs;
 * import com.pulumi.consul.inputs.ConfigEntryServiceSplitterSplitResponseHeadersArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var web = new ConfigEntry(&#34;web&#34;, ConfigEntryArgs.builder()        
 *             .kind(&#34;service-defaults&#34;)
 *             .configJson(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;Protocol&#34;, &#34;http&#34;),
 *                     jsonProperty(&#34;Expose&#34;, jsonObject(
 * 
 *                     )),
 *                     jsonProperty(&#34;MeshGateway&#34;, jsonObject(
 * 
 *                     )),
 *                     jsonProperty(&#34;TransparentProxy&#34;, jsonObject(
 * 
 *                     ))
 *                 )))
 *             .build());
 * 
 *         var serviceResolver = new ConfigEntryServiceResolver(&#34;serviceResolver&#34;, ConfigEntryServiceResolverArgs.builder()        
 *             .defaultSubset(&#34;v1&#34;)
 *             .subsets(            
 *                 ConfigEntryServiceResolverSubsetArgs.builder()
 *                     .name(&#34;v1&#34;)
 *                     .filter(&#34;Service.Meta.version == v1&#34;)
 *                     .build(),
 *                 ConfigEntryServiceResolverSubsetArgs.builder()
 *                     .name(&#34;v2&#34;)
 *                     .filter(&#34;Service.Meta.version == v2&#34;)
 *                     .build())
 *             .build());
 * 
 *         var foo = new ConfigEntryServiceSplitter(&#34;foo&#34;, ConfigEntryServiceSplitterArgs.builder()        
 *             .meta(Map.of(&#34;key&#34;, &#34;value&#34;))
 *             .splits(            
 *                 ConfigEntryServiceSplitterSplitArgs.builder()
 *                     .weight(80)
 *                     .service(&#34;web&#34;)
 *                     .serviceSubset(&#34;v1&#34;)
 *                     .requestHeaders(ConfigEntryServiceSplitterSplitRequestHeadersArgs.builder()
 *                         .set(Map.of(&#34;x-web-version&#34;, &#34;from-v1&#34;))
 *                         .build())
 *                     .responseHeaders(ConfigEntryServiceSplitterSplitResponseHeadersArgs.builder()
 *                         .set(Map.of(&#34;x-web-version&#34;, &#34;to-v1&#34;))
 *                         .build())
 *                     .build(),
 *                 ConfigEntryServiceSplitterSplitArgs.builder()
 *                     .weight(10)
 *                     .service(&#34;web&#34;)
 *                     .serviceSubset(&#34;v2&#34;)
 *                     .requestHeaders(ConfigEntryServiceSplitterSplitRequestHeadersArgs.builder()
 *                         .set(Map.of(&#34;x-web-version&#34;, &#34;from-v2&#34;))
 *                         .build())
 *                     .responseHeaders(ConfigEntryServiceSplitterSplitResponseHeadersArgs.builder()
 *                         .set(Map.of(&#34;x-web-version&#34;, &#34;to-v2&#34;))
 *                         .build())
 *                     .build(),
 *                 ConfigEntryServiceSplitterSplitArgs.builder()
 *                     .weight(10)
 *                     .service(&#34;web&#34;)
 *                     .serviceSubset(&#34;v2&#34;)
 *                     .build())
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
 * $ pulumi import consul:index/configEntryServiceSplitter:ConfigEntryServiceSplitter foo web
 * ```
 * 
 */
@ResourceType(type="consul:index/configEntryServiceSplitter:ConfigEntryServiceSplitter")
public class ConfigEntryServiceSplitter extends com.pulumi.resources.CustomResource {
    /**
     * Specifies key-value pairs to add to the KV store.
     * 
     */
    @Export(name="meta", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> meta;

    /**
     * @return Specifies key-value pairs to add to the KV store.
     * 
     */
    public Output<Optional<Map<String,String>>> meta() {
        return Codegen.optional(this.meta);
    }
    /**
     * Specifies a name for the configuration entry.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies a name for the configuration entry.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the namespace to use in the FQDN when resolving the service.
     * 
     */
    @Export(name="namespace", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> namespace;

    /**
     * @return Specifies the namespace to use in the FQDN when resolving the service.
     * 
     */
    public Output<Optional<String>> namespace() {
        return Codegen.optional(this.namespace);
    }
    /**
     * Specifies the admin partition to use in the FQDN when resolving the service.
     * 
     */
    @Export(name="partition", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> partition;

    /**
     * @return Specifies the admin partition to use in the FQDN when resolving the service.
     * 
     */
    public Output<Optional<String>> partition() {
        return Codegen.optional(this.partition);
    }
    /**
     * Defines how much traffic to send to sets of service instances during a traffic split.
     * 
     */
    @Export(name="splits", refs={List.class,ConfigEntryServiceSplitterSplit.class}, tree="[0,1]")
    private Output<List<ConfigEntryServiceSplitterSplit>> splits;

    /**
     * @return Defines how much traffic to send to sets of service instances during a traffic split.
     * 
     */
    public Output<List<ConfigEntryServiceSplitterSplit>> splits() {
        return this.splits;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConfigEntryServiceSplitter(String name) {
        this(name, ConfigEntryServiceSplitterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfigEntryServiceSplitter(String name, ConfigEntryServiceSplitterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigEntryServiceSplitter(String name, ConfigEntryServiceSplitterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("consul:index/configEntryServiceSplitter:ConfigEntryServiceSplitter", name, args == null ? ConfigEntryServiceSplitterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConfigEntryServiceSplitter(String name, Output<String> id, @Nullable ConfigEntryServiceSplitterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("consul:index/configEntryServiceSplitter:ConfigEntryServiceSplitter", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static ConfigEntryServiceSplitter get(String name, Output<String> id, @Nullable ConfigEntryServiceSplitterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConfigEntryServiceSplitter(name, id, state, options);
    }
}
