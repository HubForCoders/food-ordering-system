package top.codershub.payment.service.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "top.codershub.payment.service.dataaccess")
@EntityScan(basePackages = "top.codershub.payment.service.dataaccess")
@SpringBootApplication(scanBasePackages = "top.codershub")
public class PaymentServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceApplication.class, args);
    }
}
