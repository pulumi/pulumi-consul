// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.outputs;

import com.pulumi.consul.outputs.GetAclAuthMethodNamespaceRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAclAuthMethodResult {
    /**
     * @return The configuration options of the ACL Auth Method. This attribute is
     * deprecated and will be removed in a future version. If the configuration is
     * too complex to be represented as a map of strings, it will be blank.
     * `config_json` should be used instead.
     * 
     * @deprecated
     * The config attribute is deprecated, please use config_json instead.
     * 
     */
    @Deprecated /* The config attribute is deprecated, please use config_json instead. */
    private Map<String,String> config;
    /**
     * @return The configuration options of the ACL Auth Method.
     * 
     */
    private String configJson;
    /**
     * @return The description of the ACL Auth Method.
     * 
     */
    private String description;
    /**
     * @return An optional name to use instead of the name attribute when
     * displaying information about this auth method.
     * 
     */
    private String displayName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The maximum life of any token created by this auth method.
     * 
     */
    private String maxTokenTtl;
    private String name;
    private @Nullable String namespace;
    /**
     * @return (Enterprise Only) A set of rules that control which
     * namespace tokens created via this auth method will be created within
     * 
     */
    private List<GetAclAuthMethodNamespaceRule> namespaceRules;
    private @Nullable String partition;
    /**
     * @return The kind of token that this auth method produces. This can
     * be either &#39;local&#39; or &#39;global&#39;.
     * 
     */
    private String tokenLocality;
    /**
     * @return The type of the ACL Auth Method.
     * 
     */
    private String type;

    private GetAclAuthMethodResult() {}
    /**
     * @return The configuration options of the ACL Auth Method. This attribute is
     * deprecated and will be removed in a future version. If the configuration is
     * too complex to be represented as a map of strings, it will be blank.
     * `config_json` should be used instead.
     * 
     * @deprecated
     * The config attribute is deprecated, please use config_json instead.
     * 
     */
    @Deprecated /* The config attribute is deprecated, please use config_json instead. */
    public Map<String,String> config() {
        return this.config;
    }
    /**
     * @return The configuration options of the ACL Auth Method.
     * 
     */
    public String configJson() {
        return this.configJson;
    }
    /**
     * @return The description of the ACL Auth Method.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return An optional name to use instead of the name attribute when
     * displaying information about this auth method.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The maximum life of any token created by this auth method.
     * 
     */
    public String maxTokenTtl() {
        return this.maxTokenTtl;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return (Enterprise Only) A set of rules that control which
     * namespace tokens created via this auth method will be created within
     * 
     */
    public List<GetAclAuthMethodNamespaceRule> namespaceRules() {
        return this.namespaceRules;
    }
    public Optional<String> partition() {
        return Optional.ofNullable(this.partition);
    }
    /**
     * @return The kind of token that this auth method produces. This can
     * be either &#39;local&#39; or &#39;global&#39;.
     * 
     */
    public String tokenLocality() {
        return this.tokenLocality;
    }
    /**
     * @return The type of the ACL Auth Method.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAclAuthMethodResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> config;
        private String configJson;
        private String description;
        private String displayName;
        private String id;
        private String maxTokenTtl;
        private String name;
        private @Nullable String namespace;
        private List<GetAclAuthMethodNamespaceRule> namespaceRules;
        private @Nullable String partition;
        private String tokenLocality;
        private String type;
        public Builder() {}
        public Builder(GetAclAuthMethodResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.configJson = defaults.configJson;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.maxTokenTtl = defaults.maxTokenTtl;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.namespaceRules = defaults.namespaceRules;
    	      this.partition = defaults.partition;
    	      this.tokenLocality = defaults.tokenLocality;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder config(Map<String,String> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        @CustomType.Setter
        public Builder configJson(String configJson) {
            this.configJson = Objects.requireNonNull(configJson);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder maxTokenTtl(String maxTokenTtl) {
            this.maxTokenTtl = Objects.requireNonNull(maxTokenTtl);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder namespaceRules(List<GetAclAuthMethodNamespaceRule> namespaceRules) {
            this.namespaceRules = Objects.requireNonNull(namespaceRules);
            return this;
        }
        public Builder namespaceRules(GetAclAuthMethodNamespaceRule... namespaceRules) {
            return namespaceRules(List.of(namespaceRules));
        }
        @CustomType.Setter
        public Builder partition(@Nullable String partition) {
            this.partition = partition;
            return this;
        }
        @CustomType.Setter
        public Builder tokenLocality(String tokenLocality) {
            this.tokenLocality = Objects.requireNonNull(tokenLocality);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAclAuthMethodResult build() {
            final var o = new GetAclAuthMethodResult();
            o.config = config;
            o.configJson = configJson;
            o.description = description;
            o.displayName = displayName;
            o.id = id;
            o.maxTokenTtl = maxTokenTtl;
            o.name = name;
            o.namespace = namespace;
            o.namespaceRules = namespaceRules;
            o.partition = partition;
            o.tokenLocality = tokenLocality;
            o.type = type;
            return o;
        }
    }
}