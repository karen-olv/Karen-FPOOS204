// Escribe un programa que piuda al usuario dos palabras y que indique cual de ellas es la mas larga y por cuantas palabras.

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Ingresa la primera palabra: ");
        String palabra1 = scn.nextLine();
        
        System.out.print("Ingresa la segunda palabra: ");
        String palabra2 = scn.nextLine();

        int largo1 = palabra1.length();
        int largo2 = palabra2.length();
        
        if (largo1 > largo2) {
            System.out.println("La palabra mas larga es: " + palabra1 + " por " + (largo1 - largo2) + " letras.");
        } else if (largo2 > largo1) {
            System.out.println("La palabra mas larga es: " + palabra2 + " por " + (largo2 - largo1) + " letras.");
        } else {
            System.out.println("Ambas palabras tienen la misma longitud.");
        }
         
    }
}
