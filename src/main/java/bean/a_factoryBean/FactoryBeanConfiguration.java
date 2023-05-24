package bean.a_factoryBean;

import bean.a_factoryBean.bean.Child;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfiguration {
    @Bean
    public Child child() {
        return new Child();
    }

    //@Bean
    //public Ball ball() {
    //    return new Ball("bean-ball");
    //}

    @Bean
    public ToyFactoryBean toyFactoryBean() {
        ToyFactoryBean toyFactoryBean = new ToyFactoryBean();
        toyFactoryBean.setChild(child());
        return toyFactoryBean;
    }
}
