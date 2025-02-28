import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.mostrar_Datos();
        
        String nombreConductor = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
        String licenciaConductor = JOptionPane.showInputDialog("Ingrese el numero de licencia del conductor:");
        
        Conductor conductor = new Conductor(nombreConductor, licenciaConductor);
        
        carro.asignarConductor(conductor);  
        carro.mostrar_Datos();  

        carro.asignarConductor(conductor);
    }
}
