package TP_3;

public class Triangulo extends Figura{

	private double base;
	private double altura;
	private double lado;
	
	public Triangulo(double b, double a, double lado) {
		this.base=b;
		this.altura=a;
		this.lado=lado;
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
	
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public void calcularArea() {
		super.calcularArea();
		System.out.println("AREA DEL TRIANGULO: "+(getBase()*getAltura())/2);
	}
	
	public String calcularPerimetro() {
		return "el perimetro del triangulo es: "+(getLado()+getLado()+getBase());
	}
}
