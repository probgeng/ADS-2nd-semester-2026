import java.util.Scanner;

public class ComissaoSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário fixo: R$ ");
        double salarioFixo = entrada.nextDouble();

        System.out.print("Digite o total de vendas: R$ ");
        double totalVendas = entrada.nextDouble();

        double comissao = totalVendas * 0.04;
        double salarioFinal = salarioFixo + comissao;

        System.out.printf("Comissão (4%% das vendas): R$ %.2f%n", comissao);
        System.out.printf("Salário final:             R$ %.2f%n", salarioFinal);

        entrada.close();
    }
}
