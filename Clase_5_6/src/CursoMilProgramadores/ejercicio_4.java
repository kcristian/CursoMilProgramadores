package CursoMilProgramadores;

public class ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]numeros=new int[20];
		
		for(int i=0;i<numeros.length;i++) {
			
			numeros[i]=(int)(Math.random()*(100-1+1)+1);
		}
		
		System.out.println("se cargo el array..");
		
		for(int i=0;i<numeros.length;i++) {
			
			if(numeros[i]%5==0) {
				System.out.println(numeros[i]+" es divisible por 5");
			}
		}
	}

}
