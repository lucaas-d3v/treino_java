import java.util.Scanner;

public class TabuadaWhile {
    public static void tabuada(int n) {
        int i = 1;
        while (i <= 10) {
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        tabuada(numero);
        scanner.close();
    }
}
