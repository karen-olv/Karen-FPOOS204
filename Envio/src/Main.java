import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Envio envio = Envio.crearEnvio();

        String mensaje = "Codigo: " + envio.getCodigoEnvio() + "\nDestino: " + envio.getDestino();

        if (envio.getPeso() > 0.0) {
            mensaje += "\nPeso: " + envio.getPeso() + " kg";
        } else {
            mensaje += "\nPeso: No ingresado";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
