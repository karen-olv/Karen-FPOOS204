import javax.swing.JOptionPane;

public class Envio {
    private String codigoEnvio;
    private String destino;
    private double peso;

    public Envio(String codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = 0.0;
    }

    public Envio(String codigoEnvio, String destino, double peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public static Envio crearEnvio() {
        String codigoEnvio = JOptionPane.showInputDialog("Ingrese el codigo de envio:");
        String destino = JOptionPane.showInputDialog("Ingrese el destino:");

        int opcion = JOptionPane.showConfirmDialog(null, "Desea ingresar el peso?", "Peso del envio", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del envio:"));
            return new Envio(codigoEnvio, destino, peso);
        } else {
            return new Envio(codigoEnvio, destino);
        }
    }
}
