package CursoMilProgramadores;

import java.util.Scanner;

public class ejercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numero;
		System.out.println("ingrese un numero entero: ");
		numero=entrada.nextInt();
		System.out.println("El numero es "+TipoNumero(numero));
		entrada.close();
	}
	
	public static String TipoNumero(int numero) {
		String resultado=" ";
		
		if(numero>0) {
			resultado="Positivo";
		}else if(numero==0){
			resultado="Cero";
		}else if(numero<0){
			resultado="Negativo";
		}
		
		return resultado;
		
	}

}
