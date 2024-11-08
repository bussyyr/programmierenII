package de.thws.test.test;

public class ECKarte implements Zahlung{

    @Override
    public String erzeugeZahlung(){
       return "Zahlung mit EC-Karte";
    }
}
