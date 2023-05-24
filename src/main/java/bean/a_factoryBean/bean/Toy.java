package bean.a_factoryBean.bean;

public abstract class Toy {
    private String name;

    public Toy(String name){
        System.out.println("触发了toy的构造方法生产了一个name: " + name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                '}';
    }
}
