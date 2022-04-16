package CursoMilProgramadores;

import java.util.Scanner;

public class ejercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese el numero A: ");
		double numero1 = entrada.nextDouble();
		System.out.println("ingrese el numero B: ");
		double numero2 = entrada.nextDouble();
		
				
		System.out.println("El producto de "+numero1+" y "+numero2+" es: "+ Multiplicar(numero1,numero2));
		entrada.close();
	}
	
	
	public static double Multiplicar(double a, double b) {
		double producto= Math.round((a*b)*100.0)/100.0;
		return producto;
	}
}
