import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
        String identificacion = JOptionPane.showInputDialog("Ingrese la identificacion del conductor:");
        String licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor:");

        Conductor conductor = new Conductor(nombre, identificacion, licencia);
        conductor.mostrarInformacion();
    }
}
