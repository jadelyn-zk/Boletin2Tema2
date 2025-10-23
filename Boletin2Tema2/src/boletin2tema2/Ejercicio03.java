package boletin2tema2;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Create the scanner
		Scanner sc = new Scanner(System.in);

		// Create variable for the numbers and the operation choosen by the user
		int num1;
		int num2;
		String eleccion;

		// Ask the user for the numbers
		System.out.println("Introduce dos números:");
		// And read them
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		// Now we make the user choose an operation for both of these numbers
		System.out.println("Elije una de las siguientes operaciones para hacer con los números introducidos: " + num1
				+ " y " + num2);
		System.out.println("A) SUMAR LOS NÚMEROS\r\n" + "B) RESTAR LOS NÚMEROS\r\n" + "C) MULTIPLICAR LOS NÚMEROS\r\n"
				+ "D) DIVIDIR LOS NÚMEROS");

		// Read the user election
		eleccion = sc.next();

		// Now make a switch for each operation the user can choose to do with their
		// numbers.
		switch (eleccion) {
		case "A":
			System.out.println("La suma de ambos números es: " + (num1 + num2));
			break;
//Case for substracting the numbers
		case "B":
			System.out.println("La resta de ambos números es: " + (num1 - num2));
			break;
		//Case for the product
		case "C":
			System.out.println("La multiplicación de ambos números es: " + (num1 * num2));
			break;
		// In this case we also make a condition bc if the second number is 0 then we
		// cant divide, so it gives a error message
		case "D": {
			if (num2 == 0) {
				System.out.println("ERROR. No se puede dividir entre 0");
			} else {
				System.out.println("La división de ambos números es: " + (num1 / num2));
			}
			break;
		}

		default:
			System.out.println("ERROR. La opción seleccionada no es ninguna de las operaciones posibles");
		}
		// And close the scanner
		sc.close();

	}
}
