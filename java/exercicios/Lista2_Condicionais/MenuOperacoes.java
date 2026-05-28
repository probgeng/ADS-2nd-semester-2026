import java.util.Scanner;

public class MenuOperacoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== MENU DE OPERAÇÕES ===");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Escolha uma opção: ");
        int opcao = entrada.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        switch (opcao) {
            case 1:
                System.out.printf("Resultado da adição: %.2f%n", num1 + num2);
                break;
            case 2:
                System.out.printf("Resultado da subtração: %.2f%n", num1 - num2);
                break;
            case 3:
                System.out.printf("Resultado da multiplicação: %.2f%n", num1 * num2);
                break;
            case 4:
                if (num2 != 0) {
                    System.out.printf("Resultado da divisão: %.2f%n", num1 / num2);
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }

        entrada.close();
    }
}
