package CursoMilProgramadores;

import java.util.Scanner;

public class ejercicio_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String opcion;
		
		System.out.println("ingrese el numero de una opcion: 1)INICIO 2)DASHBOARD 3)HOME 4)PANEL");
		opcion=entrada.nextLine();
		System.out.println(Respuesta(opcion));
		entrada.close();
		
	}
	
	public static String Respuesta(String num) {
		String respuesta="ERROR";
		
		if(num.equals("1")) {
			respuesta="INICIO";
		}else if(num.equals("2")) {
					respuesta="DASHBOARD";
				}else if(num.equals("3")) {
					respuesta="HOME";
				}else if(num.equals("4")) {
					respuesta="PANEL";
				}
		
		return respuesta;
	}

}
