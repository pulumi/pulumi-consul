// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul;

import com.pulumi.consul.NamespaceRoleAttachmentArgs;
import com.pulumi.consul.Utilities;
import com.pulumi.consul.inputs.NamespaceRoleAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * `consul_namespace_role_attachment` can be imported. This is especially useful to manage the policies attached to the `default` namespace
 * 
 * ```sh
 *  $ pulumi import consul:index/namespaceRoleAttachment:NamespaceRoleAttachment default default:role_name
 * ```
 * 
 */
@ResourceType(type="consul:index/namespaceRoleAttachment:NamespaceRoleAttachment")
public class NamespaceRoleAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The namespace to attach the role to.
     * 
     */
    @Export(name="namespace", type=String.class, parameters={})
    private Output<String> namespace;

    /**
     * @return The namespace to attach the role to.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }
    /**
     * The name of the role attached to the namespace.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The name of the role attached to the namespace.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NamespaceRoleAttachment(String name) {
        this(name, NamespaceRoleAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NamespaceRoleAttachment(String name, NamespaceRoleAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NamespaceRoleAttachment(String name, NamespaceRoleAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("consul:index/namespaceRoleAttachment:NamespaceRoleAttachment", name, args == null ? NamespaceRoleAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NamespaceRoleAttachment(String name, Output<String> id, @Nullable NamespaceRoleAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("consul:index/namespaceRoleAttachment:NamespaceRoleAttachment", name, state, makeResourceOptions(options, id));
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
    public static NamespaceRoleAttachment get(String name, Output<String> id, @Nullable NamespaceRoleAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NamespaceRoleAttachment(name, id, state, options);
    }
}