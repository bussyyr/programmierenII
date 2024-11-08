package de.thws.test.test;

public class Main {

    public static void main(String[] args){
        Webshop w1 = new Webshop("Cicekci", new KreditKarte());
        Webshop w2 = new Webshop("Kofteci Yusuf", new Paypal());
        Webshop w3 = new Webshop("Random Alman Restorani", new ECKarte());

        System.out.println(w1.getName() + ": " + w1.zahlen());

        System.out.println(w2.getName() + ": " + w2.zahlen());

        System.out.println(w3.getName() + ": " + w3.zahlen());
    }
}
