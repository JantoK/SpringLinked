package bean.b_beanScope;

import bean.b_beanScope.bean.Child;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopeAnnoApplication {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanScopeConfiguration.class);
        ctx.getBeansOfType(Child.class).forEach((name, child) -> {
            System.out.println(name + " : " + child.getToy());
        });
    }
}
