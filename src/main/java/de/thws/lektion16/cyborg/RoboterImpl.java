package de.thws.lektion16.cyborg;

public class RoboterImpl implements Roboter, Autofahrer{

    @Override
    public Entscheidung entscheide(Gefahrensituation situation) {
        if(situation == Gefahrensituation.GEFAHR_RECHTS){
            return Entscheidung.LINKS;
        } else if (situation == Gefahrensituation.GEFAHR_LINKS) {
            return Entscheidung.RECHTS;
        }else{
            return Entscheidung.BREMSEN;
        }
    }

    @Override
    public void aufladen() {

    }

    @Override
    public void warten() {

    }

    @Override
    public void arbeiten() {

    }


}
