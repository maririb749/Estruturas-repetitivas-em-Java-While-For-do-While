package Main;

import java.util.Scanner;

public class For_8 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número natural N (valor máximo: 15), e depois
		 * calcular e mostrar o fatorial de N.
		 */

		Scanner sc = new Scanner(System.in);

		int N, fatorial;

		System.out.println("Digite o valor de N: ");
		N = sc.nextInt();

		fatorial = 1;
		for (int i = N; i > 0; i--) {
			fatorial = fatorial * i;

		}
		System.out.printf("FATORIAL = %d\n", fatorial);

		sc.close();

	}

}
