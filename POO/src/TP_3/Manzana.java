package TP_3;

public class Manzana extends Fruta {
	
	public Manzana(double peso) {
		super(peso);
	}
	
	public double hacerJugo() {
		
		double jugo=getPeso()*0.3;
		return jugo;
	}
}
