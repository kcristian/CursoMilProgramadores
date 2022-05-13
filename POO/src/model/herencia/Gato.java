package model.herencia;

public class Gato extends Animal{
	
	public Gato(String nombre) {
		super(nombre);
	}
	
	public String gritar() {
		return "Miauuu Miauuu";
	}
}
