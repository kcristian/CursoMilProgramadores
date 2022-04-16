package CursoMilProgramadores;

import java.util.Scanner;

public class ejercicio_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero entero natural: ");
		int numero=entrada.nextInt();
		int suma=0;
		
		while(numero>0) {
			int digito=numero%10;
			System.out.println("El digito es: " +digito);
			numero=numero/10;
			suma++;
		}
		System.out.println("La cantidad de digitos es: "+suma);
		entrada.close();
	}

}
