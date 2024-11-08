package de.thws.lektion17;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class OutputStreamTest {

    OutputStream outputStream = new OutputStream();

    @Test
    public void testWithNullArray(){
        try{
            outputStream.write(null, 1,  1);
        } catch (IOException e) {
            assertEquals("Array b cannot be null.", e.getMessage());
        }
    }

    @Test
    public void testWithNegativeOffset(){
        try{
            outputStream.write(new byte[10], -1,  5);
        } catch (IOException e) {
            assertEquals("Offset is outside the bounds of the array.", e.getMessage());
        }
    }

    @Test
    public void testWithInvalidLength(){
        try{
            outputStream.write(new byte[10], 5,  10);
        } catch (IOException e) {
            assertEquals("Length cannot be negative.", e.getMessage());
        }
    }


}