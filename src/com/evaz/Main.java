package com.evaz;

public class Main {

    public static void main( String[] args ) {
        Vehicle[] myArray = new Vehicle[5];

        myArray[0] = new Jeep("Fred's Jeep", 2, 2, 2);
        myArray[1] = new Jeep("Frank's Jeep", 2, 2, 2);
        myArray[2] = new Hovercraft("Sue's Hover-craft", 2, 2, 2, 2);
        myArray[3] = new Frigate("Money Waster", 2, 2, 2);
        myArray[4] = new PoliceCar("Fred's Ban", 2, 2);

        for (int i = 0; i < myArray.length; i++) {

            System.out.println(myArray[i].getName());

            if (myArray[i] instanceof LandVehicle) {
                LandVehicle lv = (LandVehicle) myArray[i];
                lv.drive();
            } else if (myArray[i] instanceof PoliceCar) {
                PoliceCar lv = (PoliceCar) myArray[i];
                lv.soundSiren();
            }
        }
    }
}

