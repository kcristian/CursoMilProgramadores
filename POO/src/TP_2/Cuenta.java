package TP_2;

import TP_1.Persona;

public class Cuenta{
	private Persona titular;
	private double cantidad;
	
	public Cuenta(Persona t) {
		this.titular=t;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public void mostrar() {
		
		this.titular.mostrarInformacion();
		System.out.println("Cantidad: "+this.cantidad);
		
	}
	
	public void ingresar(double cantidad) {
		if(cantidad>=0) {
			this.cantidad=cantidad;
		}else {
			System.out.println("se ingreso cantidad negativa");
		}
	}
	public void retirar(double cantidad) {
		if(cantidad<0) {
			System.out.println("debe ingresar un importe no negativo");
		}else {
			this.cantidad-=cantidad;
			if(this.cantidad<0) {
				System.out.println("su cuenta esta en numeros rojos");
			}
		}
	}
}
