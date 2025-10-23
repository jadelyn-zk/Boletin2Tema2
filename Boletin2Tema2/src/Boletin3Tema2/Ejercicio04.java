package Boletin3Tema2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Create the scanner
		Scanner sc = new Scanner(System.in);
		//And the random 
		Random rand = new Random();

		//Title
		System.out.println("Juego de la suma");
		//Create variable for 2 random numbers in a interval from 1 to 99
        int num1 = rand.nextInt(1,99);
		int num2 = rand.nextInt(1,99);
		//Then a variable for the sum of both random numbers
		int suma= num1+num2;
		//And for the result the user gives 
		int resultado;
		
		//Print these numbers so the user can sum them up
		System.out.println("Resuelve esta suma= " + num1 + " + " + num2);
		
		// Ask the user for their result
		System.out.println("Introduce el resultado: ");
		// And read it
		resultado = sc.nextInt();

		//Now create a condition to comprobate if the result is correct
		if (resultado==suma) {
			System.out.println("¡Correcto! " + num1 + " + " + num2 + " = " + suma); 
		} else {
			System.out.println("Incorrecto. " + num1 + " + " + num2 + " = " + suma);
		}
		
		//And close the scanner
		sc.close();
	}

}
