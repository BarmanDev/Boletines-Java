package Boletin01_VariablesCondicionales;

import java.util.Scanner;

public class Ej14_Notas {

	public static void main(String[] args) {
		//14. Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
	
	int nota = 0;
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Vamos a calificar tu examen suerte! :)");
	System.out.println("Por favor introduce la nota");
	
	nota = sc.nextInt();
	sc.close();
	
	if(nota <=4){
		System.out.println("Estas suspenso");
	}else if (nota == 5){
		System.out.println("Suficiente");
	}else if (nota == 6) {
		System.out.println("=Bien!");
	}else if (nota == 7 || nota == 8) {
		System.out.println("Notable");
	}else if (nota == 9 || nota == 10){
		System.out.println("Sobresaliente");
	}else if (nota > 10) {
		System.out.println("La puntuación no puede ser mayor de 10");
	}
	

	}

}
