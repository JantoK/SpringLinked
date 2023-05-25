package event.b_diyEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class SmsSenderListener implements ApplicationListener<RegisterSuccessEvent> {
    @Override
    @Order(2)
    public void onApplicationEvent(RegisterSuccessEvent event) {
        System.out.println("监听到用户注册成功，发送短信。。。");
    }
}
