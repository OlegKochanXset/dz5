package org.example.car;

import org.springframework.stereotype.Component;

@Component
public class Starter {
    private String model;

    public Starter() {
        this.model = "Bosch"; // Было "Default", меняем на "Bosch"
    }

    public Starter(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Starter{model='" + model + "'}";
    }
}