package model.herencia;

import java.util.ArrayList;

public class TestHerenciaColectivos {

	public static void main(String[] args) {
		// #### Ejercicio 8 ####
		ArrayList<Colectivo>colectivos;
		colectivos=new ArrayList<Colectivo>();
		
		ColectivoMedia m1=new ColectivoMedia("metalpar", "listo", 105, 15000);
		ColectivoMedia m2=new ColectivoMedia("jac", "listo", 110, 15000);
		ColectivoMedia m3=new ColectivoMedia("metro", "en revision", 105, 15000);
		ColectivoMedia m4=new ColectivoMedia("mercedes benz", "inactivo", 110, 15000);
		ColectivoMedia m5=new ColectivoMedia("marco polo", "listo", 105, 15000);
		
		ColectivoLarga l1=new ColectivoLarga("mercedes benz", "en revision", 110, 16000, 5000);
		ColectivoLarga l2=new ColectivoLarga("mercedes benz", "listo", 110, 16000, 5000);
		ColectivoLarga l3=new ColectivoLarga("jac", "listo", 110, 16000, 6000);
		ColectivoLarga l4=new ColectivoLarga("jac", "listo", 110, 16000, 6000);
		ColectivoLarga l5=new ColectivoLarga("metalpar", "en revision", 110, 16000, 6000);
		
		colectivos.add(m1);
		colectivos.add(m2);
		colectivos.add(m3);
		colectivos.add(m4);
		colectivos.add(m5);
		
		colectivos.add(l1);
		colectivos.add(l2);
		colectivos.add(l3);
		colectivos.add(l4);
		colectivos.add(l5);
		
		for(Colectivo c:colectivos) {
			c.mostrarDatos();
		}
	}

}
