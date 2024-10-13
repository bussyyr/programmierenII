package de.thws.lektion15.person;

public class Professor extends Person{

    public Professor(String fach){
        super(fach);
    }

    @Override
    public String gibTaetigkeitAus() {
        return "Der Professor unterrichtet: " + this.fach;
    }
}
