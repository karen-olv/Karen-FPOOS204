import java.util.Scanner;

public class Invertida {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        String invertida = "";
        
        for (int i = frase.length() - 1; i >= 0; i--) {
            invertida += frase.charAt(i);
        }
        
        System.out.println(invertida);
    }
}

