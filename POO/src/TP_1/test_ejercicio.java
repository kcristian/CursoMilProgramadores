package TP_1;

import java.util.ArrayList;

public class test_ejercicio {

	public static void main(String[] args) {
		// Instancias
		DirectorCine director1=new DirectorCine("Pedro","Gomez",31);
		DirectorCine director2=new DirectorCine("Juan","Suarez",55);
		DirectorCine director3=new DirectorCine("Elena","Albucar",29);
		
		//lista de directores
		ArrayList<DirectorCine> directores = new ArrayList<>();
		directores.add(director1);
		directores.add(director2);
		directores.add(director3);
		
		System.out.println("Lista de directores: ");
		for(DirectorCine d:directores) {
			System.out.println("nombre y apellido:"+d.getNombre()+" "+d.getApellido());
			System.out.println("Edad: "+d.getEdad());
		}
	}

}

class DirectorCine{

	//Atributos
	private String nombre;
	private String apellido;
	private int edad;
	
	//Constructores
	public DirectorCine(String n, String a, int e) {
		
		this.nombre=n;
		this.apellido=a;
		this.edad=e;
		
	}
	
	public DirectorCine() {
		
	}
	
	public DirectorCine(DirectorCine director) {
		this.nombre=director.getNombre();
		this.apellido=director.getApellido();
		this.edad=director.getEdad();
	}
	
	//accesores y mutadores
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}