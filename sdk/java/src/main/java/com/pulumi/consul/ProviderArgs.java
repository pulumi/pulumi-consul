// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul;

import com.pulumi.consul.inputs.ProviderHeaderArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    @Import(name="address")
    private @Nullable Output<String> address;

    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    @Import(name="caFile")
    private @Nullable Output<String> caFile;

    public Optional<Output<String>> caFile() {
        return Optional.ofNullable(this.caFile);
    }

    @Import(name="caPath")
    private @Nullable Output<String> caPath;

    public Optional<Output<String>> caPath() {
        return Optional.ofNullable(this.caPath);
    }

    @Import(name="caPem")
    private @Nullable Output<String> caPem;

    public Optional<Output<String>> caPem() {
        return Optional.ofNullable(this.caPem);
    }

    @Import(name="certFile")
    private @Nullable Output<String> certFile;

    public Optional<Output<String>> certFile() {
        return Optional.ofNullable(this.certFile);
    }

    @Import(name="certPem")
    private @Nullable Output<String> certPem;

    public Optional<Output<String>> certPem() {
        return Optional.ofNullable(this.certPem);
    }

    @Import(name="datacenter")
    private @Nullable Output<String> datacenter;

    public Optional<Output<String>> datacenter() {
        return Optional.ofNullable(this.datacenter);
    }

    /**
     * Additional headers to send with each Consul request.
     * 
     */
    @Import(name="headers", json=true)
    private @Nullable Output<List<ProviderHeaderArgs>> headers;

    /**
     * @return Additional headers to send with each Consul request.
     * 
     */
    public Optional<Output<List<ProviderHeaderArgs>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    @Import(name="httpAuth")
    private @Nullable Output<String> httpAuth;

    public Optional<Output<String>> httpAuth() {
        return Optional.ofNullable(this.httpAuth);
    }

    @Import(name="insecureHttps", json=true)
    private @Nullable Output<Boolean> insecureHttps;

    public Optional<Output<Boolean>> insecureHttps() {
        return Optional.ofNullable(this.insecureHttps);
    }

    @Import(name="keyFile")
    private @Nullable Output<String> keyFile;

    public Optional<Output<String>> keyFile() {
        return Optional.ofNullable(this.keyFile);
    }

    @Import(name="keyPem")
    private @Nullable Output<String> keyPem;

    public Optional<Output<String>> keyPem() {
        return Optional.ofNullable(this.keyPem);
    }

    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    @Import(name="scheme")
    private @Nullable Output<String> scheme;

    public Optional<Output<String>> scheme() {
        return Optional.ofNullable(this.scheme);
    }

    @Import(name="token")
    private @Nullable Output<String> token;

    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.address = $.address;
        this.caFile = $.caFile;
        this.caPath = $.caPath;
        this.caPem = $.caPem;
        this.certFile = $.certFile;
        this.certPem = $.certPem;
        this.datacenter = $.datacenter;
        this.headers = $.headers;
        this.httpAuth = $.httpAuth;
        this.insecureHttps = $.insecureHttps;
        this.keyFile = $.keyFile;
        this.keyPem = $.keyPem;
        this.namespace = $.namespace;
        this.scheme = $.scheme;
        this.token = $.token;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        public Builder address(String address) {
            return address(Output.of(address));
        }

        public Builder caFile(@Nullable Output<String> caFile) {
            $.caFile = caFile;
            return this;
        }

        public Builder caFile(String caFile) {
            return caFile(Output.of(caFile));
        }

        public Builder caPath(@Nullable Output<String> caPath) {
            $.caPath = caPath;
            return this;
        }

        public Builder caPath(String caPath) {
            return caPath(Output.of(caPath));
        }

        public Builder caPem(@Nullable Output<String> caPem) {
            $.caPem = caPem;
            return this;
        }

        public Builder caPem(String caPem) {
            return caPem(Output.of(caPem));
        }

        public Builder certFile(@Nullable Output<String> certFile) {
            $.certFile = certFile;
            return this;
        }

        public Builder certFile(String certFile) {
            return certFile(Output.of(certFile));
        }

        public Builder certPem(@Nullable Output<String> certPem) {
            $.certPem = certPem;
            return this;
        }

        public Builder certPem(String certPem) {
            return certPem(Output.of(certPem));
        }

        public Builder datacenter(@Nullable Output<String> datacenter) {
            $.datacenter = datacenter;
            return this;
        }

        public Builder datacenter(String datacenter) {
            return datacenter(Output.of(datacenter));
        }

        /**
         * @param headers Additional headers to send with each Consul request.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<List<ProviderHeaderArgs>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers Additional headers to send with each Consul request.
         * 
         * @return builder
         * 
         */
        public Builder headers(List<ProviderHeaderArgs> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param headers Additional headers to send with each Consul request.
         * 
         * @return builder
         * 
         */
        public Builder headers(ProviderHeaderArgs... headers) {
            return headers(List.of(headers));
        }

        public Builder httpAuth(@Nullable Output<String> httpAuth) {
            $.httpAuth = httpAuth;
            return this;
        }

        public Builder httpAuth(String httpAuth) {
            return httpAuth(Output.of(httpAuth));
        }

        public Builder insecureHttps(@Nullable Output<Boolean> insecureHttps) {
            $.insecureHttps = insecureHttps;
            return this;
        }

        public Builder insecureHttps(Boolean insecureHttps) {
            return insecureHttps(Output.of(insecureHttps));
        }

        public Builder keyFile(@Nullable Output<String> keyFile) {
            $.keyFile = keyFile;
            return this;
        }

        public Builder keyFile(String keyFile) {
            return keyFile(Output.of(keyFile));
        }

        public Builder keyPem(@Nullable Output<String> keyPem) {
            $.keyPem = keyPem;
            return this;
        }

        public Builder keyPem(String keyPem) {
            return keyPem(Output.of(keyPem));
        }

        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public Builder scheme(@Nullable Output<String> scheme) {
            $.scheme = scheme;
            return this;
        }

        public Builder scheme(String scheme) {
            return scheme(Output.of(scheme));
        }

        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        public Builder token(String token) {
            return token(Output.of(token));
        }

        public ProviderArgs build() {
            return $;
        }
    }

}