package bean.c_instantiate;

import bean.c_instantiate.bean.Car;

public class CarStaticFactory {
    public static Car getCar() {
        System.out.println("通过工厂创建的Car出来啦");
        return new Car();
    }
}
