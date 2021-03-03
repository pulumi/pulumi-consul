CHANGELOG
=========

## HEAD (Unreleased)
_(none)_

---

## 2.8.2 (2021-03-03)
* Rename LICENSE to LICENSE.txt to ensure no collisions with License resource

## 2.8.1 (2021-02-16)
* Upgrade to pulumi-terraform-bridge v2.19.0  
  **Please Note:** This includes a bug fix that stops mutating resources options in the nodejs provider
* Avoid storing config from the environment into the state

## 2.8.0 (2021-01-29)
* Upgrade to pulumi-terraform-bridge v2.18.1

## 2.7.0 (2021-01-19)
* Upgrade to v2.11.0 of the Consul Terraform Provider

## 2.6.3 (2021-01-13)
* Upgrade to pulumi-terraform-bridge v2.17.0
* Upgrade to Pulumi v2.17.0

## 2.6.2 (2020-11-24)
* Upgrade to pulumi-terraform-bridge v2.13.2  
  * This adds support for import specific examples in documentation

## 2.6.1 (2020-11-09)
* Upgrade to pulumi-terraform-bridge v2.12.1

## 2.6.0 (2020-10-26)
* Upgrade to Pulumi v2.12.0 and pulumi-terraform-bridge v2.11.0
* Improving the accuracy of previews leading to a more accurate understanding of what will actually change rather than assuming all output properties will change.  
  ** PLEASE NOTE:**  
  This new preview functionality can be disabled by setting `PULUMI_DISABLE_PROVIDER_PREVIEW` to `1` or `false`.
* Upgrade to v2.10.1 of the Consul Terraform Provider

## 2.5.0 (2020-09-21)
* Upgrade to v2.10.0 of the Consul Terraform Provider

## 2.4.0 (2020-08-31)
* Upgrade to pulumi-terraform-bridge v2.7.3
* Upgrade to Pulumi v2.9.0, which adds type annotations and input/output classes to Python

## 2.3.0 (2020-07-24)
* Upgrade to v2.9.0 of the Consul Terraform Provider

## 2.2.1 (2020-06-10)
* Switch to GitHub actions for build

## 2.2.0 (2020-05-28)
* Upgrade to Pulumi v2.3.0
* Upgrade to pulumi-terraform-bridge v2.4.0
* Upgrade to v2.8.0 of the Consul Terraform Provider

## 2.1.1 (2020-05-12)
* Upgrade to pulumi-terraform-bridge v2.3.1

## 2.1.0 (2020-04-28)
* Regenerate datasource examples to be async
* Upgrade to pulumi-terraform-bridge v2.1.0

## 2.0.0 (2020-04-17)
* Upgrade to Pulumi v2.0.0
* Upgrade to pulumi-terraform-bridge v2.0.0

## 1.8.0 (2020-04-14)
* Upgrade to Pulumi v1.13.1
* Upgrade to pulumi-terraform-bridge v1.8.4
* Upgrade to terraform-sdk v1.7.0
* Refactor layout to support Go modules

## 1.7.0 (2020-03-31)
* Upgrade to v2.7.0 of the Consul Terraform Provider

## 1.6.0 (2020-03-23)
* Upgrade to Pulumi v1.12.1
* Upgrade to pulumi-terraform-bridge v1.8.2

## 1.5.0 (2020-01-29)
* Upgrade to pulumi-terraform-bridge v1.6.4

## 1.4.0 (2020-01-06)
* Upgrade to pulumi-terraform-bridge v1.5.2

## 1.3.0 (2019-12-04)
* Upgrade to pulumi-terraform-bridge v1.4.3

## 1.2.0 (2019-11-21)
* Upgrade to support go 1.13.x
* Upgrade to pulumi-terraform-bridge v1.4.0

## 1.1.0 (2019-11-15)
* Add support for DotNet SDK Generation

## 1.0.0 (2019-10-29)
* Initial release of the provider
