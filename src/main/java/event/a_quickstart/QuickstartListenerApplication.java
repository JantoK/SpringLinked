package event.a_quickstart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QuickstartListenerApplication {
    public static void main(String[] args) {
        System.out.println("IOC容器正准备初始化");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("event.a_quickstart");
        System.out.println("IOC容器初始化完成。。。");
        ctx.close();
        System.out.println("IOC容器关闭。。。");
    }
}
