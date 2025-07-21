import java.util.ArrayList;
import java.util.Scanner;

public class BuscaArrayList
{
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<String>();

        for (int i = 0; i < 10; i++)
        {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            String nome = ler.nextLine();

            if (nomes.contains(nome))
            {
                System.out.println("O nome '" + nome + "' já existe na lista!");
                i--;
                continue;
            }

            nomes.add(nome);
        }

        ler.close();
    }
}
