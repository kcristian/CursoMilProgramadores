package CursoMilProgramadores;

import java.util.Scanner;

public class ejercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Calcular la cantidad de minutos que hay existen en una cantidad de segundos ingresada
		por el usuario*/
		
		int segundos;
		int minutos;
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese los segundos: ");
		segundos=entrada.nextInt();
		minutos=segundos/60;
		int s=segundos % 60;
		System.out.println("Son: " + minutos + " minutos con "+s+" segundos");
		
		entrada.close();
	}

}
