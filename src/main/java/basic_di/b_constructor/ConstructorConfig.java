package basic_di.b_constructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConstructorConfig {
    @Bean
    public Person person() {
        return new Person("ByCons",16);
    }
}
