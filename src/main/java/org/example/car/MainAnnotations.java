package org.example.car;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnnotations {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("org.example.car");

        Car car = context.getBean(Car.class);
        System.out.println("=== Car created via Annotations ===");
        System.out.println(car);

        context.close();
    }
}