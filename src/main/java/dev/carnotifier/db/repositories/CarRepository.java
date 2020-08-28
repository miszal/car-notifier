package dev.carnotifier.db.repositories;

import dev.carnotifier.db.dto.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CarRepository extends CrudRepository<Car, Long> {
    Optional<Car> findCarByBrand(String brand);
    Optional<Car> findById(Long id);
}
