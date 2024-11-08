package de.thws.lektion14;

import de.thws.lektion14.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void testVorname(){
        try{
            Person person = new Person("lara", "Tolini","Straße","1", 97078, "Würzburg");
            fail("Runtime Exception expected");
        }catch(RuntimeException e){
            String error = e.getMessage();
            assertEquals(error, "Vorname muss mit einem Großbuchstaben beginnen");
        }
    }

    @Test
    public void testStrasse(){
        try{
            Person person = new Person("Lara", "Tolini","straße","1", 97078, "Würzburg");
            fail("Runtime Exception expected");
        }catch(RuntimeException e){
            String error = e.getMessage();
            assertEquals(error, "Strasse muss mit einem Großbuchstaben beginnen");
        }
    }

    @Test
    public void testOrt(){
        try{
            Person person = new Person("Lara", "Tolini","Straße","1", 97078, "würzburg");
            fail("Runtime Exception expected");
        }catch(RuntimeException e){
            String error = e.getMessage();
            assertEquals("Ort muss mit einem Großbuchstaben beginnen", error);
        }
    }

    @Test
    public void testHausnummer(){
        try{
            Person person = new Person("Lara", "Tolini","Straße","A1", 97078, "Würzburg");
            fail("Runtime Exception expected");
        }catch(RuntimeException e){
            String error = e.getMessage();
            assertEquals(error, "Hausnummer muss mit einem Großbuchstaben beginnen");
        }
    }

    @Test
    public void testPerson(){
            Person person = new Person("Lara", "Tolini","Straße","1", 97078, "Würzburg");
            assertNotNull(person);
    }
}