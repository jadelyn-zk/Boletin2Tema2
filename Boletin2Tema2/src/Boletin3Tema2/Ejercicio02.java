package Boletin3Tema2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// Create a variable for the number we ask the user
		int num;
		//Then for the Absolute value
		int valorAbsoluto;

		// Akk the user for a number
		System.out.println("Introduce un número para saber su valor absoluto: ");
		// And read it
		num = sc.nextInt();

		//Then we make a ternary to find out the Absolute value
		valorAbsoluto = num >= 0 ? num : -num;
		
		//Finally print the solution
		System.out.println("El valor absoluto de "+ num + " es " + valorAbsoluto);
	
		sc.close();
	}

}
