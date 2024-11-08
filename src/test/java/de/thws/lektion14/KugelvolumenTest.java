package de.thws.lektion14;

import de.thws.lektion14.Kugelvolumen;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KugelvolumenTest {

    @Test
    public void testRadiusZero(){
        assertEquals((double) 4/3 * Math.PI * 0 * 0 * 0, Kugelvolumen.berechneKugelvolumen(0));
    }
    @Test
    public void testRadiusOne(){
        assertEquals((double) 4/3 * Math.PI * 1 * 1 * 1, Kugelvolumen.berechneKugelvolumen(1),0.0001);
    }
    @Test
    public void testRadiusFive(){
        assertEquals((double) 4/3 * Math.PI * 5 * 5 * 5, Kugelvolumen.berechneKugelvolumen(5),0.0001);
    }
    @Test
    public void testRadiusNegative(){
        try {
            Kugelvolumen.berechneKugelvolumen(-1);
            fail("Runtime Exception expected");
        }catch(RuntimeException e){
            String error = e.getMessage();
            assertEquals(error, "Radius muss größer als 0.");
        }
    }

}