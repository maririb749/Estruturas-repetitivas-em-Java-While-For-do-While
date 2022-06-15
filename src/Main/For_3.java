package Main;

import java.util.Scanner;

public class For_3 {

	public static void main(String[] args) {

		/*
		 * Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor
		 * por linha, inclusive o X, se for o caso.
		 */

		Scanner sc = new Scanner(System.in);

		int x;
		System.out.print("Digite o valor de x: ");
		x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.printf("%d\n", i);
			}
		}

		sc.close();

	}

}
