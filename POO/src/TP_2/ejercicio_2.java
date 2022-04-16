package TP_2;
import TP_1.Persona;

public class ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona cristian=new Persona("cristian","cruz",123456,"Buenos Aires 774");
		Cuenta cuentac=new Cuenta(cristian);
		cuentac.ingresar(7500);
		cuentac.mostrar();
		cuentac.retirar(10000);
		cuentac.retirar(1000);
	}

}

