package Boletin01_VariablesCondicionales;

import java.util.Scanner;

public class Ej03_LongitudCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double longitud, radio;
		System.out.println("Por favor introduce el radio de la circunferencia");
		Scanner sc = new Scanner(System.in);
		
		radio = sc.nextDouble();
		
		longitud = 2 * Math.PI * radio;
		
		System.out.println("La longitud de la circunferencia con un radio " + radio + " es: " + longitud);
		sc.close();

	}

}
