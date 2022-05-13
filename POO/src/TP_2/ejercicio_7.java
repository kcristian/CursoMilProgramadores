package TP_2;

import java.util.Scanner;

public class ejercicio_7 {

	public static void main(String[] args) {
		// Variables
		Scanner entrada1=new Scanner(System.in);
		
		String nombre, categoria;
		double precio;
		int stock;
		
		// ingreso de datos
		System.out.println("ingrese nombre del producto");
		nombre=entrada1.nextLine();
		
		System.out.println("ingrese categoria del producto");
		categoria=entrada1.nextLine();
		
		System.out.println("ingrese precio del producto");
		precio=entrada1.nextDouble();
		
		System.out.println("ingrese stock del producto");
		stock=entrada1.nextInt();
		
		entrada1.close();
		
		// creacion de objeto y prueba de metodos
		Producto p1=new Producto(nombre,categoria,precio,stock);
		System.out.println(p1.vender("lacteo", 10));
		System.out.println(p1.comprar("lacteo", 50));
	}

}
