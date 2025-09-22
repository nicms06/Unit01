//Realizar una aplicación que solicite al usuario su edad y le indique si es mayor de edad (mediante un literal booleano: true o false).

package unit01;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		
		//Create a new scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variable age
		int age;
		boolean isOfLegalAge;
		
		//We ask for the age
		System.out.print("Input your age: ");
		age = sc.nextInt();
		
        // We use a boolean to check if the person is of legal age
		isOfLegalAge = age >= 18;
		
		//We show if the person is of legal age
		System.out.println("Is of legal age? " + isOfLegalAge);

		// Close the scanner
		sc.close();
		
	}

}
