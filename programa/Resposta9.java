package programa;

import java.util.Scanner;

public class Resposta9 {
  public static void main(String ...args) {
    Scanner scan = new Scanner(System.in);


    System.out.println("Insira o numero de mini-games: ");
    int games = scan.nextInt();
    
    System.out.println("Insira o numero de calculadoras: ");
    int calc = scan.nextInt();

    System.out.println("Insira o numero de canetas: ");
    int can = scan.nextInt();

    scan.close();

    float fatGames = (float)games * (float)6.95;
    float fatCalc = (float)calc * (float)3.50;
    float fatCan = (float)can * (float)1.20;

    float fatTotal = fatGames + fatCalc + fatGames;

    System.out.printf("Faturamento Total: %.2f\nMini-Games: %.2f\nCalculadoras: %.2f\nCanetas: %.2f", fatTotal, fatGames, fatCalc, fatCan);
  }
}
