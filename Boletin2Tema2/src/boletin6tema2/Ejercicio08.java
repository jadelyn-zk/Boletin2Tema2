package boletin6tema2;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Realiza un programa que pida dos números enteros A y B. Luego visualiza los
		// números que hay entre A y B. Si A es menor que B, entonces debe mostrar los
		// números desde A hasta B. Si B es menor que A, entonces debe mostrar los
		// números desde B hasta A.
		// se define el scanner
		Scanner sc = new Scanner(System.in);

		// Variable for the numbers we ask the user
		int numA;
		int numB;
		int mayor;
		int menor;
		int contador;

		// Ask first number
		System.out.println("Introduce el primer número: ");
		// And read it
		numA = sc.nextInt();

		// Ask second number
		System.out.println("Introduce el segundo número: ");
		// And read it
		numB = sc.nextInt();

		if (numA > numB) {
			numA=menor;
			numB=mayor;
		} else 
			numA=mayor;
			numB=menor;
			
			//condition to count the numbers from the smaller one to the bigger one
		for (contador=menor;contador<=mayor; contador++);{
			System.out.println(contador);
		}
		
		
		
			
			}
		}

		// close the scanner
		sc.close();

	}

}
