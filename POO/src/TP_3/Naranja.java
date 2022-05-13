package TP_3;

public class Naranja extends Fruta{

	Naranja(double peso){
		super(peso);
	}
	public double hacerJugo() {
		double jugo=getPeso()*0.8;
		return jugo;
	}
}
