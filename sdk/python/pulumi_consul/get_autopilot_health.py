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

__all__ = [
    'GetAutopilotHealthResult',
    'AwaitableGetAutopilotHealthResult',
    'get_autopilot_health',
    'get_autopilot_health_output',
]

@pulumi.output_type
class GetAutopilotHealthResult:
    """
    A collection of values returned by getAutopilotHealth.
    """
    def __init__(__self__, datacenter=None, failure_tolerance=None, healthy=None, id=None, servers=None):
        if datacenter and not isinstance(datacenter, str):
            raise TypeError("Expected argument 'datacenter' to be a str")
        pulumi.set(__self__, "datacenter", datacenter)
        if failure_tolerance and not isinstance(failure_tolerance, int):
            raise TypeError("Expected argument 'failure_tolerance' to be a int")
        pulumi.set(__self__, "failure_tolerance", failure_tolerance)
        if healthy and not isinstance(healthy, bool):
            raise TypeError("Expected argument 'healthy' to be a bool")
        pulumi.set(__self__, "healthy", healthy)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if servers and not isinstance(servers, list):
            raise TypeError("Expected argument 'servers' to be a list")
        pulumi.set(__self__, "servers", servers)

    @_builtins.property
    @pulumi.getter
    def datacenter(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "datacenter")

    @_builtins.property
    @pulumi.getter(name="failureTolerance")
    def failure_tolerance(self) -> _builtins.int:
        """
        The number of redundant healthy servers that could fail
        without causing an outage
        """
        return pulumi.get(self, "failure_tolerance")

    @_builtins.property
    @pulumi.getter
    def healthy(self) -> _builtins.bool:
        """
        Whether the server is healthy according to the current Autopilot
        configuration
        """
        return pulumi.get(self, "healthy")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def servers(self) -> Sequence['outputs.GetAutopilotHealthServerResult']:
        """
        A list of server health information. See below for details on the
        available information.
        """
        return pulumi.get(self, "servers")


class AwaitableGetAutopilotHealthResult(GetAutopilotHealthResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAutopilotHealthResult(
            datacenter=self.datacenter,
            failure_tolerance=self.failure_tolerance,
            healthy=self.healthy,
            id=self.id,
            servers=self.servers)


def get_autopilot_health(datacenter: Optional[_builtins.str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAutopilotHealthResult:
    """
    The `get_autopilot_health` data source returns
    [autopilot health information](https://www.consul.io/api/operator/autopilot.html#read-health)
    about the current Consul cluster.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_consul as consul

    read = consul.get_autopilot_health()
    pulumi.export("health", read.healthy)
    ```


    :param _builtins.str datacenter: The datacenter to use. This overrides the agent's
           default datacenter and the datacenter in the provider setup.
    """
    __args__ = dict()
    __args__['datacenter'] = datacenter
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('consul:index/getAutopilotHealth:getAutopilotHealth', __args__, opts=opts, typ=GetAutopilotHealthResult).value

    return AwaitableGetAutopilotHealthResult(
        datacenter=pulumi.get(__ret__, 'datacenter'),
        failure_tolerance=pulumi.get(__ret__, 'failure_tolerance'),
        healthy=pulumi.get(__ret__, 'healthy'),
        id=pulumi.get(__ret__, 'id'),
        servers=pulumi.get(__ret__, 'servers'))
def get_autopilot_health_output(datacenter: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAutopilotHealthResult]:
    """
    The `get_autopilot_health` data source returns
    [autopilot health information](https://www.consul.io/api/operator/autopilot.html#read-health)
    about the current Consul cluster.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_consul as consul

    read = consul.get_autopilot_health()
    pulumi.export("health", read.healthy)
    ```


    :param _builtins.str datacenter: The datacenter to use. This overrides the agent's
           default datacenter and the datacenter in the provider setup.
    """
    __args__ = dict()
    __args__['datacenter'] = datacenter
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('consul:index/getAutopilotHealth:getAutopilotHealth', __args__, opts=opts, typ=GetAutopilotHealthResult)
    return __ret__.apply(lambda __response__: GetAutopilotHealthResult(
        datacenter=pulumi.get(__response__, 'datacenter'),
        failure_tolerance=pulumi.get(__response__, 'failure_tolerance'),
        healthy=pulumi.get(__response__, 'healthy'),
        id=pulumi.get(__response__, 'id'),
        servers=pulumi.get(__response__, 'servers')))
