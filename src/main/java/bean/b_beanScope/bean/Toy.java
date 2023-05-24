package bean.b_beanScope.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Toy {
    public Toy() {
        System.out.println("Toy constructor run ...");
    }
}
