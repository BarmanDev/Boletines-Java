package Boletin01_VariablesCondicionales;

import java.util.Scanner;

public class Ej06_Multiplos {

	public static void main (String args[]) {
	// 6. Pedir dos números y decir si uno es múltiplo del otro.
	
		int num1, num2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Por favor, introduzca el primer número");
		num1 = sc.nextInt();
		
		System.out.println("Por favor, introduzca el segundo número");
		num2 = sc.nextInt();
		
		if(num1%num2==0) {
			System.out.println("Son múltiplos");
		}else{
			System.out.println("No son múltiplos");
		}
		sc.close();

		
	}
	
}
