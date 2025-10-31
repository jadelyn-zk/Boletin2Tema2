package boletin4tema2;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Create a new scanner
		Scanner sc = new Scanner(System.in);

		// Create variables
		int num;
		int suma = 0;
		int resta = 0;
		int contador = 0;
		int contadorNeg = 0;
		int contadorCeros = 0;
		double media = 0;

		// Ask the first number to the user
		System.out.println("Introduce un número: ");
		num = sc.nextInt();

		// Then create a loop to sum up all the numbers and do the operations
		while (contador < 10) {
			++contador;
			System.out.println("Introduce otro número: ");
			num = sc.nextInt();

			if (num > 0) {
				suma += num;
			} else if (num == 0) {
				contadorCeros++;
			} else {
				++contadorNeg;
				resta += num;
			}
		}
		media = (double) resta / contadorNeg;

		// Print the results
		System.out.println("La suma de todos los números introducidos es de " + suma + " y la media es de " + media
				+ " y se han introducido " + contadorCeros + " ceros");

		// Close the scanner
		sc.close();
	}

}
