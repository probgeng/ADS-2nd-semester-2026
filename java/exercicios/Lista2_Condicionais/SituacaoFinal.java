import java.util.Scanner;

public class SituacaoFinal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota da Prova 1: ");
        double prova1 = entrada.nextDouble();

        System.out.print("Digite a nota da Prova 2: ");
        double prova2 = entrada.nextDouble();

        System.out.print("Digite a nota do Trabalho 1: ");
        double trab1 = entrada.nextDouble();

        System.out.print("Digite a nota do Trabalho 2: ");
        double trab2 = entrada.nextDouble();

        System.out.print("Digite a nota do Trabalho 3: ");
        double trab3 = entrada.nextDouble();

        double media = (prova1 + prova2 + trab1 + trab2 + trab3) / 5.0;
        System.out.printf("Média: %.2f%n", media);

        if (media >= 6) {
            System.out.println("Situação: Aprovado");
        } else if (media >= 4) {
            System.out.println("Situação: Exame");
        } else {
            System.out.println("Situação: Reprovado");
        }

        entrada.close();
    }
}
