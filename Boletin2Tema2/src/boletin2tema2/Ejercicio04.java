package boletin2tema2;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Create variable for the grade
		String tirada1;
		String tirada2;
		
		// Ask the user for the result of the first dice
		System.out.println("Introduce el resultado del primer dado (Ej: DOS): ");
		// And read them
		tirada1 = sc.next();
		//Then ask for the second dice
		System.out.println("Y ahora el resultado del segundo");
		tirada2 = sc.next();
		
		//Now make a switch for each result the user can have on their dices
		switch(tirada1){
		case UNO:
			
			break;
		case 2:
			System.out.println("La resta de ambos números es: " + (num1 - num2));
			break;
		case 3:
			System.out.println("La multiplicación de ambos números es: " + (num1*num2));
			break;
		case 4:
			System.out.println("La división de ambos números es: " + (num1/num2));
			break;
		default: 
			System.out.println("ERROR. La opción seleccionada no es ninguna de las operaciones posibles");
	}
		//And close the scanner
		sc.close();

		}
	}

