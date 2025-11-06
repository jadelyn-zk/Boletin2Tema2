package boletin5tema2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		
		System.out.println("Números hasta el 20");

		do {
			System.out.println(num);
			num+=1;
		} while (num<=20);
		sc.close();
	}

}
