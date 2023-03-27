package programa;

import java.util.Scanner;

public class Resposta10 {
  public static void main (String ...args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira o numero de vitorias: ");
    int vitoria = scan.nextInt();
    
    System.out.println("Insira o numero de derrotas: ");
    int derrota = scan.nextInt();

    System.out.println("Insira o numero de empates: ");
    int empate = scan.nextInt();

    scan.close();

    int quantJogos = vitoria + derrota + empate;
    int pontosDisputados = quantJogos * 3;
    int pontosGanhos = vitoria * 3;
    int pontosPerdidos = pontosDisputados - pontosGanhos;

    System.out.printf("Total de Jogos: %d\nPontos Disputados: %d\nPontos Ganhos: %d\nPontos Perdidos: %d", quantJogos, pontosDisputados, pontosGanhos, pontosPerdidos);
  }
}
