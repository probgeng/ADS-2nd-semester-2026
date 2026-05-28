import java.util.Scanner;

public class MaiorInteiro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = entrada.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = entrada.nextInt();

        if (n1 > n2) {
            System.out.println("O maior número é: " + n1);
        } else {
            System.out.println("O maior número é: " + n2);
        }

        entrada.close();
    }
}
