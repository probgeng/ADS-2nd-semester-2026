import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Equação: ax² + bx + c = 0 ===");
        System.out.print("Digite o valor de a (diferente de zero): ");
        double a = entrada.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = entrada.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = entrada.nextDouble();

        double delta = b * b - 4 * a * c;
        System.out.printf("Delta: %.2f%n", delta);

        if (delta >= 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("X1 = %.2f%n", x1);
            System.out.printf("X2 = %.2f%n", x2);
        } else {
            System.out.println("Não existem raízes reais.");
        }

        entrada.close();
    }
}
