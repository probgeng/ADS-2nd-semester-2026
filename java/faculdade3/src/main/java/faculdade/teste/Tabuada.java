package faculdade.teste;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resp = "s";

        while (!"n".equals(resp)) {
            System.out.print("Digite o número da tabuada: ");
            int numero = entrada.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }

            System.out.print("Deseja fazer outra tabuada? (s/n): ");
            resp = entrada.next();
        }

        System.out.println("Programa encerrado.");
        entrada.close();
    }
}
