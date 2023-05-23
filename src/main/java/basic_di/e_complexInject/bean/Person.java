package basic_di.e_complexInject.bean;

import java.util.*;

public class Person {
    private String[] names;
    private List<String> tels;
    private Set<Cat> cats;
    private Map<String, Object> events;
    private Properties props;

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", tels=" + tels +
                ", cats=" + cats +
                ", events=" + events +
                ", props=" + props +
                '}';
    }

    public void setCats(Set<Cat> cats) {
        this.cats = cats;
    }

    public void setEvents(Map<String, Object> events) {
        this.events = events;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public void setTels(List<String> tels) {
        this.tels = tels;
    }
}
