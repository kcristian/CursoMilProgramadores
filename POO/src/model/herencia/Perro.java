package model.herencia;

public class Perro extends Animal{
	
	public Perro(String nombre) {
		super(nombre);
	}
	public String gritar() {
		return "Guau Guau! ";
	}
}
