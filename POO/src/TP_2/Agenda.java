package TP_2;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Contacto> agenda;
	private int cantidad;
	
	public Agenda(int c) {
		if(c>0) {
			this.cantidad=c;
			agenda=new ArrayList<Contacto>();
		}else {
			this.cantidad=10;
			agenda=new ArrayList<Contacto>();
		}
	}
	
	public Agenda() {
		this.cantidad=10;
		agenda=new ArrayList<Contacto>();
	}

	public ArrayList<Contacto> getAgenda() {
		return agenda;
	}

	public void setAgenda(ArrayList<Contacto> agenda) {
		this.agenda = agenda;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	public boolean existeContacto(String nombre){
		boolean respuesta=false;
		
		if(agenda.size()>0) {
			
			for(Contacto c:agenda) {
				
				if(nombre==c.getNombre()) {
					
					respuesta=true;
				}
			}
		}
		
		return respuesta;
	}

	public void añadirContacto(Contacto c) {
		
		//agenda.size()<this.cantidad
		if(agendaLlena()==false) {
			
			if(existeContacto(c.getNombre())) {
				
				System.out.println("no se pudo añadir: el contacto ya existe");
				
			}else {
				
				agenda.add(c);
				
			}
			
		}else {
			
			System.out.println("no se pudo añadir: agenda llena");
			
		}
	}
	
	public void listarContactos() {
		
		for(int i=0;i<agenda.size();i++) {
			
			System.out.println("Contacto Nº "+ (i+1)+ " Nombre: "+agenda.get(i).getNombre()+" Numero: "+agenda.get(i).getNumero());
		}
	}
	
	public void buscarContacto(String nombre) {
		
		if(agenda.size()!=0) {
			for(Contacto c:agenda) {
				if(nombre==c.getNombre()) {
					
					System.out.println("el numero de :"+c.getNombre()+" es: "+c.getNumero());
					
				}else {
					
					System.out.println("busqueda fallida: el contacto no existe");
					
				}
			}
		}else {
			
			System.out.println("no se realizo la busqueda: la agenda esta vacía");
			
		}
	}
	
	public void eliminarContacto(String nombre) {
		
		if(agenda.size()!=0) {
			
			for(int i=0;i<agenda.size();i++) {
				
				if(nombre==agenda.get(i).getNombre()) {
					
					agenda.remove(i);
					
				}else {
					
					System.out.println("no se pudo eliminar: el contacto no existe");
					
				}
			}
			
		}else {
			
			System.out.println("no se realizo la eliminacion: la agenda esta vacía");
			
		}
				
	}
	
	public boolean agendaLlena() {
		boolean respuesta=false;
		
		if(agenda.size()==this.cantidad) {
			
			respuesta=true;
			
		}
		
		return respuesta;
	}
	
	public void contactosLibres() {
		
		int cantidad_libre = this.cantidad-agenda.size();
		System.out.println("hay "+cantidad_libre+" de contactos libres");
	}
}
