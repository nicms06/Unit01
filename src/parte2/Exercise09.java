/*
 * (Acepta el reto) En muchos jueces on-line (¡Acepta el reto! entre ellos) cada problema tiene un 
 * identificador único para poderlo referenciar de manera unívoca dentro del sistema. Los identificadores son 
 * números naturales correlativos, y el primer problema recibe el número 100.
 * Empezar en 100, en lugar de en 1 (o en 0), no es un capricho. Los problemas se "archivan" en volúmenes, cada uno 
 * compuesto por 100 problemas. Al asignar el número 100 al primer problema, es fácil saber en qué volumen está cualquier 
 * problema a partir de su identificador. En concreto, el primer volumen de problemas contiene a aquellos que tienen 
 * como identificador los números entre 100 y 199, el volumen 2 contiene los problemas con identificadores 200-299, etcétera.
 * Dado un problema, ¿en qué volumen está?
 */

package parte2;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int volume;
		int problem;
		
		//We ask the user for a value. 
		System.out.println("Please, input the number of a problem (the problems strart in the number 100): ");
		problem = sc.nextInt();
		
		//I create a loop to make sure that the user don't input a number under 100
		while(volume < 100) {
			
		}
		
		
		//Close the Scanner
		sc.close();

	}

}
