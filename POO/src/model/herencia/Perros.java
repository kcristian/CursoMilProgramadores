package model.herencia;

public class Perros {
	
	private int id;
	private static int id_siguiente=100;
	private String nombre;
	private String color;
	private double peso;
	private String caracteristicas;
	private boolean genero;
	private int edad;
	
	public Perros(String n, String c, double p,String cr,boolean g,int e) {
		this.id=id_siguiente;
		id_siguiente++;
		this.nombre=n;
		this.color=c;
		this.peso=p;
		this.caracteristicas=cr;
		this.genero=g;
		this.edad=e;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public boolean isGenero() {
		return genero;
	}

	public void setGenero(boolean genero) {
		this.genero = genero;
	}

	public int getId() {
		return id;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public int getEdad() {
		return edad;
	}
	
	public void mostrarDatos() {
		System.out.println("#### DATOS DEL PERRO ####");
		System.out.println("ID: "+getId());
		System.out.println("NOMBRE: "+getNombre());
		System.out.println("COLOR: "+getColor());
		System.out.println("PESO: "+getPeso());
		System.out.println("CARACTERISTICAS: "+getCaracteristicas());
		if(isGenero()) {
			System.out.println("GENERO: MACHO");
		}else {
			System.out.println("GENERO: HEMBRA");
		}
		System.out.println("EDAD: "+getEdad());
		System.out.println("");
		
	}
	
	
	public void ladrar() {
		System.out.println(getNombre()+ " esta ladrando");
	}
	public void comer() {
		System.out.println(getNombre()+" esta comiendo");
	}
	public void correr() {
		System.out.println(getNombre()+" esta corriendo");
	}
	public void saltar() {
		System.out.println(getNombre()+ " esta saltando");
	}
	public void olfatear() {
		System.out.println(getNombre()+" esta olfateando");
	}
	public void dormir() {
		System.out.println(getNombre()+" esta durmiendo");
	}
}
