package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages="hello,com.sunnycorp.model,com.sunnycorp.repository,com.sunnycorp.controller, com.sunnycorp.orchestrator")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
	@Bean
    public RestTemplate geRestTemplate() {
        return new RestTemplate();
    }
}
