package Boletin01_VariablesCondicionales;

import java.util.Scanner;

public class Ej01_Coeficientes {

	public static void main(String[] args) {
/* 1.Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen,
debe indicarlo.
*/
		
		double a,b,c;
		double x1,x2,d;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Por favor introduzca el primer coeficiente (a): ");
		a = sc.nextDouble();
		System.out.println("Por favor introduza el segundo coeficicente (b): ");
		b = sc.nextDouble();
		System.out.println("Por favor introduza el tercer coeficicente (c): ");
		c = sc.nextDouble();
		
		d=((b*b)-4*a*c);
		if(d<0){
			System.out.println("Lo sentimos matemáticamente no existe solución");
		}else {
			x1=(-b+Math.sqrt(d))/(2*a);
			x2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("Solución: " + x1);
			System.out.println("Solución: " + x2);
			
		}
		
		System.out.println("Fin del programa");
	}

}
