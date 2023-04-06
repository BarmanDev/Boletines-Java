package Boletin01_VariablesCondicionales;

import java.util.Scanner;

public class Ej10_OrdenaVarios {

	public static void main(String[] args) {
		// 10. Pedir tres números y mostrarlos ordenados de mayor a menor.

		int num1, num2, num3;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Por favor introduce el primer número");
		num1 = sc.nextInt();
		System.out.println("Por favor introduce el segundo número");
		num2 = sc.nextInt();
		System.out.println("ahora el último por favor");
		num3 = sc.nextInt();
		sc.close();
		
		if(num1>num2 && num2>num3){
			System.out.println(num1+ "," + num2 + "," + num3);
		}else {
			if(num1>num3 && num3 >num2) {
				System.out.println(num1+ "," + num3 + "," + num2);
			}else {
				if(num2>num1 && num1>num3) {
					System.out.println(num2+ "," + num1 + "," + num3);
				}else {
					if(num2>num3 && num3>num1){
						System.out.println(num2+ "," + num3 + "," + num1);
					}else{
						if(num3>num1 && num1>num2) {
							System.out.println(num3+ "," + num1 + "," + num2);
						}else {
							if(num3>num2 && num2>num1) {
								System.out.println(num3+ "," + num2 + "," + num1);
							}
						}
					}
				}	
			}
		}	

	}

}
