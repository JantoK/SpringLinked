package bean.c_instantiate;

import bean.c_instantiate.bean.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInstantiateXmlApplication {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-instantiate.xml");
        ctx.getBeansOfType(Car.class).forEach((beanName, car) -> {
            System.out.println(beanName + " : " + car);
        });
    }
}
