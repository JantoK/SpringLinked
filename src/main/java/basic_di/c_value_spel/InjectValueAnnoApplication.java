package basic_di.c_value_spel;

import basic_di.c_value_spel.bean.Green;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectValueAnnoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(InjectValueConfiguration.class);
        Green green = ctx.getBean(Green.class);
        System.out.println(green.toString());
    }
}
