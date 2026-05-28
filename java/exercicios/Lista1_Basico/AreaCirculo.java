import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o perímetro do círculo: ");
        double perimetro = entrada.nextDouble();

        double pi = 3.14;
        double raio = perimetro / (2 * pi);
        double area = pi * raio * raio;

        System.out.printf("Raio calculado: %.2f%n", raio);
        System.out.printf("Área do círculo: %.2f%n", area);

        entrada.close();
    }
}
