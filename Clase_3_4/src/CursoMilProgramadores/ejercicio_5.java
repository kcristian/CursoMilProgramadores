package CursoMilProgramadores;

import java.util.Scanner;

public class ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un numero entero");
		
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		
		if(numero % 2==0){
			System.out.println("el numero es par");
		}else {
			System.out.println("el numero es impar");
		}
		
		entrada.close();
	}

}
