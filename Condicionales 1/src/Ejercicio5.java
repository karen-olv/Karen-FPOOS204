import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args){
        Scanner Scn = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        double num1 = Scn.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        double num2 = Scn.nextDouble();

        System.out.print("Introduce el operador (+, -, *, /): ");
        char operador = Scn.next().charAt(0);

        switch (operador) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error.");
                }
                break;
            default:
                System.out.println("Operador no valido.");
        }
    
    }  
}
