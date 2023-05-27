package configuration.c_conditional.config;

import configuration.c_conditional.anno.ConditionalOnBean;
import configuration.c_conditional.component.Bar;
import configuration.c_conditional.component.Boss;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {
    @Bean
    @ConditionalOnBean(Boss.class)
    public Bar bbar () {
        return new Bar();
    }
}
