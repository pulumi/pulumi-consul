# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

address: Optional[str]

caFile: Optional[str]

caPath: Optional[str]

caPem: Optional[str]

certFile: Optional[str]

certPem: Optional[str]

datacenter: Optional[str]

headers: Optional[str]
"""
Additional headers to send with each Consul request.
"""

httpAuth: Optional[str]

insecureHttps: Optional[bool]

keyFile: Optional[str]

keyPem: Optional[str]

namespace: Optional[str]

scheme: Optional[str]

token: Optional[str]
