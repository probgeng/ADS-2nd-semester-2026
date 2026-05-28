import java.util.Scanner;

public class CategoriaNadador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = entrada.nextInt();

        if (idade >= 0 && idade <= 10) {
            System.out.println("Categoria: Infantil");
        } else if (idade <= 14) {
            System.out.println("Categoria: Junior");
        } else if (idade <= 20) {
            System.out.println("Categoria: Adolescente");
        } else if (idade <= 35) {
            System.out.println("Categoria: Jovem");
        } else {
            System.out.println("Categoria: Máster");
        }

        entrada.close();
    }
}
