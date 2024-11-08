package de.thws.lektion16.cyborg;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MenschImplTest {

    Random random = new Random();
    MenschImpl mensch = new MenschImpl();

    @Test
    public void entscheideLinksTest(){
        Entscheidung entscheidung  = mensch.entscheide(Gefahrensituation.GEFAHR_LINKS);
        assertTrue(entscheidung == Entscheidung.UNENTSCHIEDEN || entscheidung == Entscheidung.RECHTS);
    }

    @Test
    public void entscheideRechtsTest(){
        Entscheidung entscheidung  = mensch.entscheide(Gefahrensituation.GEFAHR_RECHTS);
        assertTrue(entscheidung == Entscheidung.UNENTSCHIEDEN || entscheidung == Entscheidung.LINKS);
    }

    @Test
    public void entscheideVorneTest(){
        Entscheidung entscheidung  = mensch.entscheide(Gefahrensituation.GEFAHR_VORNE);
        assertTrue(entscheidung == Entscheidung.BREMSEN ||entscheidung == Entscheidung.UNENTSCHIEDEN);
    }



}