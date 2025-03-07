import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Conductor conductor = null;
        Administrativo administrativo = null;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Menu:\n1. Agregar Conductor\n2. Agregar Administrativo\n3. Mostrar Informacion\n4. Salir\n\nSeleccione una opcion:"));

            if (opcion == 1) {
                
                String nombreConductor = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
                int idConductor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del conductor:"));
                double salarioConductor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del conductor:"));
                String licencia = JOptionPane.showInputDialog("Ingrese el tipo de licencia del conductor:");
                conductor = new Conductor(nombreConductor, idConductor, salarioConductor, licencia);
                JOptionPane.showMessageDialog(null, "Conductor agregado correctamente.");
            } 
            else if (opcion == 2) {
               
                String nombreAdmin = JOptionPane.showInputDialog("Ingrese el nombre del administrativo:");
                int idAdmin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del administrativo:"));
                double salarioAdmin = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del administrativo:"));
                String departamento = JOptionPane.showInputDialog("Ingrese el departamento del administrativo:");
                administrativo = new Administrativo(nombreAdmin, idAdmin, salarioAdmin, departamento);
                JOptionPane.showMessageDialog(null, "Administrativo agregado correctamente.");
            } 
            else if (opcion == 3) {
                
                if (conductor != null) {
                    conductor.mostrarInfo();
                } else {
                    JOptionPane.showMessageDialog(null, "No hay informacion de conductor registrada.");
                }

                if (administrativo != null) {
                    administrativo.mostrarInfo();
                } else {
                    JOptionPane.showMessageDialog(null, "No hay informacion de administrativo registrada.");
                }
            } 
            else if (opcion == 4) {
              
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
            } 
            else {
                
                JOptionPane.showMessageDialog(null, "Error. Intente de nuevo.");
            }
        } while (opcion != 4);
    }
}