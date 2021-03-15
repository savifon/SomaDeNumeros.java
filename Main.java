/* Faça um programa em java que leia vários números. Caso o usuário digite -1, o programa para de solicitar os números e imprime a soma de todos os números digitados, sem contar com o -1.
Nome do programa: SomaDeNumeros.java */

import java.util.*;

class Main {
  public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double n=0, soma=0;

		do {
			soma+=n;
			try{
				System.out.print("Digite um número: ");
				n = sc.nextDouble();
			}catch (InputMismatchException erro1) {
				System.out.println("\n\nVocê deve digitar um número!\n\n");
				sc.nextLine();
			}
		} while (n>-1);

		System.out.println("\n\nA soma do(s) número(s) digitado(s) " + soma + " \n\n");
		
  }
}