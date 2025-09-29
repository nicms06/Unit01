/*
 * Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos. 
 * La aplicación debe mostrar cuántas horas, minutos y segundos hay en el número de segundos introducidos por el usuario.
 */

package parte2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		int sec;
		int min;
		int hours;
		int totalSeconds;
		int remainingSeconds;
		
		//We ask the user for a number of seconds
		System.out.print("Input a number of seconds: ");
		
		//The machine waits for an answer
		totalSeconds = sc.nextInt();
		
		/*
		 * Create a loop to calculate the hours, minutes and seconds. While seconds are bigger or equal to 60, 
		 * we rest 60 to seconds and we sum 1 to minutes and the same to hours and minutes. In the declaration 
		 * of variables we set minutes and hours to 0.
		 * 
		 * while(sec >= 60) {
		 * 		sec -= 60;
		 * 		min ++;
		 * 
		 * 		if (min >= 60) {
		 * 			min -= 60;
		 * 			hours ++;
		 * }
		 * 
		 * Exercise with loops
		 */
		
		//Calculate hours, minutes and seconds
		hours = totalSeconds / 3600;
		remainingSeconds = totalSeconds % 3600;
		min = remainingSeconds / 60;
		sec = remainingSeconds % 60;
		
		//We show the result
		System.out.println("We have " + hours + " hours, " + min + " minutes and " + sec + " seconds.");
		
		//Close the Scanner
		sc.close();

	}

}
