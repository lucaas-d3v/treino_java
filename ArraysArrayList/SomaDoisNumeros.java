import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o 2º número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Resultado: " + (numero1 + numero2));
        scanner.close();
    }
}
