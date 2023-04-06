package Boletin01_VariablesCondicionales;

import java.util.Scanner;

public class Ej04_sonIguales {
	
	public static void main(String[] args) {
// Pedir dos números y decir si son iguales o no.
	
		int num1, num2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Vamos a ver si los números son iguales o no :)");
		System.out.println("Por favor introduzca el primer número");
		num1 = sc.nextInt();
		System.out.println("Por favor introduzca el segundo número");
		num2 = sc.nextInt();
		
		if(num1 == num2){
			System.out.println("El numero " + num1 + " y el numero " + num2  + " son iguales");
		}else {
			System.out.println("El numero " + num1 + " y el numero " + num2  + " no son iguales");
		}
		
		System.out.println("Fin del programa");
		sc.close();

	}

}
