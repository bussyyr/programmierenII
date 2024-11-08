package de.thws.lektion16.cyborg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyborgTest {

    Cyborg cyborg = new Cyborg();
    MenschImpl mensch = new MenschImpl();
    RoboterImpl roboter = new RoboterImpl();

    @Test
    public void entscheideTest() {
        Entscheidung decisionMensch = mensch.entscheide(Gefahrensituation.GEFAHR_RECHTS);
        Entscheidung decisionRoboter = roboter.entscheide(Gefahrensituation.GEFAHR_RECHTS);
        Entscheidung decisionCyborg = cyborg.entscheide(Gefahrensituation.GEFAHR_RECHTS);

        if (decisionRoboter == decisionMensch) {
            assertEquals(decisionMensch, decisionCyborg);
        } else if (decisionRoboter != decisionMensch) {
            assertTrue(decisionCyborg == decisionRoboter || decisionCyborg == decisionMensch);
        }
    }
}