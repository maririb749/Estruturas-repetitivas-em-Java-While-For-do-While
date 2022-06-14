package Main;

import java.util.Locale;
import java.util.Scanner;

public class Estrutura_do_while {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente
		 * em Fahrenheit.Perguntar se o usu�rio deseja repetir(s/n). Caso o usu�rio
		 * digite "s", repetir o programa.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resp;

		do {
			System.out.print("Digitea a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)?");
			resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();

	}

}
