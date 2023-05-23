package basic_di.b_constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuickstartByConstructorlApplication {
    public static void main(String[] args) {
        // BeanFactory beanFactory = new ClassPathXmlApplicationContext("inject-set-byConstructor.xml");
        // Person person = beanFactory.getBean(Person.class);
        // System.out.println(person.getName());

        BeanFactory beanFactory = new AnnotationConfigApplicationContext(ConstructorConfig.class);
        System.out.println(beanFactory.getBean(Person.class).getName());

    }
}
