import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args){
        Scanner Scn = new Scanner(System.in);

System.out.println("Ingrese un numero positivo:");
int numero_positivo = Scn.nextInt();

 for (int i=1; i<=numero_positivo; i+=2){

 System.out.print(i);

            if (i + 2 <= numero_positivo) {
                System.out.print(", ");
    }
}
}
}

