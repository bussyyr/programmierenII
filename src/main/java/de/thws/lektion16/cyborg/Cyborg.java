package de.thws.lektion16.cyborg;

import java.util.Random;

public class Cyborg implements Mensch, Roboter, Autofahrer{
    MenschImpl mensch = new MenschImpl();
    RoboterImpl roboter = new RoboterImpl();
    private Random random = new Random();


    @Override
    public Entscheidung entscheide(Gefahrensituation situation) {
        Entscheidung entscheidungMensch = mensch.entscheide(situation);
        Entscheidung entscheidungRoboter = roboter.entscheide(situation);

        if(entscheidungMensch == entscheidungRoboter){
            return entscheidungMensch;
        }else{
            int rand = random.nextInt(2);
            if(rand == 0){
                return entscheidungMensch;
            }else{
                return entscheidungRoboter;
            }
        }
    }

    @Override
    public void essen() {

    }

    @Override
    public void schlafen() {

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
