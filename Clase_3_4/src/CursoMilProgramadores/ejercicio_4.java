package CursoMilProgramadores;

public class ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetodosSueltos m=new MetodosSueltos();
		double var1=m.DameUnDouble();
		System.out.println("Numero generado: "+ var1);
		double var2=m.DameUnDouble();
		System.out.println("Numero generado: " + var2);
		
		int suma=(int) (var1+var2);
		System.out.println("La suma de los numeros es: "+suma);
		
		int resta=(int) (var1-var2);
		System.out.println("La resta de los numeros es: "+resta);
		
		int multiplicacion=(int) (var1*var2);
		System.out.println("La multiplicacion de los numeros es: "+multiplicacion);
		
		double division=(var1/var2);
		System.out.println("La division de los numeros es: "+division);
		
	}

}
