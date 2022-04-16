package CursoMilProgramadores;

public class MetodosSueltos {
	
	public MetodosSueltos() {
		
	}
	public int DameUnEntero() {
		//int numero = (int)(Math.random()*(X-Y+1)+Y; donde X es el maximo e Y el minimo
		int numero = (int)(Math.random()*99);
		return numero;
	}
	public double DameUnDouble() {
		double numero= Math.random()*99;
		return numero;
	}
	public float DameUnFloat() {
		float numero=(float)Math.random()*99;
		return numero;
	}
	
	public int []OrdenarArray(int[]arreglo) {
		int[] arregloordenado;
		int auxiliar;
		for(int x=0;x<arreglo.length;x++) {
			for(int i=0;i<arreglo.length-1;i++){
				if(arreglo[i] < arreglo[i+1]){
					auxiliar=arreglo[i];
					arreglo[i]=arreglo[i+1];
					arreglo[i+1]=auxiliar;
				}
			}
		}
		arregloordenado=arreglo;
		return arregloordenado;
	}
	
	public void MostrarArreglo(int[]arreglo) {
		for(int i=0;i<arreglo.length;i++) {
			System.out.println("Elemento: "+i+" : "+arreglo[i]);
		}
	}
	public boolean EsPrimo(int numero) {
		int a=0;
		for(int i=1;i<=numero;i++) {
			if(numero % i==0) {
				a++;
			}
		}
		if(a != 2) {
			return false;
		}else {
			return true;
		}
	}

}
