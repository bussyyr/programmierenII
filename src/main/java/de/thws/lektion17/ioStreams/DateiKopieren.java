package de.thws.lektion17.ioStreams;

import javax.imageio.IIOException;
import java.io.*;

public class DateiKopieren {
    public static void main(String[] args) throws IOException {
        InputStream fis = null;
        OutputStream fos = null;
        try{
            fis = new FileInputStream("/Users/buseokcu/IdeaProjects/programmierenII/src/main/java/de/thws/lektion17/ioStreams/img.png");
            fos = new FileOutputStream("copy.png");
            int b = 0;

            while(b != -1){
                b = fis.read();
                if(b != -1){
                    fos.write(b);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        finally {
            fis.close();
            fos.close();
        }
    }
}
