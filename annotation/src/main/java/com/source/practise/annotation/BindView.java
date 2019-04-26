package com.source.practise.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Class: com.source.practise.annotation.BindView</p>
 * <p>Description: </p>
 * <pre>
 *
 *  </pre>
 *
 * @author lujunjie
 * @date 2019/4/26/16:44.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface  BindView {

    int value();
}
