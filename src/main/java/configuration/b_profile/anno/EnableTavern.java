package configuration.b_profile.anno;

import configuration.b_profile.config.BartenderConfiguration;
import configuration.b_profile.component.Boss;
import configuration.b_profile.registrar.WaiterRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Boss.class, BartenderConfiguration.class, WaiterRegistrar.class})
public @interface EnableTavern {
}
