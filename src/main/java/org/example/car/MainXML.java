package org.example.car;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXML {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car = context.getBean("car", Car.class);
        System.out.println("=== Car created via XML ===");
        System.out.println(car);

        context.close();
    }
}