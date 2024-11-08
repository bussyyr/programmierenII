package de.thws.lektion16.inheritance;

import java.util.ArrayList;

public class Stack implements StackInterface{
        private ArrayList<Object> elements = new ArrayList<>();

        @Override
        public void push(Object e) {
                elements.add(e);
        }

        @Override
        public Object pop() {
                if (elements.size() > 0) {
                        return elements.remove(elements.size() - 1);
                }else{
                        throw new RuntimeException("Stack is empty!");
                }
        }
}

