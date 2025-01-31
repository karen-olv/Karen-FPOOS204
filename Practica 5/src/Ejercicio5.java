import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main (String[] args ){
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingresa una frase: ");
        String frase = scn.nextLine();

        System.out.print("Ingrese una letra: ");
        char letra = scn.next().charAt(0);
        scn.close();

        int cont = 0;
        for (char c : frase.toCharArray()) {
            if (c == letra) {
                cont++;
            }
        }

        System.out.println("La letra '" + letra + "' aparece " + cont + " veces en la frase.");
    }
}
