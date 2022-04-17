package TP_2;

import java.util.Scanner;

public class ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		int cantidad;
		double subTotal=0;
		
		Productos productos[];
		productos=new Productos[10];
		
		productos[0]=new Productos("Manteca 500g", 40.5, 19, 4, 2022, true);
		productos[1]=new Productos("Leche 1Lt", 120, 20, 4, 2022, true);
		productos[2]=new Productos("Pan lactal 800g", 100, 17, 4, 2022, true);
		productos[3]=new Productos("Yogurt 1Lt", 130, 18, 04, 2022, true);
		productos[4]=new Productos("Queso Crem 500g", 50.5, 17, 4, 2022, true);
		productos[5]=new Productos("Fideos 500g", 100, 19, 4, 2022, false);
		productos[6]=new Productos("Arroz 500g", 100, 25, 4, 2022, false);
		productos[7]=new Productos("Harina 500g", 120, 28, 4, 2022, false);
		productos[8]=new Productos("Semola 1kg", 80, 2, 5, 2022, false);
		productos[9]=new Productos("Lentejas 1kg", 80, 7, 7, 2022, false);
		
		//System.out.println("venta: "+p1.calcular(5));
		
		for(int i=0;i<productos.length;i++) {
			
			System.out.println("ingrese la cantidad de producto: "+productos[i].getNombre()+" a llevar");
			cantidad=entrada.nextInt();
			subTotal+=productos[i].calcular(cantidad);
			System.out.println("subTotal: "+productos[i].calcular(cantidad)+"\n");
		}
		
		System.out.println("Total a pagar: " + subTotal);
	}

}
