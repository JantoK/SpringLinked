package basic_dl.d_withanno;

import basic_dl.d_withanno.anno.Color;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.stream.Stream;

public class WithAnnoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("withAnno.xml");
        Map<String, Object> beans = ctx.getBeansWithAnnotation(Color.class);
        beans.forEach((beanName, bean) ->{
            System.out.println(beanName + ":" + bean);
        });
        String[] beansName = ctx.getBeanDefinitionNames();

        Stream.of(beansName).forEach(System.out::println);

        for (String beanName: beansName) {
            System.out.println(ctx.getBean(beanName));
        }
    }
}
