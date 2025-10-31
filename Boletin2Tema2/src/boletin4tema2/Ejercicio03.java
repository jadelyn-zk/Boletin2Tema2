package boletin4tema2;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
   
	
			// Create a new scanner
			Scanner sc = new Scanner(System.in);
	
			// Create variables
			int num;
			int suma = 0;
			int contador=0;
			double media=0;
	
			// Ask the first number to the user 
			System.out.println("Introduce un número: ");
			num = sc.nextInt();
			
			
			//Then create a loop to sum up all the numbers
			while (num >=0) {
				suma += num; 
				System.out.println("Introduce otro número: ");
				num = sc.nextInt();
				contador++;
			}
			media=(double)suma/contador;
			
			//Print the results
			System.out.println("La suma de todos los números introducidos es de "+ suma
					+ " y la media es de " +media );
	
			// Close the scanner
			sc.close();
		}
	
}
