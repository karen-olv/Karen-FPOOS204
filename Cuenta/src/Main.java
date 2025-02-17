import java.util.*;
import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        String num_Cuenta = JOptionPane.showInputDialog("Ingrese el numero de cuenta:");
        String titular = JOptionPane.showInputDialog("Ingrese el nombre del titular:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del titular:"));
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial:"));

        Cuenta cuenta = new Cuenta(num_Cuenta, titular, edad, saldo);

        String opcion = "";
        while (!opcion.equals("4")) {
            opcion = JOptionPane.showInputDialog(
                "Menu de Cuenta\n" +
                "1. Consultar saldo\n" +
                "2. Ingresar efectivo\n" +
                "3. Retirar efectivo\n" +
                "4. Salir\n" +
                "Seleccione una opcion:");

            if (opcion.equals("1")) {
                cuenta.consultar_saldo();
            } else 
            if (opcion.equals("2")) {
                double deposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a depositar:"));
                cuenta.ingresar_efectivo(deposito);
            } else 
            if (opcion.equals("3")) {
                double retiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a retirar:"));
                cuenta.retirar_efectivo(retiro);
            } else 
            if (!opcion.equals("4")) {
                JOptionPane.showMessageDialog(null, "Opcion no valida. Intente de nuevo.");
            }
        }

        JOptionPane.showMessageDialog(null, "Gracias.");
    }
}


