package de.thws.lektion15.unternehmen;

import de.thws.lektion15.unternehmen.Abteilungsleiter;
import de.thws.lektion15.unternehmen.Angestellter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbteilungsleiterTest {

    Abteilungsleiter abteilungsleiter = new Abteilungsleiter("Vorname", "Nachname", "B", 3000, "20.03.2024");
    Angestellter angestellter = new Angestellter("Vorname", "Nachname", "A", 2000, "20.03.2024");

    @Test
    public void testAbteilungsleiter(){

        assertEquals("Vorname", abteilungsleiter.vorname);
        assertEquals("Nachname", abteilungsleiter.nachname);
        assertEquals("B", abteilungsleiter.identifikator);
        assertEquals(3000, abteilungsleiter.grundgehalt);
        assertEquals("20.03.2024", abteilungsleiter.geburtsdatum);
        assertEquals(2, abteilungsleiter.gehaltsfaktor);
        assertEquals(6000, abteilungsleiter.gehalt);
    }

    @Test
    public void testBefoerdern(){
        abteilungsleiter.befoerdern(angestellter);
        assertEquals(1.1, angestellter.gehaltsfaktor, 0.01);
        assertEquals(2200, angestellter.gehalt, 0.01);
    }

}