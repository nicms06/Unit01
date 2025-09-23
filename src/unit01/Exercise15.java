/*Escribe un programa en el que declares una constante IVA de valor igual a 21. 
 *A continuación, pídele un precio al usuario (recuerda que los precios contienen decimales) 
 *y calcula cuál será el precio final con el IVA aplicado.*/

package unit01;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		
		//Create a new scanner
		Scanner sc = new Scanner(System.in);
		
		//We create the constant IVA 
		final double IVA = 21;
		
		//We create the variable price
		double price;
		
		//We create the variable finalPrice
		double finalPrice;
		
		//We ask to the user for a price
		System.out.println("Input a price: ");
		
		//Console wait for a price
		price = sc.nextDouble();
		
		//We calculate the final price
		finalPrice = price + (price * (IVA/100));
		
		//We show the final price
		System.out.println("The price + IVA is " + finalPrice + "€");
		
		// Close the scanner
        sc.close();

	}

}
