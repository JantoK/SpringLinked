package basic_di.c_value_spel;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("basic_di.c_value_spel.bean")
@PropertySource("classpath:red.properties")
public class InjectValueConfiguration {
}
