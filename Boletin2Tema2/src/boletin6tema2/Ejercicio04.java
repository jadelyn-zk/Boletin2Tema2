package boletin6tema2;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Variable for the number, the counting and the sum of all the odd numbers
		int num = 1;
		int contador;
		int suma = 0;

		// condition to limit the amount of numbers
		for (contador = 0; contador < 10; contador++) {
			// To sum up only the odd numbers, counting by two starting in num which is 1
			suma += num;
			num += 2;
		}

		// print the results
		System.out.println("La suma de los 10 primeros números impares es de " + suma);

	}

}
