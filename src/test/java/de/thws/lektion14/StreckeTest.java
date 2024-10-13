package de.thws.lektion14;

import de.thws.lektion14.Strecke;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreckeTest {

    @Test
    public void testAundB(){
            Strecke strecke1 = new Strecke(1, 2);
            assert (strecke1.A < strecke1.B);

            Strecke strecke2 = new Strecke(4, 1);
            assert (strecke2.A < strecke2.B);

            Strecke strecke3 = new Strecke(5, 2);
            assert (strecke3.A < strecke3.B);
    }

    @Test
    public void testUberschneiden(){
        Strecke strecke1 = new Strecke(3,5);
        Strecke strecke2 = new Strecke(4,7);
        Strecke strecke3 = new Strecke(8,10);

        assertTrue(Strecke.uberschneidet(strecke1,strecke2));
        assertTrue(Strecke.uberschneidet(strecke2,strecke1));
        assertTrue(Strecke.uberschneidet(strecke1,strecke1));

        assertFalse(Strecke.uberschneidet(strecke1, strecke3));
        assertFalse(Strecke.uberschneidet(strecke3, strecke1));
        assertFalse(Strecke.uberschneidet(strecke2, strecke3));
        assertFalse(Strecke.uberschneidet(strecke3, strecke2));
    }

    @Test
    public void testToString(){
        Strecke strecke1 = new Strecke(3,5);
        Strecke strecke2 = new Strecke(2,8);
        Strecke strecke3 = new Strecke(4,4);

        assertEquals(strecke1.toString(), "3--5");
        assertEquals(strecke2.toString(), "2------8");
        assertEquals(strecke3.toString(), "4");
    }

}