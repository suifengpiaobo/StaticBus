package com.blankj.utilcode.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public final class BusUtils {

    public static <T> T post(String name, Object... objects) {
        if (name == null || name.length() == 0) return null;
        return null;
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    public @interface Subscribe {
        String name() default "";
    }
}