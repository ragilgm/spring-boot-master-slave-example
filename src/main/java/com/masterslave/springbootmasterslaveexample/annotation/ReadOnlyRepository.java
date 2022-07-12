package com.masterslave.springbootmasterslaveexample.annotation;

import java.lang.annotation.*;

/**
 * @Author : Ragil Gilang Maulana
 * @Date : 11/07/22
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
public @interface ReadOnlyRepository {
}
