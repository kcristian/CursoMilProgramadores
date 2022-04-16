package CursoMilProgramadores;

public class ejercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=18;
		int suma=0;
		
		for(int i=1;i<numero;i++) {
			if(numero % i==0) {
				System.out.println(i + " es divisor de: "+numero);
				suma+=i;
			}			
		}
		System.out.println("la suma de los divisores es: "+suma);
	}

}
