import java.util.Scanner;


public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
    System.out.print("Ingrese la cantidad de la base: ");
    int base = scn.nextInt();

    int altura = (base + 1) / 2, i = 1;

    while (i <= altura) {
        System.out.println(" ".repeat(altura - i) + "*".repeat(2 * i - 1));
        i++;
    }

    System.out.println(" ".repeat(altura - 1) + "*"); 
}
}
