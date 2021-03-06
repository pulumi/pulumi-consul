# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = [
    'GetNetworkSegmentsResult',
    'AwaitableGetNetworkSegmentsResult',
    'get_network_segments',
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

    @property
    @pulumi.getter
    def datacenter(self) -> str:
        """
        The datacenter the segments are being read from.
        """
        return pulumi.get(self, "datacenter")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def segments(self) -> Sequence[str]:
        """
        The list of network segments.
        """
        return pulumi.get(self, "segments")

    @property
    @pulumi.getter
    def token(self) -> Optional[str]:
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


def get_network_segments(datacenter: Optional[str] = None,
                         token: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNetworkSegmentsResult:
    """
    > **NOTE:** This feature requires [Consul Enterprise](https://www.consul.io/docs/enterprise/index.html).

    The `consul_network_segment` data source can be used to retrieve the network
    segments defined in the configuration.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_consul as consul

    segments_network_segments = consul.get_network_segments()
    pulumi.export("segments", segments_network_segments.segments)
    ```


    :param str datacenter: The datacenter to use. This overrides the
           agent's default datacenter and the datacenter in the provider setup.
    :param str token: The ACL token to use. This overrides the
           token that the agent provides by default.
    """
    __args__ = dict()
    __args__['datacenter'] = datacenter
    __args__['token'] = token
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('consul:index/getNetworkSegments:getNetworkSegments', __args__, opts=opts, typ=GetNetworkSegmentsResult).value

    return AwaitableGetNetworkSegmentsResult(
        datacenter=__ret__.datacenter,
        id=__ret__.id,
        segments=__ret__.segments,
        token=__ret__.token)
