/*8. Banco simples (simulação)
Crie uma classe ContaBancaria com nome, saldo, depositar(), sacar()

Faça um programa que:

Armazene várias contas em um ArrayList<ContaBancaria>

Permita consultar saldo por nome

Depositar ou sacar

Criar nova conta
*/


import javax.swing.*;
import java.util.Scanner;

public class ContaBancaria
{
    String nome;
    String email;
    String cpf;
    double saldo = 0;

    private double depositar(Scanner ler) {
        double valor_a_depositar = 0;

        for (int i = 0; i != 1; i++) {
            System.out.print("\nDigite o valor que quer depositar: ");
            valor_a_depositar = ler.nextDouble();

            if (valor_a_depositar < 20) {
                System.out.println("\nPor favor, o depósito mínimo é de R$20.00");
                i--;
            }

        }

        return valor_a_depositar;
    }


    private double sacar(Scanner ler) {
        double valor_a_ser_sacado = 0;

        for (int i = 0; i != 1; i++) {
            System.out.print("\nDigite o valor a ser sacado: ");
            valor_a_ser_sacado = ler.nextDouble();

            if (valor_a_ser_sacado < 0.0)
            {
                System.out.println("\nO valor digitado não pode ser nagativo!");
                i--;

                if (valor_a_ser_sacado == 0.0)
                {
                    System.out.println("\nO valor digitado não pode ser R$0!");
                    i--;

                }
            }
        }

        return valor_a_ser_sacado;
    }

    private static String pedirNome(Scanner ler)
    {
        while (true)
        {
            System.out.println("====== Castro ======");

            System.out.print("Digite o seu nome completo: ");
            String provavel_nome = ler.nextLine();

            if (!Verificador.isAlpha(provavel_nome)) {
                System.out.println("\nDigite um nome válido!");
                continue;
            }

            return provavel_nome;
        }
    }

    private static String pedirCpf(Scanner ler)
    {
        while (true) {
            System.out.print("\nDigite o seu cpf: ");
            String provavel_cpf = ler.nextLine();

            if (Verificador.isCpf(provavel_cpf)) {
                System.out.println("\nCpf inválido, siga o formato (xxx.xxx.xxx-xx) ou (xxxxxxxxxxx)!");
                continue;
            }

            return provavel_cpf;
        }
    }

    public static String pedirEmail(Scanner ler)
    {
        while (true) {
            System.out.println("\nDigite o seu email: ");
            String provavel_email = ler.nextLine();

            if (!Verificador.isEmail(provavel_email)) {
                System.out.println("\nEmail inválido, por favor siga o formato (usuario@dominio.extensao)!");
                continue;
            }

            return provavel_email;
        }
    }

    private void cadastro(Scanner ler)
    {
        Verificador isAlpha = new Verificador();

        this.nome = pedirNome(ler);
        this.email = pedirEmail(ler);
        this.cpf = pedirCpf(ler);

    }

    public void menuInicial(Scanner ler)
    {
        while (true)
        {

            System.out.print("\n====== Conta Bancária ======\n\n[1] Se cadastrar\n[2] Fazer Login [3] Sair\n\noque quer fazer? ");
            String acao = ler.nextLine();

            if (Verificador.isNumber(acao)) {
                switch (acao) {
                    case "1" -> {
                        cadastro(ler);
                        break;
                    }

                    default -> {
                        System.out.println("\nÁrea em desenvolvimento!");
                        continue;
                    }
                }
            }

            System.out.println("\nA ação precisa existir!");
        }
    }

    public static void main(String[] args)
    {
    }
}
