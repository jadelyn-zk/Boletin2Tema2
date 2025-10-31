package boletin3tema2;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Pedir al usuario el número de un mes y el año 
 * (comprobando si es o no bisiesto). Debe imprimir por pantalla 
 * el número de días que tiene el mes.
 */
		
		//Create the scanner
		Scanner sc= new Scanner(System.in);
		
		//Variable for the month
		int mes;
		//Variable for the year
		int año;
		//Variable for the days per monthç
		int dias;
		
		
		//Ask the user for the number of year
		System.out.println("Introduce un año (Ej: 2025): ");
		//And read it
		año= sc.nextInt();
		System.out.println("Introduce un mes en formato numérico (Ej: Enero=1, Agosto=8): ");
		//And read it
		mes= sc.nextInt();
		
		
		//Make a conditional for the leap years.
		if (año%4 == 0 && mes==2) {
			dias=29;
		//Then if it is not a leap year, we do the cases for months of 31 days
		} else {
			switch (mes) {
			case 1,3,5,7,8,10,12 -> dias=31;
		//An especial case for february that has 28 days
			case 2 -> dias=28;
		//And the rest of months have 30 days so we use the default as the last option
			default -> dias=30;
			
			}
		}
		
		//Now we print the results
		System.out.println(" El " + mes +"º mes del año " + año + " tiene " + dias + " días.");
					
		//Close the scanner
		sc.close();
	}

}
