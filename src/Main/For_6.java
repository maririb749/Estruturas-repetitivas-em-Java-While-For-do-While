package Main;

import java.util.Locale;
import java.util.Scanner;

public class For_6 {

	public static void main(String[] args) {

		/*
		 * Leia um valor inteiro N, que representa o n�mero de casos de teste que vem a
		 * seguir. Cada caso de teste consiste de 3 valores reais, para os quais voc�
		 * dever� calcular e mostrar a m�dia ponderada, sendo que o primeiro valor tem
		 * peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5. Vale
		 * lembrar que a m�dia ponderada � a soma de todos os valores multiplicados pelo
		 * seu respectivo peso, dividida pela soma dos pesos.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double valor, valor1, valor2, media;

		System.out.print("Quantos casos voce vai digitar? ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite tres numeros:");
			valor = sc.nextDouble();
			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();

			media = (valor * 2.0 + valor1 * 3.0 + valor2 * 5.0) / 10.0;

			System.out.printf("MEDIA = %.1f\n", media);

		}

		sc.close();

	}

}
