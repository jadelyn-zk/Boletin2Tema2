package boletin4tema2;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Create a new scanner
		Scanner sc = new Scanner(System.in);

		// Create variables
		int num;
		int contadorMayor = 0;
		int suma = 0;
		int media = 0;
		int contador = 0;

		// Ask the ages of the students
		System.out.println("Introduce las edades de los alumnos : ");
		num = sc.nextInt();
		
		// Then create a loop to sum up all the numbers and do the operations
		while (num>0) {
			contador++;
		System.out.println("Introduce las edades de los alumnos : ");
			suma += num; 
			if (num>=18) {contadorMayor++;}
			num = sc.nextInt();
			}
	
		media =  suma / contador;

		// Print the results
		System.out.println("La suma de todos las edades es de " + suma + " y la media es de " + media
				+ " y hay " + contadorMayor + " personas mayores de edad");

		// Close the scanner
		sc.close();
	}

}
