package de.thws.test.komposition;

public class Main {
    public static void main(String[] args){
        Auto auto = new Auto(new Motor(), "SUV");

        System.out.println("Das Auto:");
        auto.fahren();
    }
}
