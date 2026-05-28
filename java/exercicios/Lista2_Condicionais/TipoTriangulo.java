import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double a = entrada.nextDouble();

        System.out.print("Digite o lado B: ");
        double b = entrada.nextDouble();

        System.out.print("Digite o lado C: ");
        double c = entrada.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero (todos os lados iguais)");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triângulo Isósceles (dois lados iguais)");
            } else {
                System.out.println("Triângulo Escaleno (todos os lados diferentes)");
            }
        } else {
            System.out.println("Os lados informados NÃO formam um triângulo.");
        }

        entrada.close();
    }
}
