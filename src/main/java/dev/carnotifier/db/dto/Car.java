package dev.carnotifier.db.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String brand;
    private String model;
    private String VIN;
    private String Color;

    public Car(String brand, String model, String VIN, String color) {
        this.brand = brand;
        this.model = model;
        this.VIN = VIN;
        Color = color;
    }

    protected Car() {}

    public Car(String brand, String model) {
        this(brand,model, null,null);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", VIN='" + VIN + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }
}
