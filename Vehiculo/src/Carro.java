import javax.swing.JOptionPane;

public class Carro {
    
    private String placa;
    private String modelo;
    private double capacidad_Carga;

    public Carro() {
        this.placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
        this.modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        this.capacidad_Carga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga (kg):"));
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
        JOptionPane.showMessageDialog(null, "Datos del vehículo:\n" +
                "Placa: " + placa + "\n" +
                "Modelo: " + modelo + "\n" +
                "Capacidad de carga: " + capacidad_Carga + " kg");
    }
}