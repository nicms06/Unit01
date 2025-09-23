//Crear una aplicación que calcule la media aritmética de dos notas enteras. Hay que tener en cuenta que la nota media puede tener decimales.

package unit01;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		//Create a new scanner
		Scanner sc = new Scanner(System.in);
		
		//We declare the variable mark1 
		double mark1;
		
		//We declare the variable mark2
		double mark2;
		
		//We ask for mark1 and mark2
		System.out.print("Enter the value of the first grade: ");
		mark1 = sc.nextDouble();
		
		System.out.print("Enter the value of the second grade: ");
		mark2 = sc.nextDouble();
		
		//We calculate the average and show it on the screen
		System.out.print("The average of the grades is " + ((mark1+mark2)/2));
		
		// Close the scanner
        sc.close();
	}

}
