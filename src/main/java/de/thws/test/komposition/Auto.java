package de.thws.test.komposition;

public class Auto {
    Motor motor;
    String model;

    public Auto(Motor motor, String model){
        this.motor = motor;
        this.model = model;
    }

    public void fahren(){
        motor.fahren();
    }
}
