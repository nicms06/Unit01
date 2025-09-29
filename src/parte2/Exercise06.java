/*
 * Solicita al usuario tres distancias:
 * La primera, medida en milímetros.
 * La segunda, medida en centímetros.
 * La última, medida en metros.
 * Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en centímetros).
 */

package parte2;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		double mm;
		double cm;
		double m;
		double sum;
		
		//We ask for the millimeters
		System.out.print("Input a value in millimeters: ");
		
		//The machine waits for an answer
		mm = sc.nextDouble();
		
		//We ask for the millimeters
		System.out.print("Input a value in centimeters: ");
				
		//The machine waits for an answer
		cm = sc.nextDouble();
		
		//We ask for the millimeters
		System.out.print("Input a value in meters: ");
				
		//The machine waits for an answer
		m = sc.nextDouble();
		
		//We pass everything to centimeters
		mm = mm / 10;
		m = m * 100;
		
		//We calculate the sum
		sum = m + cm + mm;
		
		//We show the result
		System.out.print("The sum is " + sum + " centimeters");
		
		//Close the Scanner
		sc.close();

	}

}
