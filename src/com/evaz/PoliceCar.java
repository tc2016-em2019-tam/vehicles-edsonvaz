package com.evaz;

public class PoliceCar extends Vehicle implements Emergency, LandVehicle {

    @Override
    public void soundSiren() {
        System.out.println("WEE OO WEE OO WEE OO!");
    }

    @Override
    public int getNumWheels() {
        return 0;
    }

    @Override
    public void setNumWheels( int numWheels ) {

    }

    @Override
    public void drive() {

    }

    public void Arrest() {
        System.out.println("YOU ARE UNDER ARREST");
    }

    public PoliceCar( String name, int maxPassengers, double maxSpeed ) {
        super(name, maxPassengers, maxSpeed);
    }
}
