package faculdade.teste;
  import java.util.InputMismatchException;
  import java.util.Scanner;
  public class Main
  {
      public static void main(String[] args)
      {
          Scanner sc = new Scanner(System.in);

          double num1 = 0;
          double num2 = 0;
          int opera = 0;

          while (true)
          {
              try
              {
                  System.out.print("Digite o primeiro número: ");
                  num1 = sc.nextDouble();
                  break;
              }
              catch (InputMismatchException e)
              {
                  System.out.println("Erro: use vírgula como separador decimal. Ex: 0,1");
                  sc.next();
              }
          }

          while (true)
          {
              try
              {
                  System.out.print("Digite o segundo número: ");
                  num2 = sc.nextDouble();
                  break;
              }
              catch (InputMismatchException e)
              {
                  System.out.println("Erro: use vírgula como separador decimal. Ex: 0,1");
                  sc.next();
              }
          }

            while (true)
          {      System.out.println("Digite a operação desejada: \n1-soma\n2-subtração\n3-divisão\n4-multiplicação");
                 opera = sc.nextInt();
                 if (opera >= 1 && opera <= 4)
           {
                 break;
           }
            else
           {
                System.out.println("Operação inválida. Escolha entre 1, 2, 3 ou 4.");
           }
          }

          if (opera == 1)
          {
              System.out.println("A soma é: " + (num1 + num2));
          }
          else if (opera == 2)
          {
              System.out.println("A subtração de " + num1 + " por " + num2 + " é    : " + (num1 - num2));
          }
          else if (opera == 3)
          {      while (num2 == 0)
          {          System.out.print("Erro: divisão por zero não é permitida. Digite outro número: ");
                    num2 = sc.nextDouble();
          }
                     System.out.println("A divisão é: " + (num1 / num2));
         }
          else if (opera == 4)
          {
              System.out.println("A multiplicação é: " + (num1 * num2));
          }
          else
          {
              System.out.println("Operação inválida.");
          }

          sc.close();
      }
  }