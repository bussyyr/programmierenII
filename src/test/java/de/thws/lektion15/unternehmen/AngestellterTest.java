package de.thws.lektion15.unternehmen;

import de.thws.lektion15.unternehmen.Angestellter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AngestellterTest {

    Angestellter angestellter = new Angestellter("Vorname", "Nachname", "A", 2000, "20.03.2024");

    @Test
    public void testAngestellter(){

        assertEquals("Vorname", angestellter.vorname);
        assertEquals("Nachname", angestellter.nachname);
        assertEquals("A", angestellter.identifikator);
        assertEquals(2000, angestellter.grundgehalt);
        assertEquals("20.03.2024", angestellter.geburtsdatum);
        assertEquals(1, angestellter.gehaltsfaktor);
        assertEquals(2000, angestellter.gehalt);
    }

}