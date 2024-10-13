package de.thws.lektion15.person;

public class Student extends Person{
    String fach;

    public Student(String fach){
        super(fach);
    }

    @Override
    public String gibTaetigkeitAus() {
        return "Der Student besucht das Fach: " + this.fach;
    }
}
