package Main;

import java.util.Locale;
import java.util.Scanner;

public class For_7 {

	public static void main(String[] args) {

		/*
		 * Escreva um algoritmo que leia um n�mero inteiro N, e depois repita N vezes:
		 * ler dois n�meros e imprimir o resultado da divis�o do primeiro pelo segundo.
		 * Caso n�o for poss�vel, mostre a mensagem �DIVISAO IMPOSSIVEL�.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int ncasos, numerador, denominador;
		double divisao;

		System.out.print("Quantos casos voce vai digitar? ");
		ncasos = sc.nextInt();

		for (int i = 0; i < ncasos; i++) {
			System.out.print("Entre com o numerador: ");
			numerador = sc.nextInt();

			System.out.print("Entre com o denominador: ");
			denominador = sc.nextInt();

			if (denominador == 0) {
				System.out.println("DIVISAO IMPOSSIVEL");

			} else {
				divisao = (double) numerador / denominador;
				System.out.printf("DIVISAO = %.2f\n", divisao);
			}
		}

		sc.close();

	}

}
