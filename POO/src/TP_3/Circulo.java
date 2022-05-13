package TP_3;

public class Circulo extends Figura{
	
private double radio;
	
	public Circulo(double r) {
		this.radio=r;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public void calcularArea() {
		
		super.calcularArea();
		System.out.println("AREA DEL CIRCULO: "+(3.14*getRadio()*getRadio()));
	}
	
	public String calcularPerimetro() {
		return "el perimetro del circulo es: "+radio*2*3.1415;
	}
}
