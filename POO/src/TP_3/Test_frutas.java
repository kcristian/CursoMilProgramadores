package TP_3;

import java.util.ArrayList;

public class Test_frutas {

	public static void main(String[] args) {
		// ### EJercicio 4 ###
		ArrayList <Fruta> lista;
		lista=new ArrayList<Fruta>();
		int cmanzanas, cnaranjas, cperas;
		
		cmanzanas=MetodosSueltos.DameUnEntero();
		cnaranjas=MetodosSueltos.DameUnEntero();
		cperas=MetodosSueltos.DameUnEntero();
		
		for(int i=0;i<cmanzanas;i++) {
			lista.add(new Manzana(MetodosSueltos.DameUnDouble()));
		}
		for(int i=0;i<cnaranjas;i++) {
			lista.add(new Naranja(MetodosSueltos.DameUnDouble()));
		}
		for(int i=0;i<cperas;i++) {
			lista.add(new Pera(MetodosSueltos.DameUnDouble()));
		}
		
		for(int i=0;i<lista.size();i++) {
			
			String peso=String.format("%.2f", lista.get(i).getPeso());
			String porcentaje=String.format("%.2f", lista.get(i).hacerJugo());
					
			
			System.out.println("El jugo producido por "+peso+"kg es: "+porcentaje+" kg");
		}

	}

}
