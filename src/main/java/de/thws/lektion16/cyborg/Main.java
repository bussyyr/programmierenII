package de.thws.lektion16.cyborg;

public class Main {
    public static void main(String[] args){
        MenschImpl mensch = new MenschImpl();
        RoboterImpl roboter = new RoboterImpl();
        Cyborg cyborg = new Cyborg();

        Gefahrensituation[] situationen = Gefahrensituation.values();

        for(Gefahrensituation situation : situationen){
            Entscheidung menschEntscheidung = mensch.entscheide(situation);
            Entscheidung roboterEntscheidung = roboter.entscheide(situation);
            Entscheidung cyborgEntscheidung = cyborg.entscheide(situation);

            System.out.println("Situation: " + situation);
            System.out.println("Mensch entscheidet: " + menschEntscheidung);
            System.out.println("Roboter entscheidet: " + roboterEntscheidung);
            System.out.println("Cyborg entscheidet: " + cyborgEntscheidung);
            System.out.println();
        }
    }
}
