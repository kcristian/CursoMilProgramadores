package Curso_Java;
import java.io.*;

public class pruebas_bais2 {

	public static void main(String[] args) throws IOException {
		
		Teclado.leerEntero();
	}

}
class Teclado{
	
	public static BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
	
	public static String leerString() {
		String cadena="";
		try {
			
			cadena=new String(entrada.readLine());
			
		} catch (IOException e) {
			System.out.println("Error de E/S");
		}
		return cadena;
	}
	
	public static int leerEntero() {
		int entero=0;
		boolean error=false;
		do {
			try {
				error=false;
				entero=Integer.valueOf(entrada.readLine()).intValue();
				
			} catch (NumberFormatException e) {
				
				error=true;
				System.out.println("ERROR en el formato del numero, intentelo de nuevo.");
				
			} catch (IOException e) {
				System.out.println("Error de E/S");
			}
			
		}while(error);
		return entero;
		
	}
	
    
}
