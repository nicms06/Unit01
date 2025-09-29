/*
 * Dado el siguiente polinomio de segundo grado:
 * y=ax2+bx+c
 * Crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcula el valor correspondiente de y.
 */

package parte2;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//We create the variables
		double a;
		double b;
		double c;
		double x;
		double y;
		
		//We ask the user for a
		System.out.print("Please, input a: ");
		
		//The machine waits for an answer
		a = sc.nextDouble();
		
		//We ask the user for b
		System.out.print("Please, input b: ");
				
		//The machine waits for an answer
		b = sc.nextDouble();
			
		//We ask the user for c
		System.out.print("Please, input c: ");
				
		//The machine waits for an answer
		c = sc.nextDouble();
		
		//We ask the user for x
		System.out.print("Please, input x: ");
						
		//The machine waits for an answer
		x = sc.nextDouble();
		
		//Calculate the value of y
		y = (a*x*x)+(b*x)+c;
		
		//We show the result
		System.out.println("The result is " + y );
		
		//Close the Scanner
		sc.close();

	}

}
