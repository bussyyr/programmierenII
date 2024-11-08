package de.thws.test.test;

public class KreditKarte implements Zahlung{

    @Override
    public String erzeugeZahlung(){
        return "Zahlung mit Kreditkarte";
    }
}
