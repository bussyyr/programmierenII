package de.thws.lektion16.muenzautomat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimaleChangeCalculatorTest {
    MinimaleChangeCalculator mcc = new MinimaleChangeCalculator();
    int[] change;

    public void runEuroTest(int[] expected){
        for(int i = 0; i < expected.length; i++){
            assertEquals(expected[i], change[6 + i]);
        }
    }

    public void runCentTest(int[] expected){
        for(int i = 0; i < expected.length; i++){
            assertEquals(expected[i], change[i]);
        }
    }

    @Test
    public void testEuros(){
        change = mcc.getChange(5, 0);
        runEuroTest(new int[] {1, 2});

        change = mcc.getChange(10, 0);
        runEuroTest(new int[] {0, 5});

        change = mcc.getChange(1, 0);
        runEuroTest(new int[] {1, 0});

        change = mcc.getChange(0, 0);
        runEuroTest(new int[] {0, 0});
    }

    @Test
    public void testCents(){
        change = mcc.getChange(0, 10);
        runCentTest(new int[] {0, 0, 0, 1, 0, 0});

        change = mcc.getChange(0, 63);
        runCentTest(new int[] {1, 1, 0, 1, 0, 1});

        change = mcc.getChange(0, 77);
        runCentTest(new int[] {0, 1, 1, 0, 1, 1});

        change = mcc.getChange(0, 27);
        runCentTest(new int[] {0, 1, 1, 0, 1, 0});
    }

    @Test
    public void testMCC(){
        int[] expected;

        change = mcc.getChange(13, 45);
        expected = new int[] {0, 0, 1, 0, 2, 0, 1, 6};
        for(int i = 0; i < change.length; i++){
            assertEquals(expected[i], change[i]);
        }

        change = mcc.getChange(20, 56);
        expected = new int[] {1, 0, 1, 0, 0, 1, 0, 10};
        for(int i = 0; i < change.length; i++){
            assertEquals(expected[i], change[i]);
        }
    }

}