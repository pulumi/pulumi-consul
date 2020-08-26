[![Actions Status](https://github.com/pulumi/pulumi-consul/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-consul/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Fconsul.svg)](https://www.npmjs.com/package/@pulumi/consul)
[![Python version](https://badge.fury.io/py/pulumi-consul.svg)](https://pypi.org/project/pulumi-consul)
[![NuGet version](https://badge.fury.io/nu/pulumi.consul.svg)](https://badge.fury.io/nu/pulumi.consul)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-consul/sdk/v2/go)](https://pkg.go.dev/github.com/pulumi/pulumi-consul/sdk/v2/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-consul/blob/master/LICENSE)

# Hashicorp Consul Resource Provider

The Consul resource provider for Pulumi lets you manage Consul resources in your cloud programs. To use
this package, please [install the Pulumi CLI first](https://pulumi.io/).

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/consul

or `yarn`:

    $ yarn add @pulumi/consul

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_consul

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-consul/sdk/v2/go/...

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Consul

## Configuration

The following configuration points are available:

- `consul:address` - (Optional) The HTTP(S) API address of the agent to use. Defaults to `127.0.0.1:8500`.
- `consul:scheme` - (Optional) The URL scheme of the agent to use (`http` or `https`). Defaults to `http`.
- `consul:httpAuth` - (Optional) HTTP Basic Authentication credentials to be used when communicating with Consul, in the
  format of either user or user:pass. This may also be specified using the `CONSUL_HTTP_AUTH` environment variable.
- `consul:datacenter` - (Optional) The datacenter to use. Defaults to that of the agent.
- `consul:token` - (Optional) The ACL token to use by default when making requests to the agent. Can also be specified 
  with `CONSUL_HTTP_TOKEN` or `CONSUL_TOKEN` as an environment variable.
- `consul:caFile` - (Optional) A path to a PEM-encoded certificate authority used to verify the remote agent's certificate.
- `consul:certFile` - (Optional) A path to a PEM-encoded certificate provided to the remote agent; requires use of `keyFile`.
- `consul:keyFile` - (Optional) A path to a PEM-encoded private key, required if `certFile` is specified.
- `consul:caPath` - (Optional) A path to a directory of PEM-encoded certificate authority files to use to check the 
  authenticity of client and server connections. Can also be specified with the `CONSUL_CAPATH` environment variable.
- `consul:insecureHttps` - (Optional) Boolean value to disable SSL certificate verification; setting this value to true 
  is not recommended for production use. Only use this with scheme set to `https`.

## Reference

For further information, please visit [the Consul provider docs](https://www.pulumi.com/docs/intro/cloud-providers/consul) or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/consul).
