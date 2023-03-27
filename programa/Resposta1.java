package programa;
import java.util.Scanner;

class Resposta1 {
  public static void main(String ...args) {
   Scanner scan = new Scanner(System.in);

   System.out.print("Digite um numero para saber o dobro: ");

   int num = scan.nextInt();
   scan.close();

   System.out.printf("Dobro de %d = %d", num, num * 2);
  }
}