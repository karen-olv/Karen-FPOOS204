import javax.swing.JOptionPane;

public class Entrega {
    
    private String numeroGuia;
    private String estado;

    public Entrega(String numeroGuia) {
        this.numeroGuia = numeroGuia;
        this.estado = "Pendiente";
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public String getEstado() {
        return estado;
    }

    public void actualizarEstado(String nuevoEstado) {
        if (nuevoEstado.equalsIgnoreCase("En transito") || nuevoEstado.equalsIgnoreCase("Entregado")) {
            this.estado = nuevoEstado;
            JOptionPane.showMessageDialog(null, "Estado actualizado a: " + estado);
        } else {
            JOptionPane.showMessageDialog(null, "Estado invalido. Solo se puede cambiar a 'En transito' o 'Entregado'.");
        }
    }
}
