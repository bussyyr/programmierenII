package de.thws.test.test;

public class Webshop {
    String name;
    Zahlung zahlung;

    public Webshop(String name, Zahlung zahlung){
        this.name = name;
        this.zahlung = zahlung;
    }

    public String zahlen(){
        return zahlung.erzeugeZahlung();
    }

    public String getName() {
        return name;
    }
}
