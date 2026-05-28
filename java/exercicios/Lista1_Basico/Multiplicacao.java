import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = entrada.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double n3 = entrada.nextDouble();

        double resultado = n1 * n2 * n3;
        System.out.printf("Resultado da multiplicação: %.2f%n", resultado);

        entrada.close();
    }
}
