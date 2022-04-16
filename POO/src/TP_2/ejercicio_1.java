package TP_2;

public class ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Raices ecuacion1=new Raices(1,0,-16);
		ecuacion1.Calcular();
		
	}

}

class Raices{
	private double a;
	private double b;
	private double c;
	
	public Raices(double coeficienteA, double coeficienteB, double coeficienteC) {
		
		this.a=coeficienteA;
		this.b=coeficienteB;
		this.c=coeficienteC;
	}
	public Raices() {
		
	}
	
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	public double getDiscriminante(){
		
		double delta= (this.b*this.b)-4*this.a*this.c;
		return delta;
	}
	
	public void obtenerRaices() {
		
		double delta=getDiscriminante();
		if(delta>0) {
			
			double x1=(-this.b+Math.sqrt(delta))/(2*this.a);
			double x2=(-this.b-Math.sqrt(delta))/(2*this.a);
			
			System.out.println("Hay 2 raices reales: x1= "+x1+" y x2= "+x2);
			
		}else if(delta==0) {
			System.out.println("No hay 2 raices");
		}else if(delta<0) {
			System.out.println("No hay 2 raices");
		}
		
	}
	public void obtenerRaiz() {
		
		double delta=getDiscriminante();
		if(delta==0) {
			
			double x1=-this.b/(2*this.b);
			System.out.println("La ecuacion tiene solo una raiz real x1: "+x1);
			
		}else if(delta>0) {
			System.out.println("No tiene 1 unica raiz");
			
		}else if(delta<0) {
			System.out.println("No tiene 1 unica raiz");
		}
		
		
	}
	public boolean tieneRaices() {
		boolean respuesta=false;
		
		if(getDiscriminante()>0) {
			respuesta=true;
		}
		
		return respuesta;
	}
	public boolean tieneRaiz() {
		
		boolean respuesta=false;
		
		if(getDiscriminante()==0) {
			respuesta=true;
		}
		
		return respuesta;
	}
	public void Calcular() {
		
		double delta=getDiscriminante();
		if(delta>0) {
			
			double x1=(-this.b+Math.sqrt(delta))/(2*this.a);
			double x2=(-this.b-Math.sqrt(delta))/(2*this.a);
			
			System.out.println("Hay 2 raices reales: x1= "+x1+" y x2= "+x2);
			
		}else if(delta==0) {
			double x1=-this.b/(2*this.b);
			System.out.println("Hay 1 unica razi real: x1= "+x1);
		}else if(delta<0) {
			System.out.println("No tiene raices reales");
		}
		
	}
}
