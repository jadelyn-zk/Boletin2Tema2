package boletin2tema2;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Create variable for each dice roll
		String tirada1;
		String tirada2;
		
		// Create new variables for the numbers

		int tiradaN1 = 0;
		int tiradaN2 = 0;
		
		// Ask the user for the result of the first dice
		System.out.println("Introduce el resultado del primer dado (Ej: DOS): ");
		// And read them
		tirada1 = sc.next();
		//Then ask for the second dice
		System.out.println("Y ahora el resultado del segundo");
		tirada2 = sc.next();
		
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

				default -> 
					System.out.println("ERROR. ¡El dado solo puede sacar números hasta 6!");
			}
				
				//Finally, make the operation and print the sum of the 2 dice rolls
			
				System.out.println("Tu tirada resulta en " + (tiradaN1 + tiradaN2));
				
		//And close the scanner
		sc.close();

		}
	}

