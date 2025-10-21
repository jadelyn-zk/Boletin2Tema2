package boletin2tema2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Idear un programa que solicite al usuario un número comprendido entre 1 y 7,
		// correspondiente a un día de la semana. Se debe mostrar el nombre del día de
		// la semana al que corresponde. Por ejemplo, el número 1 corresponde a “Lunes”
		// y el 6 a “Sábado”.
		// Create the scanner
		Scanner sc = new Scanner(System.in);

		// Create variable for the grade
		int dia;

		// Ask the user for the grade
		System.out.println("Introduce un número para conseguir el día de la semana:");
		// And read it
		dia = sc.nextInt();
		
		switch(dia){
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default: 
			System.out.println("ERROR. No hay más de 7 días en la semana, ni menos de 1");
	}
		sc.close();

}}
