package study.astro.pratice.hellospring.byannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    MessageService serviceBean() {
        return new MessageServiceImpl();
    }
}
