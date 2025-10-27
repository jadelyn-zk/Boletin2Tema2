package boletin3tema2;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		/*
		 * Determinar el precio de un billete de tren, conociendo la distancia a
		 * recorrer, y sabiendo que si el número de días de estancia es superior a 7 y
		 * la distancia superior a 800 km el billete tiene una reducción del 30%. El
		 * precio por kilómetro es de 2,5€. La distancia a recorrer y el número de días
		 * de estancia los debes solicitar al usuario por teclado.
		 */

		// Create scanner
		Scanner sc = new Scanner(System.in);

		// Create a variable for the distance (KM)
		int distancia;
		// Another for the days you are going to stay in your destination
		int dias;
		// Create a constant for the price reduction of 30% if the staying days are more than 7 AND THE DISTANCE IS OVER 800KM
		final double DESCUENTO = 0.70;
		// Variable for the final price of the ticket
		double precioFinal;
		// Another costant for the price per kilometer
		final double PRECIO_POR_KILOMETRO=2.5;

		// Ask the user for the information we need, starting by the distance
		System.out.println("Introduce la distancia de tu viaje: ");
		// And read it
		distancia = sc.nextInt();
		
		// Ask the user for the staying days in their destination
		System.out.println("Introduce los días de estancia en tu viaje: ");
		// And read it
		dias = sc.nextInt();
		
		//Now make a conditional to find out the final price of the ticket
		if (distancia>800 && dias>7) {
			precioFinal = ((double) distancia*PRECIO_POR_KILOMETRO*DESCUENTO);
		} else {
			precioFinal = ((double) distancia*PRECIO_POR_KILOMETRO);
		}
		
	//Finally, print the result

System.out.println("El precio final de tu ticket de tren será de " + precioFinal + "€ por un viaje de " + distancia + "Km de distancia y de " + dias + " de estancia");
	
		//Close the scanner
		sc.close();
		

	}

}
