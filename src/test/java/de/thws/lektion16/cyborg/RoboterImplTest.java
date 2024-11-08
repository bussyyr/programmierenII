package de.thws.lektion16.cyborg;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class RoboterImplTest {
    RoboterImpl roboter = new RoboterImpl();

    @Test
    public void entscheideTest(){
        assertEquals(Entscheidung.RECHTS, roboter.entscheide(Gefahrensituation.GEFAHR_LINKS));
        assertEquals(Entscheidung.LINKS, roboter.entscheide(Gefahrensituation.GEFAHR_RECHTS));
        assertEquals(Entscheidung.BREMSEN, roboter.entscheide(Gefahrensituation.GEFAHR_VORNE));
    }

}