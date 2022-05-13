package model.herencia;

import java.time.*;

public class Producto {
	
	private int codigo;
	private static int codigosiguiente=100;
	private String nombre;
	private double precio;
	private String rubro;
	private LocalDate vencimiento;
	
	public Producto(String n,double p,String r,int a,int m,int d) {
		this.codigo=codigosiguiente;
		codigosiguiente++;
		this.nombre=n;
		this.precio=p;
		this.rubro=r;
		this.vencimiento= LocalDate.of(a,m,d);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public LocalDate getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(LocalDate vencimiento) {
		this.vencimiento = vencimiento;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public void mostrarDatos(){
		
		System.out.println("### INFORMACION DEL PRODUCTO ###");
		System.out.println("CODIGOO: "+getCodigo());
		System.out.println("NOMBRE: "+getNombre());
		System.out.println("PRECIO: $"+getPrecio());
		System.out.println("RUBRO: "+getRubro());
		System.out.println("FECHA VENCIMIENTO: "+getVencimiento());
		
	}
	
}
