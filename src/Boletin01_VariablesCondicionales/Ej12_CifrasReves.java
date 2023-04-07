package Boletin01_VariablesCondicionales;

import java.util.Scanner;

public class Ej12_CifrasReves {

	public static void main(String[] args) {
		// 12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
		
		int num;
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
		
		System.out.println( unidades + " " + decenas + " " + centenas + " " + uniMillar + " " +decMillar);
		
	
		

	}

}
