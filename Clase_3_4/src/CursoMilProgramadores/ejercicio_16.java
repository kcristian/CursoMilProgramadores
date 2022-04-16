package CursoMilProgramadores;

import java.util.Scanner;

public class ejercicio_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int numero=entrada.nextInt();
		
		while(numero>0) {
			int digito=numero%10;
			System.out.println("El digito es: " +digito);
			numero=numero/10;
		}
		entrada.close();
	}

}
