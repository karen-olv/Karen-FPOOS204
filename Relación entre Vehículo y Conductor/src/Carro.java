import javax.swing.JOptionPane;

public class Carro {
    
    private String placa;
    private String modelo;
    private double capacidad_Carga;
    private Conductor conductor;

    public Carro() {
        this.placa = JOptionPane.showInputDialog("Ingrese la placa del vehiculo:");
        this.modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo:");
        this.capacidad_Carga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga (kg):"));
        this.conductor = null;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidad_Carga() {
        return capacidad_Carga;
    }

    public void setCapacidad_Carga(double capacidad_Carga) {
        this.capacidad_Carga = capacidad_Carga;
    }

    public void mostrar_Datos() {
        JOptionPane.showMessageDialog(null, "Datos del vehiculo:\n" +
                "Placa: " + placa + "\n" +
                "Modelo: " + modelo + "\n" +
                "Capacidad de carga: " + capacidad_Carga + " kg");
        if (conductor != null) {
            JOptionPane.showMessageDialog(null, "Conductor asignado: " + conductor.getNombre() +
                    "\nLicencia: " + conductor.getLicencia());
        } else {
            JOptionPane.showMessageDialog(null, "No hay conductor asignado.");
        }
    }

    public void asignarConductor(Conductor conductor) {
        if (this.conductor == null) {
            this.conductor = conductor;
            JOptionPane.showMessageDialog(null, "Conductor asignado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El conductor ya ha sido asignado y no puede ser modificado.");
        }
    }
}
