package CursoMilProgramadores;

import java.util.Scanner;

public class ejercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		double[]notas=new double[4];
		for(int i=0;i<notas.length;i++) {
			
			System.out.println("ingrese la nota "+(i+1)+": ");
			notas[i]=entrada.nextDouble();
		}
		
		System.out.println("el promedio de las notas es: "+CalcularPromedio(notas));
		entrada.close();
		
	}
	
	public static double CalcularPromedio(double[]arreglo) {
		double promedio=0;
		double suma=0;
		for(int i=0;i<arreglo.length;i++) {
			suma+=arreglo[i];
		}
		
		promedio=Math.round((suma/arreglo.length)*100.0)/100.0;
				
		return promedio;
	}

}
