package Vehicle;

import java.time.temporal.ValueRange;

public class Vehicle {
    private String type;
    private String model;
    private Engine engine;
    private int fuel;

    Vehicle(String type , String model , Engine engine , int fuel){
        this.type = type;
        this.model = model;
        this.engine = engine;
        this.fuel = fuel;
    }
    public void drive(int fuelLoss){
        if(fuel >= fuelLoss){
            this.fuel -= fuelLoss;
            System.out.println("Remaining fuel: " + fuelLoss);
        } else {
            System.out.println("NO FUEL");
        }
    }

    public int getFuel() {
        return fuel;
    }
}


class Engine {
    private int power;
    private int fuel;
    public Engine(int power , int fuel){
        this.power = power;
        this.fuel = fuel;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}