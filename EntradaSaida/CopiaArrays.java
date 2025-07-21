public class CopiaArrays
{
    public static int[] reverter(int[] numeros)
    {
        int[] invertido = new int[numeros.length];

        for (int i = numeros.length - 1, a = 0; i >= 0; i--, a++)
        {
            invertido[a] = numeros[i];
        }

        return invertido;
    }

    public static void main(String[] args)
    {
        int[] original = {1, 2, 3, 4 , 5};

        for (int n : original)
        {
            System.out.print(n);
        }

        System.out.println();

        int[] invertido = reverter(original);

        for (int n : invertido)
        {
            System.out.print(n);
        }

        System.out.println();
    }
}
