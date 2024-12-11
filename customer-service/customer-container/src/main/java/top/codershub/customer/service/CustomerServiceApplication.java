package top.codershub.customer.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = { "top.codershub.customer.service.dataaccess", "top.codershub.dataaccess"})
@EntityScan(basePackages = { "top.codershub.customer.service.dataaccess", "top.codershub.dataaccess" })
@SpringBootApplication(scanBasePackages = "top.codershub")
public class CustomerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
}
