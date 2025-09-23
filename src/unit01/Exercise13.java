/*Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen aspectos que influirán en esta decisión: solo podremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas. 
Existe una opción en la que, indistintamente de lo anterior, podremos salir a la calle: el hecho de tener que ir a la biblioteca.
Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas y si necesita ir a la biblioteca.
El algoritmo debe mostrar mediante un booleano (true o false) si es posible que se le otorgue permiso para salir a la calle.
*/

package unit01;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		

		//Create a new scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variable itsRaining
		boolean itsRaining;
		
		//Declare the variable homeworkDone
		boolean homeworkDone;
		
		//Declare the variable library
		boolean library;
		
		//Declare the variable goOut
		boolean goOut;
		
		// Ask the user if it's raining (0 = No, 1 = Yes)
		System.out.print("It's rainig? (0 = No, 1 = Yes): " );
		itsRaining = sc.nextInt() == 1;
		
		// Ask the user if he has his homework done (0 = No, 1 = Yes)
		System.out.print("Have your homework done? (0 = No, 1 = Yes): " );
		homeworkDone = sc.nextInt() == 1;
		
		// Ask the user if he has to go to the library (0 = No, 1 = Yes)
		System.out.print("Do you have to go to the library? (0 = No, 1 = Yes): " );
		library = sc.nextInt() == 1;
		
		//the logic of the exercise
		goOut = (!itsRaining && homeworkDone) || library;
		
		//Show if you can go out
		System.out.println("Can you go out?: " + goOut);
		
		// Close the scanner
        sc.close();
		
	}

}
