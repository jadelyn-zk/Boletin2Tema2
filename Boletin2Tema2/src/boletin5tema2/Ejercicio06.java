package boletin5tema2;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		String jugador1;  
		String jugador2; 
		String seguirJugando;  
		
		
		do {
			System.out.println("JUGADOR 1: Inteoduce un item (PIEDRA, PAPEL O TIJERA): ");
			jugador1 = scanner.next().toUpperCase();
		} while (!jugador1.equals("PIEDRA") && !jugador1.equals("PAPEL") && !jugador1.equals("TIJERA") );
		
		
		do {
			System.out.println("JUGADOR 2: Inteoduce otro item (PIEDRA, PAPEL O TIJERA): ");
			jugador2 = scanner.next().toUpperCase();
		}while(!jugador2.equals("PIEDRA") && !jugador2.equals("PAPEL") && !jugador2.equals("TIJERA") );
		
		do {
			if (jugador1.equals(jugador2) ) {
				System.out.println("EMPATE");
			} else if ((jugador1.equals("PIEDRA")&& jugador2.equals("TIJERA"))
				||(jugador2.equals("PIEDRA")&& jugador1.equals("PAPEL"))
				||(jugador1.equals("TIJERA")&& jugador2.equals("PAPEL"))) {
				System.out.println("GANA 1");
			} else {
				System.out.println("GANA 2");}
			System.out.println("¿Quieres seguir jugando?(S/N)");
			seguirJugando = scanner.next().toUpperCase(); 
		}while (!seguirJugando.equals("S") ); 
		
		scanner.close();
	}

}
