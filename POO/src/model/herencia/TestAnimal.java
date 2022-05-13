package model.herencia;

import java.util.Scanner;

public class TestAnimal {

	public static void main(String[] args) {
		// #### Ejercicio 9 ####
		Scanner e1=new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del perro:");
		Perro perro=new Perro(e1.next());
		System.out.println(perro.gritar());
		
		System.out.println("Ingrese el nombre del gato:");
		Gato gato=new Gato(e1.next());
		System.out.println(gato.gritar());
		
		System.out.println("Ingrese el nombre del gallo:");
		Gallo gallo=new Gallo(e1.next());
		System.out.println(gallo.gritar());
		
		e1.close();
	}

}
