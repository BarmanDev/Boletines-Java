package Boletin01_VariablesCondicionales;

import java.util.Scanner;

public class Ej07_MayorQue {

	public static void main(String[] args) {
		//. Pedir dos números y decir cual es el mayor.
		
		int num1, num2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el primer número");
		num1 = sc.nextInt();
		System.out.println("Introduce el segundo número");
		num2 = sc.nextInt();
		
		if (num1>num2){
			System.out.println("El número " + num1 + " es mayor que " + num2);
		}else{
			System.out.println("El número " + num2 + " es mayor que " + num1);
		}
		
		sc.close();

	}

}
