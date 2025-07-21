import java.util.Scanner;
import java.time.Year;

public class CalculadoraIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de seu nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = Year.now().getValue();
        int idade = anoAtual - anoNascimento;

        if (anoNascimento < 0 || idade < 0) {
            System.out.println("Ano inválido!");
        } else {
            System.out.println("Sua idade é: " + idade);
        }
        scanner.close();
    }
}
