import java.util.Random;

public class password {

    private int longitud;
    private boolean incluirNumeros;
    private boolean incluirMayusculas;
    private boolean incluirEspeciales;

    public password(int longitud, boolean incluirNumeros, boolean incluirMayusculas, boolean incluirEspeciales) {
        this.longitud = longitud;
        this.incluirNumeros = incluirNumeros;
        this.incluirMayusculas = incluirMayusculas;
        this.incluirEspeciales = incluirEspeciales;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean getIncluirNumeros() {
        return incluirNumeros;
    }

    public void setIncluirNumeros(boolean incluirNumeros) {
        this.incluirNumeros = incluirNumeros;
    }

    public boolean getIncluirMayusculas() {
        return incluirMayusculas;
    }

    public void setIncluirMayusculas(boolean incluirMayusculas) {
        this.incluirMayusculas = incluirMayusculas;
    }

    public boolean getIncluirEspeciales() {
        return incluirEspeciales;
    }

    public void setIncluirEspeciales(boolean incluirEspeciales) {
        this.incluirEspeciales = incluirEspeciales;
    }

    public String generarPassword() {
        String numeros = "0123456789";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String especiales = "!@#$%^&*()";

        StringBuilder caracteres = new StringBuilder(minusculas);

        if (incluirNumeros) caracteres.append(numeros);
        if (incluirMayusculas) caracteres.append(mayusculas);
        if (incluirEspeciales) caracteres.append(especiales);

        StringBuilder password = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < longitud; i++) {
            password.append(caracteres.charAt(r.nextInt(caracteres.length())));
        }

        return password.toString();
    }

    public String comprobarFortaleza(String password) {
        boolean tieneNumeros = false;
        boolean tieneMayusculas = false;
        boolean tieneEspeciales = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                tieneNumeros = true;
            } else if (Character.isUpperCase(c)) {
                tieneMayusculas = true;
            } else if (!Character.isLetterOrDigit(c)) {
                tieneEspeciales = true;
            }
        }

        if (password.length() >= 12 && tieneNumeros && tieneMayusculas && tieneEspeciales) {
            return "Muy Fuerte";
        } else if (password.length() >= 8 && (tieneNumeros || tieneMayusculas || tieneEspeciales)) {
            return "Fuerte";
        } else if (password.length() >= 6) {
            return "Moderada";
        } else {
            return "Debil";
        }
    }
}