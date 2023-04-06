package Boletin01_VariablesCondicionales;

import java.util.Scanner;

public class Ej05_PosNega {

	public static void main(String[] args) {
	// 5. Pedir un número e indicar si es positivo o negativo.

		int num1;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Vamos a mirar si un número es positivo o negativo");
		System.out.println("Por favor introduzca el número");
		num1 = sc.nextInt();

		
		if(num1 == 0) {
			System.out.println("El número es cardinal");
			
		}else if(num1 < 0){
			System.out.println("El número es negativo");
		
		}else {
			System.out.println("Es positivo");
		}
		sc.close();
		
	}

}
