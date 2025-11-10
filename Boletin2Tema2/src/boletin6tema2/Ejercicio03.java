package boletin6tema2;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//create scanner
		Scanner sc=new Scanner(System.in);
		
		//Variable for the number we are going to ask the user
		int num=0;
		int contador;	
		int media=0;
		int suma=0;
	
		
		//Ask the user for a number
		//And read it
		
		for(contador=0;contador<10;contador++) {
			System.out.println("Introduce un número");
			//And read it
			num=sc.nextInt();
			//Then sum up all the introduced numbers
			suma+=num;
		}
		media=suma/contador;
		System.out.println("La media de los 10 números introducidos es "+ media);
		
		sc.close();
	}

}
