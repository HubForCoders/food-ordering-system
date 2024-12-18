package top.codershub.order.service.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = { "top.codershub.order.service.dataaccess", "top.codershub.dataaccess" })
@EntityScan(basePackages = { "top.codershub.order.service.dataaccess", "top.codershub.dataaccess"})
@SpringBootApplication(scanBasePackages = "top.codershub")
public class OrderServiceApplication {
    public static void main(String[] args) {
      SpringApplication.run(OrderServiceApplication.class, args);
    }
}
