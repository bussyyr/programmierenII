package de.thws.lektion17.exceptions;

public class Main{
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        int ergebnis = calculator.division(7, -2);
        System.out.println("Ergebnis: " + ergebnis);

    }
}
