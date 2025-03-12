package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLitre;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + ": Hybrid engine is starting");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + ": Driving with hybrid power");
        runEngine();
    }
}
