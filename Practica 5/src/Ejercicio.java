import java.util.Scanner;

public class Ejercicio {
    
    public static void main (String[] args ){
       Scanner scn = new Scanner(System.in);


       for (int i = 1; i <= 10; i++) {
        System.out.println("Tabla del " + i + ": " + i*1 + " " + i*2 + " " + i*3 + " " + i*4 + " " + i*5 + 
                           " " + i*6 + " " + i*7 + " " + i*8 + " " + i*9 + " " + i*10);
       }

    }
}
