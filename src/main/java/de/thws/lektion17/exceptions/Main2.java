package de.thws.lektion17.exceptions;

public class Main2 {
    public static void main(String[] args) throws MyException {
        Calculator calculator = new Calculator();
        int ergebnis = calculator.division2(9, -3);
    }
}
