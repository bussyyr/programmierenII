package de.thws.test.test;

public class Paypal implements Zahlung{

    @Override
    public String erzeugeZahlung(){
        return "Zahlung mit Paypal";
    }
}
