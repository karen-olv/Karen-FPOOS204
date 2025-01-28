import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner Scn = new Scanner(System.in);
    
        System.out.print("Introduce la edad del cliente: ");
        int edad = Scn.nextInt();

        if (edad < 4) {
            System.out.println("La entrada es gratis.");
        } else if (edad <= 18) {
            System.out.println("El precio de la entrada a pagar es de $110");
        }else{
              System.out.println("El Precio de la entrada a pagar es de $190");
        }

}
}