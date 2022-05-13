package model.herencia;

public class Profesor extends Persona{
	
	private int legajo;
	private static int legajosiguiente=1;
	private double sueldo;
	
	public Profesor(String n,String a,int dni,String d,boolean g, int s) {
		super(n,a,dni,d,g);
		this.sueldo=s;
		this.legajo=legajosiguiente;
		legajosiguiente++;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("LEGAJO: "+getLegajo());
		System.out.println("SUELDO: $"+getSueldo());
	}
}
