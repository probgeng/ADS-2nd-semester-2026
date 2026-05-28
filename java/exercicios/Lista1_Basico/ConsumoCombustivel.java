import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a distância percorrida (km): ");
        double distancia = entrada.nextDouble();

        System.out.print("Digite o consumo (litros por km): ");
        double consumoPorKm = entrada.nextDouble();

        double totalLitros = distancia * consumoPorKm;
        System.out.printf("Total de litros gastos: %.2f L%n", totalLitros);

        entrada.close();
    }
}
