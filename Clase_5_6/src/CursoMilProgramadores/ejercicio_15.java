package CursoMilProgramadores;

import java.util.Scanner;

public class ejercicio_15 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub				
		String usuario, contraseña;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese usuario: ");
		usuario=entrada.nextLine();
		System.out.println("Ingrese contraseña: ");
		contraseña=entrada.nextLine();
		
		if(ValidarLogeo(usuario, contraseña)==true) {
			System.out.println("Logueo Exitoso");
		}else {
			System.out.println("Error Logueo");
		}
		entrada.close();
		
	}

	
	public static boolean ValidarLogeo(String u, String c) {
		
		boolean estado=false;
		
		if(u.equals("cris1234") && c.equals("xf3C#")) {
			estado=true;
		}
				
		return estado;
		
	}

}
