package basic_di.d_complexfield;

import basic_di.d_complexfield.bean.Dog;
import basic_di.d_complexfield.bean.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("basic_di.d_complexfield.bean")
public class InjectComplexFieldConfiguration {

    @Bean
    @Qualifier("master")
    public Dog robotDog(Person person) {
        Dog dog = new Dog();
        dog.setName("mimi");
        dog.setPerson(master());
        System.out.println(dog);
        return dog;
    }

    @Bean
    public Person master() {
        Person master = new Person();
        master.setName("master");
        return master;
    }
}
