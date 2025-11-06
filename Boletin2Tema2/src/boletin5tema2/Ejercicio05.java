package boletin5tema2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random aleatorio = new Random();

		int max = 101;
		int min = 1;
		int numAleatorio;
		String respuesta;

		System.out.println("Piensa un número");

		do {
			numAleatorio = aleatorio.nextInt(min, max);
			System.out.println("El número en el q estás pensando es: " + numAleatorio + "?");
			respuesta = sc.next();
			if (respuesta.equals("menor")) {
				max = numAleatorio;
			} else if (respuesta.equals("mayor")) {
				min = numAleatorio + 1;
			} else {
				System.out.println("Número adivinado");
			}
		} while (!respuesta.equals("correcto"));

		sc.close();

	}

}
