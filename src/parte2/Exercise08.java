/*
 * La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una competición donde cada 
 * participante escribe un algoritmo en un papel y lo lanza, ganando quien consiga lanzarlo más lejos. 
 * La peculiaridad del concurso es que la longitud del lanzamiento se mide en metros (con tantos decimales como se desee), 
 * pero para el ranking solo se tiene en cuenta la longitud en centímetros (sin decimales). 
 * Por ejemplo, para un lanzamiento de 12,3456 m, que son 1234,56 cm solo se contabilizan 1234 cm.
 * Realiza un programa que solicite la longitud (en metros) de un lanzamiento y muestre la parte entera 
 * correspondiente en centímetros. Utiliza la conversión de tipos.
 */

package parte2;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		double meters;
		int centimeters;
		
		//We ask the user for a value 
		System.out.print("Input a value in meters: ");
		
		//The machine waits for an answer
		meters = sc.nextDouble();
		
		//We convert the meters to centimeters 
		centimeters = (int) (meters * 100);
		
		//We show the result
		System.out.println("The result is : " + centimeters + " centimeters.");
		
		//Close the Scanner
		sc.close();
		
	}

}
