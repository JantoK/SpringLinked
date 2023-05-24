package bean.c_instantiate;

import bean.c_instantiate.bean.Car;

public class CarInstanceFactory {
    public Car getCar(){
        return new Car();
    }
}
