package bean.a_factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(FactoryBeanConfiguration.class);
        //Toy toy1 = ctx.getBean(Toy.class);
        //System.out.println(toy);
        //Toy toy2 = ctx.getBean(Toy.class);
        System.out.println(ctx.getBean("&toyFactoryBean"));
    }
}
