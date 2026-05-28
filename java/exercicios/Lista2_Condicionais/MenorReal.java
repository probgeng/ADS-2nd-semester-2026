import java.util.Scanner;

public class MenorReal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número real: ");
        double n1 = entrada.nextDouble();

        System.out.print("Digite o segundo número real: ");
        double n2 = entrada.nextDouble();

        if (n1 < n2) {
            System.out.printf("O menor número é: %.2f%n", n1);
        } else {
            System.out.printf("O menor número é: %.2f%n", n2);
        }

        entrada.close();
    }
}
