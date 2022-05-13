package leyendo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Acceso_Fichero {

	public static void main(String[] args) {
		
		Leer_Fichero accediendo=new Leer_Fichero();
		accediendo.lee();
	}

}
class Leer_Fichero{
	
	public void lee() {
		
		try {
			entrada=new FileReader("C:/Users/INTEL/Documents/eclipse-workspace/ejemplo.txt");
			BufferedReader mibuffer=new BufferedReader(entrada);
			
			String linea="";
			while(linea!=null) {
				
				linea =mibuffer.readLine();
				if(linea!=null)
				System.out.println(linea);
				
			}
			/*int c=0;
			
			while(c!=-1) {
				c=entrada.read();
				char letra=(char)c;
				System.out.println(letra);
				
			}*/
			//entrada.close();
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("No se encontro el archivo.");
		}finally{
			try {
				entrada.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	FileReader entrada;
}
