/* Pedir por teclado al usuario cuántas palabras tiene su nombre completo
• Preguntar por cada una de esas palabras y guardarlas en un string independiente a cada una, usando estructuras de control
• meter esos strings en una colección (la que ustedes definan)
• imprimir todos los strings de vuelta en pantalla, en una sola línea
• subir el código a *github*
• entregar antes del inicio de la clase */

package org.techquiero.letras;

import java.util.*;


public class Request {

	public static void main(String[] args) {
		
		int words = 0;
		String nombre;
		boolean isnumber = false;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("**** Bienvenido a la Biblioteca de Nombres ****\n");
		
	       do{
	    	   System.out.print("Cuantas palabras tiene tu nombre completo? ");
	            try{
	        		words = scanner.nextInt();
	            
	            }catch(InputMismatchException e){
	                  System.out.println("Por favor, ingrese solo numeros... \n") ;
	                  scanner.nextLine();
	                  words=0;
	                  isnumber=false;
	            }finally {
	            	if (words > 0)
	            		isnumber=true;
	            }
	       }while(isnumber == false);

		
		List<String> Lista = new ArrayList<String>();
		
		
		for(int i=0; i<words; i++) {
			
			System.out.print("Ingrese el nombre " + (i+1)+": ");
			Scanner scan = new Scanner(System.in);
			nombre = scan.nextLine();	
			Lista.add(nombre);		
			
		}
		
		System.out.println("\nTu nombre completo es: ");
		for( String nom:Lista) {
			
			System.out.print(nom+" ");
		}

		}

}
