/*Realiza un conversor de pesetas a euros. Para ello, pídele al usuario que te introduzca el valor en pesetas y, 
 *a posteriori, debes mostrarle el resultado de la conversión.(1€ = 166 ptas).
*/

package unit01;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		
		//Create a new scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variable pesetas
		double pesetas;
		
		//Declare the variable euros
		double euros;
		
		//We ask for pesetas
		System.out.print("How many pesetas would you like to convert to euros?: ");
		pesetas = sc.nextDouble();
		
		// Let's calculate the euros
		euros = pesetas/166;
		
		//We show the euros
		System.out.print(pesetas + " pesetas are " + euros + " euros");
		
		// Close the scanner
		sc.close();
		
	}

}
