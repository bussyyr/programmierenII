package de.thws.lektion17.exceptions;

public class Calculator{

    public int division (int a, int b){
        if(b <= 0){
            throw new MyRuntimeException("B can't be smaller than 0.");
        }
        return a / b;
    }

    public int division2 (int a, int b) throws MyException{
        if(b <= 0){
            throw new MyException("B can't be smaller than 0.");
        }
        return a / b;
    }
}
