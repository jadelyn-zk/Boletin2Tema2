package boletin6tema2;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		//create scanner
		Scanner sc=new Scanner(System.in);
		
		//Variable for the grades we are going to ask the students
		int num;
		int contador;
		boolean suspenso=false;
		int contadorSuspensos=0;
		//Limit the entered grades to 5 grades
		for(contador=1;contador<=5;contador++) {
			System.out.println("Introduce una nota");
			num=sc.nextInt();
		//Condition to know the failed grades
			if (num<5) {
				suspenso=true;
				contadorSuspensos++;
			} 
		}
		System.out.println("Hay suspensos: "+suspenso  + ". Cuantos: "+ contadorSuspensos);
		//close the scanner
		sc.close();
	}

}
