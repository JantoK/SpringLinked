package configuration.a_module;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {
    @Bean
    public Bar bbar () {
        return new Bar();
    }
}
