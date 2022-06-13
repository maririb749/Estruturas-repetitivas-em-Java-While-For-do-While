package Main;

import java.util.Locale;
import java.util.Scanner;

public class Estrutura_while {

	public static void main(String[] args) {

		/*
		 * Fazer um programa que l� n�meros inteiros at� que o zero seja lido. Ao final
		 * mostrar a soma dos n�meros.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
		int soma = 0;
		
		while (x != 0) {
			soma = soma +  x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);

		sc.close();

	}

}
