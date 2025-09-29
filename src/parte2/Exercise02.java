/*
 * Escribe un programa que tome como entrada un número entero e indique qué cantidad 
 * hay que sumarle para que sea múltiplo de 7. Por ejemplo, a 2 hay que sumarle 5 para que sea múltiplo de 7. 
 * En el caso de 13 habría que sumarle 1. Usa el operador módulo (%) para calcularlo.
 */

package parte2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int n;
		int rest;
		int sum;
		
		//We ask the user for a number 
		System.out.print("Input a number: ");
		
		//The machine waits for an answer
		n = sc.nextInt();
		
		//Calculate the rest
		rest = n%7;
		
		//We calculate the number
		sum = (rest == 0) ? 0 : (7-rest);
		
		//Show the result 
		System.out.println("You have to add " + sum + " to make " + n + " multiple of 7");
		
		//Close the Scanner
		sc.close();

	}

}
