package lifecycle.a_initmethod.bean;

public class Cat {

    private String name;

    public Cat(){
        System.out.println("猫猫被初始化构造函数创建了");
    }

    public void setName(String name) {
        System.out.println("猫猫执行了setName方法");
        this.name = name;
    }

    public void init() {
        System.out.println("猫猫：" + name + "被初始化了。。。");
    }
    public void destroy() {
        System.out.println("猫猫：" + name + "被销毁了。。。");
    }
}
