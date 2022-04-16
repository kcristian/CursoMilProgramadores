package CursoMilProgramadores;

import java.util.Scanner;

public class ejercicio_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numero;
		System.out.println("Ingrese un numero natural: ");
		numero=entrada.nextInt();
		if(BuscarNumero(numero)==1) {
			System.out.println("Se encontro el numero");
		}else {
			System.out.println("No se encontro el numero");
		}
		entrada.close();
	}
	
	public static int BuscarNumero(int numero) {
		
		int encontrado=0;
		
		for(int i=1;i<=100;i++) {
			if(numero==i) {
				encontrado=1;
			}
		}
		return encontrado;
	}

}
