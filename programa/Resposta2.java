package programa;

import java.util.Scanner;

public class Resposta2 {
  public static void main(String ...args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Insira o primeiro numero: ");
    int n1 = scan.nextInt();

    System.out.print("Insira o segundo numero: ");
    int n2 = scan.nextInt();

    scan.close();

    float avg = ((float)n1 + (float)n2) / 2;
    float res = ((float)n1 - (float)n2) / 2;

    System.out.printf("Media: %.2f\nMetade da Diferenca: %.2f", avg, res);
    
  }
}
