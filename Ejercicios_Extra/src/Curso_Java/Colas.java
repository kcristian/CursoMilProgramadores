package Curso_Java;

import java.util.Iterator;
import java.util.LinkedList;

public class Colas {

	public static void main(String[] args) {
		/*
		 * FIFO
		 * offer añadir
		 * poll obtener
		 */
		LinkedList<String> cola=new LinkedList<String>();
		
		//Iterator iter= cola.iterator();
		
		cola.offer("a");
		cola.offer("b");
		cola.offer("c");
		cola.offer("d");
		
		while(cola.peek()!=null) {
			System.out.println(cola.poll());
		}
		//Otro Ejemplo
		
		LinkedList<String> turnos = new LinkedList<String>();
		 
	    // agregando elementos a turnos
	    turnos.add("Daniela");
	    turnos.add("Alejandra");
	    turnos.add("Maria");
	    turnos.add("Carolina");
	    turnos.add("Sonia");
	    while(turnos.peek()!=null) {
	    	System.out.println(turnos.poll());
	    }
	    // iterador
	    Iterator it = turnos.iterator();
	 
	    // Iterando la lista en sentido contrario
	    System.out.println("Turnos:");
	    while(it.hasNext()){
	       System.out.println(it.next());
	    }
	}

}
