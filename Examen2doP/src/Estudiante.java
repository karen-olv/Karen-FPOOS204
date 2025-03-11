import java.util.*;
import javax.swing.*;

public class Estudiante {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int anioNacimiento;
    private String carrera;
    private int digitos;

    public Estudiante(String nombre, String apellidoPaterno, String apellidoMaterno, int anioNacimiento, String carrera) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.anioNacimiento = anioNacimiento;
        this.carrera = carrera;
    }

    public String generarMatricula() {
        String tresLetrasCarrera = carrera.substring(0, 3).toUpperCase();
        String dosUltimosAnioActual = String.valueOf(java.time.Year.now().getValue()).substring(2);
        String dosUltimosAnioNacimiento = String.valueOf(anioNacimiento).substring(2);
        String primeraLetraNombre = nombre.substring(0, 1).toUpperCase();
        String tresLetrasApellidoPaterno = apellidoPaterno.substring(0, 3).toUpperCase();
        String tresLetrasApellidoMaterno = apellidoMaterno.substring(0, 3).toUpperCase();
        int tresDigitosAleatorios = (int)(Math.random() * 900) + 100;

        return tresLetrasCarrera + dosUltimosAnioActual + dosUltimosAnioNacimiento +
                primeraLetraNombre + tresLetrasApellidoPaterno + tresLetrasApellidoMaterno + tresDigitosAleatorios;
    }
}
