package Curso_Java;

import java.util.Stack;

public class Pilas {

	public static void main(String[] args) {
		/*
		 * push añade un elemento
		 * pop obtener y eleminar ultimo elemento
		 * peek ver ultimo elemento
		 * empty vacia
		 */

		Stack <Carta>pila=new Stack<Carta>();
		
		Carta c1=new Carta("Mago Oscuro",100 ,"Carta insignia de Yugi");
		Carta c2=new Carta("Dragón Blanco de Ojos Azules",200 ,"Carta insignia de Kaiba");
		Carta c3=new Carta("Héroe Elemental Neos",300 ,"Carta insignia de Judai");
		Carta c4=new Carta("Dragón de Polvo de Estrellas",400 ,"Carta insignia de Yusei");
		
		pila.push(c1);
		pila.push(c2);
		pila.push(c3);
		pila.push(c4);

		while(!pila.empty()) {
			pila.pop().mostrarDatos();
		}
		
	}

}
class Carta{
	private String nombre;
	private int codigo;
	private String descripcion;
	
	public Carta(String nombre, int codigo, String descripcion) {
		this.nombre=nombre;
		this.codigo=codigo;
		this.descripcion=descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void mostrarDatos() {
		
		System.out.println("###INFORMACION DE CARTA###");
		System.out.println("NOMBRE: "+getNombre());
		System.out.println("CODIGO: "+getCodigo());
		System.out.println("DESCRIPCION: "+getDescripcion());
	}
}
