package javalearning.javalearning.config;

import javalearning.javalearning.common.base.BaseServiceImpl;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/8/27
 * @Time: 20:09
 */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(
        validatedBy = {}
)
public @interface NotExists {
    String fieldName();

    String shopId();

    Class<? extends BaseServiceImpl> baseService();
    String message() default "你成功了";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};



    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public @interface List {
        NotExists[] value();
    }
}
