package basic_di.d_complexfield;

import basic_di.d_complexfield.bean.Bird;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComplexfieldApplication {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(InjectComplexFieldConfiguration.class);
        Bird bird = ctx.getBean(Bird.class);
        System.out.println(bird);
    }
}
