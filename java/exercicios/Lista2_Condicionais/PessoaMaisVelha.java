import java.util.Scanner;

public class PessoaMaisVelha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Pessoa 1 ===");
        System.out.print("Nome: ");           String nome1 = entrada.next();
        System.out.print("Dia de nascimento: "); int dia1 = entrada.nextInt();
        System.out.print("Mês de nascimento: "); int mes1 = entrada.nextInt();
        System.out.print("Ano de nascimento: "); int ano1 = entrada.nextInt();

        System.out.println("=== Pessoa 2 ===");
        System.out.print("Nome: ");           String nome2 = entrada.next();
        System.out.print("Dia de nascimento: "); int dia2 = entrada.nextInt();
        System.out.print("Mês de nascimento: "); int mes2 = entrada.nextInt();
        System.out.print("Ano de nascimento: "); int ano2 = entrada.nextInt();

        String maisVelha;
        if (ano1 < ano2) {
            maisVelha = nome1;
        } else if (ano2 < ano1) {
            maisVelha = nome2;
        } else if (mes1 < mes2) {
            maisVelha = nome1;
        } else if (mes2 < mes1) {
            maisVelha = nome2;
        } else if (dia1 < dia2) {
            maisVelha = nome1;
        } else if (dia2 < dia1) {
            maisVelha = nome2;
        } else {
            maisVelha = "Mesma idade (" + nome1 + " e " + nome2 + ")";
        }

        System.out.println("Pessoa mais velha: " + maisVelha);

        entrada.close();
    }
}
