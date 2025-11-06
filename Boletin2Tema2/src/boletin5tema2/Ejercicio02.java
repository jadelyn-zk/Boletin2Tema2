package boletin5tema2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 2;
		
		System.out.println("Números pares desde el 1 hasta el 200");

		do {
			System.out.println(num);
			num+=2;
		} while (num<=200);
		sc.close();
	}

}
