package boletin6tema2;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//create scanner
		Scanner sc=new Scanner(System.in);
		
		//Variable for the number we are going to ask the user
		int num;
		//And for the result of the factorial operation
		int factorial=1;
		//then for the initial number, which is gonna be 1 
		int contador;
		//Ask the user for a number
		System.out.println("Introduce un número");
		//And read it
		num=sc.nextInt();
		
		//conditional to know the numbers between 1 and num 
		for(contador=1;contador<=num;contador++) {
		//And multiply and asign each time while the condition is true.
			System.out.print(contador);
			if (contador!=num) {
				System.out.print("*");
			}
			factorial *=contador;
		}
		//print the results
		System.out.println("=" +factorial);
		
		//close the scanner
		sc.close();
	}

}
