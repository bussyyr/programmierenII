package de.thws.lektion15.person;

import de.thws.lektion15.person.Person;
import de.thws.lektion15.person.Professor;
import de.thws.lektion15.person.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void testStudentgibTaetigkeitAus(){
        Student student = new Student("Programmieren");
        assertEquals("Der Student besucht das Fach: Programmieren", student.gibTaetigkeitAus());
    }

    @Test
    public void testProfessorgibTaetigkeitAus(){
        Professor professor = new Professor("Programmieren");
        assertEquals("Der Professor unterrichtet: Programmieren", professor.gibTaetigkeitAus());
    }

    @Test
    public void testMainClass(){
        Person[] personen = new Person[100];

        for(int i = 0; i < 100; i++){
            Person person;
            if(i % 2 == 0){
                person = new Student("Programmieren");
            }else{
                person = new Professor("Programmieren");
            }
            personen[i] = person;
        }

        for(int i = 0; i < personen.length; i++){
            if(i % 2 == 0){
                assertEquals("Der Student besucht das Fach: Programmieren", personen[i].gibTaetigkeitAus());
            }else{
                assertEquals("Der Professor unterrichtet: Programmieren", personen[i].gibTaetigkeitAus());
            }
        }
    }

}