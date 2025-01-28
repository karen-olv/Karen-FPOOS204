
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args){
           Scanner Scn = new Scanner(System.in);

           System.out.print("Introduce un número entero: ");
        int num = Scn.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

    }
    
}
