package de.thws.lektion14;

public class Person {
    String vorname;
    String nachname;
    Adresse adresse;

    public Person(String vorname, String nachname, String strasse, String hausnummer, int postleitzahl, String ort){
        if(vorname.charAt(0) >= 'A' && vorname.charAt(0) <= 'Z'){
            this.vorname = vorname;
        }

        else{
            throw new RuntimeException("Vorname muss mit einem Großbuchstaben beginnen");
        }

        this.nachname = nachname;

        this.adresse = new Adresse();

        if(strasse.charAt(0) >= 'A' && strasse.charAt(0) <= 'Z'){
            this.adresse.strasse = strasse;
        }
        else{
            throw new RuntimeException("Strasse muss mit einem Großbuchstaben beginnen");
        }

        if(hausnummer.charAt(0) >= '0' && hausnummer.charAt(0) <= '9'){
            this.adresse.hausnummer = hausnummer;
        }
        else{
            throw new RuntimeException("Hausnummer muss mit einem Großbuchstaben beginnen");
        }

        this.adresse.postleitzahl = postleitzahl;

        if(ort.charAt(0) >= 'A' && ort.charAt(0) <= 'Z'){
            this.adresse.ort = ort;
        }
        else{
            throw new RuntimeException("Ort muss mit einem Großbuchstaben beginnen");
        }
    }
}
