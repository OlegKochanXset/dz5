package org.example.car;

import org.springframework.stereotype.Component;

@Component
public class Hinge {
    private String material;

    public Hinge() {
        this("Steel");
    }

    public Hinge(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Hinge{material='" + material + "'}";
    }
}