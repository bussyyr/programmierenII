package de.thws.lektion16.schach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrettTest {

    @Test
    public void kombiniereTest(){
        Brett brett1 = new LaeuferImpl(4,5).gibErlaubteFelder();
        Brett brett2 = new LaeuferImpl(6,7).gibErlaubteFelder();
        Brett kombinierte = brett1.kombiniere(brett2);

        int[][] feld = {
                {1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 4},
                {6, 3}, {7, 2}, {8, 1}, {3, 6}, {2, 7},
                {1, 8}, {5, 6}, {6, 7}, {7, 8}, {5, 8},
                {7, 6}, {8, 5}
        };

        Brett expected = new Brett();
        for(int i = 0; i < feld.length; i++){
            expected.markiereFeld(feld[i][0], feld[i][1]);
        }

        for(int i = 1; i <= 8; i++){
            for(int j = 1; j <= 8; j++){
                assertEquals(expected.gibFeld(i, j), kombinierte.gibFeld(i, j));
            }
        }
    }



}