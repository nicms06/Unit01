//Escribir un programa que pida un número al usuario e indique mediante un literal booleano (true o false) si el número es par.

package unit01;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		
		//Create a new scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variable number
		int number;
		
		//Declare boolean
		boolean isEven;
		
		//We ask for the number
		System.out.print("Input a number: ");
		number = sc.nextInt();
		
		// We use a boolean to check if is an even number
		isEven = number%2==0;
		
		//We show if the number is an even number
		System.out.print("Is " + number + " an even number?: " + isEven);
		
		// Close the scanner
		sc.close();

	}

}
