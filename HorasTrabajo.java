import java.util.Scanner;

public class HorasTrabajo {
double horastrabajadas;
double costo_hora;
double paga;

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Intruduce el numero de horas trabajadas");
        double horastrabajadas = scanner.nextDouble();
        System.out.println("introduce el costo por hora");
        double costo_hora = scanner.nextDouble();

        double paga = horastrabajadas * costo_hora;
        System.out.println("La Paga total correspondiente: $" + paga);

    

    }
    
}
