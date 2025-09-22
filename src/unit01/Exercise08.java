//Escribe un programa que pida al usuario su nombre y su edad y muestre por pantalla un mensaje como el siguiente: “Hola Juanito, tienes 21 años, ¡qué mayor eres!”. 

package unit01;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		//Create a new scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables name and age
		String name;
		int age;		
		
		//We ask for name
		System.out.print("Input your name: ");
		name = sc.nextLine();
		
		//We ask for age
		System.out.print("Input your age: ");
		age = sc.nextInt();
		
		//We show the message
		System.out.print("Hello " + name + ", you are " + age + " years old. You're so grown up!" );
		
		// Close the scanner
        sc.close();	

	}

}
