/*Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras. 
 * Por este motivo, es necesario diseñar una aplicación que solicite las ventas (en kilos, tanto de las peras como de las manzanas). 
 * La aplicación mostrará el importe total sabiendo que el precio del kilo de manzanas está fijado en 2,35€ y el kilo de peras en 1,95€.
*/
package unit01;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		
		//Create a new scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variable kgPears
		double kgPears;
		
		//Declare the variable kgApples
		double kgApples;
		
		//Declare the variable total
		double total;
		
		//We ask for kgPears
		System.out.print("How many kg of pears have been sold?: ");
		kgPears = sc.nextDouble();
		
		//We ask for kgApples
		System.out.print("How many kg of apples have been sold?: ");
		kgApples = sc.nextDouble();
		
		//Let's calculate the total
		total = (kgPears*1.95) + (kgApples*2.35);
		
		//We show the total
		System.out.print("The total is " + total + "€");
		
		// Close the scanner
        sc.close();
	}

}
