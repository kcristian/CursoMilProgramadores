package TP_2;

public class Contacto {
	
	private String nombre;
	private String numero;
	
	public Contacto(String nom,String num) {
		
		this.nombre=nom;
		this.numero=num;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
