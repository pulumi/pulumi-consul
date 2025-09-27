# Install Pulumi and plugins required at build time.
install_plugins: .make/install_plugins
.make/install_plugins: export PULUMI_HOME := $(WORKING_DIR)/.pulumi
.make/install_plugins:
	pulumi plugin install converter terraform 1.0.16
	pulumi plugin install resource aws 4.0.0
	pulumi plugin install resource vault 4.0.0
	pulumi plugin install resource random 4.14.0
	pulumi plugin install resource std 1.6.2
	@touch $@
.PHONY: install_plugins
