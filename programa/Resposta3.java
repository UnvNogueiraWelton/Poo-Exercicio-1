package programa;

import java.util.Scanner;

public class Resposta3 {
  public static void main (String ...args) {

    Scanner scan = new Scanner(System.in);

    float media = 0;

    for(int i = 0; i < 3; i++) {
      System.out.printf("Insira a %d nota: ", i + 1);
      media += scan.nextFloat();
    }

    scan.close();

    media /= 3;

    System.out.printf("A media do aluno e: %.2f", media);
  }
}
