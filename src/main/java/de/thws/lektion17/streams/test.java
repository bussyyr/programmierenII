package de.thws.lektion17.streams;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class test {

    public static void main(String[] args)
            throws IOException
    {
        PrintStream out = System.out;
        InputStream in = System.in;
        int i;
        do {
            i = in.read();
            if (i != -1) out.write(i);
        }
        while (i != -1);
    }
}
