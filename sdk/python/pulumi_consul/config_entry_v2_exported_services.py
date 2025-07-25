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

__all__ = ['ConfigEntryV2ExportedServicesArgs', 'ConfigEntryV2ExportedServices']

@pulumi.input_type
class ConfigEntryV2ExportedServicesArgs:
    def __init__(__self__, *,
                 kind: pulumi.Input[_builtins.str],
                 partition: pulumi.Input[_builtins.str],
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 namespace: Optional[pulumi.Input[_builtins.str]] = None,
                 partition_consumers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 peer_consumers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 sameness_group_consumers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 services: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a ConfigEntryV2ExportedServices resource.
        :param pulumi.Input[_builtins.str] kind: The kind of exported services config (ExportedServices, NamespaceExportedServices, PartitionExportedServices).
        :param pulumi.Input[_builtins.str] partition: The partition the config entry is associated with.
        :param pulumi.Input[_builtins.str] name: The name of the config entry to read.
        :param pulumi.Input[_builtins.str] namespace: The namespace the config entry is associated with.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] partition_consumers: The exported service partition consumers.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] peer_consumers: The exported service peer consumers.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] sameness_group_consumers: The exported service sameness group consumers.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] services: The exported services.
        """
        pulumi.set(__self__, "kind", kind)
        pulumi.set(__self__, "partition", partition)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if partition_consumers is not None:
            pulumi.set(__self__, "partition_consumers", partition_consumers)
        if peer_consumers is not None:
            pulumi.set(__self__, "peer_consumers", peer_consumers)
        if sameness_group_consumers is not None:
            pulumi.set(__self__, "sameness_group_consumers", sameness_group_consumers)
        if services is not None:
            pulumi.set(__self__, "services", services)

    @_builtins.property
    @pulumi.getter
    def kind(self) -> pulumi.Input[_builtins.str]:
        """
        The kind of exported services config (ExportedServices, NamespaceExportedServices, PartitionExportedServices).
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "kind", value)

    @_builtins.property
    @pulumi.getter
    def partition(self) -> pulumi.Input[_builtins.str]:
        """
        The partition the config entry is associated with.
        """
        return pulumi.get(self, "partition")

    @partition.setter
    def partition(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "partition", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the config entry to read.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def namespace(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The namespace the config entry is associated with.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "namespace", value)

    @_builtins.property
    @pulumi.getter(name="partitionConsumers")
    def partition_consumers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The exported service partition consumers.
        """
        return pulumi.get(self, "partition_consumers")

    @partition_consumers.setter
    def partition_consumers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "partition_consumers", value)

    @_builtins.property
    @pulumi.getter(name="peerConsumers")
    def peer_consumers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The exported service peer consumers.
        """
        return pulumi.get(self, "peer_consumers")

    @peer_consumers.setter
    def peer_consumers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "peer_consumers", value)

    @_builtins.property
    @pulumi.getter(name="samenessGroupConsumers")
    def sameness_group_consumers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The exported service sameness group consumers.
        """
        return pulumi.get(self, "sameness_group_consumers")

    @sameness_group_consumers.setter
    def sameness_group_consumers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "sameness_group_consumers", value)

    @_builtins.property
    @pulumi.getter
    def services(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The exported services.
        """
        return pulumi.get(self, "services")

    @services.setter
    def services(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "services", value)


@pulumi.input_type
class _ConfigEntryV2ExportedServicesState:
    def __init__(__self__, *,
                 kind: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 namespace: Optional[pulumi.Input[_builtins.str]] = None,
                 partition: Optional[pulumi.Input[_builtins.str]] = None,
                 partition_consumers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 peer_consumers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 sameness_group_consumers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 services: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering ConfigEntryV2ExportedServices resources.
        :param pulumi.Input[_builtins.str] kind: The kind of exported services config (ExportedServices, NamespaceExportedServices, PartitionExportedServices).
        :param pulumi.Input[_builtins.str] name: The name of the config entry to read.
        :param pulumi.Input[_builtins.str] namespace: The namespace the config entry is associated with.
        :param pulumi.Input[_builtins.str] partition: The partition the config entry is associated with.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] partition_consumers: The exported service partition consumers.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] peer_consumers: The exported service peer consumers.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] sameness_group_consumers: The exported service sameness group consumers.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] services: The exported services.
        """
        if kind is not None:
            pulumi.set(__self__, "kind", kind)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if partition is not None:
            pulumi.set(__self__, "partition", partition)
        if partition_consumers is not None:
            pulumi.set(__self__, "partition_consumers", partition_consumers)
        if peer_consumers is not None:
            pulumi.set(__self__, "peer_consumers", peer_consumers)
        if sameness_group_consumers is not None:
            pulumi.set(__self__, "sameness_group_consumers", sameness_group_consumers)
        if services is not None:
            pulumi.set(__self__, "services", services)

    @_builtins.property
    @pulumi.getter
    def kind(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The kind of exported services config (ExportedServices, NamespaceExportedServices, PartitionExportedServices).
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "kind", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the config entry to read.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def namespace(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The namespace the config entry is associated with.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "namespace", value)

    @_builtins.property
    @pulumi.getter
    def partition(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The partition the config entry is associated with.
        """
        return pulumi.get(self, "partition")

    @partition.setter
    def partition(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "partition", value)

    @_builtins.property
    @pulumi.getter(name="partitionConsumers")
    def partition_consumers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The exported service partition consumers.
        """
        return pulumi.get(self, "partition_consumers")

    @partition_consumers.setter
    def partition_consumers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "partition_consumers", value)

    @_builtins.property
    @pulumi.getter(name="peerConsumers")
    def peer_consumers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The exported service peer consumers.
        """
        return pulumi.get(self, "peer_consumers")

    @peer_consumers.setter
    def peer_consumers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "peer_consumers", value)

    @_builtins.property
    @pulumi.getter(name="samenessGroupConsumers")
    def sameness_group_consumers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The exported service sameness group consumers.
        """
        return pulumi.get(self, "sameness_group_consumers")

    @sameness_group_consumers.setter
    def sameness_group_consumers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "sameness_group_consumers", value)

    @_builtins.property
    @pulumi.getter
    def services(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The exported services.
        """
        return pulumi.get(self, "services")

    @services.setter
    def services(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "services", value)


