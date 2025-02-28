import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        String numeroGuia = JOptionPane.showInputDialog("Ingrese el numero de guia:");
        Entrega entrega = new Entrega(numeroGuia);

        JOptionPane.showMessageDialog(null, "Entrega creada con el numero de guia: " + entrega.getNumeroGuia() + "\nEstado inicial: " + entrega.getEstado());
        
        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado de la entrega (En transito o Entregado):");
        entrega.actualizarEstado(nuevoEstado);
    }
}
