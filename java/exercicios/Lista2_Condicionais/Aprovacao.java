import java.util.Scanner;

public class Aprovacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media > 6) {
            System.out.printf("Aprovado! Média: %.2f%n", media);
        } else {
            System.out.printf("Reprovado! Média: %.2f%n", media);
        }

        entrada.close();
    }
}
