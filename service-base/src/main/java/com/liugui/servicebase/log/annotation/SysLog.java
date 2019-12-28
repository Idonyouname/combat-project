package com.liugui.servicebase.log.annotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

    /**
     * 日志描述信息
     *
     * @return
     */
    String description() default "";
}
