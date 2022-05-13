package TP_2;

import java.util.ArrayList;
import java.util.Scanner;

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
				System.out.println("se añadio exitosamente el contacto");
				
			}
			
		}else {
			
			System.out.println("no se pudo añadir: agenda llena");
			
		}
	}
	
	public void listarContactos() {
		
		if(agenda.size()==0) {
			System.out.println("la agenda esta vacia.");
		}else {
			for(int i=0;i<agenda.size();i++) {
				
				System.out.println("Contacto Nº "+ (i+1)+ " Nombre: "+agenda.get(i).getNombre()+" Numero: "+agenda.get(i).getNumero());
			}
		}
	}
	
	public void buscarContacto(String nombre) {
		
		if(agenda.size()!=0) {
			for(Contacto c:agenda) {
				if(c.getNombre().equals(nombre)) {
					
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
				
				if(nombre.equals(agenda.get(i).getNombre())) {
					
					agenda.remove(i);
					System.out.println("se elimino el contacto");
					
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
	
	public void Tablero() {
		
		int valor;
		String nom,num;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("#### MENU DE OPCIONES - INGRESE UN NUMERO ####");
		System.out.println("1) VERIFICAR SI EXISTE UN CONTACTO");
		System.out.println("2) AÑADIR UN CONTACTO");
		System.out.println("3) LISTAR CONTACTOS");
		System.out.println("4) BUSCAR CONTACTO");
		System.out.println("5) ELIMINAR CONTACTO");
		System.out.println("6) VERIFICAR AGENDA LLENA");
		System.out.println("7) VERIFICAR CONTACTOS LIBRES");
		
		valor=entrada.nextInt();
		
		switch(valor) {
		
		case 1: System.out.println("ingrse el nombre del contacto: ");
				if(existeContacto(entrada.next())) {
					System.out.println("contacto existe");
				}else {
					System.out.println("no existe");
				}
				break;
		case 2: System.out.println("ingrese nombre del contacto: ");
				nom=entrada.next();
				System.out.println("ingrese numero del contacto: ");
				num=entrada.next();
				Contacto contacto=new Contacto(nom,num);
				añadirContacto(contacto);
				break;
				
		case 3: listarContactos();
				break;
				
		case 4: System.out.println("ingrese nombre del contacto: ");
				nom=entrada.next();
				buscarContacto(nom);
				break;
				
		case 5: System.out.println("ingrese nombre del contacto: ");
				nom=entrada.next();
				eliminarContacto(nom);
				break;
				
		case 6: if(agendaLlena()) {
					System.out.println("agenda llena");
				}else {
					System.out.println("la agenda no esta llena");
				}
				break;
				
		case 7: contactosLibres();
				break;
		
		default: System.out.println("debe ingresar un numero");
				break;
			
		}
		
		
	}
}
