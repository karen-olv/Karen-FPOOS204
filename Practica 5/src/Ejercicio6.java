import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int saldoActual = 8800;
        String accion;
        boolean finalizar = false;

        System.out.println("Saldo inicial: $" + saldoActual);
        System.out.println("Opciones: D (Depositar $100) | R (Retirar $50)");

        while (!finalizar) {
            System.out.print("Ingrese la operación (D/R) o Enter para salir: ");
            accion = scn.nextLine();

            switch (accion.toUpperCase()) {
                case "D":
                    saldoActual += 100;
                    System.out.println("Deposito realizado. Saldo actual: $" + saldoActual);
                    break;
                case "R":
                    saldoActual -= 50;
                    System.out.println("Retiro realizado. Saldo actual: $" + saldoActual);
                    break;
                case "":
                    finalizar = true;
                    break;
                default:
                    System.out.println("Operacion no valida. Intente de nuevo.");
            }
        }

        System.out.println("Saldo final: $" + saldoActual);

    }
}