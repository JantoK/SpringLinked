package basic_di.d_complexfield.bean;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class Bird {
    @Resource(name = "master")
    private Person person;

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return person.getName();
    }
}
