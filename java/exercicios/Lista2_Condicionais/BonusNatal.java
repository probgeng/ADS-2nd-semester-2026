import java.util.Scanner;

public class BonusNatal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o sexo (M/F): ");
        char sexo = entrada.next().toUpperCase().charAt(0);

        System.out.print("Digite o tempo de casa (anos): ");
        int tempo = entrada.nextInt();

        System.out.print("Digite o salário: R$ ");
        double salario = entrada.nextDouble();

        double bonus;
        if (sexo == 'M' && tempo > 15) {
            bonus = salario * 0.20;
            System.out.println("Bônus aplicado: 20% (homem, mais de 15 anos de casa)");
        } else if (sexo == 'F' && tempo > 10) {
            bonus = salario * 0.25;
            System.out.println("Bônus aplicado: 25% (mulher, mais de 10 anos de casa)");
        } else {
            bonus = 200.0;
            System.out.println("Bônus aplicado: R$ 200,00 (padrão)");
        }

        double total = salario + bonus;
        System.out.printf("Bônus:  R$ %.2f%n", bonus);
        System.out.printf("Total:  R$ %.2f%n", total);

        entrada.close();
    }
}
