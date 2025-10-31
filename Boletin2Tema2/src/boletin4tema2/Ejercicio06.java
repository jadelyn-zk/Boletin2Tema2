package boletin4tema2;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		//Create scanner
		Scanner sc=new Scanner(System.in);
		
		//Create variables for the high of the trees and the maximum high
		int altura;
		int alturaMax=0;
		
		//Ask the user for the first high
		System.out.println("Introduce la altura del primer árbol");
		//And read it
		altura=sc.nextInt();
		
		
		//Now create a condition to compare each high the user introduces.
		while (altura>0) {
			if (altura>alturaMax) {alturaMax=altura;}
			
		System.out.println("Introduce la altura del siguiente árbol");
			altura = sc.nextInt();
		}
		
		//Print the results in case of a negative high
		System.out.println("El árbol más alto mide " + alturaMax);
		
	sc.close();
	

}
	}
