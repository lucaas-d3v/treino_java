import java.util.Scanner;

public class CadastroNomes
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        String[] lista = new String[5];

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Digite o nome da " + (i + 1) + "ª pessoa: ");
            String nome = ler.nextLine();

            lista[i] = nome;
        }

        ler.close();

        System.out.println(java.util.Arrays.toString(lista));
    }
}
