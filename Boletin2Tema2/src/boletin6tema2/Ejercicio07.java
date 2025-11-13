package boletin6tema2;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		// Realiza un programa en java que pida un número entero positivo 
		//y nos diga si es primo o no.
		
		//create the scanner
		Scanner sc = new Scanner(System.in);

		int num;
		int contador;
		boolean primo = true;

		System.out.println("Introduce num: ");
		num = sc.nextInt();
		
		//The 1 is not a primo number, neither any even number but 2
		if (num == 1) {
			primo  = false;
			  
		} else {

		//condition to know if the entered number is primo
		for (contador=2;contador<num;contador++) {
	
			if (num % contador==0){ 
				primo=false;
			}
		}
		
		//Print the results
		System.out.println("Es primo? " + primo);
		
		// se cierra el scanner
		sc.close();

	}

}}
