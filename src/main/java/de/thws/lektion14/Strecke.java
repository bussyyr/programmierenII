package de.thws.lektion14;

public class Strecke {
    int A;
    int B;

    public Strecke(int a, int b){
        if(a <= 0 || b <= 0){
            throw new RuntimeException("Ungültige A oder/und B Werte");
        }
        else if(a > b){
            this.A = b;
            this.B = a;
        }
        else{
            this.A = a;
            this.B = b;
        }
    }

    public static boolean uberschneidet(Strecke s1, Strecke s2){
        if(s1.A < s2.B){
            return s2.A < s1.B;
        }
        else{
            return false;
        }
    }

    public String toString(){
        String out = Integer.toString(A);
        if(A != B){
            for(int i = B-A; i > 0; i--){
                out += '-';
            }
            out += Integer.toString(B);
        }
            return out;
    }
}
