import java.util.Scanner;

public class NumeroPrimo {

    public static boolean ePrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (ePrimo(numero)) {
            System.out.println(numero + " é primo");
        } else {
            System.out.println(numero + " não é primo");
        }
        scanner.close();
    }
}
