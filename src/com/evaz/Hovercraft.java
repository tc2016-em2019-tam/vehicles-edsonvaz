package com.evaz;

public class Hovercraft extends Vehicle implements SeaVessel, LandVehicle {
    private int numWheels;
    private double Displacement;

    public Hovercraft( String name, int maxPassengers, double maxSpeed, int numWheels, double displacement ) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
        Displacement = displacement;
    }


    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setNumWheels( int numWheels ) {
        this.numWheels = numWheels;
    }

    @Override
    public void drive() {
        System.out.println("Callling drive() method!");
    }

    @Override
    public double getDisplacement() {
        return Displacement;
    }

    @Override
    public void setDisplacement( double Displacement ) {
        this.Displacement = Displacement;
    }

    @Override
    public void launch() {
        System.out.println("Calling launch() method!");
    }

    public void enterLand() {
        System.out.println("Hovercraft entering world!");
    }

    public void enterSea() {
        System.out.println("Hovercraft entering sea!");
    }
}
