import java.util.Scanner;

public class SalarioGratificacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário base: R$ ");
        double salarioBase = entrada.nextDouble();

        double gratificacao = salarioBase * 0.05;
        double imposto = salarioBase * 0.07;
        double novoSalario = salarioBase + gratificacao - imposto;

        System.out.printf("Gratificação (5%%):  R$ %.2f%n", gratificacao);
        System.out.printf("Imposto (7%%):       R$ %.2f%n", imposto);
        System.out.printf("Novo salário:       R$ %.2f%n", novoSalario);

        entrada.close();
    }
}
