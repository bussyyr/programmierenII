package de.thws.lektion17;

import java.io.IOException;

public class OutputStream {

    public void write(byte b[], int off, int len) throws IOException {
        if(b == null){
            throw new IOException("Array b cannot be null.");
        }else if(off >= b.length - 1 || off < 0){
            throw new IOException("Offset is outside the bounds of the array.");
        }else if(len < 0){
            throw new IOException("Length cannot be negative.");
        }
    }
}
