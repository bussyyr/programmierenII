package de.thws.lektion16.inheritance;


import java.util.ArrayList;

//Klasse zum Upload ins e-learning
@SuppressWarnings("all")
public class StackVererbung extends ArrayList<Object> {
        public void push(Object e){
            this.add(e);
        }

        public Object pop(){
            if (this.size() > 0){
                return this.remove(this.size() - 1);
            }else{
                throw new RuntimeException("Stack is empty!");
            }
        }
}
