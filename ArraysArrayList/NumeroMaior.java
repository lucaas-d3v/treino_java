import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o 2º número: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o 3º número: ");
        double c = scanner.nextDouble();

        double maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;

        System.out.println("O maior número digitado foi " + maior);
        scanner.close();
    }
}
