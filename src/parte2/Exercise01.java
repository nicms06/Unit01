/*
 * Realizar un programa que pida como entrada un número con decimales y 
 * lo muestre redondeado al entero más próximo. (SIN UTILIZAR Math.round())
 */

package parte2;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		//We create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		Double num;
		int result;
		
		//We ask the user for a number with decimals
		System.out.print("Please, input a number with decimals: ");
		
		//The machine waits for an answer
		num = sc.nextDouble();
		
		//We calculate the result 
		result = (int) (num+0.5);
		
		//We show the result
		System.out.println("The rounded number is: " + result);
		
		//We close the Scanner
		sc.close();

	}

}
