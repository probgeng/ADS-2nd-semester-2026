import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double a = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = entrada.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double c = entrada.nextDouble();

        double temp;
        if (a > b) { temp = a; a = b; b = temp; }
        if (a > c) { temp = a; a = c; c = temp; }
        if (b > c) { temp = b; b = c; c = temp; }

        System.out.printf("Ordem crescente: %.2f, %.2f, %.2f%n", a, b, c);

        entrada.close();
    }
}
