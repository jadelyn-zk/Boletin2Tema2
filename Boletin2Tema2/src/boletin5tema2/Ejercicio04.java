package boletin5tema2;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int numero; 
		int contador = 0; 
		System.out.println("Introduce in número: ");
		numero = sc.nextInt();
		
		do {
			++contador; 
			System.out.println(numero +" x "+contador+" = "+numero*contador);
		}while(contador != 10); 
		
		sc.close();
	}

}
