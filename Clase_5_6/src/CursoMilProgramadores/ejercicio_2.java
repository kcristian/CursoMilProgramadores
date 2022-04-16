package CursoMilProgramadores;

import java.util.Scanner;


public class ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Se cargaran los datos del array: ");
		int[]pesos=new int[20];
		Scanner entrada=new Scanner(System.in);
		//MetodosSueltos m= new MetodosSueltos();
		
		int mayor, menor, suma=0;
		double promedio;
		
		for(int i=0;i<pesos.length;i++) {
			
			//pesos[i]=m.DameUnEntero();
			System.out.println("ingrese el peso de la persona "+i+":");
			pesos[i]=entrada.nextInt(); 
			
		}
		mayor=menor=pesos[0];
		for(int i=0;i<pesos.length;i++) {
			
			suma+=pesos[i];
			
			if(pesos[i]>mayor) {
				mayor=pesos[i];
			}
			if(pesos[i]< menor){
				menor=pesos[i];
			}
			
		}
		promedio=(double)suma/pesos.length;
		
		System.out.println("el peso mayor es: "+mayor+"Kg");
		System.out.println("el peso menor es: "+menor+"Kg");
		System.out.println("el peso promedio es: "+promedio+"Kg");
		
				
		entrada.close();
		}

}
