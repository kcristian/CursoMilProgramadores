package TP_2;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Productos {
	
	private String nombre;
	private double precio;
	private LocalDate vencimiento;
	private boolean perecedero;
	
	public Productos (String n, double p, int d,int m,int a,boolean t) {
		this.nombre=n;
		this.precio=p;
		this.vencimiento= LocalDate.of(a, m, d);
		this.perecedero=t;
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

	public LocalDate getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(LocalDate vencimiento) {
		this.vencimiento = vencimiento;
	}

	public boolean isPerecedero() {
		return perecedero;
	}

	public void setPerecedero(boolean tipo) {
		this.perecedero = tipo;
	}
	
	public long diasVencimiento() {
		
		LocalDate hoy=LocalDate.now();
		long numeroDeDias= ChronoUnit.DAYS.between(hoy, vencimiento);
		return numeroDeDias;
	}
	
	public double calcular(int cantidad) {
		if(isPerecedero()) {
			
			if(diasVencimiento()==1) {
				
				return (this.precio/4)*cantidad;
				
			}else if(diasVencimiento()==2) {
				
				return (this.precio/3)*cantidad;
				
			}else if(diasVencimiento()==3) {
				return (this.precio/2)*cantidad;
			}else {
				return this.precio*cantidad;
			}
			
		}else {
			return this.precio*cantidad;
		}
	}
	
}
