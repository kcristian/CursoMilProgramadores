package Curso_Java;

public class Colas_Logica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaLista cola=new ColaLista();
		cola.insertar(1);
		cola.insertar(2);
		cola.insertar(3);
		cola.insertar(4);
		cola.insertar(5);
		
		System.out.println(cola.quitar());
		System.out.println(cola.quitar());
		System.out.println(cola.quitar());
		System.out.println(cola.quitar());
		System.out.println(cola.quitar());

	}
	

}

class NodoCola{
	
	int elemento;
	NodoCola siguiente;
	
	public NodoCola(int x) {
		
		elemento=x;
		siguiente=null;
	}
	
}

class ColaLista{
	
	protected NodoCola frente;
	protected NodoCola fin;
	
	public ColaLista() {
		frente=fin=null;
	}
	
	public void insertar(int elemento) {
		
		NodoCola a;
		a=new NodoCola(elemento);
		if(colaVacia()) {
			frente=a;
		}else {
			fin.siguiente=a;
		}
		fin=a;
	}
	
	public int quitar() {
		int aux;
		if(!colaVacia()) {
			aux=frente.elemento;
			frente=frente.siguiente;
		}else {
			return -1;
		}
		return aux;
	}
	
	public void borrarCola() {
		while(frente != null) {
			frente=frente.siguiente;
		}
	}
	
	public boolean colaVacia() {
		if(frente==null) {
			return true;
		}else {
			return false;
		}
	}
}
