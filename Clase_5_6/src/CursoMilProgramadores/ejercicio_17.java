package CursoMilProgramadores;

import java.util.Scanner;

public class ejercicio_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.println("Ingrese un numero natural: ");
		numero=entrada.nextInt();
		if(esPrimo(numero)) {
			System.out.println("ES PRIMO");
		}else {
			System.out.println("NO ES PRIMO");
		}
		entrada.close();
		
	}
	public static boolean esPrimo(int numero) {
		boolean estado=false;
		int a=0;
		
		for(int i=1;i<=numero;i++) {
			if(numero % i==0) {
				a++;
			}
		}
		if(a != 2) {
			estado=false;
		}else {
			estado=true;
		}
		
		return estado;
	}

}
