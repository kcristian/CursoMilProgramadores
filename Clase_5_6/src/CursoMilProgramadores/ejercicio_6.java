package CursoMilProgramadores;

import java.util.Scanner;


public class ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		MetodosSueltos m=new MetodosSueltos();
		System.out.print("ingrese la cantidad de palabras: ");
		int cantidad = entrada.nextInt();
		String palabras[]=new String[cantidad];
		
		for(int i=0;i<palabras.length;i++) {
			System.out.print("ingrese una palabra: ");
			palabras[i]=entrada.next();
		}
		for(int i=0;i<palabras.length;i++) {
			if(m.EsPalindromo(palabras[i])==true) {
				System.out.println(palabras[i] +" es palindromo");
			}
		}
		entrada.close();
		
	}
	
	
}
