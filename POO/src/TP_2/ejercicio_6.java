package TP_2;

public class ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi t1=new Taxi("f112", 2);
		Taxi t2=new Taxi("y567", 1);
		Taxi t3=new Taxi("k335", 1);
		t1.cambiarTarifa();
		t1.cambiarTarifa();
		t1.cambiarTarifa();
		System.out.println(t1.calcularTotalAPagar(2));
		t1.mostrarDatos();
		t2.mostrarDatos();
		t3.mostrarDatos();
	}

}
