/*
 * Modifica el ejercicio anterior para que, indicando dos números, por ejemplo, 
 * num1 y num2, diga qué cantidad hay que sumarle a num1 para que sea múltiplo de num2.
 */

package parte2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
				
		//Declare the variables
		int n1;
		int n2;
		int rest;
		int sum;
				
		//We ask the user for a number 
		System.out.print("Input a number: ");
			
		//The machine waits for an answer
		n1 = sc.nextInt();
		
		//We ask to the user for n2
		System.out.print("Enter the number by which you want " + n1 + " to be a multiple: ");
		
		//The machine waits for an answer
		n2 = sc.nextInt();
		
		//Calculate the rest
		rest = n1%n2;
				
		//We calculate the number
		sum = (rest == 0) ? 0 : (n2-rest);
				
		//Show the result 
		System.out.println("You have to add " + sum + " to make " + n1 + " multiple of " + n2);
				
		//Close the Scanner
		sc.close();
		
	}

}
