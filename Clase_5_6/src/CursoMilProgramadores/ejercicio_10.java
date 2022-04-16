package CursoMilProgramadores;

import java.util.Scanner;

public class ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int m,n;
		
		System.out.println("ingrese la cantidad de filas para las matrices: ");
		m=entrada.nextInt();
		System.out.println("ingrese la cantidad de columnas para las matrices: ");
		n=entrada.nextInt();
		
		int matrizA[][]=new int[m][n];
		int matrizB[][]=new int[m][n];
		int matrizC[][]=new int[m][n];
		
		System.out.println("Ingresando los numeros de matriz A");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.println("ingrese el elemento ["+i+"]"+"["+j+"]: ");
				matrizA[i][j]=entrada.nextInt();
			}
		}
		
		System.out.println("Ingresando los numero de matriz B");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.println("ingrese el elemento ["+i+"]"+"["+j+"]: ");
				matrizB[i][j]=entrada.nextInt();
			}
		}
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				matrizC[i][j]=matrizA[i][j]+matrizB[i][j];
			}
		}
		System.out.println("Se creo la matriz C a partir de A y B");
		entrada.close();
		
		System.out.println("MATRIZ A");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrizA[i][j]+" ");;
				//System.out.println("El elemento ["+i+"]"+"["+j+"] es:"+matrizA[i][j]);				
			}
			System.out.println();
		}
		System.out.println("MATRIZ B");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrizB[i][j]+" ");;
				//System.out.println("El elemento ["+i+"]"+"["+j+"] es:"+matrizB[i][j]);				
			}
			System.out.println();
		}
		System.out.println("MATRIZ C");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrizC[i][j]+" ");
				//System.out.println("El elemento ["+i+"]"+"["+j+"] es:"+matrizC[i][j]);				
			}
			System.out.println();
		}
			
	}

}
