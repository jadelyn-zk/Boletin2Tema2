package boletin6tema2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		//create scanner
		Scanner sc=new Scanner(System.in);
		
		//Variable to count the multiples of 3
		int contMult=0;
		//Variable for the number we are going to ask the user
		int num;
		
		//Ask the user for a number
		System.out.println("Introduce un número");
		//And read it
		num=sc.nextInt();
		
		for(int contador=1; contador<=num; contador++) {
			if(contador%3==0) {
				contMult++;
			}
		}
		
		System.out.println("El número de multiplos de 3 desde 1 hasta "+ num+ " es " + contMult);
		
		//close the scanner
		sc.close();
	}

}
