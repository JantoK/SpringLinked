package configuration.c_conditional.anno;

import configuration.c_conditional.config.BartenderConfiguration;
import configuration.c_conditional.registrar.WaiterRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({BartenderConfiguration.class, WaiterRegistrar.class})
public @interface EnableTavern {
}
