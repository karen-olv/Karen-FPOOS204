import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero de cuenta: ");
        String numero = scanner.nextLine();
        System.out.print("Titular: ");
        String titular = scanner.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        Cuenta cuenta = new Cuenta(numero, titular, saldo);

        int opcion;
        do {
            System.out.println("\n1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Depositar a otra cuenta");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo: " + cuenta.consultarSaldo());
                    break;
                case 2:
                    System.out.print("Monto a ingresar: ");
                    double ingreso = scanner.nextDouble();
                    cuenta.ingresar(ingreso);
                    break;
                case 3:
                    System.out.print("Monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (cuenta.retirar(retiro)) {
                        System.out.println("Retiro exitoso.");
                    } else {
                        System.out.println("Fondos insuficientes.");
                    }
                    break;
                case 4:
                    System.out.print("Numero de cuenta destino: ");
                    String numeroDestino = scanner.nextLine();
                    System.out.print("Titular de la cuenta destino: ");
                    String titularDestino = scanner.nextLine();
                    System.out.print("Saldo inicial de la cuenta destino: ");
                    double saldoDestino = scanner.nextDouble();
                    scanner.nextLine();

                    Cuenta cuentaDestino = new Cuenta(numeroDestino, titularDestino, saldoDestino);

                    System.out.print("Monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    if (cuenta.depositar(deposito, cuentaDestino)) {
                        System.out.println("Deposito exitoso.");
                    } else {
                        System.out.println("Fondos insuficientes.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 5);

    }
}