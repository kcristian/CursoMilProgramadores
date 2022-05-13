package model.herencia;

public class Estudiante extends Persona {
	
	private int legajo;
	private static int legajosiguiente=1;
	private int edad;
	private int año;
	
	public Estudiante(String n, String a, int dni, String d,boolean g,int e,int año) {
		super(n,a,dni,d,g);
		this.legajo=legajosiguiente;
		legajosiguiente++;
		this.edad=e;
		this.año=año;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año=año;
	}
	
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("EDAD: "+getEdad());
		System.out.println("LEGAJO: "+getLegajo());
		System.out.println("AÑO: "+getAño());
	}
}
