import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = entrada.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = entrada.nextDouble();

        double area = base * altura;
        System.out.printf("Área do retângulo: %.2f%n", area);

        entrada.close();
    }
}
