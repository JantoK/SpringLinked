package basic_di.d_complexfield.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Person {
    private String name = "admin";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
