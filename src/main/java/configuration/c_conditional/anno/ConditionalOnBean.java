package configuration.c_conditional.anno;

import configuration.c_conditional.condition.OnBeanCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Conditional(OnBeanCondition.class)
public @interface ConditionalOnBean {
    String[] beanNames() default {};

    Class<?>[] value() default {};
}
