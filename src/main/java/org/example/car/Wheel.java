package org.example.car;

import org.springframework.stereotype.Component;

@Component
public class Wheel {
    private String type;

    // Для Spring аннотаций
    public Wheel() {
        this.type = "All-season";
    }

    // Для XML и ручного создания
    public Wheel(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Wheel{type='" + type + "'}";
    }
}