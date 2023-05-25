package event.b_diyEvent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RegisterEventApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("event.b_diyEvent");
        RegisterService registerService = ctx.getBean(RegisterService.class);
        registerService.register("Janto");
    }
}
