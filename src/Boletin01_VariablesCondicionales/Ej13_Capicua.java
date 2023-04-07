package Boletin01_VariablesCondicionales;

import java.util.Scanner;

public class Ej13_Capicua {

	public static void main(String[] args) {
		// 13. Pedir un número entre 0 y 9.999, decir si es capicúa.	
		
		int num;
		@SuppressWarnings("unused")
		int decMillar, uniMillar, centenas, decenas, unidades;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca un número entre 0 y 99.999: ");
		num = sc.nextInt();
		sc.close();
		
		unidades = num % 10;
		num = num / 10;
		
		decenas = num % 10;
		num = num / 10;
		
		centenas = num % 10;
		num = num / 10;
		
		uniMillar = num % 10;
		num = num / 10;
		
		decMillar = num % 10;
		num = num / 10;
		
		if (decMillar == unidades && uniMillar == decenas) {
			System.out.println ("el número es capicúa");
		}else {
			System.out.println ("el número NO es capicúa");
		}
	}

}
