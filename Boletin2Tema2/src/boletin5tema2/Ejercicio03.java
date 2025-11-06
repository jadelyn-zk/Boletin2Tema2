package boletin5tema2;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int suma=0;
		int contador=1;
		int num=0;
		
		//Ask for a number
		System.out.println("Introduce un número: ");
		//And read it
		num= sc.nextInt();
		
		do {
			suma+=contador;
			contador++
			;
		} while (contador<=num);
		
		System.out.println("La suma total es de " + suma);
		sc.close();
	}

}
