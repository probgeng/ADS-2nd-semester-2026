import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = entrada.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " é Par");
        } else {
            System.out.println(n + " é Ímpar");
        }

        entrada.close();
    }
}
