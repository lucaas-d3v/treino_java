import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("O número " + n + " é par!");
        } else {
            System.out.println("O número " + n + " é ímpar!");
        }
        scanner.close();
    }
}
