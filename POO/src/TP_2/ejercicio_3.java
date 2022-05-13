package TP_2;

public class ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado e1=new Empleado("Cristian","Cruz",34550921,"italia 260",30000);
		Empleado e2=new Empleado("Cristian","Cruz",34550921,"italia 260",30000);
		Empleado e3=new Empleado("Cristian","Cruz",34550921,"italia 260",30000);
		e1.verEmpleado();
		e2.verEmpleado();
		e3.verEmpleado();
		System.out.println(e1.calculoSueldo(4));
		
	}

}
