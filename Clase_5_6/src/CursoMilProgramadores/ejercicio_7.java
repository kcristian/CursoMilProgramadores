package CursoMilProgramadores;

import java.util.Scanner;

public class ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		System.out.println("ingrese una palabra");
		String palabra=entrada.next();
		int vocal=0;
		int consonante=0;
		for(int x=0;x<palabra.length();x++) {
			if((palabra.charAt(x)=='a')||(palabra.charAt(x)=='e')||(palabra.charAt(x)=='i')||(palabra.charAt(x)=='o')||(palabra.charAt(x)=='u')) {
				vocal++;
			}
			
		}
		consonante=palabra.length()- vocal;
		System.out.println("la palabra "+palabra+" tiene "+vocal+" vocales y "+consonante+" consonantes");
		entrada.close();
	}

}
