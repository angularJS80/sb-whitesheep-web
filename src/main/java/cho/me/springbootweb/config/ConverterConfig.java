package cho.me.springbootweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;

//@Configuration
public class ConverterConfig {
    @Bean
    public ConfigurableWebBindingInitializer configurableWebBindingInitializer(){
        ConfigurableWebBindingInitializer configurableWebBindingInitializer = new ConfigurableWebBindingInitializer();
        ConfigurableConversionService configurableConversionService = new FormattingConversionService();
        configurableConversionService.addConverter(new UserNameConverter());
        configurableWebBindingInitializer.setConversionService(configurableConversionService);
        return configurableWebBindingInitializer;
    }
}
