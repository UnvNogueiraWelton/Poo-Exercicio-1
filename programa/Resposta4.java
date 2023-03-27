package programa;

import java.util.Scanner;

public class Resposta4 {
  public static void main(String ...args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Insira o salario bruto do funcionario: ");
    float salBruto = scan.nextFloat();

    scan.close();
    
    float desc = salBruto * (float)0.08;
    float salLiquido = salBruto - desc;

    System.out.printf("Salario Bruto: R$ %.2f\nDesconto: R$ %.2f\nSalario Liquido: %.2f", salBruto, desc, salLiquido);
  }
}
