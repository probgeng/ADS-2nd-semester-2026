import java.util.Scanner;

public class MediaPonderadaTres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota P1: ");
        double p1 = entrada.nextDouble();

        System.out.print("Digite a nota P2: ");
        double p2 = entrada.nextDouble();

        System.out.print("Digite a nota P3: ");
        double p3 = entrada.nextDouble();

        double media = (p1 * 3 + p2 * 3 + p3 * 4) / 10.0;
        System.out.printf("Média ponderada: %.2f%n", media);

        entrada.close();
    }
}
