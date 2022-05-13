package model.herencia;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int dni;
	private String direccion;
	private boolean genero;
	
	public Persona(String n, String a, int dni, String d, boolean g) {
		this.nombre=n;
		this.apellido=a;
		this.dni=dni;
		this.direccion=d;
		this.genero=g;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean isGenero() {
		return genero;
	}

	public void setGenero(boolean genero) {
		this.genero = genero;
	}
	
	public void mostrarDatos() {
		
		System.out.println("#### INFORMACION PERSONAL ####");
		System.out.println("NOMBRE: "+getNombre());
		System.out.println("APELLIDO: "+getApellido());
		System.out.println("DNI: "+getDni());
		System.out.println("DIRECCION: "+getDireccion());
		if(isGenero()) {
			System.out.println("GENERO: MASCULINO");
		}else {
			System.out.println("GENERO: FEMENINO");
		}
		
	}
}
