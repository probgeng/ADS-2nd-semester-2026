import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a altura em metros (ex: 1.75): ");
        double altura = entrada.nextDouble();

        System.out.print("Digite o sexo (M/F): ");
        char sexo = entrada.next().toUpperCase().charAt(0);

        double pesoIdeal;
        if (sexo == 'M') {
            pesoIdeal = 72.7 * altura - 58;
        } else {
            pesoIdeal = 62.1 * altura - 44.7;
        }

        System.out.printf("Peso ideal: %.2f kg%n", pesoIdeal);

        entrada.close();
    }
}
