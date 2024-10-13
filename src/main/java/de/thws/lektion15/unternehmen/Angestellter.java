package de.thws.lektion15.unternehmen;

public class Angestellter {
    String vorname;
    String nachname;
    String identifikator;
    int grundgehalt;
    double gehaltsfaktor;
    String geburtsdatum;
    double gehalt;

    public Angestellter(String vorname, String nachname, String identifikator, int grundgehalt, String geburtsdatum){
        this.vorname = vorname;
        this.nachname = nachname;
        this.identifikator = identifikator;
        this.grundgehalt = grundgehalt;
        this.gehaltsfaktor = 1;
        this.geburtsdatum = geburtsdatum;
        this.gehalt = this.gehaltsfaktor * this.grundgehalt;
    }
}
