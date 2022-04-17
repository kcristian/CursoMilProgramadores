package TP_1;

public class Persona {
	
	String nombre;
	String apellido;
	int dni;
	String domicilio;
	
	public Persona(String n, String a, int dni, String domicilio){
		this.nombre=n;
		this.apellido=a;
		this.dni=dni;
		this.domicilio=domicilio;
	}
	public Persona() {
		
	}
	public Persona(Persona p) {
		
	}
	
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
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public void mostrarInformacion() {
		
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Apellido: "+this.apellido);
		System.out.println("DNI: "+this.dni);
		System.out.println("Direccion: "+this.domicilio);
		
	}
}
