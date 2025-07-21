/*
Crie um programa que leia três valores de ponto flutuante: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem base A e altura C.
b) a área do círculo de raio C. (pi = 3,14159)
c) a área do trapézio que tem A e B pela base e C pela altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

Entrada
O arquivo de entrada contém três valores double com um dígito após a vírgula decimal.

Saída
O arquivo de saída deve conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima,
sempre com uma mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado
 com 3 dígitos após a vírgula decimal.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Area {

    public static float areaRetangulo(float a, float b)
    {
        return a * b;
    }

    public static double areaCirculo(float c)
    {
        return 3.14159 * Math.pow(c, 2);
    }

    public static float areaTrapezio(float a, float b, float c)
    {
        return (a + b) * (c / 2.0f);
    }

    public static float areaQuadrado(float b)
    {
        return (float)Math.pow(b, 2);
    }

    public static float areaTrianguloRetangulo(float a, float b)
    {
        return (float)((a * b) / 2.0f);
    }

    public static void main(String[] args)
    {
        ArrayList<Float> numeros = new ArrayList<Float>();
        String a;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor de a, b, c: ");
        a = ler.nextLine();

        for (String num : a.split(" "))
        {
            numeros.add((float) Integer.parseInt(num));
        }

        areaTrianguloRetangulo(numeros.get(0), numeros.get(1));
        areaCirculo(numeros.get(2));
        areaTrapezio(numeros.get(0), numeros.get(1), numeros.get(2));
        areaQuadrado(numeros.get(1));
        areaRetangulo(numeros.get(0), numeros.get(1));

        ler.close();

    }
}
