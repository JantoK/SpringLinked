package configuration.c_conditional.selector;

import configuration.c_conditional.config.TavernConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class TavernApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("city");
        ctx.register(TavernConfiguration.class);
        ctx.refresh();
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
        //System.out.println("--------------------------");
        //Map<String, Bartender> bartenders = ctx.getBeansOfType(Bartender.class);
        //bartenders.forEach((name, bartender) -> System.out.println(bartender));
    }
}
