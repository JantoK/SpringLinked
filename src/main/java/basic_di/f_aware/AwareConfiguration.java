package basic_di.f_aware;

import basic_di.f_aware.bean.AwareTestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AwareConfiguration {

    @Bean
    public AwareTestBean bbb(){
        return new AwareTestBean();
    }
}
