# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = ['NamespacePolicyAttachmentArgs', 'NamespacePolicyAttachment']

@pulumi.input_type
class NamespacePolicyAttachmentArgs:
    def __init__(__self__, *,
                 namespace: pulumi.Input[_builtins.str],
                 policy: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a NamespacePolicyAttachment resource.
        :param pulumi.Input[_builtins.str] namespace: The namespace to attach the policy to.
        :param pulumi.Input[_builtins.str] policy: The name of the policy attached to the namespace.
        """
        pulumi.set(__self__, "namespace", namespace)
        pulumi.set(__self__, "policy", policy)

    @_builtins.property
    @pulumi.getter
    def namespace(self) -> pulumi.Input[_builtins.str]:
        """
        The namespace to attach the policy to.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "namespace", value)

    @_builtins.property
    @pulumi.getter
    def policy(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the policy attached to the namespace.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "policy", value)


@pulumi.input_type
class _NamespacePolicyAttachmentState:
    def __init__(__self__, *,
                 namespace: Optional[pulumi.Input[_builtins.str]] = None,
                 policy: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering NamespacePolicyAttachment resources.
        :param pulumi.Input[_builtins.str] namespace: The namespace to attach the policy to.
        :param pulumi.Input[_builtins.str] policy: The name of the policy attached to the namespace.
        """
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if policy is not None:
            pulumi.set(__self__, "policy", policy)

    @_builtins.property
    @pulumi.getter
    def namespace(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The namespace to attach the policy to.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "namespace", value)

    @_builtins.property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the policy attached to the namespace.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "policy", value)


@pulumi.type_token("consul:index/namespacePolicyAttachment:NamespacePolicyAttachment")
class NamespacePolicyAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 namespace: Optional[pulumi.Input[_builtins.str]] = None,
                 policy: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Import

        `consul_namespace_policy_attachment` can be imported. This is especially useful
        to manage the policies attached to the `default` namespace:

        ```sh
        $ pulumi import consul:index/namespacePolicyAttachment:NamespacePolicyAttachment default default:policy_name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] namespace: The namespace to attach the policy to.
        :param pulumi.Input[_builtins.str] policy: The name of the policy attached to the namespace.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NamespacePolicyAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        `consul_namespace_policy_attachment` can be imported. This is especially useful
        to manage the policies attached to the `default` namespace:

        ```sh
        $ pulumi import consul:index/namespacePolicyAttachment:NamespacePolicyAttachment default default:policy_name
        ```

        :param str resource_name: The name of the resource.
        :param NamespacePolicyAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NamespacePolicyAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 namespace: Optional[pulumi.Input[_builtins.str]] = None,
                 policy: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NamespacePolicyAttachmentArgs.__new__(NamespacePolicyAttachmentArgs)

            if namespace is None and not opts.urn:
                raise TypeError("Missing required property 'namespace'")
            __props__.__dict__["namespace"] = namespace
            if policy is None and not opts.urn:
                raise TypeError("Missing required property 'policy'")
            __props__.__dict__["policy"] = policy
        super(NamespacePolicyAttachment, __self__).__init__(
            'consul:index/namespacePolicyAttachment:NamespacePolicyAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            namespace: Optional[pulumi.Input[_builtins.str]] = None,
            policy: Optional[pulumi.Input[_builtins.str]] = None) -> 'NamespacePolicyAttachment':
        """
        Get an existing NamespacePolicyAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] namespace: The namespace to attach the policy to.
        :param pulumi.Input[_builtins.str] policy: The name of the policy attached to the namespace.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NamespacePolicyAttachmentState.__new__(_NamespacePolicyAttachmentState)

        __props__.__dict__["namespace"] = namespace
        __props__.__dict__["policy"] = policy
        return NamespacePolicyAttachment(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def namespace(self) -> pulumi.Output[_builtins.str]:
        """
        The namespace to attach the policy to.
        """
        return pulumi.get(self, "namespace")

    @_builtins.property
    @pulumi.getter
    def policy(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the policy attached to the namespace.
        """
        return pulumi.get(self, "policy")

