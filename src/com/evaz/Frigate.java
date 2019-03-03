package com.evaz;

public class Frigate extends Vehicle implements SeaVessel {
    private double Displacement;

    public Frigate( String name, int maxPassengers, double maxSpeed, double displacement ) {
        super(name, maxPassengers, maxSpeed);
        Displacement = displacement;
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
        System.out.println("Ahoy!");
    }

    public void FireGun() {
        System.out.println("Fum fum fum!");
    }
}
