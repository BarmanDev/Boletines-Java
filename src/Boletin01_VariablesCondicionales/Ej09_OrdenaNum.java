package Boletin01_VariablesCondicionales;

import java.util.Scanner;

public class Ej09_OrdenaNum {

	public static void main(String[] args) {
		// Pedir dos números y mostrarlos ordenados de mayor a menor.


		int num1, num2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Por favor introduce el primer número");
		num1 = sc.nextInt();
		System.out.println("Por favor introduce el segundo número");
		num2 = sc.nextInt();
		sc.close();
		
		if(num1>num2){
			System.out.println(num1 + " y " + num2);
		}else {
			System.out.println(num2 + " y " + num1);

		}
		
	}

}
