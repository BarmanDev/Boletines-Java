package Boletin01_VariablesCondicionales;

import java.util.Scanner;

public class Ej02_AreaCirculo {

	public static void main(String[] args) {
		//2. Pedir el radio de un círculo y calcular su área. A=PI*r^2.

		double area, radio;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿Cual es area del circulo que quieres calcular?");
		
		radio = sc.nextDouble();
		
		area = Math.PI*(radio*radio);
		
		System.out.println("El área de la circunderencia del radio " + radio + " es: " + area );
		
	}

}
