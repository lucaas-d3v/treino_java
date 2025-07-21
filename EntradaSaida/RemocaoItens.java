import java.util.ArrayList;
import java.util.Scanner;

public class RemocaoItens
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int numero;

        do {
            System.out.print("Digite um número ('-1' pra parar): ");
            numero = ler.nextInt();

            if (numero != -1) {
                numeros.add(numero);
            }

        } while (numero != -1);

        System.out.println("\n===== Números Adicionados =====\n");
        System.out.println(numeros);

        System.out.print("Digite o número que quer remover: ");
        int numero_a_remover = ler.nextInt();

        if (numeros.contains(numero_a_remover)) {
            numeros.remove(Integer.valueOf(numero_a_remover));
        } else {
            System.out.println("Número não encontrado na lista.");
        }

        System.out.println("Lista atualizada: " + numeros);
        ler.close();
    }
}
