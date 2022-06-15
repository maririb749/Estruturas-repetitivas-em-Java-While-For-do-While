package Main;

import java.util.Scanner;

public class For_5 {

	public static void main(String[] args) {

		/*
		 * Leia um valor inteiro N. Este valor ser� a quantidade de n�meros inteiros que
		 * ser�o lidos em seguida. Para cada valor lido, mostre uma mensagem dizendo se
		 * este valor lido � PAR ou IMPAR, e tamb�m se � POSITIVO ou NEGATIVO. No caso
		 * do valor ser igual a zero (0), seu programa dever� imprimir apenas NULO.
		 */

		Scanner sc = new Scanner(System.in);

		int n, valor;

		System.out.print("Quantos numeros voce vai digitar?");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero:");
			valor = sc.nextInt();

			if (valor == 0) {
				System.out.println("NULO");
			} 
			else {
				if (valor % 2 == 0) {
					System.out.print("PAR");
				} 
				else {
					System.out.print("IMPAR");

				}
				if (valor > 0) {
					System.out.println(" POSITIVO");

				} 
				else {
					System.out.println(" NEGATIVO");
				}

			}
		}

		sc.close();

	}

}
