package Curso_Java;

public class Pilas_Logica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilaLista pila=new PilaLista();
		pila.insertar(10);
		pila.insertar(20);
		pila.insertar(30);
		pila.insertar(40);
		pila.insertar(50);
		
		System.out.println(pila.quitar());
		System.out.println(pila.quitar());
		System.out.println(pila.quitar());
		System.out.println(pila.quitar());
		System.out.println(pila.quitar());
	}

}
class NodoPila{
	int elemento;
	NodoPila siguiente;
	
	NodoPila(int x){
		elemento=x;
		siguiente=null;
	}
}

class PilaLista{
	private NodoPila cima;
	public PilaLista() {
		cima=null;
	}
	
	//Operaciones
	
	public boolean pilaVacia() {
		if(cima==null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void insertar(int elemento) {
		
		NodoPila nuevo;
		nuevo=new NodoPila(elemento);
		nuevo.siguiente=cima;
		cima=nuevo;
	}
	
	public int quitar() {
		if(pilaVacia()) {
			return -1;
		}
		int aux=cima.elemento;
		cima=cima.siguiente;
		return aux;
	}
	
	public void limpiarPila() {
		NodoPila t;
		while(!pilaVacia()) {
			t=cima;
			cima=cima.siguiente;
			t.siguiente=null;
		}
	}
}
