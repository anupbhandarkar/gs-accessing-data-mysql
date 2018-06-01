package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories("anup")
@SpringBootApplication

public class Application1 {

    public static void main(String[] args) {
        SpringApplication.run(Application1.class, args);
    }
}
