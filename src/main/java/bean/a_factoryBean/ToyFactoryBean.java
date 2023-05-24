package bean.a_factoryBean;

import bean.a_factoryBean.bean.Ball;
import bean.a_factoryBean.bean.Car;
import bean.a_factoryBean.bean.Child;
import bean.a_factoryBean.bean.Toy;
import org.springframework.beans.factory.FactoryBean;

public class ToyFactoryBean implements FactoryBean<Toy> {
    private Child child;

    public ToyFactoryBean(){
        System.out.println("触发toyfactorybean的默认构造方法");
    }

    @Override
    public Toy getObject() throws Exception {
        switch (child.getWantToy()) {
            case "ball":
                return new Ball("ball");
            case "car":
                return new Car("car");
            default:
                return null;
        }
    }

    @Override
    public Class<Toy> getObjectType() {
        return Toy.class;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
