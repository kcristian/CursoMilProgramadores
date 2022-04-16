package TP_1;

import java.util.Scanner;

public class ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese un numero entero: ");
		numeroEntero n1=new numeroEntero(entrada.nextInt());
		
		System.out.println("ingrese otro numero entero: ");
		numeroEntero n2=new numeroEntero(entrada.nextInt());
		n1.cociente(n1,n2);
	}

}
class numeroEntero{
	
	private int entero;
	
	public numeroEntero(int num) {
		entero=num;
	}

	public int getEntero() {
		return entero;
	}

	public void setEntero(int entero) {
		this.entero = entero;
	}
	
	public void suma(numeroEntero x, numeroEntero y) {
		System.out.println("la suma de los enteros es "+(x.getEntero()+y.getEntero()));
	}
	public void resta(numeroEntero x, numeroEntero y) {
		System.out.println("la resta de los enteros es "+(x.getEntero()-y.getEntero()));
	}
	public void producto(numeroEntero x, numeroEntero y) {
		System.out.println("el producto de los enteros es "+(x.getEntero()*y.getEntero()));
	}
	public void cociente(numeroEntero x, numeroEntero y) {
		if(y.getEntero()!=0) {
			System.out.println("el cociente de los enteros es "+(x.getEntero()/y.getEntero()));	
		}else {
			System.out.println("no se puede dividir por cero");
		}
		
	}
}
