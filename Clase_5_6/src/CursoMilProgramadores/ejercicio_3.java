package CursoMilProgramadores;

import java.util.Scanner;

public class ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double []numeros=new double[10];
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0;i<numeros.length;i++) {
			System.out.println("ingrese el elemento en la posicion "+i+":");
			//numeros[i]=entrada.nextDouble();
			numeros[i]=entrada.nextDouble();
			
		}
		System.out.println("ingrese una posicion entre 0 y 9");
		int numero=entrada.nextInt();
		numeros[numero]=0;
		for(int i=0;i<numeros.length;i++) {
			System.out.println("el elemento de la posicion "+i+" es :"+numeros[i]);
			
		}
		entrada.close();
	}

}
