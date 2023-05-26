package configuration.c_conditional.config;

import configuration.c_conditional.anno.ConditionalOnBean;
import configuration.c_conditional.component.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {
    @Bean
    @ConditionalOnBean(beanNames = "configuration.c_conditional.component.Boss")
    public Bar bbar () {
        return new Bar();
    }
}
