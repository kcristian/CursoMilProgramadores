package TP_3;
import TP_1.Persona;

public class Alumnos extends Persona{
	
	private double notas[];
	
	public Alumnos(String nombre, String apellido,int dni,String domicilio) {
		
		super(nombre,apellido,dni,domicilio);
		this.notas=new double[3];
		this.notas[0]=generar_notas();
		this.notas[1]=generar_notas();
		this.notas[2]=generar_notas();
		
	}
	
	
	
	public double[] getNotas() {
		return notas;
	}



	public void setNotas(double[] notas) {
		this.notas = notas;
	}



	private double generar_notas() {
		
		double numero= (Math.random()*10)+1;
		String.format("%.1f", numero);
		return numero;
	}
	
	public void mostrar_notas() {
		
		super.mostrarInformacion();
		System.out.println("## Notas ##");
		System.out.println("Matematica: "+String.format("%.2f",getNotas()[0]));
		System.out.println("Lengua: "+String.format("%.2f",getNotas()[1]));
		System.out.println("Historia: "+String.format("%.2f",getNotas()[2]));
		
	}
	
}
