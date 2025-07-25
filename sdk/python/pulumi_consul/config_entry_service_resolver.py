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
from . import outputs
from ._inputs import *

__all__ = ['ConfigEntryServiceResolverArgs', 'ConfigEntryServiceResolver']

@pulumi.input_type
class ConfigEntryServiceResolverArgs:
    def __init__(__self__, *,
                 connect_timeout: Optional[pulumi.Input[_builtins.str]] = None,
                 default_subset: Optional[pulumi.Input[_builtins.str]] = None,
                 failovers: Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverFailoverArgs']]]] = None,
                 load_balancers: Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverLoadBalancerArgs']]]] = None,
                 meta: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 namespace: Optional[pulumi.Input[_builtins.str]] = None,
                 partition: Optional[pulumi.Input[_builtins.str]] = None,
                 redirects: Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverRedirectArgs']]]] = None,
                 request_timeout: Optional[pulumi.Input[_builtins.str]] = None,
                 subsets: Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverSubsetArgs']]]] = None):
        """
        The set of arguments for constructing a ConfigEntryServiceResolver resource.
        :param pulumi.Input[_builtins.str] connect_timeout: Specifies the timeout duration for establishing new network connections to this service.
        :param pulumi.Input[_builtins.str] default_subset: Specifies a defined subset of service instances to use when no explicit subset is requested. If this parameter is not specified, Consul uses the unnamed default subset.
        :param pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverFailoverArgs']]] failovers: Specifies controls for rerouting traffic to an alternate pool of service instances if the target service fails.
        :param pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverLoadBalancerArgs']]] load_balancers: Specifies the load balancing policy and configuration for services issuing requests to this upstream.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] meta: Specifies key-value pairs to add to the KV store.
        :param pulumi.Input[_builtins.str] name: Specifies a name for the configuration entry.
        :param pulumi.Input[_builtins.str] namespace: Specifies the namespace that the service resolver applies to.
        :param pulumi.Input[_builtins.str] partition: Specifies the admin partition that the service resolver applies to.
        :param pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverRedirectArgs']]] redirects: Specifies redirect instructions for local service traffic so that services deployed to a different network location resolve the upstream request instead.
        :param pulumi.Input[_builtins.str] request_timeout: Specifies the timeout duration for receiving an HTTP response from this service.
        :param pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverSubsetArgs']]] subsets: Specifies names for custom service subsets and the conditions under which service instances belong to each subset.
        """
        if connect_timeout is not None:
            pulumi.set(__self__, "connect_timeout", connect_timeout)
        if default_subset is not None:
            pulumi.set(__self__, "default_subset", default_subset)
        if failovers is not None:
            pulumi.set(__self__, "failovers", failovers)
        if load_balancers is not None:
            pulumi.set(__self__, "load_balancers", load_balancers)
        if meta is not None:
            pulumi.set(__self__, "meta", meta)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if partition is not None:
            pulumi.set(__self__, "partition", partition)
        if redirects is not None:
            pulumi.set(__self__, "redirects", redirects)
        if request_timeout is not None:
            pulumi.set(__self__, "request_timeout", request_timeout)
        if subsets is not None:
            pulumi.set(__self__, "subsets", subsets)

    @_builtins.property
    @pulumi.getter(name="connectTimeout")
    def connect_timeout(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the timeout duration for establishing new network connections to this service.
        """
        return pulumi.get(self, "connect_timeout")

    @connect_timeout.setter
    def connect_timeout(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "connect_timeout", value)

    @_builtins.property
    @pulumi.getter(name="defaultSubset")
    def default_subset(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies a defined subset of service instances to use when no explicit subset is requested. If this parameter is not specified, Consul uses the unnamed default subset.
        """
        return pulumi.get(self, "default_subset")

    @default_subset.setter
    def default_subset(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "default_subset", value)

    @_builtins.property
    @pulumi.getter
    def failovers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverFailoverArgs']]]]:
        """
        Specifies controls for rerouting traffic to an alternate pool of service instances if the target service fails.
        """
        return pulumi.get(self, "failovers")

    @failovers.setter
    def failovers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverFailoverArgs']]]]):
        pulumi.set(self, "failovers", value)

    @_builtins.property
    @pulumi.getter(name="loadBalancers")
    def load_balancers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverLoadBalancerArgs']]]]:
        """
        Specifies the load balancing policy and configuration for services issuing requests to this upstream.
        """
        return pulumi.get(self, "load_balancers")

    @load_balancers.setter
    def load_balancers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverLoadBalancerArgs']]]]):
        pulumi.set(self, "load_balancers", value)

    @_builtins.property
    @pulumi.getter
    def meta(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Specifies key-value pairs to add to the KV store.
        """
        return pulumi.get(self, "meta")

    @meta.setter
    def meta(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "meta", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies a name for the configuration entry.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def namespace(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the namespace that the service resolver applies to.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "namespace", value)

    @_builtins.property
    @pulumi.getter
    def partition(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the admin partition that the service resolver applies to.
        """
        return pulumi.get(self, "partition")

    @partition.setter
    def partition(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "partition", value)

    @_builtins.property
    @pulumi.getter
    def redirects(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverRedirectArgs']]]]:
        """
        Specifies redirect instructions for local service traffic so that services deployed to a different network location resolve the upstream request instead.
        """
        return pulumi.get(self, "redirects")

    @redirects.setter
    def redirects(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverRedirectArgs']]]]):
        pulumi.set(self, "redirects", value)

    @_builtins.property
    @pulumi.getter(name="requestTimeout")
    def request_timeout(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the timeout duration for receiving an HTTP response from this service.
        """
        return pulumi.get(self, "request_timeout")

    @request_timeout.setter
    def request_timeout(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "request_timeout", value)

    @_builtins.property
    @pulumi.getter
    def subsets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverSubsetArgs']]]]:
        """
        Specifies names for custom service subsets and the conditions under which service instances belong to each subset.
        """
        return pulumi.get(self, "subsets")

    @subsets.setter
    def subsets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverSubsetArgs']]]]):
        pulumi.set(self, "subsets", value)


@pulumi.input_type
class _ConfigEntryServiceResolverState:
    def __init__(__self__, *,
                 connect_timeout: Optional[pulumi.Input[_builtins.str]] = None,
                 default_subset: Optional[pulumi.Input[_builtins.str]] = None,
                 failovers: Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverFailoverArgs']]]] = None,
                 load_balancers: Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverLoadBalancerArgs']]]] = None,
                 meta: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 namespace: Optional[pulumi.Input[_builtins.str]] = None,
                 partition: Optional[pulumi.Input[_builtins.str]] = None,
                 redirects: Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverRedirectArgs']]]] = None,
                 request_timeout: Optional[pulumi.Input[_builtins.str]] = None,
                 subsets: Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverSubsetArgs']]]] = None):
        """
        Input properties used for looking up and filtering ConfigEntryServiceResolver resources.
        :param pulumi.Input[_builtins.str] connect_timeout: Specifies the timeout duration for establishing new network connections to this service.
        :param pulumi.Input[_builtins.str] default_subset: Specifies a defined subset of service instances to use when no explicit subset is requested. If this parameter is not specified, Consul uses the unnamed default subset.
        :param pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverFailoverArgs']]] failovers: Specifies controls for rerouting traffic to an alternate pool of service instances if the target service fails.
        :param pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverLoadBalancerArgs']]] load_balancers: Specifies the load balancing policy and configuration for services issuing requests to this upstream.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] meta: Specifies key-value pairs to add to the KV store.
        :param pulumi.Input[_builtins.str] name: Specifies a name for the configuration entry.
        :param pulumi.Input[_builtins.str] namespace: Specifies the namespace that the service resolver applies to.
        :param pulumi.Input[_builtins.str] partition: Specifies the admin partition that the service resolver applies to.
        :param pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverRedirectArgs']]] redirects: Specifies redirect instructions for local service traffic so that services deployed to a different network location resolve the upstream request instead.
        :param pulumi.Input[_builtins.str] request_timeout: Specifies the timeout duration for receiving an HTTP response from this service.
        :param pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverSubsetArgs']]] subsets: Specifies names for custom service subsets and the conditions under which service instances belong to each subset.
        """
        if connect_timeout is not None:
            pulumi.set(__self__, "connect_timeout", connect_timeout)
        if default_subset is not None:
            pulumi.set(__self__, "default_subset", default_subset)
        if failovers is not None:
            pulumi.set(__self__, "failovers", failovers)
        if load_balancers is not None:
            pulumi.set(__self__, "load_balancers", load_balancers)
        if meta is not None:
            pulumi.set(__self__, "meta", meta)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if namespace is not None:
            pulumi.set(__self__, "namespace", namespace)
        if partition is not None:
            pulumi.set(__self__, "partition", partition)
        if redirects is not None:
            pulumi.set(__self__, "redirects", redirects)
        if request_timeout is not None:
            pulumi.set(__self__, "request_timeout", request_timeout)
        if subsets is not None:
            pulumi.set(__self__, "subsets", subsets)

    @_builtins.property
    @pulumi.getter(name="connectTimeout")
    def connect_timeout(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the timeout duration for establishing new network connections to this service.
        """
        return pulumi.get(self, "connect_timeout")

    @connect_timeout.setter
    def connect_timeout(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "connect_timeout", value)

    @_builtins.property
    @pulumi.getter(name="defaultSubset")
    def default_subset(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies a defined subset of service instances to use when no explicit subset is requested. If this parameter is not specified, Consul uses the unnamed default subset.
        """
        return pulumi.get(self, "default_subset")

    @default_subset.setter
    def default_subset(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "default_subset", value)

    @_builtins.property
    @pulumi.getter
    def failovers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverFailoverArgs']]]]:
        """
        Specifies controls for rerouting traffic to an alternate pool of service instances if the target service fails.
        """
        return pulumi.get(self, "failovers")

    @failovers.setter
    def failovers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverFailoverArgs']]]]):
        pulumi.set(self, "failovers", value)

    @_builtins.property
    @pulumi.getter(name="loadBalancers")
    def load_balancers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverLoadBalancerArgs']]]]:
        """
        Specifies the load balancing policy and configuration for services issuing requests to this upstream.
        """
        return pulumi.get(self, "load_balancers")

    @load_balancers.setter
    def load_balancers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverLoadBalancerArgs']]]]):
        pulumi.set(self, "load_balancers", value)

    @_builtins.property
    @pulumi.getter
    def meta(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]:
        """
        Specifies key-value pairs to add to the KV store.
        """
        return pulumi.get(self, "meta")

    @meta.setter
    def meta(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "meta", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies a name for the configuration entry.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def namespace(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the namespace that the service resolver applies to.
        """
        return pulumi.get(self, "namespace")

    @namespace.setter
    def namespace(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "namespace", value)

    @_builtins.property
    @pulumi.getter
    def partition(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the admin partition that the service resolver applies to.
        """
        return pulumi.get(self, "partition")

    @partition.setter
    def partition(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "partition", value)

    @_builtins.property
    @pulumi.getter
    def redirects(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverRedirectArgs']]]]:
        """
        Specifies redirect instructions for local service traffic so that services deployed to a different network location resolve the upstream request instead.
        """
        return pulumi.get(self, "redirects")

    @redirects.setter
    def redirects(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverRedirectArgs']]]]):
        pulumi.set(self, "redirects", value)

    @_builtins.property
    @pulumi.getter(name="requestTimeout")
    def request_timeout(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the timeout duration for receiving an HTTP response from this service.
        """
        return pulumi.get(self, "request_timeout")

    @request_timeout.setter
    def request_timeout(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "request_timeout", value)

    @_builtins.property
    @pulumi.getter
    def subsets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverSubsetArgs']]]]:
        """
        Specifies names for custom service subsets and the conditions under which service instances belong to each subset.
        """
        return pulumi.get(self, "subsets")

    @subsets.setter
    def subsets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ConfigEntryServiceResolverSubsetArgs']]]]):
        pulumi.set(self, "subsets", value)


@pulumi.type_token("consul:index/configEntryServiceResolver:ConfigEntryServiceResolver")
class ConfigEntryServiceResolver(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 connect_timeout: Optional[pulumi.Input[_builtins.str]] = None,
                 default_subset: Optional[pulumi.Input[_builtins.str]] = None,
                 failovers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ConfigEntryServiceResolverFailoverArgs', 'ConfigEntryServiceResolverFailoverArgsDict']]]]] = None,
                 load_balancers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ConfigEntryServiceResolverLoadBalancerArgs', 'ConfigEntryServiceResolverLoadBalancerArgsDict']]]]] = None,
                 meta: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 namespace: Optional[pulumi.Input[_builtins.str]] = None,
                 partition: Optional[pulumi.Input[_builtins.str]] = None,
                 redirects: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ConfigEntryServiceResolverRedirectArgs', 'ConfigEntryServiceResolverRedirectArgsDict']]]]] = None,
                 request_timeout: Optional[pulumi.Input[_builtins.str]] = None,
                 subsets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ConfigEntryServiceResolverSubsetArgs', 'ConfigEntryServiceResolverSubsetArgsDict']]]]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_consul as consul

        web = consul.ConfigEntryServiceResolver("web",
            name="web",
            default_subset="v1",
            connect_timeout="15s",
            subsets=[
                {
                    "name": "v1",
                    "filter": "Service.Meta.version == v1",
                },
                {
                    "name": "v2",
                    "filter": "Service.Meta.version == v2",
                },
            ],
            redirects=[{
                "service": "web",
                "datacenter": "dc2",
            }],
            failovers=[
                {
                    "subset_name": "v2",
                    "datacenters": ["dc2"],
                },
                {
                    "subset_name": "*",
                    "datacenters": [
                        "dc3",
                        "dc4",
                    ],
                },
            ])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] connect_timeout: Specifies the timeout duration for establishing new network connections to this service.
        :param pulumi.Input[_builtins.str] default_subset: Specifies a defined subset of service instances to use when no explicit subset is requested. If this parameter is not specified, Consul uses the unnamed default subset.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ConfigEntryServiceResolverFailoverArgs', 'ConfigEntryServiceResolverFailoverArgsDict']]]] failovers: Specifies controls for rerouting traffic to an alternate pool of service instances if the target service fails.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ConfigEntryServiceResolverLoadBalancerArgs', 'ConfigEntryServiceResolverLoadBalancerArgsDict']]]] load_balancers: Specifies the load balancing policy and configuration for services issuing requests to this upstream.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] meta: Specifies key-value pairs to add to the KV store.
        :param pulumi.Input[_builtins.str] name: Specifies a name for the configuration entry.
        :param pulumi.Input[_builtins.str] namespace: Specifies the namespace that the service resolver applies to.
        :param pulumi.Input[_builtins.str] partition: Specifies the admin partition that the service resolver applies to.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ConfigEntryServiceResolverRedirectArgs', 'ConfigEntryServiceResolverRedirectArgsDict']]]] redirects: Specifies redirect instructions for local service traffic so that services deployed to a different network location resolve the upstream request instead.
        :param pulumi.Input[_builtins.str] request_timeout: Specifies the timeout duration for receiving an HTTP response from this service.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ConfigEntryServiceResolverSubsetArgs', 'ConfigEntryServiceResolverSubsetArgsDict']]]] subsets: Specifies names for custom service subsets and the conditions under which service instances belong to each subset.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ConfigEntryServiceResolverArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_consul as consul

        web = consul.ConfigEntryServiceResolver("web",
            name="web",
            default_subset="v1",
            connect_timeout="15s",
            subsets=[
                {
                    "name": "v1",
                    "filter": "Service.Meta.version == v1",
                },
                {
                    "name": "v2",
                    "filter": "Service.Meta.version == v2",
                },
            ],
            redirects=[{
                "service": "web",
                "datacenter": "dc2",
            }],
            failovers=[
                {
                    "subset_name": "v2",
                    "datacenters": ["dc2"],
                },
                {
                    "subset_name": "*",
                    "datacenters": [
                        "dc3",
                        "dc4",
                    ],
                },
            ])
        ```

        :param str resource_name: The name of the resource.
        :param ConfigEntryServiceResolverArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ConfigEntryServiceResolverArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 connect_timeout: Optional[pulumi.Input[_builtins.str]] = None,
                 default_subset: Optional[pulumi.Input[_builtins.str]] = None,
                 failovers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ConfigEntryServiceResolverFailoverArgs', 'ConfigEntryServiceResolverFailoverArgsDict']]]]] = None,
                 load_balancers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ConfigEntryServiceResolverLoadBalancerArgs', 'ConfigEntryServiceResolverLoadBalancerArgsDict']]]]] = None,
                 meta: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 namespace: Optional[pulumi.Input[_builtins.str]] = None,
                 partition: Optional[pulumi.Input[_builtins.str]] = None,
                 redirects: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ConfigEntryServiceResolverRedirectArgs', 'ConfigEntryServiceResolverRedirectArgsDict']]]]] = None,
                 request_timeout: Optional[pulumi.Input[_builtins.str]] = None,
                 subsets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ConfigEntryServiceResolverSubsetArgs', 'ConfigEntryServiceResolverSubsetArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ConfigEntryServiceResolverArgs.__new__(ConfigEntryServiceResolverArgs)

            __props__.__dict__["connect_timeout"] = connect_timeout
            __props__.__dict__["default_subset"] = default_subset
            __props__.__dict__["failovers"] = failovers
            __props__.__dict__["load_balancers"] = load_balancers
            __props__.__dict__["meta"] = meta
            __props__.__dict__["name"] = name
            __props__.__dict__["namespace"] = namespace
            __props__.__dict__["partition"] = partition
            __props__.__dict__["redirects"] = redirects
            __props__.__dict__["request_timeout"] = request_timeout
            __props__.__dict__["subsets"] = subsets
        super(ConfigEntryServiceResolver, __self__).__init__(
            'consul:index/configEntryServiceResolver:ConfigEntryServiceResolver',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            connect_timeout: Optional[pulumi.Input[_builtins.str]] = None,
            default_subset: Optional[pulumi.Input[_builtins.str]] = None,
            failovers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ConfigEntryServiceResolverFailoverArgs', 'ConfigEntryServiceResolverFailoverArgsDict']]]]] = None,
            load_balancers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ConfigEntryServiceResolverLoadBalancerArgs', 'ConfigEntryServiceResolverLoadBalancerArgsDict']]]]] = None,
            meta: Optional[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            namespace: Optional[pulumi.Input[_builtins.str]] = None,
            partition: Optional[pulumi.Input[_builtins.str]] = None,
            redirects: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ConfigEntryServiceResolverRedirectArgs', 'ConfigEntryServiceResolverRedirectArgsDict']]]]] = None,
            request_timeout: Optional[pulumi.Input[_builtins.str]] = None,
            subsets: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ConfigEntryServiceResolverSubsetArgs', 'ConfigEntryServiceResolverSubsetArgsDict']]]]] = None) -> 'ConfigEntryServiceResolver':
        """
        Get an existing ConfigEntryServiceResolver resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] connect_timeout: Specifies the timeout duration for establishing new network connections to this service.
        :param pulumi.Input[_builtins.str] default_subset: Specifies a defined subset of service instances to use when no explicit subset is requested. If this parameter is not specified, Consul uses the unnamed default subset.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ConfigEntryServiceResolverFailoverArgs', 'ConfigEntryServiceResolverFailoverArgsDict']]]] failovers: Specifies controls for rerouting traffic to an alternate pool of service instances if the target service fails.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ConfigEntryServiceResolverLoadBalancerArgs', 'ConfigEntryServiceResolverLoadBalancerArgsDict']]]] load_balancers: Specifies the load balancing policy and configuration for services issuing requests to this upstream.
        :param pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]] meta: Specifies key-value pairs to add to the KV store.
        :param pulumi.Input[_builtins.str] name: Specifies a name for the configuration entry.
        :param pulumi.Input[_builtins.str] namespace: Specifies the namespace that the service resolver applies to.
        :param pulumi.Input[_builtins.str] partition: Specifies the admin partition that the service resolver applies to.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ConfigEntryServiceResolverRedirectArgs', 'ConfigEntryServiceResolverRedirectArgsDict']]]] redirects: Specifies redirect instructions for local service traffic so that services deployed to a different network location resolve the upstream request instead.
        :param pulumi.Input[_builtins.str] request_timeout: Specifies the timeout duration for receiving an HTTP response from this service.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ConfigEntryServiceResolverSubsetArgs', 'ConfigEntryServiceResolverSubsetArgsDict']]]] subsets: Specifies names for custom service subsets and the conditions under which service instances belong to each subset.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ConfigEntryServiceResolverState.__new__(_ConfigEntryServiceResolverState)

        __props__.__dict__["connect_timeout"] = connect_timeout
        __props__.__dict__["default_subset"] = default_subset
        __props__.__dict__["failovers"] = failovers
        __props__.__dict__["load_balancers"] = load_balancers
        __props__.__dict__["meta"] = meta
        __props__.__dict__["name"] = name
        __props__.__dict__["namespace"] = namespace
        __props__.__dict__["partition"] = partition
        __props__.__dict__["redirects"] = redirects
        __props__.__dict__["request_timeout"] = request_timeout
        __props__.__dict__["subsets"] = subsets
        return ConfigEntryServiceResolver(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="connectTimeout")
    def connect_timeout(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies the timeout duration for establishing new network connections to this service.
        """
        return pulumi.get(self, "connect_timeout")

    @_builtins.property
    @pulumi.getter(name="defaultSubset")
    def default_subset(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies a defined subset of service instances to use when no explicit subset is requested. If this parameter is not specified, Consul uses the unnamed default subset.
        """
        return pulumi.get(self, "default_subset")

    @_builtins.property
    @pulumi.getter
    def failovers(self) -> pulumi.Output[Optional[Sequence['outputs.ConfigEntryServiceResolverFailover']]]:
        """
        Specifies controls for rerouting traffic to an alternate pool of service instances if the target service fails.
        """
        return pulumi.get(self, "failovers")

    @_builtins.property
    @pulumi.getter(name="loadBalancers")
    def load_balancers(self) -> pulumi.Output[Optional[Sequence['outputs.ConfigEntryServiceResolverLoadBalancer']]]:
        """
        Specifies the load balancing policy and configuration for services issuing requests to this upstream.
        """
        return pulumi.get(self, "load_balancers")

    @_builtins.property
    @pulumi.getter
    def meta(self) -> pulumi.Output[Optional[Mapping[str, _builtins.str]]]:
        """
        Specifies key-value pairs to add to the KV store.
        """
        return pulumi.get(self, "meta")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies a name for the configuration entry.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def namespace(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies the namespace that the service resolver applies to.
        """
        return pulumi.get(self, "namespace")

    @_builtins.property
    @pulumi.getter
    def partition(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies the admin partition that the service resolver applies to.
        """
        return pulumi.get(self, "partition")

    @_builtins.property
    @pulumi.getter
    def redirects(self) -> pulumi.Output[Optional[Sequence['outputs.ConfigEntryServiceResolverRedirect']]]:
        """
        Specifies redirect instructions for local service traffic so that services deployed to a different network location resolve the upstream request instead.
        """
        return pulumi.get(self, "redirects")

    @_builtins.property
    @pulumi.getter(name="requestTimeout")
    def request_timeout(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies the timeout duration for receiving an HTTP response from this service.
        """
        return pulumi.get(self, "request_timeout")

    @_builtins.property
    @pulumi.getter
    def subsets(self) -> pulumi.Output[Optional[Sequence['outputs.ConfigEntryServiceResolverSubset']]]:
        """
        Specifies names for custom service subsets and the conditions under which service instances belong to each subset.
        """
        return pulumi.get(self, "subsets")

