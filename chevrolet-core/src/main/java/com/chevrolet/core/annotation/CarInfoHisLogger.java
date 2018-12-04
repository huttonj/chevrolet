package com.chevrolet.core.annotation;

import java.lang.annotation.*;

/**
 * Created by maihe on 2017/7/4.
 */

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CarInfoHisLogger {
}
