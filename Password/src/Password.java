import java.util.Random;

public class Password {
    private int longitud=8;
    private boolean incluir_Numeros;
    private boolean incluir_Mayusculas;
    private boolean incluir_Especiales;

    public Password(int longitud, boolean incluirNumeros, boolean incluirMayusculas, boolean incluirEspeciales) {
        this.longitud = longitud;
        this.incluir_Numeros = incluir_Numeros;
        this.incluir_Mayusculas = incluir_Mayusculas;
        this.incluir_Especiales = incluir_Especiales;
    }

    public String generarPassword() {
        String numeros = "0123456789";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String especiales = "!@#$%^&*()";

        StringBuilder caracteres = new StringBuilder(minusculas);

        if (incluir_Numeros) caracteres.append(numeros);
        if (incluir_Mayusculas) caracteres.append(mayusculas);
        if (incluir_Especiales) caracteres.append(especiales);

        StringBuilder password = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < longitud; i++) {
            password.append(caracteres.charAt(r.nextInt(caracteres.length())));
        }

        return password.toString();
    }

    public String comprobarFortaleza(String password) {
        boolean tiene_Numeros = false;
        boolean tiene_Mayusculas = false;
        boolean tiene_Especiales = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                tiene_Numeros = true;
            } else if (Character.isUpperCase(c)) {
                tiene_Mayusculas = true;
            } else if (!Character.isLetterOrDigit(c)) {
                tiene_Especiales = true;
            }
        }

        if (password.length() >= 12 && tiene_Numeros && tiene_Mayusculas && tiene_Especiales) {
            return "Muy Fuerte";
        } else if (password.length() >= 8 && (tiene_Numeros || tiene_Mayusculas || tiene_Especiales)) {
            return "Fuerte";
        } else if (password.length() >= 6) {
            return "Moderada";
        } else {
            return "Debil";
        }
    }
}