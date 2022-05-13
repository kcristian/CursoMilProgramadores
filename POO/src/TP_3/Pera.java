package TP_3;

public class Pera extends Fruta{

	Pera(double peso){
		super(peso);
	}
	public double hacerJugo() {
		double jugo=getPeso()*0.6;
		return jugo;
	}
}
