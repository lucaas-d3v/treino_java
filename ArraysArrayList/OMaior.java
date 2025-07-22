import java.util.ArrayList;
import java.util.Scanner;

public class OMaior {

    public static int pegarMaior(ArrayList<Integer> numeros)
    {
        int a, b, c;
        a = numeros.get(0);
        b = numeros.get(1);
        c = numeros.get(2);

        int quase_maior = ((a + b) + Math.abs(a - b)) / 2;

        if (quase_maior > c)
        {
            return quase_maior;
        }

        return c;

    }

    public static void main(String[] args) {
        ArrayList<Integer> numeros_sep = new ArrayList<Integer>();

        Scanner ler = new Scanner(System.in);

        String numeros_digitados = ler.nextLine();

        for (String numero : numeros_digitados.split(" "))
        {
            numeros_sep.add(Integer.parseInt(numero));
        }

        String a = String.format("%d eh o maior", pegarMaior(numeros_sep));

        System.out.printf("%s eh o maior", a);
    }
}