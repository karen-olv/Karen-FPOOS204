import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cuenta {
    private String num_cuenta;
    private String titular;
    private int edad;
    private double saldo;

    public Cuenta(String num_cuenta, String titular, int edad, double saldo) {
        this.num_cuenta = num_cuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }

    public void consultar_saldo() {
        JOptionPane.showMessageDialog(null, "Saldo actual: $" + saldo);
    }

    public void ingresar_efectivo(double monto) {
        saldo += monto;
        JOptionPane.showMessageDialog(null, "Deposito exitoso. Nuevo saldo: $" + saldo);
    }

    public void retirar_efectivo(double monto) {
        if (monto > saldo) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
        } else {
            saldo -= monto;
            JOptionPane.showMessageDialog(null, "Retiro exitoso. Nuevo saldo: $" + saldo);
        }
    }
}
