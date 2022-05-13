package model.herencia;

import java.util.ArrayList;

public class TestHerenciaProducto {

	public static void main(String[] args) {
		// ##### Ejercicio 6 ####
		ArrayList <Producto> productos=new ArrayList<Producto>();
		
		ProductoLacteo l1=new ProductoLacteo("Leche 1lt",130,"Leche",2023,6,12,100,10);
		ProductoLacteo l2=new ProductoLacteo("Yogurt 1lt",120,"Procesado",2023,8,12,90,10);
		ProductoLacteo l3=new ProductoLacteo("Queso 1kg",200,"Procesado",2023,9,12,100,10);
		ProductoLacteo l4=new ProductoLacteo("Chocolatada 1lt",150,"Mezcla",2023,7,12,60,10);
		ProductoLacteo l5=new ProductoLacteo("Leche en Polvo 1kg",250,"Procesado",2023,2,12,100,10);
		
		ProductoEnvasado e1=new ProductoEnvasado("Galletas 180g",150,"Pan",2023,7,25,"Bolsa");
		ProductoEnvasado e2=new ProductoEnvasado("Mortadela 200g",180,"Fiambre",2023,5,24,"Bolsa");
		ProductoEnvasado e3=new ProductoEnvasado("Azucar 1kg",150,"Azucar",2023,3,23,"Bolsa");
		ProductoEnvasado e4=new ProductoEnvasado("Salsa de tomate 1lt",180,"Procesado",2023,3,20,"Botella");
		ProductoEnvasado e5=new ProductoEnvasado("Te en saquitos 100unid",120,"Infusion",2023,2,19,"Caja");
		
		productos.add(l1);
		productos.add(l2);
		productos.add(l3);
		productos.add(l4);
		productos.add(l5);
		productos.add(e1);
		productos.add(e2);
		productos.add(e3);
		productos.add(e4);
		productos.add(e5);
		
		int i=0;
		for(Producto p:productos) {
			p.mostrarDatos();
			i++;
		}
		System.out.println("productos mostrados: "+i);
		
			
		
		
	}

}
