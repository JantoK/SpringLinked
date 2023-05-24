package basic_di.f_aware.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.stream.Stream;

public class AwareTestBean implements ApplicationContextAware, BeanNameAware {
    private ApplicationContext ctx;
    private String beanName;

    public String getBeanName() {
        return beanName;
    }

    public void printBeansName(){
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }
}
