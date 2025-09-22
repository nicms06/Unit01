//Escribir un programa que le pida al usuario su nombre, dirección y teléfono. Guarda cada dato en variables distintas. A continuación, muestra los datos de la siguiente forma:

package unit01;

import java.util.Scanner; 

public class Exercise07 {

	public static void main(String[] args) {
		
		//Create a new scanner
		Scanner sc = new Scanner(System.in);
		
		//We declare the variables name, address and phone
		String name, address;
		int phone;
		
		//We ask for name
		System.out.print("Input your name: ");
		name = sc.nextLine();
		
		//We ask for address
		System.out.print("Input your address: ");
		address = sc.nextLine();
		
		//We ask for phone
		System.out.print("Input your phone: ");
		phone = sc.nextInt();
		
		//We display on the screen the values
		System.out.println("Nombre: " + name);
		System.out.println("Address: " + address);
		System.out.println("Phone: " + phone);
		
		// Close the scanner
        sc.close();	
	}

}
