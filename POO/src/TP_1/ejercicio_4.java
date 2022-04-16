package TP_1;

public class ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador c = new Contador(1);
		c.incrementar();	
		c.decrementar();
		c.decrementar();
		c.decrementar();
	}

}
class Contador{
	
	private int cont;
	
	public Contador() {
		
	}
	public Contador(int c) {
		if(c<0) {
			cont=0;
		}else {
			cont=c;
		}
		System.out.println("el valor del contador incia con: "+cont);
		
	}
	public int getCont() {
		return cont;
		
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public void incrementar() {
		cont++;
		System.out.println("el contador ahora vale: "+this.cont);
	}
	public void decrementar() {
		if(cont==0) {
			System.out.println("el contador ha llegado a 0");
		}else {
			cont--;
			System.out.println("el contador ahora vale: "+this.cont);
		}
	}
}