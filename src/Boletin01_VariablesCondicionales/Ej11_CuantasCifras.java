package Boletin01_VariablesCondicionales;

import java.util.Scanner;

public class Ej11_CuantasCifras {

	public static void main(String[] args) {
		// 11. Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.

		int num;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduza un número y te digo cuantas cifras tiene :)");
		num = sc.nextInt();
		sc.close();
		
		if(num<10){
			System.out.println(num + " tiene una cifra");
		}else if (num<100){
			System.out.println(num + " tiene dos cifra");
		}else if (num<1000) {
			System.out.println(num + " tiene tres cifra");
		}else if (num<10000) {
			System.out.println(num + " tiene cuatro cifra");
		}else if (num<100000) {
			System.out.println(num + " tiene cinco cifra");
		}else {
			System.out.println("Cansé de contar");
		}
	}

}
