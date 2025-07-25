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

__all__ = [
    'GetNetworkSegmentsResult',
    'AwaitableGetNetworkSegmentsResult',
    'get_network_segments',
    'get_network_segments_output',
]

@pulumi.output_type
class GetNetworkSegmentsResult:
    """
    A collection of values returned by getNetworkSegments.
    """
    def __init__(__self__, datacenter=None, id=None, segments=None, token=None):
        if datacenter and not isinstance(datacenter, str):
            raise TypeError("Expected argument 'datacenter' to be a str")
        pulumi.set(__self__, "datacenter", datacenter)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if segments and not isinstance(segments, list):
            raise TypeError("Expected argument 'segments' to be a list")
        pulumi.set(__self__, "segments", segments)
        if token and not isinstance(token, str):
            raise TypeError("Expected argument 'token' to be a str")
        pulumi.set(__self__, "token", token)

    @_builtins.property
    @pulumi.getter
    def datacenter(self) -> _builtins.str:
        """
        The datacenter the segments are being read from.
        """
        return pulumi.get(self, "datacenter")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def segments(self) -> Sequence[_builtins.str]:
        """
        The list of network segments.
        """
        return pulumi.get(self, "segments")

    @_builtins.property
    @pulumi.getter
    @_utilities.deprecated("""The token argument has been deprecated and will be removed in a future release.
Please use the token argument in the provider configuration""")
    def token(self) -> Optional[_builtins.str]:
        return pulumi.get(self, "token")


class AwaitableGetNetworkSegmentsResult(GetNetworkSegmentsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNetworkSegmentsResult(
            datacenter=self.datacenter,
            id=self.id,
            segments=self.segments,
            token=self.token)


def get_network_segments(datacenter: Optional[_builtins.str] = None,
                         token: Optional[_builtins.str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNetworkSegmentsResult:
    """
    > **NOTE:** This feature requires [Consul Enterprise](https://www.consul.io/docs/enterprise/index.html).

    The `consul_network_segment` data source can be used to retrieve the network
    segments defined in the configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_consul as consul

    segments = consul.get_network_segments()
    pulumi.export("segments", segments.segments)
    ```


    :param _builtins.str datacenter: The datacenter to use. This overrides the
           agent's default datacenter and the datacenter in the provider setup.
    :param _builtins.str token: The ACL token to use. This overrides the
           token that the agent provides by default.
    """
    __args__ = dict()
    __args__['datacenter'] = datacenter
    __args__['token'] = token
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('consul:index/getNetworkSegments:getNetworkSegments', __args__, opts=opts, typ=GetNetworkSegmentsResult).value

    return AwaitableGetNetworkSegmentsResult(
        datacenter=pulumi.get(__ret__, 'datacenter'),
        id=pulumi.get(__ret__, 'id'),
        segments=pulumi.get(__ret__, 'segments'),
        token=pulumi.get(__ret__, 'token'))
def get_network_segments_output(datacenter: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                token: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetNetworkSegmentsResult]:
    """
    > **NOTE:** This feature requires [Consul Enterprise](https://www.consul.io/docs/enterprise/index.html).

    The `consul_network_segment` data source can be used to retrieve the network
    segments defined in the configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_consul as consul

    segments = consul.get_network_segments()
    pulumi.export("segments", segments.segments)
    ```


    :param _builtins.str datacenter: The datacenter to use. This overrides the
           agent's default datacenter and the datacenter in the provider setup.
    :param _builtins.str token: The ACL token to use. This overrides the
           token that the agent provides by default.
    """
    __args__ = dict()
    __args__['datacenter'] = datacenter
    __args__['token'] = token
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('consul:index/getNetworkSegments:getNetworkSegments', __args__, opts=opts, typ=GetNetworkSegmentsResult)
    return __ret__.apply(lambda __response__: GetNetworkSegmentsResult(
        datacenter=pulumi.get(__response__, 'datacenter'),
        id=pulumi.get(__response__, 'id'),
        segments=pulumi.get(__response__, 'segments'),
        token=pulumi.get(__response__, 'token')))
