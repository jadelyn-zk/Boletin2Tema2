package boletin5tema2;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		//Create scanner
		Scanner sc = new Scanner(System.in);
		// Create variables for the 2 numbers
		int num1;
		int num2;
		// and for the election of the user
		String letra;

		// ask the numbers to the user
		do {
			System.out.println("Introduce el primer número: ");
			num1 = sc.nextInt();
			System.out.println("Introduce el segundo número: ");
			num2 = sc.nextInt();

			// ask the user which operation they want to do
			System.out.println("A. SUMAR\n" + "B. RESTAR\n" + "C. MULTIPLICAR\n" + "D. DIVIDIR\n" + "E. SALIR\n"
					+ "Introduce una opcion: ");
			letra = sc.next().toUpperCase();
			// and make a condition for each option that can be chosen
			switch (letra) {
			case "A" -> {
				System.out.println("SUMAR: " + (num1 + num2));
				;
			}
			case "B" -> {
				System.out.println("RESTAR: " + (num1 - num2));
				;
			}

			case "C" -> {
				System.out.println("MULTIPLICAR: " + (num1 * num2));
				;
			}

			case "D" -> {
				System.out.println("DIVIDIR: ");
				System.out.println(num2 == 0 ? "NO SE PUEDE" : (num1 / num2));
				;
			}
			case "E" -> System.out.println("SALIENDO...");
			default -> {
				System.out.println("OPCIÓN ERRÓNEA");
				letra = "Z";
			}
			}
			;
			// all of this meanwhile the option is not the exit option
		} while (!letra.equals("E"));

		sc.close();
	}

}
