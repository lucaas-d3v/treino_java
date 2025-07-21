import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefas
{
    public static void escrever(String frase)
    {
        for (char caractere : frase.toCharArray())
        {
            System.out.print(caractere);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println();
    }

    public static void telaPrincipal()
    {
        escrever("========== Lista de Tarefas =========");
    }

    public static void adicionar(ArrayList<String> tarefas, Scanner ler)
    {
        escrever("Digite a ação a ser adicionada: ");
        ler.nextLine(); // limpar buffer
        tarefas.add(ler.nextLine());
    }

    public static void remover(ArrayList<String> tarefas, Scanner ler)
    {
        escrever("Digite o id da tarefa a ser removida: ");
        int posicao = ler.nextInt();

        if (posicao > 0 && posicao <= tarefas.size()) {
            tarefas.remove((posicao - 1));
        } else {
            escrever("Posição inválida!");
        }
    }

    public static void exibir(ArrayList<String> tarefas)
    {
        for (int i = 0; i < tarefas.size(); i++)
        {
            escrever((i + 1) + " - " + tarefas.get(i));
        }
    }

    public static void main(String[] args)
    {
        ArrayList<String> tarefas = new ArrayList<String>();
        int acao = 0;
        boolean parar = false;
        Scanner ler = new Scanner(System.in);

        while (true) {
            telaPrincipal();

            escrever("[1] Adicionar Tarefa\n[2] Remover Tarefa\n[3] Exibir Lista\n[4] Sair\n\nO que quer fazer? ");
            acao = ler.nextInt();

            switch (acao) {
                case 1:
                    adicionar(tarefas, ler);
                    break;

                case 2:
                    remover(tarefas, ler);
                    break;

                case 3:
                    exibir(tarefas);
                    continue;

                case 4:
                    parar = true;
                    break;

                default:
                    escrever("\nA ação não existe, por favor, digite uma ação válida!\n");
            }

            if (parar){
                escrever("Saindo...");
                break;
            }
        }

        ler.close();
    }
}
