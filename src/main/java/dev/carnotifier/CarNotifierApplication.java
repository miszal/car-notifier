package dev.carnotifier;

import dev.carnotifier.db.repositories.CarRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class CarNotifierApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarNotifierApplication.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate(CarRepository carRepository) {
        return new RestTemplate();
    }
}
