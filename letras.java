import java.util.Scanner;

public class letras {
String nombre;
String nombre_maysuculas;
int numero_letras;

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

System.out.println("Introduce un nombre: ");
String nombre = scanner.nextLine();

String nombre_mayusculas = nombre.toUpperCase();
int numero_letras = nombre.replace(nombre, nombre_mayusculas).length();

System.out.println(nombre_mayusculas + "tiene" + numero_letras + "letras");


    }

    
}
