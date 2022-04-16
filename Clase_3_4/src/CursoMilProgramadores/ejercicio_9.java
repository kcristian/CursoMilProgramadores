package CursoMilProgramadores;

public class ejercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[]= {1,9,5,7,6,3,5,2};
		MetodosSueltos m=new MetodosSueltos();
		m.MostrarArreglo(numeros);		
		System.out.println("Ordenando de mayor a menor...");
		numeros=m.OrdenarArray(numeros);
		m.MostrarArreglo(numeros);
	}
}