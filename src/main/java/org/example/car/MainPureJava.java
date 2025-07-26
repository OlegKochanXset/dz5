package org.example.car;

public class MainPureJava {
    public static void main(String[] args) {
        // Создаем компоненты с кастомными параметрами
        Wheel wheel = new Wheel("Winter");
        Starter starter = new Starter("Bosch Premium");
        SparkPlug sparkPlug = new SparkPlug("Denso Iridium");
        Engine engine = new Engine(starter, sparkPlug, 200);
        Accumulator accumulator = new Accumulator(80, "Lithium");
        Hinge hinge = new Hinge("Titanium");
        Differential differential = new Differential("Electronic");
        Suspension suspension = new Suspension(hinge, differential);

        // Собираем автомобиль
        Car car = new Car(wheel, engine, accumulator, suspension);

        System.out.println("=== Car created via Pure Java ===");
        System.out.println(car);
    }
}