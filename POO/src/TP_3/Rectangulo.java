package TP_3;

public class Rectangulo extends Figura{
	
	private double base;
	private double altura;
	
	public Rectangulo(double b, double a) {
		
		this.base=b;
		this.altura=a;
		
	}
	
	
	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public void calcularArea() {
		super.calcularArea();
		System.out.println("AREA DEL RECTANGULO: "+(getAltura()*getBase()));
	}
	public String calcularPerimetro() {
		return "el perimetro del rectangulo es: "+((getBase()*2)+(getAltura()*2));
	}
}
