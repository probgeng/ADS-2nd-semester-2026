import java.util.Scanner;

public class IdadeAnos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = entrada.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = entrada.nextInt();

        int idade = anoAtual - anoNascimento;
        System.out.println("Idade aproximada: " + idade + " anos");

        entrada.close();
    }
}
