// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.consul.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreparedQueryTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreparedQueryTemplateArgs Empty = new PreparedQueryTemplateArgs();

    /**
     * The regular expression to match with. When using `name_prefix_match`, this regex is applied against the query name.
     * 
     */
    @Import(name="regexp", required=true)
    private Output<String> regexp;

    /**
     * @return The regular expression to match with. When using `name_prefix_match`, this regex is applied against the query name.
     * 
     */
    public Output<String> regexp() {
        return this.regexp;
    }

    /**
     * If set to true, will cause the tags list inside the service structure to be stripped of any empty strings.
     * 
     */
    @Import(name="removeEmptyTags")
    private @Nullable Output<Boolean> removeEmptyTags;

    /**
     * @return If set to true, will cause the tags list inside the service structure to be stripped of any empty strings.
     * 
     */
    public Optional<Output<Boolean>> removeEmptyTags() {
        return Optional.ofNullable(this.removeEmptyTags);
    }

    /**
     * The type of template matching to perform. Currently only `name_prefix_match` is supported.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of template matching to perform. Currently only `name_prefix_match` is supported.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private PreparedQueryTemplateArgs() {}

    private PreparedQueryTemplateArgs(PreparedQueryTemplateArgs $) {
        this.regexp = $.regexp;
        this.removeEmptyTags = $.removeEmptyTags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreparedQueryTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreparedQueryTemplateArgs $;

        public Builder() {
            $ = new PreparedQueryTemplateArgs();
        }

        public Builder(PreparedQueryTemplateArgs defaults) {
            $ = new PreparedQueryTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param regexp The regular expression to match with. When using `name_prefix_match`, this regex is applied against the query name.
         * 
         * @return builder
         * 
         */
        public Builder regexp(Output<String> regexp) {
            $.regexp = regexp;
            return this;
        }

        /**
         * @param regexp The regular expression to match with. When using `name_prefix_match`, this regex is applied against the query name.
         * 
         * @return builder
         * 
         */
        public Builder regexp(String regexp) {
            return regexp(Output.of(regexp));
        }

        /**
         * @param removeEmptyTags If set to true, will cause the tags list inside the service structure to be stripped of any empty strings.
         * 
         * @return builder
         * 
         */
        public Builder removeEmptyTags(@Nullable Output<Boolean> removeEmptyTags) {
            $.removeEmptyTags = removeEmptyTags;
            return this;
        }

        /**
         * @param removeEmptyTags If set to true, will cause the tags list inside the service structure to be stripped of any empty strings.
         * 
         * @return builder
         * 
         */
        public Builder removeEmptyTags(Boolean removeEmptyTags) {
            return removeEmptyTags(Output.of(removeEmptyTags));
        }

        /**
         * @param type The type of template matching to perform. Currently only `name_prefix_match` is supported.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of template matching to perform. Currently only `name_prefix_match` is supported.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public PreparedQueryTemplateArgs build() {
            if ($.regexp == null) {
                throw new MissingRequiredPropertyException("PreparedQueryTemplateArgs", "regexp");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("PreparedQueryTemplateArgs", "type");
            }
            return $;
        }
    }

}
