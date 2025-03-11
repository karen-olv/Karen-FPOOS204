import javax.swing.JOptionPane;

public class Main{

    public static void main(String[] args) {

    
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String apellidoPaterno = JOptionPane.showInputDialog("Ingrese su apellido paterno:");
        String apellidoMaterno = JOptionPane.showInputDialog("Ingrese su apellido materno:");
        int anioNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento:"));
        String carrera = JOptionPane.showInputDialog("Ingrese su carrera:");

        Estudiante estudiante = new Estudiante (nombre, apellidoPaterno, apellidoMaterno, anioNacimiento, carrera);
        String matricula = estudiante.generarMatricula();

        JOptionPane.showMessageDialog(null, "Su matricula generada es: " + matricula);
    }
}



        

