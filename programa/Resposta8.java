package programa;

import java.util.Scanner;

public class Resposta8 {
  public static void main (String ...args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira a quantidade de alunos do sexo masculino: ");
    int aluMasculino = scan.nextInt();

    System.out.println("Insira a quantidade de alunos do sexo feminino: ");
    int aluFeminino = scan.nextInt();

    System.out.println("Insira a quantidade de alunos aprovados: ");
    int aluApr = scan.nextInt();

    scan.close();

    int totalAlunos = aluMasculino + aluFeminino + aluApr;

    float percentMasculino = (float)aluMasculino * 100 / (float)totalAlunos;
    float percentFeminino = (float)aluFeminino * 100 / (float)totalAlunos;
    float percentAprovado = (float)aluApr * 100 / (float)totalAlunos;

    System.out.printf("Total de Alunos: %d\nPorcentagem Masculino: %.2f\nPorcentagem Feminino: %.2f\nPorcentagem Aprovado: %.2f", totalAlunos, percentMasculino, percentFeminino, percentAprovado);
    
    
  }
}
