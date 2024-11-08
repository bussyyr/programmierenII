package de.thws.lektion17;

import java.io.*;

public class BufferedStream {

    public static void unbufferedStream(String path) throws FileNotFoundException{
        try(FileInputStream fis = new FileInputStream(path)) {
            FileOutputStream fos = new FileOutputStream("target/unbufferedOutput");
            int content;

            while ((content = fis.read()) != -1) {
                fos.write(content);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void bufferedStream(String path) throws FileNotFoundException{
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path))) {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("target/bufferedOutput"));
            int content;

            while ((content = bis.read()) != -1) {
                bos.write(content);
            }

            bos.flush();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void unbufferedArrayStream(String path) throws FileNotFoundException{
        try(FileInputStream fis = new FileInputStream(path)) {
            FileOutputStream fos = new FileOutputStream("target/unbufferedArrayOutput");
            byte[] contents;

            while ((contents = fis.readNBytes(1024)).length > 0) {
                fos.write(contents);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        String path="/Users/buseokcu/IdeaProjects/programmierenII/src/main/java/de/thws/lektion17/sample.mp3";

        long currentTime;

        currentTime = System.currentTimeMillis();
        unbufferedStream(path);
        System.out.println("Unbuffered: " + (System.currentTimeMillis() - currentTime) + "ms");

        currentTime = System.currentTimeMillis();
        bufferedStream(path);
        System.out.println("Buffered: " + (System.currentTimeMillis() - currentTime) + "ms");

        currentTime = System.currentTimeMillis();
        unbufferedArrayStream(path);
        System.out.println("UnbufferedArray: " + (System.currentTimeMillis() - currentTime) + "ms");
    }


}
