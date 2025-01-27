import java.util.Scanner;

public class numeroenterox {
    
    int x;
    int suma;

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Introduce un numero entero x: ");
       int x = scanner.nextInt();
        
       int suma = (x * (x + 1))/2;

       System.out.println("Suma de todos los enteros  de 1 " + x + "es:" + suma);

       }
    }

