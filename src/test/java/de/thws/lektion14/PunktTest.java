package de.thws.lektion14;

import de.thws.lektion14.Punkt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PunktTest {

    Punkt punkt = new Punkt();

    @Test
    public void testNegativeX(){
        try{
            punkt.verschiebePunkt(-1,0);
            fail("Runtime Exception expected");
        }
        catch(RuntimeException e){
            String error = e.getMessage();
            assertEquals(error, "Ungültige Werte");
        }
    }

    @Test
    public void testNegativeY(){
        try{
            punkt.verschiebePunkt(0,-1);
            fail("Runtime Exception expected");
        }
        catch(RuntimeException e){
            String error = e.getMessage();
            assertEquals(error, "Ungültige Werte");
        }
    }

    @Test
    public void testGrosseX(){
        try{
            punkt.verschiebePunkt(1921,0);
            fail("Runtime Exception expected");
        }
        catch(RuntimeException e){
            String error = e.getMessage();
            assertEquals(error, "Ungültige Werte");
        }
    }

    @Test
    public void testGrosseY(){
        try{
            punkt.verschiebePunkt(0,1081);
            fail("Runtime Exception expected");
        }
        catch(RuntimeException e){
            String error = e.getMessage();
            assertEquals(error, "Ungültige Werte");
        }
    }

    @Test
    public void testXundY(){
            punkt.verschiebePunkt(1920,1080);
            punkt.verschiebePunkt(0, 0);
    }
}