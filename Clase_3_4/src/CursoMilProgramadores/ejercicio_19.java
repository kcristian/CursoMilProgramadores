package CursoMilProgramadores;

import java.util.Scanner;

public class ejercicio_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ingrese un numero natural: ");
		Scanner entrada = new Scanner(System.in);
		int numero=entrada.nextInt();
		MetodosSueltos m=new MetodosSueltos();
		
		for(int i=2;i<numero;i++) {
			if(m.EsPrimo(i)==true) {
				System.out.println("El numero: "+i+" es primo");
			}else {
				System.out.println("El numero: "+i+" no es primo");
			}
		}
		
		entrada.close();
	}

}
