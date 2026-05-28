import java.util.Scanner;

public class CategoriaMoto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a cilindrada da moto (cc): ");
        int cc = entrada.nextInt();

        if (cc >= 0 && cc <= 120) {
            System.out.println("Categoria: Sub Production");
        } else if (cc <= 240) {
            System.out.println("Categoria: Production");
        } else {
            System.out.println("Categoria: Super Production");
        }

        entrada.close();
    }
}
