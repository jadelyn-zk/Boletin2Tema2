package boletin6tema2;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// create scanner
		Scanner sc = new Scanner(System.in);

		// Variable for the number we are going to ask the user
		int num=1;
		int contador;
		int suma=0;

		for(contador=0;contador<10;contador++) {
			//Then sum up all the introduced numbers
			suma+=num;
			num+=2;
		}
			System.out.println("La suma de los 10 primeros números impares es de "+ suma);
		
		
		//close the scanner
		sc.close();
	}

}
