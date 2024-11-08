package de.thws.lektion18.studiengangsplitter;

import java.io.*;

public class Splitter {

    public void splitStudiengaenge(String dateiname) throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(dateiname))){
            String read = bufferedReader.readLine();

            BufferedWriter WInfWriter = new BufferedWriter(new FileWriter("/Users/buseokcu/IdeaProjects/programmierenII/src/main/java/de/thws/lektion18/studiengangsplitter/WInfNr.txt"));
            BufferedWriter InfWriter = new BufferedWriter(new FileWriter("/Users/buseokcu/IdeaProjects/programmierenII/src/main/java/de/thws/lektion18/studiengangsplitter/InfNr.txt"));
            BufferedWriter ECWriter = new BufferedWriter(new FileWriter("/Users/buseokcu/IdeaProjects/programmierenII/src/main/java/de/thws/lektion18/studiengangsplitter/ECNr.txt"));

            while(read != null){
                int matrikelNr = Integer.parseInt(read);

                if(matrikelNr >= 5000000 && matrikelNr <= 5099999){
                    WInfWriter.write(matrikelNr + "\n");
                }else if(matrikelNr >= 5100000 && matrikelNr <= 5199999){
                    InfWriter.write(matrikelNr + "\n");
                } else if(matrikelNr >= 6100000 && matrikelNr <= 6199999) {
                    ECWriter.write(matrikelNr + "\n");
                }else{
                    WInfWriter.close();
                    InfWriter.close();
                    ECWriter.close();
                    bufferedReader.close();
                    throw new MatrikelNummerException();
                }
                read = bufferedReader.readLine();
            }
            WInfWriter.close();
            InfWriter.close();
            ECWriter.close();
        }
    }
}
