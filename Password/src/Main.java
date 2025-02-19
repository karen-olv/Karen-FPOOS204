import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Longitud de la contrasena: ");
        int longitud = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Quieres usar numeros? (S/N): ");
        String usarNumeros = scanner.nextLine().toLowerCase();

        System.out.print("Quieres usar mayusculas? (S/N): ");
        String usarMayusculas = scanner.nextLine().toLowerCase();

        System.out.print("Quieres usar caracteres especiales? (S/N): ");
        String usarEspeciales = scanner.nextLine().toLowerCase();

        Password passwordGenerator = new Password(
            longitud,
            usarNumeros.equals("si"),
            usarMayusculas.equals("si"),
            usarEspeciales.equals("si")
        );

        String password = passwordGenerator.generarPassword();
        System.out.println("\nTu contrasena generada es: " + password);

        String fortaleza = passwordGenerator.comprobarFortaleza(password);
        System.out.println("Fortaleza de la contrasena: " + fortaleza);
    }
}