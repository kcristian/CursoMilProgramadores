package Curso_Java;

import java.util.Scanner;

public class Prueba_arrays {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int filas,columnas;
		
		System.out.println("ingrese filas: ");
		filas=entrada.nextInt();
		System.out.println("ingrese columnas: ");
		columnas=entrada.nextInt();
		int[][]numeros=new int[filas][columnas];
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				numeros[i][j]=MetodosSueltos.DameUnEntero();
				System.out.println("se genero el elemento "+"["+(i)+"]"+"["+(j)+"]");
			}
		}
		
		MetodosSueltos.BurbujaBidimensional(numeros);
		MetodosSueltos.MostrarMatriz(numeros);
		//System.out.println("filas: "+numeros.length);
		//System.out.println("columnas: "+numeros[0].length);

	}

}
