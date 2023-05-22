package basic_di.a_quickstart_set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickstartInjectBySetXmlApplication {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("inject-set.xml");
        Person person = beanFactory.getBean(Person.class);
        System.out.println(person.getName());

        Cat cat = beanFactory.getBean(Cat.class);
        System.out.println(cat.getMaster());
    }
}
