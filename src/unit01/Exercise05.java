//Diseñar una aplicación que calcule la longitud y el área de una circunferencia. Para ello, el usuario debe introducir el radio, que puede contener decimales. Usa Math.PI para tomar el valor de PI. (longitud = 2πr, área=πr2)

package unit01;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
		//Create a new scanner
		Scanner sc = new Scanner(System.in);
		
		//We declare the variable radius
		double radius;
		
		//We declare the variable length
		double length;
		
		//We declare the variable area
		double area;
		
		//We ask for radius
		System.out.print("Enter the radius of the circumference: ");
		radius = sc.nextDouble();
		
		//We calculate the length and the area
		length = 2 * Math.PI * radius;
		area = Math.PI * radius * radius;
		
		//We display on the screen the value of the length and the area.
		System.out.println("The length is: " + length + " units");
		System.out.print("The area is: " + area + " square units");
		
		// Close the scanner
        sc.close();		
	}

}
