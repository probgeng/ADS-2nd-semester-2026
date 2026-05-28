import java.util.Scanner;

public class NovoSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário atual: R$ ");
        double salario = entrada.nextDouble();

        double novoSalario = salario * 1.25;
        System.out.printf("Novo salário com 25%% de aumento: R$ %.2f%n", novoSalario);

        entrada.close();
    }
}
