package basic_di.e_complexInject.bean;

import org.springframework.stereotype.Component;

@Component("miaomiao")
public class Cat {
    private String name = "a cat";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
