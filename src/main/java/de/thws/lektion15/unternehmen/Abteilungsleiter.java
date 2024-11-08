package de.thws.lektion15.unternehmen;

public class Abteilungsleiter extends Angestellter{
    public Abteilungsleiter(String vorname, String nachname, String identifikator, int grundgehalt, String geburtsdatum){
        super(vorname, nachname, identifikator, grundgehalt, geburtsdatum);
        this.gehaltsfaktor = 2;
        this.gehalt = this.gehaltsfaktor * this.grundgehalt;
    }

    public void befoerdern(Angestellter angestellter){
        angestellter.gehaltsfaktor *= 1.1;
        angestellter.gehalt = angestellter.gehaltsfaktor * angestellter.grundgehalt;
    }
}
