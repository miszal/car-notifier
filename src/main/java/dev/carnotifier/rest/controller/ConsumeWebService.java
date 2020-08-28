package dev.carnotifier.rest.controller;

import dev.carnotifier.db.dto.Car;
import dev.carnotifier.db.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumeWebService {
    @Autowired
    RestTemplate restTemplate;
    CarRepository carRepository;

    @GetMapping(value = "/cars")
    public Car getCarList() {
        return carRepository.findCarByBrand("Dan").get();
    }
}
