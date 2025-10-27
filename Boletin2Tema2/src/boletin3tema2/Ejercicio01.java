package boletin3tema2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Escribe una aplicación que solicite al usuario un número comprendido entre 0
		 * y 9999. La aplicación tendrá que indicar si el número introducido es capicúa.
		 * Un número es capicúa si se lee igual de izquierda a derecha que de derecha a
		 * izquierda.
		 */

		// Create a variable for the number we ask the user
		int num;

		// ASk the user for a number
		System.out.println("Introduce numero entre 0 y 9999");
		// And read it
		num = sc.nextInt();

		// Create a condition for the numbers of 1 digit
		if (num >= 0 && num < 10) {
			System.out.println("El numero es capicua");

		} else if (num >= 10 && num < 100) {
			if (num / 10 == num % 10) {
				System.out.println("El numero es capicua");
			} else {
				System.out.println("El numero no es capicua");
			}
		} else if (num >= 100 && num < 1000) {
			if (num / 100 == num % 10) {
				System.out.println("El numero es capicua");
			} else {
				System.out.println("El numero no es capicua");
			}
		} else if (num >= 1000 && num < 10000) {
			if (num / 1000 == num % 10 && (num / 100) % 10 == (num / 10) % 10) {
				System.out.println("El numero es capicua");
			} else {
				System.out.println("El numero no es capicua");
			}
		} else {
			System.out.println("Fuera de rango");
		}

		//Close the scanner
		sc.close();

	}

}
