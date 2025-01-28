import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);

    String contrasena = "password1234";

    System.out.print("Introduce la contraseña: ");
    String contrasenaUsuario = scanner.nextLine();

    if (contrasena.equalsIgnoreCase(contrasenaUsuario)) {
        System.out.println("La contraseña es correcta.");
    } else {
        System.out.println("La contraseña es incorrecta.");
    }
    
}
}
    

