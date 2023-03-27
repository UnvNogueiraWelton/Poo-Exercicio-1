package programa;

import java.util.Scanner;

public class Resposta6 {
  public static void main(String ...args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira uma distancia em km: ");
    float km = scan.nextFloat();
    scan.close();

    System.out.printf("%.2fkm = %.2fm", km, km * 1000);
  }
}
