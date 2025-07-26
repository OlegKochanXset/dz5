package org.example.car;

import org.springframework.stereotype.Component;

@Component
public class SparkPlug {
    private String brand;

    public SparkPlug() {
        this.brand = "NGK";
    }

    public SparkPlug(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "SparkPlug{brand='" + brand + "'}";
    }
}