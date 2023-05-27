package configuration.c_conditional.condition;

import configuration.c_conditional.anno.ConditionalOnBean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class OnBeanCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditionalOnBean.class.getName());
        Class<?>[] classes = (Class<?>[]) attributes.get("value");
        for (Class<?> classe : classes) {
            if (!context.getBeanFactory().containsBeanDefinition(classe.getName())){
                return false;
            }
        }

        String[] beanNames = (String[]) attributes.get("beanNames");
        for (String beanName : beanNames) {
            if (!context.getBeanFactory().containsBeanDefinition(beanName)){
                return false;
            }
        }
        return true;
    }
}
