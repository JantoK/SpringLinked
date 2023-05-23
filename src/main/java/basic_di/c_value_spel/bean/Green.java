package basic_di.c_value_spel.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Green {

    @Value("#{'copy-of' + blue.name}")
    private String name;

    @Value("#{blue.order + 2}")
    private Integer order;

    @Override
    public String toString() {
        return "Green{" + "name='" + name + '\'' + ", order=" + order + '}';
    }
}
