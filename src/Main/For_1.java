package Main;

import java.util.Scanner;

public class For_1 {

	public static void main(String[] args) {

		/*
		 * Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10,
		 * conforme exemplo.
		 */

		Scanner sc = new Scanner(System.in);

		int n, produto;

		System.out.print("Dedseja a tabuada para qual valor:");
		n = sc.nextInt();

		for (int i=1; i<=10;i++) {
			produto = n * i;
			System.out.printf("%d x %d = %d\n", n, i, produto);
		}

		sc.close();

	}

}
