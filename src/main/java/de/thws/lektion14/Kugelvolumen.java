package de.thws.lektion14;

public class Kugelvolumen {
    public static double berechneKugelvolumen(double radius) {
        if(radius < 0){
            throw new RuntimeException("Radius muss größer als 0.");
        }else {
            return (double) 4 / 3 * Math.PI * radius * radius * radius;
        }
    }
}
