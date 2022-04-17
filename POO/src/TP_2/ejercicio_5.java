package TP_2;

import java.util.ArrayList;

public class ejercicio_5 {
	
	public static void main(String arg[]) {
		
		Contacto c1=new Contacto("Cristian","147258");
		Contacto c2=new Contacto("Gustavo","369741");
		Contacto c3=new Contacto("Esteban","852963");
		Contacto c4=new Contacto("Gonzalo","789456");
		
		Agenda g=new Agenda();
		g.añadirContacto(c1);	
		g.añadirContacto(c2);
		g.añadirContacto(c3);
		g.añadirContacto(c4);
		
		g.eliminarContacto("Esteban");
		g.contactosLibres();
		
	}
}
