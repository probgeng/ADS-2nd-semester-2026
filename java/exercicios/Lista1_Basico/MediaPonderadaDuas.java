import java.util.Scanner;

public class MediaPonderadaDuas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota (peso 2): ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota (peso 3): ");
        double nota2 = entrada.nextDouble();

        double media = (nota1 * 2 + nota2 * 3) / 5.0;
        System.out.printf("Média ponderada: %.2f%n", media);

        entrada.close();
    }
}
