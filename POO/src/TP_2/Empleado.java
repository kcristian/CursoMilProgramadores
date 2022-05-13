package TP_2;
import TP_1.Persona;

public class Empleado extends Persona{
	
	private double sueldoBasico;
	private int num_legajo;
	private static int num_legajo_siguiente=10;
	
	public Empleado(String n, String a, int dni, String d, double sb) {
		super(n,a,dni,d);
		this.sueldoBasico=sb;
		this.num_legajo=num_legajo_siguiente;
		num_legajo_siguiente++;
	}
	
	
	public double getSueldoBasico() {
		return sueldoBasico;
	}


	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}


	public int getNum_legajo() {
		return num_legajo;
	}


	public void setNum_legajo(int num_legajo) {
		this.num_legajo = num_legajo;
	}


	public static int getNum_legajo_siguiente() {
		return num_legajo_siguiente;
	}


	public static void setNum_legajo_siguiente(int num_legajo_siguiente) {
		Empleado.num_legajo_siguiente = num_legajo_siguiente;
	}


	public String calculoSueldo(int horas){
		double sueldo=horas*this.sueldoBasico;
		return "el sueldo por "+ horas+" horas de trabajo es: "+sueldo;
	}
	
	public void verEmpleado() {
		
		System.out.println("### INFORMACION ###");
		super.mostrarInformacion();
		System.out.println("Legajo: "+this.num_legajo);
		System.out.println("Sueldo Basico: "+this.sueldoBasico);
		
	}
}