@pulumi.type_token("consul:index/configEntryV2ExportedServices:ConfigEntryV2ExportedServices")
class ConfigEntryV2ExportedServices(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 kind: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 namespace: Optional[pulumi.Input[_builtins.str]] = None,
                 partition: Optional[pulumi.Input[_builtins.str]] = None,
                 partition_consumers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 peer_consumers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 sameness_group_consumers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 services: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        Create a ConfigEntryV2ExportedServices resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] kind: The kind of exported services config (ExportedServices, NamespaceExportedServices, PartitionExportedServices).
        :param pulumi.Input[_builtins.str] name: The name of the config entry to read.
        :param pulumi.Input[_builtins.str] namespace: The namespace the config entry is associated with.
        :param pulumi.Input[_builtins.str] partition: The partition the config entry is associated with.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] partition_consumers: The exported service partition consumers.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] peer_consumers: The exported service peer consumers.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] sameness_group_consumers: The exported service sameness group consumers.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] services: The exported services.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ConfigEntryV2ExportedServicesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a ConfigEntryV2ExportedServices resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param ConfigEntryV2ExportedServicesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ConfigEntryV2ExportedServicesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 kind: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 namespace: Optional[pulumi.Input[_builtins.str]] = None,
                 partition: Optional[pulumi.Input[_builtins.str]] = None,
                 partition_consumers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 peer_consumers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 sameness_group_consumers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 services: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ConfigEntryV2ExportedServicesArgs.__new__(ConfigEntryV2ExportedServicesArgs)

            if kind is None and not opts.urn:
                raise TypeError("Missing required property 'kind'")
            __props__.__dict__["kind"] = kind
            __props__.__dict__["name"] = name
            __props__.__dict__["namespace"] = namespace
            if partition is None and not opts.urn:
                raise TypeError("Missing required property 'partition'")
            __props__.__dict__["partition"] = partition
            __props__.__dict__["partition_consumers"] = partition_consumers
            __props__.__dict__["peer_consumers"] = peer_consumers
            __props__.__dict__["sameness_group_consumers"] = sameness_group_consumers
            __props__.__dict__["services"] = services
        super(ConfigEntryV2ExportedServices, __self__).__init__(
            'consul:index/configEntryV2ExportedServices:ConfigEntryV2ExportedServices',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            kind: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            namespace: Optional[pulumi.Input[_builtins.str]] = None,
            partition: Optional[pulumi.Input[_builtins.str]] = None,
            partition_consumers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            peer_consumers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            sameness_group_consumers: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            services: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None) -> 'ConfigEntryV2ExportedServices':
        """
        Get an existing ConfigEntryV2ExportedServices resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] kind: The kind of exported services config (ExportedServices, NamespaceExportedServices, PartitionExportedServices).
        :param pulumi.Input[_builtins.str] name: The name of the config entry to read.
        :param pulumi.Input[_builtins.str] namespace: The namespace the config entry is associated with.
        :param pulumi.Input[_builtins.str] partition: The partition the config entry is associated with.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] partition_consumers: The exported service partition consumers.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] peer_consumers: The exported service peer consumers.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] sameness_group_consumers: The exported service sameness group consumers.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] services: The exported services.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ConfigEntryV2ExportedServicesState.__new__(_ConfigEntryV2ExportedServicesState)

        __props__.__dict__["kind"] = kind
        __props__.__dict__["name"] = name
        __props__.__dict__["namespace"] = namespace
        __props__.__dict__["partition"] = partition
        __props__.__dict__["partition_consumers"] = partition_consumers
        __props__.__dict__["peer_consumers"] = peer_consumers
        __props__.__dict__["sameness_group_consumers"] = sameness_group_consumers
        __props__.__dict__["services"] = services
        return ConfigEntryV2ExportedServices(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def kind(self) -> pulumi.Output[_builtins.str]:
        """
        The kind of exported services config (ExportedServices, NamespaceExportedServices, PartitionExportedServices).
        """
        return pulumi.get(self, "kind")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the config entry to read.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def namespace(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The namespace the config entry is associated with.
        """
        return pulumi.get(self, "namespace")

    @_builtins.property
    @pulumi.getter
    def partition(self) -> pulumi.Output[_builtins.str]:
        """
        The partition the config entry is associated with.
        """
        return pulumi.get(self, "partition")

    @_builtins.property
    @pulumi.getter(name="partitionConsumers")
    def partition_consumers(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        The exported service partition consumers.
        """
        return pulumi.get(self, "partition_consumers")

    @_builtins.property
    @pulumi.getter(name="peerConsumers")
    def peer_consumers(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        The exported service peer consumers.
        """
        return pulumi.get(self, "peer_consumers")

    @_builtins.property
    @pulumi.getter(name="samenessGroupConsumers")
    def sameness_group_consumers(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        The exported service sameness group consumers.
        """
        return pulumi.get(self, "sameness_group_consumers")

    @_builtins.property
    @pulumi.getter
    def services(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        The exported services.
        """
        return pulumi.get(self, "services")

