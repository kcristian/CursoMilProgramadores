package TP_2;

import java.util.Scanner;

public class ejercicio_5 {
	
	public static void main(String arg[]) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Usar la agenda por defecto?: y/n");
		String letra=entrada.next();
		String continuar;
		int c;
					
		if(letra.equals("n")) {
			
			System.out.println("ingrese la cantidad de contactos: ");
			c=entrada.nextInt();
			Agenda a=new Agenda(c);
			System.out.println("Se creo una agenda de "+c+" contactos");
			a.Tablero();
			do {
				a.Tablero();
				System.out.println("desea continuar?: y/n");
				continuar=entrada.next();	
				
			}while(continuar.equals("y"));
			
			
		}else {
			
			Agenda a=new Agenda();
			System.out.println("Se creo una agenda de 10 contactos");
			a.Tablero();
			do {
				a.Tablero();
				System.out.println("desea continuar?: y/n");
				continuar=entrada.next();	
				
			}while(continuar.equals("y"));
			
			System.out.println("Agenda Cerrada");
			entrada.close();
		}
		
		
		
		
		}
		
		/*Contacto c1=new Contacto("Cristian","147258");
		Contacto c2=new Contacto("Gustavo","369741");
		Contacto c3=new Contacto("Esteban","852963");
		Contacto c4=new Contacto("Gonzalo","789456");
		
		Agenda g=new Agenda();
		g.añadirContacto(c1);	
		g.añadirContacto(c2);
		g.añadirContacto(c3);
		g.añadirContacto(c4);
		
		g.eliminarContacto("Esteban");
		g.contactosLibres();*/
		
	
}
