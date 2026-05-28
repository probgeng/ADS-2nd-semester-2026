import java.util.Scanner;

public class MaiorAreaTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Triângulo 1 ===");
        System.out.print("Base: "); double base1 = entrada.nextDouble();
        System.out.print("Altura: "); double altura1 = entrada.nextDouble();
        double area1 = (base1 * altura1) / 2;

        System.out.println("=== Triângulo 2 ===");
        System.out.print("Base: "); double base2 = entrada.nextDouble();
        System.out.print("Altura: "); double altura2 = entrada.nextDouble();
        double area2 = (base2 * altura2) / 2;

        System.out.println("=== Triângulo 3 ===");
        System.out.print("Base: "); double base3 = entrada.nextDouble();
        System.out.print("Altura: "); double altura3 = entrada.nextDouble();
        double area3 = (base3 * altura3) / 2;

        double maiorArea = area1;
        if (area2 > maiorArea) maiorArea = area2;
        if (area3 > maiorArea) maiorArea = area3;

        System.out.printf("Áreas: T1=%.2f | T2=%.2f | T3=%.2f%n", area1, area2, area3);
        System.out.printf("Maior área: %.2f%n", maiorArea);

        entrada.close();
    }
}
