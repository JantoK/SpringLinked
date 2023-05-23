package basic_di.c_value_spel.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Blue {
    @Value("#{'blue-value-byspel'}")
    private String name;

    @Value("#{6}")
    private Integer order;

    public Integer getOrder() {
        return order;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Blue{" + "name='" + name + '\'' + ", order=" + order + '}';
    }
}
