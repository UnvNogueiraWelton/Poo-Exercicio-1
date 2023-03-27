package programa;

import java.util.Scanner;

public class Resposta5 {
  public static void main(String ...args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira respectivamento os valores de A, B e C: ");
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    scan.close();

    int delta = (int)Math.pow(b, 2) - (4 * a * c);

    System.out.printf("Delta: %d", delta);
  }
}
