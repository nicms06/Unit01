//Pedir al usuario su edad y mostrar la edad que tendrá el próximo año.

package unit1;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		//Create a new scanner
		Scanner sc = new Scanner(System.in);
				
		//We declare the variable number
		int age;
				
		//We ask the user to enter his/her age
		System.out.print("Please, enter your age: ");
				
		//The console waits for a value
		age = sc.nextInt();	
				
		//We print the age for next year
		System.out.print("Next year you will be " + (age+1));	
				
		//We close the scanner
		sc.close();

	}

}
