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

__all__ = ['IntentionArgs', 'Intention']

@pulumi.input_type
class IntentionArgs:
    def __init__(__self__, *,
                 action: pulumi.Input[_builtins.str],
                 destination_name: pulumi.Input[_builtins.str],
                 source_name: pulumi.Input[_builtins.str],
                 datacenter: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 destination_namespace: Optional[pulumi.Input[_builtins.str]] = None,
                 meta: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 source_namespace: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Intention resource.
        :param pulumi.Input[_builtins.str] action: The intention action. Must be one of `allow` or `deny`.
        :param pulumi.Input[_builtins.str] destination_name: The name of the destination service for the intention. This
               service does not have to exist.
        :param pulumi.Input[_builtins.str] source_name: The name of the source service for the intention. This
               service does not have to exist.
        :param pulumi.Input[_builtins.str] datacenter: The datacenter to use. This overrides the
               agent's default datacenter and the datacenter in the provider setup.
        :param pulumi.Input[_builtins.str] description: Optional description that can be used by Consul
               tooling, but is not used internally.
        :param pulumi.Input[_builtins.str] destination_namespace: The destination
               namespace of the intention.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] meta: Key/value pairs that are opaque to Consul and are associated
               with the intention.
        :param pulumi.Input[_builtins.str] source_namespace: The source namespace of the
               intention.
        """
        pulumi.set(__self__, "action", action)
        pulumi.set(__self__, "destination_name", destination_name)
        pulumi.set(__self__, "source_name", source_name)
        if datacenter is not None:
            pulumi.set(__self__, "datacenter", datacenter)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if destination_namespace is not None:
            pulumi.set(__self__, "destination_namespace", destination_namespace)
        if meta is not None:
            pulumi.set(__self__, "meta", meta)
        if source_namespace is not None:
            pulumi.set(__self__, "source_namespace", source_namespace)

    @_builtins.property
    @pulumi.getter
    def action(self) -> pulumi.Input[_builtins.str]:
        """
        The intention action. Must be one of `allow` or `deny`.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "action", value)

    @_builtins.property
    @pulumi.getter(name="destinationName")
    def destination_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the destination service for the intention. This
        service does not have to exist.
        """
        return pulumi.get(self, "destination_name")

    @destination_name.setter
    def destination_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "destination_name", value)

    @_builtins.property
    @pulumi.getter(name="sourceName")
    def source_name(self) -> pulumi.Input[_builtins.str]:
        """
        The name of the source service for the intention. This
        service does not have to exist.
        """
        return pulumi.get(self, "source_name")

    @source_name.setter
    def source_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "source_name", value)

    @_builtins.property
    @pulumi.getter
    def datacenter(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The datacenter to use. This overrides the
        agent's default datacenter and the datacenter in the provider setup.
        """
        return pulumi.get(self, "datacenter")

    @datacenter.setter
    def datacenter(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "datacenter", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Optional description that can be used by Consul
        tooling, but is not used internally.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="destinationNamespace")
    def destination_namespace(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The destination
        namespace of the intention.
        """
        return pulumi.get(self, "destination_namespace")

    @destination_namespace.setter
    def destination_namespace(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "destination_namespace", value)

    @_builtins.property
    @pulumi.getter
    def meta(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Key/value pairs that are opaque to Consul and are associated
        with the intention.
        """
        return pulumi.get(self, "meta")

    @meta.setter
    def meta(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "meta", value)

    @_builtins.property
    @pulumi.getter(name="sourceNamespace")
    def source_namespace(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The source namespace of the
        intention.
        """
        return pulumi.get(self, "source_namespace")

    @source_namespace.setter
    def source_namespace(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "source_namespace", value)


@pulumi.input_type
class _IntentionState:
    def __init__(__self__, *,
                 action: Optional[pulumi.Input[_builtins.str]] = None,
                 datacenter: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 destination_name: Optional[pulumi.Input[_builtins.str]] = None,
                 destination_namespace: Optional[pulumi.Input[_builtins.str]] = None,
                 meta: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 source_name: Optional[pulumi.Input[_builtins.str]] = None,
                 source_namespace: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Intention resources.
        :param pulumi.Input[_builtins.str] action: The intention action. Must be one of `allow` or `deny`.
        :param pulumi.Input[_builtins.str] datacenter: The datacenter to use. This overrides the
               agent's default datacenter and the datacenter in the provider setup.
        :param pulumi.Input[_builtins.str] description: Optional description that can be used by Consul
               tooling, but is not used internally.
        :param pulumi.Input[_builtins.str] destination_name: The name of the destination service for the intention. This
               service does not have to exist.
        :param pulumi.Input[_builtins.str] destination_namespace: The destination
               namespace of the intention.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] meta: Key/value pairs that are opaque to Consul and are associated
               with the intention.
        :param pulumi.Input[_builtins.str] source_name: The name of the source service for the intention. This
               service does not have to exist.
        :param pulumi.Input[_builtins.str] source_namespace: The source namespace of the
               intention.
        """
        if action is not None:
            pulumi.set(__self__, "action", action)
        if datacenter is not None:
            pulumi.set(__self__, "datacenter", datacenter)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if destination_name is not None:
            pulumi.set(__self__, "destination_name", destination_name)
        if destination_namespace is not None:
            pulumi.set(__self__, "destination_namespace", destination_namespace)
        if meta is not None:
            pulumi.set(__self__, "meta", meta)
        if source_name is not None:
            pulumi.set(__self__, "source_name", source_name)
        if source_namespace is not None:
            pulumi.set(__self__, "source_namespace", source_namespace)

    @_builtins.property
    @pulumi.getter
    def action(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The intention action. Must be one of `allow` or `deny`.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "action", value)

    @_builtins.property
    @pulumi.getter
    def datacenter(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The datacenter to use. This overrides the
        agent's default datacenter and the datacenter in the provider setup.
        """
        return pulumi.get(self, "datacenter")

    @datacenter.setter
    def datacenter(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "datacenter", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Optional description that can be used by Consul
        tooling, but is not used internally.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="destinationName")
    def destination_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the destination service for the intention. This
        service does not have to exist.
        """
        return pulumi.get(self, "destination_name")

    @destination_name.setter
    def destination_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "destination_name", value)

    @_builtins.property
    @pulumi.getter(name="destinationNamespace")
    def destination_namespace(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The destination
        namespace of the intention.
        """
        return pulumi.get(self, "destination_namespace")

    @destination_namespace.setter
    def destination_namespace(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "destination_namespace", value)

    @_builtins.property
    @pulumi.getter
    def meta(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Key/value pairs that are opaque to Consul and are associated
        with the intention.
        """
        return pulumi.get(self, "meta")

    @meta.setter
    def meta(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "meta", value)

    @_builtins.property
    @pulumi.getter(name="sourceName")
    def source_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the source service for the intention. This
        service does not have to exist.
        """
        return pulumi.get(self, "source_name")

    @source_name.setter
    def source_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "source_name", value)

    @_builtins.property
    @pulumi.getter(name="sourceNamespace")
    def source_namespace(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The source namespace of the
        intention.
        """
        return pulumi.get(self, "source_namespace")

    @source_namespace.setter
    def source_namespace(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "source_namespace", value)


@pulumi.type_token("consul:index/intention:Intention")
class Intention(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[_builtins.str]] = None,
                 datacenter: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 destination_name: Optional[pulumi.Input[_builtins.str]] = None,
                 destination_namespace: Optional[pulumi.Input[_builtins.str]] = None,
                 meta: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 source_name: Optional[pulumi.Input[_builtins.str]] = None,
                 source_namespace: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        [Intentions](https://www.consul.io/docs/connect/intentions.html) are used to define
        rules for which services may connect to one another when using [Consul Connect](https://www.consul.io/docs/connect/index.html).

        > **NOTE:** This resource is appropriate for managing legacy intentions in
        Consul version 1.8 and earlier. As of Consul 1.9, intentions should be managed
        using the [`service-intentions`](https://www.consul.io/docs/connect/intentions)
        configuration entry. It is recommended to migrate from the `Intention`
        resource to `ConfigEntry` when running Consul 1.9 and later.

        It is appropriate to either reference existing services, or specify non-existent services
        that will be created in the future when creating intentions. This resource can be used
        in conjunction with the `Service` datasource when referencing services
        registered on nodes that have a running Consul agent.

        ## Example Usage

        Create a simplest intention with static service names:

        ```python
        import pulumi
        import pulumi_consul as consul

        database = consul.Intention("database",
            source_name="api",
            destination_name="db",
            action="allow")
        ```

        Referencing a known service via a datasource:

        ```python
        import pulumi
        import pulumi_consul as consul

        database = consul.Intention("database",
            source_name="api",
            destination_name=pg_consul_service["name"],
            action="allow")
        pg = consul.get_service(name="postgresql")
        ```

        ## Import

        `consul_intention` can be imported:

        ```sh
        $ pulumi import consul:index/intention:Intention database 657a57d6-0d56-57e2-31cb-e9f1ed3c18dd
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] action: The intention action. Must be one of `allow` or `deny`.
        :param pulumi.Input[_builtins.str] datacenter: The datacenter to use. This overrides the
               agent's default datacenter and the datacenter in the provider setup.
        :param pulumi.Input[_builtins.str] description: Optional description that can be used by Consul
               tooling, but is not used internally.
        :param pulumi.Input[_builtins.str] destination_name: The name of the destination service for the intention. This
               service does not have to exist.
        :param pulumi.Input[_builtins.str] destination_namespace: The destination
               namespace of the intention.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] meta: Key/value pairs that are opaque to Consul and are associated
               with the intention.
        :param pulumi.Input[_builtins.str] source_name: The name of the source service for the intention. This
               service does not have to exist.
        :param pulumi.Input[_builtins.str] source_namespace: The source namespace of the
               intention.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IntentionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        [Intentions](https://www.consul.io/docs/connect/intentions.html) are used to define
        rules for which services may connect to one another when using [Consul Connect](https://www.consul.io/docs/connect/index.html).

        > **NOTE:** This resource is appropriate for managing legacy intentions in
        Consul version 1.8 and earlier. As of Consul 1.9, intentions should be managed
        using the [`service-intentions`](https://www.consul.io/docs/connect/intentions)
        configuration entry. It is recommended to migrate from the `Intention`
        resource to `ConfigEntry` when running Consul 1.9 and later.

        It is appropriate to either reference existing services, or specify non-existent services
        that will be created in the future when creating intentions. This resource can be used
        in conjunction with the `Service` datasource when referencing services
        registered on nodes that have a running Consul agent.

        ## Example Usage

        Create a simplest intention with static service names:

        ```python
        import pulumi
        import pulumi_consul as consul

        database = consul.Intention("database",
            source_name="api",
            destination_name="db",
            action="allow")
        ```

        Referencing a known service via a datasource:

        ```python
        import pulumi
        import pulumi_consul as consul

        database = consul.Intention("database",
            source_name="api",
            destination_name=pg_consul_service["name"],
            action="allow")
        pg = consul.get_service(name="postgresql")
        ```

        ## Import

        `consul_intention` can be imported:

        ```sh
        $ pulumi import consul:index/intention:Intention database 657a57d6-0d56-57e2-31cb-e9f1ed3c18dd
        ```

        :param str resource_name: The name of the resource.
        :param IntentionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IntentionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[_builtins.str]] = None,
                 datacenter: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 destination_name: Optional[pulumi.Input[_builtins.str]] = None,
                 destination_namespace: Optional[pulumi.Input[_builtins.str]] = None,
                 meta: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 source_name: Optional[pulumi.Input[_builtins.str]] = None,
                 source_namespace: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IntentionArgs.__new__(IntentionArgs)

            if action is None and not opts.urn:
                raise TypeError("Missing required property 'action'")
            __props__.__dict__["action"] = action
            __props__.__dict__["datacenter"] = datacenter
            __props__.__dict__["description"] = description
            if destination_name is None and not opts.urn:
                raise TypeError("Missing required property 'destination_name'")
            __props__.__dict__["destination_name"] = destination_name
            __props__.__dict__["destination_namespace"] = destination_namespace
            __props__.__dict__["meta"] = meta
            if source_name is None and not opts.urn:
                raise TypeError("Missing required property 'source_name'")
            __props__.__dict__["source_name"] = source_name
            __props__.__dict__["source_namespace"] = source_namespace
        super(Intention, __self__).__init__(
            'consul:index/intention:Intention',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            action: Optional[pulumi.Input[_builtins.str]] = None,
            datacenter: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            destination_name: Optional[pulumi.Input[_builtins.str]] = None,
            destination_namespace: Optional[pulumi.Input[_builtins.str]] = None,
            meta: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            source_name: Optional[pulumi.Input[_builtins.str]] = None,
            source_namespace: Optional[pulumi.Input[_builtins.str]] = None) -> 'Intention':
        """
        Get an existing Intention resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] action: The intention action. Must be one of `allow` or `deny`.
        :param pulumi.Input[_builtins.str] datacenter: The datacenter to use. This overrides the
               agent's default datacenter and the datacenter in the provider setup.
        :param pulumi.Input[_builtins.str] description: Optional description that can be used by Consul
               tooling, but is not used internally.
        :param pulumi.Input[_builtins.str] destination_name: The name of the destination service for the intention. This
               service does not have to exist.
        :param pulumi.Input[_builtins.str] destination_namespace: The destination
               namespace of the intention.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] meta: Key/value pairs that are opaque to Consul and are associated
               with the intention.
        :param pulumi.Input[_builtins.str] source_name: The name of the source service for the intention. This
               service does not have to exist.
        :param pulumi.Input[_builtins.str] source_namespace: The source namespace of the
               intention.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IntentionState.__new__(_IntentionState)

        __props__.__dict__["action"] = action
        __props__.__dict__["datacenter"] = datacenter
        __props__.__dict__["description"] = description
        __props__.__dict__["destination_name"] = destination_name
        __props__.__dict__["destination_namespace"] = destination_namespace
        __props__.__dict__["meta"] = meta
        __props__.__dict__["source_name"] = source_name
        __props__.__dict__["source_namespace"] = source_namespace
        return Intention(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def action(self) -> pulumi.Output[_builtins.str]:
        """
        The intention action. Must be one of `allow` or `deny`.
        """
        return pulumi.get(self, "action")

    @_builtins.property
    @pulumi.getter
    def datacenter(self) -> pulumi.Output[_builtins.str]:
        """
        The datacenter to use. This overrides the
        agent's default datacenter and the datacenter in the provider setup.
        """
        return pulumi.get(self, "datacenter")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Optional description that can be used by Consul
        tooling, but is not used internally.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="destinationName")
    def destination_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the destination service for the intention. This
        service does not have to exist.
        """
        return pulumi.get(self, "destination_name")

    @_builtins.property
    @pulumi.getter(name="destinationNamespace")
    def destination_namespace(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The destination
        namespace of the intention.
        """
        return pulumi.get(self, "destination_namespace")

    @_builtins.property
    @pulumi.getter
    def meta(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        Key/value pairs that are opaque to Consul and are associated
        with the intention.
        """
        return pulumi.get(self, "meta")

    @_builtins.property
    @pulumi.getter(name="sourceName")
    def source_name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the source service for the intention. This
        service does not have to exist.
        """
        return pulumi.get(self, "source_name")

    @_builtins.property
    @pulumi.getter(name="sourceNamespace")
    def source_namespace(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The source namespace of the
        intention.
        """
        return pulumi.get(self, "source_namespace")

