package basic_di.d_complexfield.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    @Value("wangwang")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//  @Autowired
    private Person person;

//    @Autowired
//    public Dog(Person person) {
//        this.person = person;
//    }

    @Autowired
    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return getName() + " is " + person.getName() + "'s doggie";
    }
}
