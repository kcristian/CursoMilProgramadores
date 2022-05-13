package Curso_Java;

import java.util.Iterator;

public class MetodosSueltos {
	
	public static int DameUnEntero() {
		//int numero = (int)(Math.random()*(X-Y+1)+Y; donde X es el maximo e Y el minimo
		int numero = (int)(Math.random()*99);
		return numero;
	}
	public static void BurbujaBidimensional(int[][]matriz) {
		int filas=matriz.length;
		int columnas=matriz[0].length;
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				for(int x=0;x<filas;x++) {
					for(int y=0;y<columnas;y++) {
						if(matriz[i][j]>matriz[x][y]) {
							int aux=matriz[i][j];
							matriz[i][j]=matriz[x][y];
							matriz[x][y]=aux;
						}
					}
				}
			}
		}
		
		/*for(int k=0;k<filas;k++) {
			for(int m=0;m<columnas;m++) {
				for(int i=0;i<filas-1;i++) {
					for(int j=0;j<columnas-1;j++){
						if(matriz[i][j]>matriz[i][j+1]) {
							int aux=matriz[i][j];
							matriz[i][j]=matriz[i][j+1];
							matriz[i][j+1]=aux;
						}
					}
				}
			}
		}*/
	}
	public static void MostrarMatriz(int[][]matriz) {
		
		int filas=matriz.length;
		int columnas=matriz[0].length;
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
