import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Escribe una Frase:");

        String cadena = scn.nextLine().replace(" ", "").toLowerCase();
        String invertida = "";
        
        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }

        if (cadena.equals(invertida)) {
            System.out.println("La cadena es un palindromo.");
        } else {
            System.out.println("La cadena no es un palindromo.");
        }
    }
}
