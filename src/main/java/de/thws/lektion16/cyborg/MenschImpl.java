package de.thws.lektion16.cyborg;

import java.util.Random;

public class MenschImpl implements Mensch, Autofahrer{
    Random random = new Random();

    @Override
    public Entscheidung entscheide(Gefahrensituation situation) {
        int rand = random.nextInt(4);

        if(rand==0){
            return Entscheidung.UNENTSCHIEDEN;
        }else if(situation == Gefahrensituation.GEFAHR_RECHTS){
            return Entscheidung.LINKS;
        } else if (situation == Gefahrensituation.GEFAHR_LINKS) {
            return Entscheidung.RECHTS;
        }else{
            return Entscheidung.BREMSEN;
        }
    }

    @Override
    public void essen() {

    }

    @Override
    public void schlafen() {

    }

    @Override
    public void arbeiten() {

    }
}
