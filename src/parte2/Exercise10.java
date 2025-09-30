/*
 * (Acepta el reto) El cinquecento es un periodo del arte europeo (principalmente italiano) enclavado en pleno Renacimiento. 
 * Aunque su nombre esconde el número cinco, en realidad ¡pertenece al siglo XVI! Cinquecento es, abreviadamente, 
 * "años [mil] quinientos", en italiano, y es que el siglo XVI comprendió los años desde el 1501 al 1600, igual que el siglo XXI 
 * empezó en el 2001, con un 20 en sus dos primeros dígitos y no un 21.
 * Dado un año, ¿de qué siglo es?
 */

package parte2;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare variables
		int year;
		int century;
		
		//We ask the user to input a year
		System.out.print("Please input a year: ");
		year = sc.nextInt();
		
		//Calculate the century
		century = (year+99)/100;
		
		//Show the solution
		System.out.println("The year " + year + " is in the " + century + "th century");		
		
		//Close Scanner
		sc.close();

	}

}
