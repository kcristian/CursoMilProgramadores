package CursoMilProgramadores;

import java.util.Scanner;

public class ejercicio_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un numero natural: ");
		Scanner entrada = new Scanner(System.in);
		int n=entrada.nextInt();
		int dig, aux=n, inverso=0;

				while (aux!=0) {
					dig=aux%10;
					inverso=inverso*10+dig;
					aux=aux/10;	
				}
				 
				if (n==inverso) {
					System.out.println("es capicua");
				}else {
					System.out.println("no es capicua:");
				}
		entrada.close();
				
	}

}
