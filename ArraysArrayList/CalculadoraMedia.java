import java.util.Scanner;

public class CalculadoraMedia {

    public static double pedirNota(int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a " + n + "ª nota: ");
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        double nota1 = pedirNota(1);
        double nota2 = pedirNota(2);
        double nota3 = pedirNota(3);

        double media = (nota1 + nota2 + nota3) / 3.0;
        System.out.printf("A média das suas notas é %.2f%n", media);

        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
