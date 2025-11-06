package boletin5tema2;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Create variable for each dice roll
		String tirada1;
		String tirada2;
		
		// Create new variables for the numbers

		int tiradaN1 = 0;
		int tiradaN2 = 0;
		
		// Ask the user for the result of the first dice 
		do {
			System.out.println("Introduce el resultado del primer dado (Ej: DOS): ");
			// And read them
			tirada1 = sc.next().toUpperCase();
			
			//condition to CHECK if the string is correct, if it is not then ask AGAIN
		}while (!tirada1.equalsIgnoreCase("UNO")
				&&!tirada1.equalsIgnoreCase("DOS")
				&&!tirada1.equalsIgnoreCase("TRES")
				&&!tirada1.equalsIgnoreCase("CUATRO")
				&&!tirada1.equalsIgnoreCase("CINCO")
				&&!tirada1.equalsIgnoreCase("SEIS"));
		
		//Then ask for the second dice
		do {
			System.out.println("Y ahora el resultado del segundo");
			tirada2 = sc.next().toUpperCase();
			//and do the same here to check if the string is correct
		}while (!tirada2.equalsIgnoreCase("UNO")
				&&!tirada2.equalsIgnoreCase("DOS")
				&&!tirada2.equalsIgnoreCase("TRES")
				&&!tirada2.equalsIgnoreCase("CUATRO")
				&&!tirada2.equalsIgnoreCase("CINCO")
				&&!tirada2.equalsIgnoreCase("SEIS"));
		
		//Now make a switch for each result the user can have on their dices on the first dice roll
		switch(tirada1){
		case "UNO"-> {
			tiradaN1 = 1;
		}
		case "DOS"-> {
			tiradaN1 = 2;
		}
		case "TRES"-> {
			tiradaN1 = 3;
		}
		case "CUATRO"-> {
			tiradaN1 = 4;
		}
		case "CINCO"-> {
			tiradaN1 = 5;
		}
		case "SEIS"-> {
			tiradaN1 = 6;

		}
//iF THE SECOND NUMBER IS 2 AND THE USER CHOOSE TO DIVIDE
		default -> 
			System.out.println("ERROR. ¡Un dado solo puede sacar números hasta 6!");
	}
		
		//Then for the second dice roll
				switch(tirada2){
				case "UNO"-> {
					tiradaN2 = 1;
				}
				case "DOS"-> {
					tiradaN2 = 2;
				}
				case "TRES"-> {
					tiradaN2 = 3;
				}
				case "CUATRO"-> {
					tiradaN2 = 4;
				}
				case "CINCO"-> {
					tiradaN2 = 5;
				}
				case "SEIS"-> {
					tiradaN2 = 6;

				}
//If the number of the dice is bigger than 6 then it prints an error
				default -> 
					System.out.println("ERROR. ¡El dado solo puede sacar números hasta 6!");
			}
				
				//Finally, make the operation and print the sum of the 2 dice rolls
				System.out.println("Tu tirada resulta en " + (tiradaN1 + tiradaN2));
				
		//And close the scanner
		sc.close();

	}

}
