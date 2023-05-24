package basic_di.f_aware;

import basic_di.f_aware.bean.AwareTestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareApplication {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AwareConfiguration.class);
        AwareTestBean bbb = ctx.getBean(AwareTestBean.class);
        bbb.printBeansName();
        System.out.println("-----------------");
        System.out.println(bbb.getBeanName());
    }
}
