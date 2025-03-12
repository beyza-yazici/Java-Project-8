package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "Car{name='" + name + "', cylinders=" + cylinders + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return cylinders == car.cylinders && name.equals(car.name);
    }

    public String startEngine() {
        System.out.println(getClass().getSimpleName() + ": the car's engine is starting");
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName() + ": the car is accelerating");
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println(getClass().getSimpleName() + ": the car is braking");
        return "the car is braking";
    }
}
