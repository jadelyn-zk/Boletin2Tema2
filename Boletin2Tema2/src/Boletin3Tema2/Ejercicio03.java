package Boletin3Tema2;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Create a variable for the DNI 
		int dni;
		// Then for the letter at the end of the DNI
		char letra;

		// Ask the user for the DNI
		System.out.println("Introduce tu dni: ");
		// And read it
		dni = sc.nextInt();

		// Create a switch to compare all cases, to find out the Letter on the dni
		switch (dni % 23) {
		case 0 -> letra = 'T';
		case 1 -> letra = 'R';
		case 2 -> letra = 'W';
		case 3 -> letra = 'A';
		case 4 -> letra = 'G';
		case 5 -> letra = 'M';
		case 6 -> letra = 'Y';
		case 7 -> letra = 'F';
		case 8 -> letra = 'P';
		case 9 -> letra = 'D';
		case 10 -> letra = 'X';
		case 11 -> letra = 'B';
		case 12 -> letra = 'N';
		case 13 -> letra = 'J';
		case 14 -> letra = 'Z';
		case 15 -> letra = 'S';
		case 16 -> letra = 'Q';
		case 17 -> letra = 'V';
		case 18 -> letra = 'H';
		case 19 -> letra = 'L';
		case 20 -> letra = 'C';
		case 21 -> letra = 'R';
		//Use the default as the last case.
		default -> letra = 'E';
		}

		// Print the full DNI with the correct final letter
		System.out.println("El DNI completo es: " + dni + letra);

		// close the scanner
		sc.close();
	}

}
