/*Escribir un programa que le pida dos números al usuario. 
 * A continuación, debe mostrar la suma, la resta, la multiplicación y la división de ambos números. 
 * Debe mostrarse el resultado de cada operación en una línea distinta.
*/
package unit01;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		//Create a new scanner
		Scanner sc = new Scanner(System.in);
				
		//We declare the variable n1
		double n1;
		
		//We declare the variable
		double n2;
		
		//We declare the variable sum
		double sum;
		
		//We declare the variable subtraction
		double subtraction;
		
		//We declare the variable multiplication
		double multiplication;
		
		//We declare the variable division
		double division;
				
		//We ask for n1 
		System.out.print("Enter the value 1: ");
		n1 = sc.nextDouble();
		
		//We ask for n2
		System.out.print("Enter the value 2: ");
		n2 = sc.nextDouble();
		
		//We calculate the sum
		sum = n1 + n2;
		
		//We calculate the subtraction
		subtraction = n1 - n2;
		
		//We calculate the multiplication
		multiplication = n1 * n2;
		
		//We calculate the division
		division = n1 / n2;
		
		//We display on the screen the values
		System.out.println("Sum = " + sum);
		System.out.println("Subtraction = " + subtraction);
		System.out.println("Multiplication = " + multiplication);
		System.out.println("The division = " + division);
		
		// Close the scanner
        sc.close();	
	}

}
