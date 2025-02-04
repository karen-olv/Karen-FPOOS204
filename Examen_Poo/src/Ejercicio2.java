//Escribir un programa que visualice en pantalla los numero multiplos de 10 comprendidos entre 10 y 1000
import java.util.*;
public class Ejercicio2 {

    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Numeros multiplos de 10 entre 10 y 100:");
        for (int i = 10; i <= 1000; i += 10) {
            System.out.println(i);
        }
    }
}



    

 