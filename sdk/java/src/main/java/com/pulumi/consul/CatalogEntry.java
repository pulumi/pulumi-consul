// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul;

import com.pulumi.consul.CatalogEntryArgs;
import com.pulumi.consul.Utilities;
import com.pulumi.consul.inputs.CatalogEntryState;
import com.pulumi.consul.outputs.CatalogEntryService;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * !&gt; The `consul.CatalogEntry` resource has been deprecated in version 2.0.0 of the provider
 * and will be removed in a future release. Please read the [upgrade guide](https://www.terraform.io/docs/providers/consul/guides/upgrading.html#deprecation-of-consul_catalog_entry)
 * for more information.
 * 
 * Registers a node or service with the [Consul Catalog](https://www.consul.io/docs/agent/http/catalog.html#catalog_register).
 * Currently, defining health checks is not supported.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="consul:index/catalogEntry:CatalogEntry")
public class CatalogEntry extends com.pulumi.resources.CustomResource {
    /**
     * The address of the node being added to,
     * or referenced in the catalog.
     * 
     */
    @Export(name="address", type=String.class, parameters={})
    private Output<String> address;

    /**
     * @return The address of the node being added to,
     * or referenced in the catalog.
     * 
     */
    public Output<String> address() {
        return this.address;
    }
    /**
     * The datacenter to use. This overrides the
     * agent&#39;s default datacenter and the datacenter in the provider setup.
     * 
     */
    @Export(name="datacenter", type=String.class, parameters={})
    private Output<String> datacenter;

    /**
     * @return The datacenter to use. This overrides the
     * agent&#39;s default datacenter and the datacenter in the provider setup.
     * 
     */
    public Output<String> datacenter() {
        return this.datacenter;
    }
    /**
     * The name of the node being added to, or
     * referenced in the catalog.
     * 
     */
    @Export(name="node", type=String.class, parameters={})
    private Output<String> node;

    /**
     * @return The name of the node being added to, or
     * referenced in the catalog.
     * 
     */
    public Output<String> node() {
        return this.node;
    }
    /**
     * A service to optionally associated with
     * the node. Supported values are documented below.
     * 
     */
    @Export(name="services", type=List.class, parameters={CatalogEntryService.class})
    private Output</* @Nullable */ List<CatalogEntryService>> services;

    /**
     * @return A service to optionally associated with
     * the node. Supported values are documented below.
     * 
     */
    public Output<Optional<List<CatalogEntryService>>> services() {
        return Codegen.optional(this.services);
    }
    /**
     * ACL token.
     * 
     */
    @Export(name="token", type=String.class, parameters={})
    private Output</* @Nullable */ String> token;

    /**
     * @return ACL token.
     * 
     */
    public Output<Optional<String>> token() {
        return Codegen.optional(this.token);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CatalogEntry(String name) {
        this(name, CatalogEntryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CatalogEntry(String name, CatalogEntryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CatalogEntry(String name, CatalogEntryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("consul:index/catalogEntry:CatalogEntry", name, args == null ? CatalogEntryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CatalogEntry(String name, Output<String> id, @Nullable CatalogEntryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("consul:index/catalogEntry:CatalogEntry", name, state, makeResourceOptions(options, id));
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
    public static CatalogEntry get(String name, Output<String> id, @Nullable CatalogEntryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CatalogEntry(name, id, state, options);
    }
}