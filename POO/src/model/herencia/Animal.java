package model.herencia;

public class Animal {

	private int id;
	private static int id_siguiente=50;
	private String nombre;
	
	public Animal(String nombre) {
		this.id=id_siguiente;
		id_siguiente++;
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}
	
	public String gritar() {
		return "aaaaaaaaaaah";
	}
}
