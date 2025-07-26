package org.example.car;

import org.springframework.stereotype.Component;

@Component
public class Accumulator {
    private int capacity;
    private String type;

    public Accumulator() {
        this(60, "Lead-acid");
    }

    public Accumulator(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Accumulator{capacity=" + capacity + ", type='" + type + "'}";
    }
}