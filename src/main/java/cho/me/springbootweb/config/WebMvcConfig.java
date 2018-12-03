package cho.me.springbootweb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{
   /* @Bean
    public HttpMessageConverters httpMessageConverters(){
        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
        return new HttpMessageConverters(converter);
    }*/

}
