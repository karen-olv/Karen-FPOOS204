import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args){
        Scanner Scn = new Scanner(System.in);

        System.out.println("Ingresa un numero entero positivo: ");
            int numero_entero = Scn.nextInt();

            for (int i = numero_entero; i >= 0; i--) {
                System.out.print(i);
                if (i > 0) {
                    System.out.print(", ");



                }
            }
    }
}
