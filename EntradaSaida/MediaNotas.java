import java.util.Scanner;

public class MediaNotas
{
    public static float calcularMedia(float[] notas)
    {
        float sum_notas = 0.0f;

        for(float nota : notas)
        {
            sum_notas += nota;
        }
        return sum_notas / 4.0f;
    }

    public static void main(String[] args)
    {
        float[] notas = new float[4];
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 4; i++)
        {
            System.out.print("Digite a sua " + (i + 1) + "ª nota: ");
            float nota = ler.nextFloat();

            notas[i] = nota;
        }

        ler.close();

        float media = calcularMedia(notas);

        System.out.print("A sua média é " + media);

        if (media >= 7.0f)
        {
            System.out.println(" e você foi aprovado!");
        }
        else
        {
            System.out.println(" e você foi reprovado...");
        }
    }
}
