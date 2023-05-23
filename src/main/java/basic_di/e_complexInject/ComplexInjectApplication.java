package basic_di.e_complexInject;

import basic_di.e_complexInject.bean.Person2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComplexInjectApplication {
    public static void main(String[] args){
        // ApplicationContext ctx = new ClassPathXmlApplicationContext("e_complexInject.xml");
        ApplicationContext ctx = new AnnotationConfigApplicationContext("basic_di.e_complexInject.bean");
        Person2 person2 = ctx.getBean(Person2.class);
        System.out.println(person2);
    }
}
