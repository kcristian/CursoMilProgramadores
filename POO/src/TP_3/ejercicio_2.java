package TP_3;

public class ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r=new Rectangulo(10, 20);
		Circulo c=new Circulo(5);
		Triangulo t=new Triangulo(12, 4,2);
		
		r.calcularArea();
		c.calcularArea();
		t.calcularArea();
		
		System.out.println(r.calcularPerimetro());
		System.out.println(c.calcularPerimetro());
		System.out.println(t.calcularPerimetro());
	}

}
