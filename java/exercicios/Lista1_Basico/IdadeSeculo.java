import java.util.Scanner;

public class IdadeSeculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade atual: ");
        int idadeAtual = entrada.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = entrada.nextInt();

        int idadeNoSeculo = idadeAtual + (2100 - anoAtual);
        System.out.println("Idade na virada do próximo século (2100): " + idadeNoSeculo + " anos");

        entrada.close();
    }
}
