package com.Koa.springbootinit.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 权限校验
 *
 * @author <a href=" https://github.com/Zhangwhhoumiandoushixiadade">程序员Koa</a>
 * @from <a href=" https://github.com/Zhangwhhoumiandoushixiadade">Koa</a>
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthCheck {

    /**
     * 必须有某个角色
     *
     * @return
     */
    String mustRole() default "";

}

