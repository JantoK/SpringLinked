package lifecycle.b_jsr250;

import lifecycle.b_jsr250.bean.Pen;
import org.springframework.context.annotation.Bean;

public class JSR250Configuration {
    @Bean(initMethod = "open", destroyMethod = "close")
    public Pen pen() {
        return new Pen();
    }
}
