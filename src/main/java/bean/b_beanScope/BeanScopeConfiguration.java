package bean.b_beanScope;

import bean.b_beanScope.bean.Child;
import bean.b_beanScope.bean.Toy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("bean.b_beanScope.bean")
public class BeanScopeConfiguration {

    @Bean
    @Scope("singleton")
    public Child child1(Toy toy){
        Child child = new Child();
        child.setToy(toy);
        return child;
    }

    @Bean
    @Scope("singleton")
    public Child child2(Toy toy){
        Child child = new Child();
        child.setToy(toy);
        return child;
    }
}
