package org.example.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    private Starter starter;
    private SparkPlug sparkPlug;
    private int power;

    @Autowired
    public Engine(Starter starter, SparkPlug sparkPlug) {
        this(starter, sparkPlug, 150);
    }

    public Engine(Starter starter, SparkPlug sparkPlug, int power) {
        this.starter = starter;
        this.sparkPlug = sparkPlug;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{starter=" + starter + ", sparkPlug=" + sparkPlug + ", power=" + power + "}";
    }
}