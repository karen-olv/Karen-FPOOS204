import java.util.Scanner;

public class Jugueteria {

    static int peso_payaso = 112;
    static int peso_muneca = 75;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num_payaso = scanner.nextInt();
        int num_muneca = scanner.nextInt();

        int total = (num_payaso * peso_payaso) + (num_muneca * peso_muneca);
    }
}
