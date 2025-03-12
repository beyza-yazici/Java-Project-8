package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLitre;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + ": Gas engine is starting");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + ": Driving with gas power");
        runEngine();
    }
}
