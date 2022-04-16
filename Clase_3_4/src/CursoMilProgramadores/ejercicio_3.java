package CursoMilProgramadores;

public class ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetodosSueltos m = new MetodosSueltos();
		int numero1=m.DameUnEntero();
		System.out.println("Numero generado: " +numero1);
		int numero2=m.DameUnEntero();
		System.out.println("Numero generado: " +numero2);
		int numero3=m.DameUnEntero();
		System.out.println("Numero generado: " +numero3);
		
		int mayor=0;
		
		if(numero1>mayor){
			mayor=numero1;
		}
		if(numero2>mayor){
			mayor=numero2;
		}
		if(numero3>mayor){
			mayor=numero3;
		}
		
		System.out.println("el numero mayor es: "+mayor);
	}

}
