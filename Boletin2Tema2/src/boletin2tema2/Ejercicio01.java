package boletin2tema2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

//Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma: insuficiente (de 0 a 4), suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10).

		// Create the scanner
		Scanner sc = new Scanner(System.in);

		// Create variable for the grade
		int grade;

		// Ask the user for the grade
		System.out.println("Introduce tu nota:");
		// And read it
		grade = sc.nextInt();

		// Now use a switch to print a message for each grade

		switch (grade) {
		case 0, 1, 2, 3, 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7, 8:
			System.out.println("Notable");
			break;
		case 9, 10:
			System.out.println("Sobresaliente");
			break;
		default: {
			System.out.println("ERROR. Tu nota no debe ser menor que 0 o mayor que 10");
		}

			sc.close();

		}

	}
}
