package CursoMilProgramadores;

public class ejercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Dada un lista con las edades de N deportistas, se necesita informar la edad promedio de
		los deportistas de la lista; cual es la menor y la mayor edad ingresada.*/
		
		int deportistas[]= {12,14,20,18,17,16};
		int mayor=deportistas[0];
		int menor=deportistas[0];
		int suma=0;
		double promedio;
		
		for(int i=1;i<deportistas.length;i++) {
			if(deportistas[i]>mayor) {
				mayor=deportistas[i];
			}
		}
		System.out.println("El valor mayor es:" +mayor);
		
		for(int i=1;i<deportistas.length;i++) {
			if(deportistas[i]<menor) {
				menor=deportistas[i];
			}
		}
		System.out.println("El valor menor es:" +menor);
		
		for(int i=0;i<deportistas.length;i++) {
			suma+=deportistas[i];
		}
		promedio=(double)suma/deportistas.length;
		System.out.println("el promedio de edad es:" +promedio);
	}

}
