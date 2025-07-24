/*8. Banco simples (simulação)
Crie uma classe ContaBancaria com nome, saldo, depositar(), sacar()

Faça um programa que:

Armazene várias contas em um ArrayList<ContaBancaria>

Permita consultar saldo por nome

Depositar ou sacar

Criar nova conta
*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ContaBancaria
{
    String nome;
    String email;
    String cpf;
    double saldo = 0;

    public String[] toArray(String frase)
    {
        return frase.split(" ");
    }

    public static double toDouble(String algo) { return Double.parseDouble(algo); }

    public static String toString(double algo) { return Double.toString(algo); }

    private void depositar(String cpf, HashMap<String, ArrayList<String>> dados, Scanner ler) {
        double valor_a_depositar = 0;

        while (true)
        {
            System.out.print("\nDigite o valor que quer depositar: ");
            valor_a_depositar = ler.nextDouble();

            if (valor_a_depositar < 20) {
                System.out.println("\nPor favor, o depósito mínimo é de R$20.00");
                continue;
            }

            break;
        }

        String saldo_atual = dados.get(cpf).get(2);

        String novo_saldo = toString(toDouble(saldo_atual) + valor_a_depositar);

        dados.get(cpf).set(2, novo_saldo);

        mostrarPefil(dados.get(cpf).get(0), cpf, dados.get(cpf).get(1), ler, dados);
    }

    private String getKeyByValue(final HashMap<String, String> map, final String value) {
        return map.entrySet()
                .stream()
                .filter(e -> e.getValue().equals(value))
                .findFirst()
                .map(HashMap.Entry::getKey)
                .orElse(null);
    }

    private void sacar(HashMap<String, ArrayList<String>> dados, Scanner ler) {
        double valor_a_ser_sacado = 0;

        while (true) {
            System.out.print("\nDigite o valor a ser sacado: ");
            valor_a_ser_sacado = ler.nextDouble();

            if (valor_a_ser_sacado < 0.0)
            {
                System.out.println("\nO valor digitado não pode ser nagativo!");
                continue;

            }
            break;
        }

        String saldo_atual = dados.get(dados.keySet()).get(2);

        String novo_saldo = toString(toDouble(saldo_atual) - valor_a_ser_sacado);

        dados.get(cpf).set(2, novo_saldo);

        mostrarPefil(dados.get(cpf).get(0), cpf, dados.get(cpf).get(1), ler, dados);
    }

    private static String pedirNome(Scanner ler)
    {
        while (true)
        {
            System.out.println("\n====== Castro ======");

            System.out.print("Digite o seu nome completo: ");
            String provavel_nome = ler.nextLine();

            if (!Verificador.isName(provavel_nome)) {
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

        HashMap<String, ArrayList<String>> contas = new HashMap<>();

        HashMap<String, ArrayList<String>> banco = salvarConta(this.nome, this.email, this.cpf, contas);

        intersecao(nome, cpf, email, ler, banco);
    }

    public void intersecao(String nome, String cpf, String email, Scanner ler, HashMap<String, ArrayList<String>> banco)
    {
        while (true)
        {
            System.out.print("\n[1] Consultar minha conta\n[2] Sair\n\nOque quer fazer? ");
            String acao = ler.nextLine();

            if (!Verificador.isNumber(acao)) {
                if (acao != "1") {
                    System.out.println("\nAção não existe!");
                    continue;

                }
                System.out.println("\nAção não existe!");
                continue;

            }

            break;
        }

        mostrarPefil(nome, cpf, email, ler, banco);
    }

    public void menuInicial(Scanner ler)
    {

        while (true)
        {
            System.out.print("====== Conta Bancária ======\n\n\n[1] Se cadastrar\n[2] Fazer Login\n[3] Sair\n\noque quer fazer? ");
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

    public static HashMap<String, ArrayList<String>> salvarConta(String nome, String email, String cpf, HashMap<String, ArrayList<String>> contas)
    {
        ArrayList<String> resto = new ArrayList<>();

        resto.add(nome);
        resto.add(email);
        resto.add("0.0");

        contas.put(cpf, resto);

        return contas;
    }

    private void mostrarPefil(String nome, String cpf, String email, Scanner ler, HashMap<String, ArrayList<String>> banco)
    {
        while (true) {
            System.out.println("========= Bem-Vindo! " + this.nome.split(" ")[0] + "=========");
            System.out.println("\n--------- Seus dados ---------");
            System.out.println("\nNome completo: " + banco.get(cpf).get(0));
            System.out.println("\nEmail: " + banco.get(cpf).get(1));
            System.out.println("\nSaldo: " + banco.get(cpf).get(2));

            System.out.print("\n[1] Depositar\n[2] Scar\n\nOq quer fazer? ");
            String acao = ler.nextLine();

            if (!Verificador.isNumber(acao)) {
                System.out.println("\nAção não existe, por favor digite uma ação existente!");
                continue;
            }

            if (acao.equals("1")) {
                depositar(cpf, banco, ler);

            } else if (acao.equals("2")) {
                sacar(banco, ler);

            } else if (acao.equals("3")) {
                System.out.println("\nSaindo...");
                break;

            } else
            {
                System.out.println("\na ação não existe!");

            }
        }
    }
}
