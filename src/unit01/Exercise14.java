/*Escribir un programa que solicite las notas del primer, segundo y tercer trimestre 
 * (notas enteras que se solicitarán al usuario). El programa debe mostrar la nota media del curso como 
 * se utiliza en el boletín de calificaciones (solo la parte entera) y como se usa en el expediente académico 
 * (con decimales).*/

package unit01;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		
		//Create a new scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variable mark1
		int mark1;
		
		//Declare the variable mark2
		int mark2;
		
		//Declare the variable mark3
		int mark3;
		
		//Declare the variable reportCard
		int reportCard;
		
		//Declare the variableacademicRecord
		double academicRecord;
		
		//We ask to the user for the mark of the first quarter
		System.out.println("Input the mark of the first quarter: ");
		
		//The console waits for the value
		mark1 = sc.nextInt();
		
		//We ask to the user for the mark of the first quarter
		System.out.println("Input the mark of the second quarter: ");
		
		//The console waits for the value
		mark2 = sc.nextInt();
		
		//We ask to the user for the mark of the first quarter
		System.out.println("Input the mark of the third quarter: ");
		
		//The console waits for the value
		mark3 = sc.nextInt();
		
		//We calculate the value of the report card (Int)
		reportCard = (mark1 + mark2 + mark3)/3;
		
		//We calculate the value of the academic record (double)
		academicRecord = (mark1 + mark2 + mark3)/3.0;
		
		//We show the result of the report card
		System.out.println("Report card: " + reportCard);	
		
		//We show the result of the academic record
		System.out.println("Academic record: " + academicRecord);
		
		// Close the scanner
        sc.close();

	}

}
