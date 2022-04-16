package CursoMilProgramadores;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> numeros = new ArrayList <Integer> ();
		ArrayList <Integer> pares = new ArrayList<Integer>();
		ArrayList <Integer> impares = new ArrayList<Integer>();
		
		MetodosSueltos m= new MetodosSueltos();
		Scanner entrada = new Scanner(System.in);
		int cantidad;
		System.out.println("ingrese la cantidad de numeros: ");
		cantidad=entrada.nextInt();
		
		//generando la lista de numeros principal
		for(int i=0;i<cantidad;i++) {
			numeros.add(m.DameUnInteger());			
		}
		System.out.println("se generaron: "+numeros.size()+" elementos");
		
		//generando las listas de numeros pares e impares.
		for(int i=0;i<cantidad;i++) {
			if(numeros.get(i) % 2==0) {
				//agregando un par
				pares.add(numeros.get(i));
			}else {
				//agregando un impar
				impares.add(numeros.get(i));
			}
		}
		
		burbuja(pares);
		burbuja(impares);
		
		//mosrando las listas de pares e impares
		System.out.println("\nLista de numeros pares: \n");
		for(int i=0;i<pares.size();i++) {
			System.out.println("elemento " +i+" es: "+pares.get(i));
		}
		System.out.println("\nLista de numero impares: \n");
		for(int i=0;i<impares.size();i++) {
			System.out.println("elemento " +i+" es: "+impares.get(i));
		}
		entrada.close();
		/*System.out.println("Mostrando los elementos..");
		for(int i=0;i<cantidad;i++) {
			System.out.println("elemento " +i+" es: "+numeros.get(i));
		}*/
	}
	
	public static void burbuja(ArrayList<Integer> lista){
        int temp;
        for(int i=1;i < lista.size();i++){
            for (int j=0 ; j < lista.size()- 1; j++){
                if (lista.get(j) > lista.get(j+1)){
                    temp = lista.get(i);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, temp);
                    
                }
            }
        }
    }


}
