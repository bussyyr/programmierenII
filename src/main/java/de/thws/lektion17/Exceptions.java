package de.thws.lektion17;

public class Exceptions {
    public static void main(String[] args) {

        try {
            //Number Format
            String invalidNumber = "abc";
            int number = Integer.parseInt(invalidNumber);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        try {
            //ArrayIndexOutOfBound
            int[] array = new int[5];
            int element = array[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            //NullPointer
            String string = null;
            int length = string.length();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            //OutOfMemory
            long[] array = new long[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println(e.getMessage());
        }

        try {
            //Arithmetic
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
