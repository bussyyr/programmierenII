package de.thws.lektion18.studiengangsplitter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filepath = "/Users/buseokcu/IdeaProjects/programmierenII/src/main/java/de/thws/lektion18/studiengangsplitter/MatrNr.txt";
        Splitter splitter = new Splitter();
        try{
            splitter.splitStudiengaenge(filepath);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
