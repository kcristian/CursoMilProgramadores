package model.herencia;

public class Colectivo {
	
	private int id;
	private static int id_siguiente=101;
	private String marca;
	private String estado;
	private int capacidad;
	private double peso;
	
	public Colectivo(String marca,String estado,int capacidad, double peso) {
		this.id=id_siguiente;
		id_siguiente++;
		this.marca=marca;
		this.estado=estado;
		this.capacidad=capacidad;
		this.peso=peso;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getId() {
		return id;
	}
	
	public void mostrarDatos() {
		
		System.out.println("#### DATOS DEL COLECTIVO ####");
		System.out.println("ID: "+getId());
		System.out.println("MARCA: "+getMarca());
		System.out.println("ESTADO: "+getEstado());
		System.out.println("CAPACIDAD "+getCapacidad()+" PERSONAS");
		System.out.println("PESO: "+getPeso()+" kg");
	}
	
}
