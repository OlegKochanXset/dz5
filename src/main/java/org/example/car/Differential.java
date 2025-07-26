package org.example.car;

import org.springframework.stereotype.Component;

@Component
public class Differential {
    private String type;

    public Differential() {
        this("Limited-slip");
    }

    public Differential(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Differential{type='" + type + "'}";
    }
}