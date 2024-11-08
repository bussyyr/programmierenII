package de.thws.lektion16.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    public void testPushAndPop(){
        Stack stack = new Stack();
        stack.push("First");
        stack.push("Second");

        assertEquals("Second", stack.pop());
        assertEquals("First", stack.pop());
    }

    @Test
    public void popFromEmptyStack(){
        Stack stack = new Stack();
        try {
            stack.pop();
            fail("Expected RuntimeException was not thrown");
        } catch (RuntimeException e) {
            assertEquals("Stack is empty!", e.getMessage());
        }

    }
}