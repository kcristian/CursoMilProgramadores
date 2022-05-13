package model.herencia;

import java.util.ArrayList;

public class TestHerenciaPerros {

	public static void main(String[] args) {
		// #### Ejercicio 7 ####
		ArrayList<Perros>perros;
		perros=new ArrayList<Perros>();
		
		Caniche c1=new Caniche("coco", "marron", 20, "cicatrices en espalda y oreja cortada", true, 5);
		Caniche c2=new Caniche("tobi", "marron", 15.7, "rengo y oreja cortada", true, 4);
		Caniche c3=new Caniche("kala", "negro", 21.9, "mancha blanca en ojo izquierda", false, 7);
		Caniche c4=new Caniche("aron", "amarillo", 22, "chaleco azul", true, 7);
		Caniche c5=new Caniche("rina", "negro", 14, "afeitada y operada", false, 3);
		
		Salchicha s1=new Salchicha("moro", "negro", 19.5, "sin collar",true,6);
		Salchicha s2=new Salchicha("ringo", "marron", 17.6, "herido en cola",true,5);
		Salchicha s3=new Salchicha("dingo", "blanco", 10.9, "mordidas en cuello",true,3);
		Salchicha s4=new Salchicha("dina", "negro", 9.2, "quemaduras",true,3);
		Salchicha s5=new Salchicha("maka", "negro", 11.1, "collar rojo",true,3);
		
		perros.add(c1);
		perros.add(c2);
		perros.add(c3);
		perros.add(c4);
		perros.add(c5);
		
		perros.add(s1);
		perros.add(s2);
		perros.add(s3);
		perros.add(s4);
		perros.add(s5);
		
		for(Perros p:perros) {
			p.mostrarDatos();
		}

	}

}
