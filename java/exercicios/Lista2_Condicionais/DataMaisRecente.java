import java.util.Scanner;

public class DataMaisRecente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Data 1 ===");
        System.out.print("Dia: ");  int dia1 = entrada.nextInt();
        System.out.print("Mês: ");  int mes1 = entrada.nextInt();
        System.out.print("Ano: ");  int ano1 = entrada.nextInt();

        System.out.println("=== Data 2 ===");
        System.out.print("Dia: ");  int dia2 = entrada.nextInt();
        System.out.print("Mês: ");  int mes2 = entrada.nextInt();
        System.out.print("Ano: ");  int ano2 = entrada.nextInt();

        String maisRecente;
        if (ano1 > ano2) {
            maisRecente = dia1 + "/" + mes1 + "/" + ano1;
        } else if (ano2 > ano1) {
            maisRecente = dia2 + "/" + mes2 + "/" + ano2;
        } else if (mes1 > mes2) {
            maisRecente = dia1 + "/" + mes1 + "/" + ano1;
        } else if (mes2 > mes1) {
            maisRecente = dia2 + "/" + mes2 + "/" + ano2;
        } else if (dia1 > dia2) {
            maisRecente = dia1 + "/" + mes1 + "/" + ano1;
        } else if (dia2 > dia1) {
            maisRecente = dia2 + "/" + mes2 + "/" + ano2;
        } else {
            maisRecente = "As datas são iguais";
        }

        System.out.println("Data mais recente: " + maisRecente);

        entrada.close();
    }
}
