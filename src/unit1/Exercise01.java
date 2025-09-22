//Diseña un programa que pida un número al usuario y a continuación lo muestre.

package unit1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		//Create a new scanner
		Scanner sc = new Scanner(System.in);
		
		//We declare the variable number
		int number;
		
		//We ask the user to enter a value
		System.out.print("Input a value:  ");
		
		//The console waits for a value
		number = sc.nextInt();	
		
		//We print the value
		System.out.print("You entered: " + number);	

		//We close the scanner
		sc.close();
	}

}
