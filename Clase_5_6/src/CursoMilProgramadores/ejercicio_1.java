package CursoMilProgramadores;

import java.util.Scanner;

public class ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[];
		numeros = new int[10];
		
		IngresarDatosArray(numeros);
		MostrarArray(numeros);
		
	}
	
	public static void IngresarDatosArray(int arreglo[]) {
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0;i<arreglo.length;i++){
			
			System.out.println("ingrese el elemento: "+i+": ");
			arreglo[i]=entrada.nextInt();
		}
		
		entrada.close();
	} 
	
	public static void MostrarArray(int arreglo[]) {
		
		for(int i=0;i<arreglo.length;i++) {
			System.out.println("El elemento "+i+" es: "+arreglo[i]);
		}
	}

}
