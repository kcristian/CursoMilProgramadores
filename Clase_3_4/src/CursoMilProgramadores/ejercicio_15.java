package CursoMilProgramadores;

import java.util.Scanner;

public class ejercicio_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ingrese un numero natural: ");
		Scanner entrada= new Scanner(System.in);
		int numero= entrada.nextInt();
		int a=0;
		for(int i=1;i<=numero;i++) {
			if(numero % i==0) {
				a++;
			}
		}
		if(a != 2) {
			System.out.println("No es primo");
		}else {
			System.out.println("Si es primo");
		}
		entrada.close();
	}

}
