import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Buscas
{
    public static int buscaBinaria(List<Integer> numeros, int numero) {
        List<Integer> ordenados = numeros.stream().sorted().toList();  // Garante ordenação

        int inicio = 0;
        int fim = ordenados.size() - 1;
        int tentativa = 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int item = ordenados.get(meio);

            if (item == numero) {
                return tentativa; // Encontrou o número
            } else if (item > numero) {
                fim = meio - 1; // Vai para a metade da esquerda
            } else {
                inicio = meio + 1; // Vai para a metade da direita
            }

            tentativa++;
        }

        return -1; // Número não encontrado
    }

    public static int buscaLinear(int numero, ArrayList<Integer> numeros)
    {

        for (int index = 0; index < numeros.size(); index++)
        {
            if (numeros.get(index) == numero)
            {
                return index;
            }
            else
            {
                continue;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = ler.nextInt();

        System.out.print("Digite o tamanho da lista: ");
        int tamanho = ler.nextInt();

        ler.close();

        ArrayList<Integer> numeros = gerarLista(tamanho);

        int resultado = buscaBinaria(numeros, numero);

        if (resultado == -1) {
            System.out.println("O número " + numero + " não existe na lista");
        } else {
            System.out.println("O número " + numero + " foi encontrado na tentaiva " + resultado);
        }
    }

    public static ArrayList<Integer> gerarLista(int tamanho)
    {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= tamanho; i++)
        {
            numeros.add(i);
        }

        Collections.shuffle(numeros);

        return numeros;
    }
}


