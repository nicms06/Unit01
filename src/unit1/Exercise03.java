//Escribir una aplicación que pida el año actual y el año de nacimiento del usuario. Debe calcular su edad.

package unit1;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Create a new scanner
		Scanner sc = new Scanner(System.in);
		
		//We declare the variable year1 and year2
		//year1 = year of birth and year2 = current year 
		int year1;
		int year2;
		
		//We ask the user to enter his/her year of birth
		System.out.print("Enter your year of birth: ");
		
		//The console waits for a value
		year1 = sc.nextInt ();
		
		//We ask the user to enter his/her current year
		System.out.print("Enter your current year: ");
				
		//The console waits for a value
		year2 = sc.nextInt ();
		
		//We print the age
		System.out.print("You are " + (year2 - year1) + " years old.");
		
		//We close the scanner
		sc.close();

	}

}
