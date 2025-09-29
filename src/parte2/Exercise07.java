/*
 * Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a calcular el importe 
 * que hay que cobrar en la taquilla por la compra de una serie de entradas (cuyo número será introducido por el usuario).
 * Existen dos tipos de entradas: infantiles, que cuestan 15,50€; y de adultos, que cuestan 20€. En el caso de que 
 * el importe total sea igual o superior a 100€, se aplicará automáticamente un bono descuento del 5%.
 */

package parte2;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the constants
		final int CONST_TICKET = 20;
		final double CONST_CHILD_TICKET = 15.50;
		
		//Declare the variables
		int ticket;
		int childTicket;
		double sum;
		
		//We ask the user how many child tickets he want to buy
		System.out.print("How many child tickets do you want to buy?: ");
		
		//The machine waits for an answer
		childTicket = sc.nextInt();
		
		//We ask the user how many regular tickets he want to buy
		System.out.print("How many regular tickets do you want to buy?: ");
				
		//The machine waits for an answer
		ticket = sc.nextInt();
		
		//Calculate the value 
		sum = (ticket*CONST_TICKET) + (childTicket*CONST_CHILD_TICKET);
		
		//If the sum is over 100, discount of the 5% and if is not over 100, you have to pay all
		sum = (sum >= 100) ? sum * 0.95 : sum;
		
		//Show the result
		System.out.printf("You have to pay %.2f EUR%n", sum);
		
		//Close the Scanner
		sc.close();

	}

}
