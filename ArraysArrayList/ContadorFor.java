import java.util.Scanner;

public class ContadorFor {

    public static void contarAte(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Contando... " + i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int contador = scanner.nextInt();

        contarAte(contador);
        System.out.println("Cabo");
        scanner.close();
    }
}
