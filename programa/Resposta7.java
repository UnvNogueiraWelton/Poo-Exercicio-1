package programa;

import java.util.Scanner;

public class Resposta7 {
  public static void main(String ...args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira o Km Inicial: ");
    float kmInicial = scan.nextFloat();

    System.out.println("Insira o Km Final: ");
    float kmFinal = scan.nextFloat();

    scan.close();

    System.out.printf("Percorrido %.2fKm", kmFinal - kmInicial);
  }
}
