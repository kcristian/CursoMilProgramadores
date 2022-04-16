package CursoMilProgramadores;

import java.util.Scanner;

public class ejercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombres[]=new String[10];
		Scanner entrada = new Scanner(System.in);
		String nombre;
		boolean encontrado=false;
		for(int i=0;i<nombres.length;i++) {
			
			System.out.println("ingresa un nombre: ");
			nombres[i]=entrada.next();
			
		}
		System.out.println("ingrese un nombre para buscar: ");
		nombre=entrada.next();
		
		for(int i=0;i<nombres.length;i++) {
			
			if(nombres[i].equals(nombre)) {
				encontrado=true;
			}
			
		}
		if(encontrado) {
			System.out.println("Nombre encontrado");
		}else {
			System.out.println("Nombre no encontrado");
		}
		entrada.close();
	}
	

}
