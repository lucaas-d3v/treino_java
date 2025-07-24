/*🔴 Avançado
7. Contador de palavras únicas
Peça ao usuário para digitar uma frase.

Separe as palavras (pode usar split(" ")).

Armazene no ArrayList.

Mostre:

Quantas palavras são únicas (sem repetir)

Quantas se repetem*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ContadorPalavrasUnicas
{

    private static ArrayList<String> separar(String frase)
    {
        ArrayList<String> palavras_temp = new ArrayList<>();
        String[] palavras = frase.split(" ");

        for (String palavra : palavras)
        {
            palavras_temp.add(palavra);
        }

        return palavras_temp;
    }

    private static void pegarRepetidos(ArrayList<String> palavras_separadas)
    {
        ArrayList<String> repetidos = new ArrayList<String>();
        ArrayList<Integer> ocorrencias = new ArrayList<Integer>();
        ArrayList<String> nao_repetidos = new ArrayList<String>();

        int ocorrencia;

        System.out.println();

        for (String palavra : palavras_separadas)
        {
            ocorrencia = Collections.frequency(palavras_separadas, palavra);

            if (ocorrencia > 1) {
                if (!repetidos.contains(palavra)) {
                    repetidos.add(palavra);
                    ocorrencias.add(ocorrencia);
                }
                else
                {
                    ocorrencias.add(ocorrencia);
                }
            }
            else
            {
                nao_repetidos.add(palavra);
            }
        }

        for (int i = 0; i < repetidos.size(); i++) {
            System.out.println(repetidos.get(i) + " - " + ocorrencias.get(i));
        }

        System.out.println("\n==== Não repetidos ====\n");

        for (int i = 0; i < nao_repetidos.size(); i++) {
            System.out.println(nao_repetidos.get(i));
        }

    }


    public static void main(String[] args)
    {
        ArrayList<String> palavras = new ArrayList<String>();

        System.out.print("Digite uma frase: ");
        Scanner ler = new Scanner(System.in);
        String frase = ler.nextLine();
        ler.close();

        palavras = separar(frase);

        pegarRepetidos(palavras);


    }
}
