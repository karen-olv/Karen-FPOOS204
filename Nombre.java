import java.util.Scanner;
public class Nombre {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

System.out.print("Escribe tu primer nombre: ");
String nombre = scanner.nextLine();
System.out.print("Escribe tu primer apellido: ");
String apellidoPaterno = scanner.nextLine();
System.out.print("Escribe tu segundo apellido: ");
String apellidoMaterno = scanner.nextLine();

String nombreCompleto = nombre + " " + apellidoPaterno + " " + apellidoMaterno;
String iniciales = Character.toUpperCase(nombre.charAt(0)) + " " +
                   Character.toUpperCase(apellidoPaterno.charAt(0)) + " " +
                   Character.toUpperCase(apellidoMaterno.charAt(0));

System.out.println(nombreCompleto.toLowerCase());
System.out.println(nombreCompleto.toUpperCase());
System.out.println(iniciales);

    }
}
