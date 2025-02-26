import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Longitud de la contraseña: ");
        int longitud = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("¿Quieres usar numeros? (S/N): ");
        boolean incluirNumeros = scanner.nextLine().equalsIgnoreCase("S");

        System.out.print("¿Quieres usar mayusculas? (S/N): ");
        boolean incluirMayusculas = scanner.nextLine().equalsIgnoreCase("S");

        System.out.print("¿Quieres usar caracteres especiales? (S/N): ");
        boolean incluirEspeciales = scanner.nextLine().equalsIgnoreCase("S");

        password passwordGenerator = new password(longitud, incluirNumeros, incluirMayusculas, incluirEspeciales);

        String password = passwordGenerator.generarPassword();
        System.out.println("\nTu contraseña generada es: " + password);

        String fortaleza = passwordGenerator.comprobarFortaleza(password);
        System.out.println("Fortaleza de la contraseña: " + fortaleza);

    }
}