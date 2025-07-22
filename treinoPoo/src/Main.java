import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ContaBancaria contaBancaria = new ContaBancaria();

        Scanner ler = new Scanner(System.in);

        contaBancaria.menuInicial(ler);

        ler.close();
    }
}
