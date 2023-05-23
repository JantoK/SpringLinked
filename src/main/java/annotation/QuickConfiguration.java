package annotation;

import org.springframework.context.annotation.Configuration;

@Configuration
public class QuickConfiguration {

    // @Bean("Janto")
    public Person person() {
        Person person = new Person();
        person.setName("Houston");
        person.setAge(12);
        return person;
    }
}
