package com.zoom.node;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Created by liangbo.zhou on 18-4-23.
 */
@Target(value = {ElementType.FIELD})
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface GlobalProperty {
    final static String DEFAULT_NULL_STRING = "very-magic-zoom-default-null-value-you-can-not-use-this$#%@#$%@#$%";

    String name();
    String defaultValue() default DEFAULT_NULL_STRING;
    boolean required() default false;
}

