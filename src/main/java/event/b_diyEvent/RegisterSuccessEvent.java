package event.b_diyEvent;

import org.springframework.context.ApplicationEvent;

public class RegisterSuccessEvent extends ApplicationEvent {

    public RegisterSuccessEvent(Object source){
        super(source);
    }
}
