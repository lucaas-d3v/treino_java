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

    public static float areaTrianguloRetangulo(float a, float c)
    {
        return (a * c) / 2;
    }

    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        String linha = ler.nextLine();
        ler.close();

        String[] partes = linha.split(" ");
        float a = Float.parseFloat(partes[0]);
        float b = Float.parseFloat(partes[1]);
        float c = Float.parseFloat(partes[2]);

        System.out.printf("TRIANGULO: %.3f\n", areaTrianguloRetangulo(a, c));
        System.out.printf("CIRCULO: %.3f\n", areaCirculo(c));
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio(a, b, c));
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado(b));
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo(a, b));
    }
}
